package FirstDay

fun main(args:Array<String>){
    // val person = Pair("张三",20)   //二元元组使用Pair()
    val person = "张三" to 20 //同样可以使用to
    val name = person.first
    val age = person.second
    print(name)
    print(age)

    val newPerson = Triple("张三",20,"39893842")
    val newName = newPerson.first
    val newAge = newPerson.second           //三元元组使用Tripe()
    val newPhone = newPerson.third
    print(newName)
    print(newAge)
    print(newPhone)
}




