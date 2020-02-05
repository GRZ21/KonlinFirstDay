package FirstDay

fun main(args:Array<String>){
    var a1 = "Hello"
    var a2 = String(charArrayOf('H','e','l','l','o'))

    print(a1.equals(a2))
    print(a1==a2)        //在konlin中，equals()和==是等价的
    print(a1===a2)        //konlin中，===是比较两个值的地址


}