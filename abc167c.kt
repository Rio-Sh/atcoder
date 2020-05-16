//https://atcoder.jp/contests/abc167/tasks/abc167_c

import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

var N = 0
var M = 0
var X = 0

fun main(args: Array<String>) {
    val(n, m, x) = nextListOfInt()
    N = n; M = m; X = x
    val fig = Array(n){ nextListOfInt() }
    val und = Array(m){x}
    abc167c(fig, und)
}

fun abc167c(fig :Array<List<Int>>, und :Array<Int>) {
    var sum = 0
    val sums = mutableListOf<Int>()
    fun solve(i:Int){
        if(und.all{ it <= 0}) sums.add(sum)
        if(i == N) return
        solve(i+1)
        for(j in 0 until M){
            und[j] = und[j] - fig[i][j + 1]
        }
        sum += fig[i][0]
        solve(i+1)
        for(j in 0 until M){
            und[j] = und[j] + fig[i][j + 1]
        }
        sum -= fig[i][0]
    }
    solve(0)
    if(sums.isNotEmpty()) println(sums.min()) else print("-1")
}


fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }


