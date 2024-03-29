//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_7_A
import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

class Node {
    var parent :Int = -1
    var leftChi :Int = -1
    var rightSib :Int = -1
}

fun main(args: Array<String>) {
    val n = nextInt()
    val fig = (0 until n).map { nextListOfInt() }
    val str = Array(n){Node()}
    for(i in 0 until n){
        val id = fig[i][0]
        val k = fig[i][1]
        for(j in 2 until k+2){
            if(j == 2) str[id].leftChi = fig[i][j]
            str[fig[i][j]].parent = id
            if(j == k+1) continue
            str[fig[i][j]].rightSib = fig[i][j+1]
        }
    }

    for(i in 0 until n){
        val type = if(str[i].parent == -1){
            "root"
        }else if(str[i].leftChi == -1){
            "leaf"
        }else {
            "internal node"
        }

        println("node $i: parent = ${str[i].parent}, depth = ${getDepth(i, str)}, $type, ${getChild(i, str)}")
    }

}

fun getDepth(node :Int, str :Array<Node>) : Int{
    var d = 0
    var n = node
    while(str[n].parent != -1){
        n = str[n].parent
        d++
    }
    return d
}

fun getChild(node :Int, str :Array<Node>) : MutableList<Int> {
    val ans = mutableListOf<Int>()
    if(str[node].leftChi != -1){
        ans.add(str[node].leftChi)
        var n = str[node].leftChi
        while (str[n].rightSib != -1){
            ans.add(str[n].rightSib)
            n = str[n].rightSib
        }
    }

    return ans
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
