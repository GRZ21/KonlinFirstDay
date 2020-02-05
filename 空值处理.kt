package FirstDay

fun main(args:Array<String>){
    val s:String ?= null       //String类型不能为空，所以使用?=成为可空类型
   // s?.toInt()                 //?.空安全调用符
    //s!!.toInt()                 //非空断言，建议不用

    var a: Int = s?.toInt()?:-1   //Elvis操作符?:含义：如果s不为空，将s.toInt()返回，s为空，返回-1
    print(a)
}