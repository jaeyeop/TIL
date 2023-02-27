package Chapter9

class TreeNode<T>(val data:T) {
    private val _children = arrayListOf<TreeNode<T>>()
    var parent: TreeNode<T>? = null
        private set

    val children: List<TreeNode<T>> get() = _children

    // Extension Function
    val <T> TreeNode<T>.depth: Int
        get() = (children.asSequence().map { it.depth }.maxOrNull() ?: 0) + 1

    fun addChild(data: T) = TreeNode(data).also {
        _children += it
        it.parent = this
    }

    override fun toString(): String =
        _children.joinToString(prefix = "$data {", postfix = "}")

}

// Extension Function
// https://velog.io/@kyy00n/kotlin-in-Action-Extension-Function-%ED%99%95%EC%9E%A5-%ED%95%A8%EC%88%98
fun <T> TreeNode<T>.addChildren(vararg data: T) {
    data.forEach { addChild(it) }
}

fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
    children.forEach{ it.walkDepthFirst(action) }
    action(data)
}

fun <T : Number> TreeNode<T>.average(): Double {
    var count = 0
    var sum = 0.0
    walkDepthFirst {
        count++
        sum += it.toDouble()
    }
    return sum/count
}

fun main() {
    val intTree = TreeNode(1).apply {
        addChildren(2,3,4,5)
        println(average())
    }
    println(intTree.javaClass.name)

    val intTree2 = TreeNode(1).apply {
        addChild(2).addChild(3)
        addChild(4)
    }
    println(intTree2)

    val doubleTree = TreeNode(1.0).apply {
        addChildren(2.0,3.0,)
        println(average())
    }
    println(doubleTree.javaClass.name)

    val stringTree = TreeNode("String").apply {
        addChildren("a","b","c")
//        println(average())
    }.toString()
    println(stringTree)
}

