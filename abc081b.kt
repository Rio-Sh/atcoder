import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = nextInt()
    val a = nextListOfInt()
    println(abc81b(n,a))
}

fun abc81b(n: Int, a: List<Int>): Int? {
    val arr = a.toIntArray()
    for (i in 0 until n){
        var count = 0
        while (arr[i]%2 == 0){
            arr[i] /= 2
            count++
        }
        arr[i] = count
    }
    return arr.min()
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


