import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*
 
val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)
 
fun main(args: Array<String>) {
    val n = sc.nextInt()
    val arr = Array(n){sc.next()}
    println(abc109b(n, arr))
}
 
fun abc109b(n: Int, arr: Array<String>): String {
    val cnt = arr.groupBy { it }.mapValues { it.value.count() }
    for((key, value) in cnt){
        if(value > 1) return "No"
    }
    for(i in 0 until n-1){
        if (arr[i].last() != arr[i+1].first()) return "No"
    }
    return "Yes"
}
 
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map 
