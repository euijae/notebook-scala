object DefangIpAddress extends App{
  def defangIPaddr(address: String): String = {
    var result = "";

    for(ch <- address) {
      result = result + (if(ch == '.') "[.]" else ch)
    }

    result
  }

  def defangIPaddr2(address: String): String = {
    var result = new StringBuilder();

    address.foreach{ ch =>
      result.append(if(ch == '.') "[.]" else ch)
    }

    result.toString();
  }

  def defangIPaddr3(address: String): String = address.replaceAll("\\.", "[.]")

  println(defangIPaddr3("1.1.1.1"));
}
