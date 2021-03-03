object CountMatches {
    def countMatches(items: List[List[String]], ruleKey: String, ruleValue: String): Int = {
        var counter: Int = 0;

        items.foreach{ item =>
          val type1: String  = item.head
          val color: String = item(1)
          val name: String  = item(2)

          if((ruleKey == "type" && ruleValue == type1)
            || (ruleKey == "color" && ruleValue == color)
            || (ruleKey == "name" && ruleValue == name)) {
            counter = counter + 1
          }
        }

        counter
    }
}
