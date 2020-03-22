import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = sc.nextInt()
    val arr: Array<Int> = Array(n){sc.nextInt()}
    abc134c(n, arr)
}

fun abc134c(n: Int, arr: Array<Int>): Unit {
    val arrsorted = arr.sortedArray()
    val arrMax = arrsorted[arrsorted.size-1]
    val arrSec = arrsorted[arrsorted.size-2]
    for (i in 0 until n){
        if(arr[i] == arrMax){
            pw.println(arrSec)
        }else{
            pw.println(arrMax)
        }
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

