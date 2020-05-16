//https://atcoder.jp/contests/atc001/tasks/dfs_a

import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

var H = 0
var W = 0

val dx = listOf(1, 0, -1, 0)
val dy = listOf(0, 1,  0, -1)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (hh, ww) = nextListOfInt()
    H = hh
    W = ww
    val field = Array(H) { next() }
    val seen = Array(H){ Array(W){ false } }
    var (sh, sw, gh, gw) = Array(4){0}
    for(i in 0 until H){
        for(j in 0 until W){
            if(field[i][j] == 's') {sh = i; sw = j}
            if(field[i][j] == 'g') {gh = i; gw = j}
        }
    }
    dfs(field, sh, sw, seen)
    if(seen[gh][gw]) println("Yes") else println("No")
}

fun dfs(field: Array<String>, h: Int, w: Int, seen: Array<Array<Boolean>>) {
    seen[h][w] = true

    for(dir in 0 until 4){
        val nh = h + dx[dir]
        val nw = w + dy[dir]

        if(nh < 0 || nh >= H || nw < 0 || nw >= W) continue
        if(field[nh][nw] == '#')continue
        if (seen[nh][nw]) continue

        dfs(field, nh, nw, seen)
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


