package top.lintao.springjavamavenbase.interface_abstract_class.kotlin_version


// use interface
data class Model1(
    override val name: String,
    override val age: Int,
) : ModelInterface

data class Model2(
    override val name: String,
    override val age: Int,
    val other: String,
) : ModelInterface

interface ModelInterface {
    val name: String
    val age: Int
}

// ⬇️ use abstract class && abstract val (actually get method)=================================
data class ModelAbstract1(
    override val name: String,
    override val age: Int,
) : ModelAbstract()

data class ModelAbstract2(
    override val name: String,
    override val age: Int,
    val other: String,
) : ModelAbstract()

abstract class ModelAbstract {
    abstract val name: String
    abstract val age: Int
}

// ⬆️ ===================================

// ⬇️ use abstract class && But fields=================================
class ModelAbstract91(
    name: String,
    age: Int
) : ModelAbstractVal(name, age)

// Can't use data class
// 所有的参数必须是在本类声明的属性
// 不能是父类声明的属性,本类继承而来（隐式，耦合）

//data class ModelAbstract22(
//    override val name: String,
//    override val age: Int,
//    val other: String,
//) : ModelAbstract92()

abstract class ModelAbstractVal(
    val name: String,
    val age: Int
)
// ⬆️ ===================================
