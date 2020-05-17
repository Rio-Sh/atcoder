//参照 https://qiita.com/drken/items/996d80bcae64649a6580
import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

fun main(args: Array<String>) {
   val (n, m) = nextListOfInt()

   //グラフ入力受け取り
   val graph  = (0 until n).map{ mutableListOf<Int>()}
   for(i in 0 until m){
      val (a, b) = nextListOfInt()
      graph[a].add(b)
      graph[b].add(a)
   }

   //BFSの為のデータ構造
   val dist = Array(n){ -1 }
   val que = LinkedList<Int>()

   //初期条件(頂点0を初期ノードに)
   dist[0] = 0
   que.add(0)

   //BFS
   while(que.isNotEmpty()){
      val v = que.poll()!!

      for(nv in graph[v]){
         if(dist[nv] != -1) continue //発見済み

         //未発見の頂点nvの距離情報を追加してキューに追加
         dist[nv] = dist[v] + 1
         que.add(nv)
      }
   }

   for(v in 0 until n){
      println("$v : ${dist[v]}")
   }

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


