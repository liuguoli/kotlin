fun test() {
    class Test {
        fun unaryPlus(a: Int=1): Test = Test()
    }
    val test = Test()
    test.unaryPl<caret>us()
}
