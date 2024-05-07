package test

class First(n: Int): AbstFirst(n) {
    override val s: String = "Test"

    override fun info() {
        println("info $s")
    }
}