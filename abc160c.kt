import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val k = sc.nextInt()
    val n = sc.nextInt()
    val arr =Array(n){sc.nextInt()}
    println(abc160c(n,k,arr))
}

fun abc160c(n: Int, k: Int, arr: Array<Int>): Int{
    var maxDiff = 0
    if(arr[0] != 0){
        maxDiff = (k-arr[n-1]) + arr[0]
    }else{
        maxDiff = k - arr[n-1]
    }
    for(i in 0 until n - 1){
        val tmp = arr[i+1] - arr[i]
        if(tmp > maxDiff) maxDiff = tmp
    }
    return k - maxDiff
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


