import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = sc.nextInt()
    makeCombination(n)
}

fun makeCombination(n: Int) {
    val S = Array(n){0}

    fun rec(i:Int){
        if(i == n) return println(S.joinToString(""))
        rec(i+1)
        S[i] = 1
        rec(i+1)
        S[i] = 0
    }

    rec(0)
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


