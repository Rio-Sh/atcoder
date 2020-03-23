import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val L = BigDecimal(sc.nextInt())
    val div = BigDecimal(27)
    val L3 = L*L*L
    val result = L3.divide(div, 10, BigDecimal.ROUND_HALF_UP)
    println(result)
}


fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


