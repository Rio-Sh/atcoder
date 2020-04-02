//https://atcoder.jp/contests/abc141/tasks/abc141_c

import java.io.PrintWriter
import java.math.BigDecimal
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = sc.nextInt()
    val k = sc.nextInt()
    val q = sc.nextInt()
    val arr = Array(n){k - q}
    val points = Array(q){sc.nextInt()}
    abc141c(n,k,q,arr, points)
}

fun abc141c(n: Int, k: Int, q:Int, arr: Array<Int>, points: Array<Int>) {
    for (i in 0 until q){
        arr[points[i]-1] += 1
    }
    for(i in 0 until n){
        if(arr[i] > 0){
            println("Yes")
        }else{
            println("No")
        }
    }
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


