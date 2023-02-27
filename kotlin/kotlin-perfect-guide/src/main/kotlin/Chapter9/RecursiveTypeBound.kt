package Chapter9

//interface Fruits {
//    val price : Int
//    fun compareTo(other: Fruits) : Boolean {
//        return this.price > other.price
//    }
//}
//
//data class Apple (override val price : Int): Fruits
//data class Orange (override val price : Int): Fruits

//interface Fruits<T> {
//    val price : Int
//    fun compareTo(other: T) : Boolean {
//        return this.price > other.price
//    }
//}

// recursive types 제한(bound)
interface Fruits<T : Fruits<T>> {
    val price : Int
    fun compareTo(other: T) : Boolean {
        return this.price > other.price
    }
}

data class Apple (override val price : Int): Fruits<Apple>
data class Orange (override val price : Int): Fruits<Orange>

fun main() {
    val apple1 = Apple(30)
    val apple2 = Apple(50)
    val orange1 = Orange(100)
    val orange2 = Orange(200)

    // Nope..
//    apple1.compareTo(orange1)
}