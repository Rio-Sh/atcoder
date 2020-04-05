import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val k = sc.nextInt()
    abc161d(k)
}

fun abc161d(k:Int) {
    var count = 0
    val que: LinkedList<Long> = LinkedList<Long>((1L..9L).toList())
    if(k <= 9) return println(que[k-1])
    while (count < k){
        count++
        if(count == k){
            println(que.poll())
            break
        }
        val tmp = que.poll()
        val suf = tmp%10L
        if(suf != 0L) que.add(tmp*10L+(suf-1L))
        que.add(tmp*10L+suf)
        if(suf != 9L) que.add(tmp*10L + (suf+1L))
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



