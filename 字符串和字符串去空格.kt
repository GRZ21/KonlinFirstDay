package FirstDay

fun main(args:Array<String>){

    var y = "江苏省"+"\n"+"淮安市"+"\n"+"淮安区"+"\n"    //val是不可变量，var是可变变量      \n是换行
    var z = "    abcd"
    var newZ = z.trim() //使用trim()去空格
    val x = """
        |江苏省
        |淮安市
        |淮安区
    """.trimMargin("|")//使用原样输出进行去除空格，trim Margin()      """"""同样可以实现换行
    print(y)
    print(x)
    print(newZ)

}