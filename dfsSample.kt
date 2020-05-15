import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (n, m) = nextListOfInt() //頂点数、辺数
    val graph = Array(n) { mutableListOf<Int>() }
    val seen = Array(n){ false }
    for(i in 0 until m){
        val (a, b) = nextListOfInt()
        graph[a].add(b)
        graph[b].add(a)
    }
    dfsSample(graph, 0, seen)
}

fun dfsSample(graph: Array<MutableList<Int>>, v: Int, seen: Array<Boolean>) {
    seen[v] = true //vを訪問済みに

    for(next_v in graph[v]){
        if(seen[next_v])continue //訪問済みならスキップ
        dfsSample(graph, next_v, seen)
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


