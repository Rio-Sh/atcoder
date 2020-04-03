import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = sc.nextInt()
    val d = sc.nextLong()
    abc100b(n, d)
}

fun abc100b(n:Int, d:Long) {
    var ans = 0L
    when(n){
        0 -> {
            if(d==100L){
                ans = 101L
            }else{
                ans = d
            }
        }

        1 -> {
            if(d==100L){
                ans = 10100L
            }else{
                ans = d * 100L
            }
        }

        2 -> {
            if(d==100L){
                ans = 101L * 10000L
            }else{
                ans = d * 10000L
            }
        }
    }
    println(ans)
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


