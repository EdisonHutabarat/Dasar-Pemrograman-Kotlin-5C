fun main(args: Array<String>) {
    val a: Int = 10000
    println("a apakah identik degnan a atau a === a : "+ (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA === anotherBoxedA : " +(boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "+(boxedA == anotherBoxedA))
}