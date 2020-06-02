import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)


fun main(args: Array<String>) {
    val n = nextLong()
    val arr = primeFact(n)
    var ans = 0
    for(i in 0 until arr.size){
        var ex = 1L
        var now = arr[i].second
        while(now >= ex){
            now -= ex
            ans++
            ex++
        }
    }
    println(ans)
}


fun primeFact(n : Long) : ArrayList<Pair<Long, Long>> {
    var N = n
    val res = arrayListOf<Pair<Long, Long>>()
    for(a in 2 until n/2){
        if(a * a > N) break
        if(N % a != 0L) continue
        var ex = 0L

        while(N % a == 0L) {
            ex++
            N /= a
        }

        res.add(Pair(a, ex))
    }

    if(N != 1L) res.add(Pair(N, 1))
    return res
}

fun abc000a() {
}

fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextListOfString() = next().split(" ")
fun nextListOfInt() = nextListOfString().map { it.toInt() }
fun nextListOfLong() = nextListOfString().map { it.toLong() }
fun nextListOfDouble() = nextListOfString().map { it.toDouble() }

