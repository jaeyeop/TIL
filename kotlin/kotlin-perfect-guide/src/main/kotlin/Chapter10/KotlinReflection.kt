package Chapter10

import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberProperties

class KotlinReflection(
    @MyAnnotation val a: String,
    @MyAnnotation val b: String,
    val c: String = "3") {

    @MyAnnotation
    fun print() = println("${this.a}, ${this.b}, ${this.c}")

    fun print2() = println("print2")

    fun print3(a:Int, b:Int) = println(a+b)


}

fun findCustomMyAnnotationProperty(kclass: KClass<*>) {
    val memberProperties = kclass.memberProperties.filter { it.findAnnotation<MyAnnotation>() != null }
    println(memberProperties)
}

fun main() {
    val kotlinReflection = KotlinReflection("1", "2")
    val kclass = kotlinReflection::class
    findCustomMyAnnotationProperty(kclass)

    //KFunction
    val functions = kclass.functions.first() { it.name == "print2" }
    functions.call(kotlinReflection)

    val kFunction1 = kotlinReflection::print
    kFunction1.call()

    val kFunction2 = kotlinReflection::print2
    kFunction2.call()

    val kFunction21 = kotlinReflection::print3
    kFunction21.invoke(1,2100)

    //KProperty
    val kProperty0 = kotlinReflection::a
    println(kProperty0.call())
    println(kProperty0.get())

    val kProperty01 = KotlinReflection::b
    println(kProperty01.get(kotlinReflection))

    val kProperty02 = kotlinReflection::b
    println(kProperty02.get())
    println(kProperty02.javaClass.name)

}