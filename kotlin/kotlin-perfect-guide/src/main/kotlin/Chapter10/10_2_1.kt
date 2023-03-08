package Chapter10

import kotlin.reflect.KAnnotatedElement
import kotlin.reflect.KClass

annotation class Dependency(vararg val componentClasses: KClass<*>)

annotation class Component(
    val name: String = "Core",
    val dependency: Dependency = Dependency()
)

@Component("I/O")
class IO

@Component("Log", Dependency(IO::class))
class Logger

@Component(dependency = Dependency(IO::class, Logger::class))
class Main

fun main() {
    val component = Main::class.annotations
        .filterIsInstance<Component>()
//        .firstOrNull() ?: return

    println(component)

//    println("Component name: ${component.name}")

//    val depText = component.dependency.componentClasses
//        .joinToString { it.simpleName ?: "" }

//    print(depText)
}
