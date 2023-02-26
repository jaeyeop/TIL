package chapter8

/*
* Object, Companion Object 다시 보기
* https://jaeyeong951.medium.com/%EC%BD%94%ED%8B%80%EB%A6%B0-object-companion-object-3237ecea8df4
* */
open class Person(val name: String, val age: Int) {
    companion object : Person("Unknown", 0)
}

object JohnDoe : Person("John Doe", 30)

fun main() {
    println("JohnDoe name = ${JohnDoe.name}")

    val person = Person("Jeong", 20)
    println("person name = ${person.name}")



}