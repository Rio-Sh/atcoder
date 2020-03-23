import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = nextInt()
    val a = nextListOfLong()
    abc159d(n,a)
}

fun abc159d(n:Int, a:List<Long>){
    val cnt = a.toLongArray().groupBy { it }
        .mapValues { it.value.count().toLong() }

    var sum = 0L
    for ((key, value) in cnt){
       sum += (value*(value-1)/2)
    }
    for(i in 0 until n){
        val ans = sum - (cnt[a[i]]!! - 1)
        pw.println(ans)
    }
    pw.flush()
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


