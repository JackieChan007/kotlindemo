class TestA{
    fun printA(){
        println("printA")
    }
}
class TestB{
    fun printB(){
        println("printB")
    }
}
fun main(){
    var t1=TestA()
    var t2=TestB()
    t2.printB()
    t1.printA()
}