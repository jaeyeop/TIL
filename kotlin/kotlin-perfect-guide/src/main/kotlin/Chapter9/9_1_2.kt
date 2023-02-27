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

    // Extension Function
    fun <T> TreeNode<T>.addChildren(vararg data: T) {
        data.forEach { addChildren(it) }
    }

//    이거 잘 모르겠는데..
//    fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
//        children.forEach( it.walkDepthFirst(action) )
//        action(data)
//    }

    override fun toString(): String =
        _children.joinToString(prefix = "$data {", postfix = "}")

}

