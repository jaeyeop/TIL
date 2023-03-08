package Chapter10

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

//class Person(val name: String, val age: Int)

//fun main() {
//    val person = Person("jerry", 32)
//    val kclass = person::class
//    val kclass2 = person.javaClass.kotlin
//
//    println(kclass.simpleName)
//
//    kclass.memberProperties.forEach { println(it.name) }
//
//    val members = kclass.members
//    println(members)
//
////    KClass
//}



class Person(val firstName: String, val familyName: String) {
    fun fullName(familyFirst: Boolean): String = if (familyFirst) {
        "$familyName $firstName"
    } else {
        "$firstName $familyName"
    }
}

fun main() {
    val personKclass = Person::class
    val person = personKclass.constructors.first().call("John", "Doe")
    val fullNameFun = personKclass.members.first() { it.name == "fullName" }

    println(fullNameFun.call(person, false))
}
