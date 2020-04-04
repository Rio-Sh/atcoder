import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = sc.nextInt()
    val A = Array(n){sc.nextInt()}
    val q = sc.nextInt()
    val m = Array(q){sc.nextInt()}
    alds1_5_a(n,A,q, m)
}

fun alds1_5_a(n:Int, A:Array<Int>, q:Int, m:Array<Int> ) {
    fun solve(i:Int, m:Int): Boolean{
        if(m == 0) return true
        if(i >= n) return false
        return solve(i+1, m ) || solve( i+1, m-A[i])
    }
    for(i in 0 until q){
        if(solve(0, m[i])) println("yes") else println("no")
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


