//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_8_A

import java.io.PrintWriter
import java.util.*

val pw = PrintWriter(System.out)
val sc = Scanner(System.`in`)

class Node(var key:Int, var par:Node?, var lef: Node?,var rig:Node?) {
    fun find(value :Int) : Node? = when {
        this.key > value -> lef?.find(value)
        this.key < value -> rig?.find(value)
        this.key == value -> this
        else -> null
    }

    fun insert(value :Int) {
        if(this.key > value){
            if(this.lef == null){
                this.lef = Node(value, this, null, null)
            }else{
                this.lef!!.insert(value)
            }
        }else{
            if(this.rig == null){
                this.rig = Node(value, this, null, null)
            }else{
                this.rig!!.insert(value)
            }
        }
    }
}

val root = Node(-1, null, null, null)

fun main(args: Array<String>) {
    val n = nextInt()
    for(i in 0 until n) {
        val command = next()
        if (command == "print") {
            inOrder(root)
            print("\n")
            preOrder(root)
            print("\n")
        } else {
            val key = command.split(" ")[1].toInt()
            if (root.key == -1) {
                root.key = key
                continue
            }
            root.insert(key)
        }
    }

}

fun preOrder(d :Node?) {
    if (d == null) return
    print(" ${d.key}")
    preOrder(d.lef)
    preOrder(d.rig)
}

fun inOrder(d :Node?) {
    if(d == null) return
    inOrder(d.lef)
    print(" ${d.key}")
    inOrder(d.rig)
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
