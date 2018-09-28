val int42 = 42
val str = "I am string"
val strCool = str + " " + " " + str
val strInterpolatedCool = s"$str ${str * int42} $str"
val strInterpolatedCoolMulty =
  s"""
    |"${str}"
    |${int42}
    |"${str}"
  """.stripMargin