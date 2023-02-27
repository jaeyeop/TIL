package Chapter9

class TypeParameter

//class TreeNode<T>(val data:T) {
//    private val _children = arrayListOf<TreeNode<T>>()
//    var parent: TreeNode<T>? = null
//        private set
//
//    val children: List<TreeNode<T>> get() = _children
//
//    fun addChild(data: T) = TreeNode(data).also {
//        _children += it
//        it.parent = this
//    }
//
////    fun <T> TreeNode<T>.walkDepthFirst(action: (T) -> Unit) {
////        children.forEach( it.walkDepthFirst(action) )
////    }
//
//    override fun toString(): String =
//        _children.joinToString(prefix = "$data {", postfix = "}")
//
//}
//
//// Extension Function
//fun <T> TreeNode<T>.addChildren(vararg data: T) {
//    data.forEach { addChildren(it) }
//}
//
//// Extension Function
//val <T> TreeNode<T>.depth: Int
//    get() = (children.asSequence().map { it.depth }.maxOrNull() ?: 0) + 1
//
//fun main() {
//    val root = TreeNode("Hello").apply {
//        addChild("World")
//        addChild("!!!")
//    }
//
//    println(root)
//    println(root.children)
//    print(root.depth)
//}

open class DataHolder<T>(val data: T)
//
////class StringDataHolder(data: String) : DataHolder<String>(data)
//class StringDataHolder<T>(data: T) : DataHolder<T>(data)
//
//// 타입 인자를 상위 타입의 타입 인자로 넘김
//class TreeNode<T>(data: T) : DataHolder<T>(data)
//
//// 함수에서는 컴파일러가 추론함
//fun stringDataHolder(data: String) = DataHolder(data)





