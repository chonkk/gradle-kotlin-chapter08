
class Chapter08 {
}
//From : https://jessyt.tistory.com/103?category=941874

fun main(){
//    sample1()
    sample2()
}

fun sample2() {
    val tv = TV()
    val tvRemote: TVRemote = TVRemote(tv)
    // 사용방법
    val anotherTV = TV()
    println("Volume: ${tv.volume}")
    println("anotherTV Volume: ${anotherTV.volume}")

    val anotherRemote = Remote.combine(tvRemote, TVRemote(anotherTV))
    tvRemote.up()
    println("Volume: ${tv.volume}")
    println("anotherTV Volume: ${anotherTV.volume}")

    anotherRemote.up()
    println("Volume: ${tv.volume}")
    println("anotherTV Volume: ${anotherTV.volume}")
    println("${tvRemote}")
    println("${anotherRemote}")
}

fun sample1() {
    val tv = TV()
    val tvRemote: TVRemote = TVRemote(tv)

    println("Volume: ${tv.volume}")
    tvRemote.up()

    println("Volume: ${tv.volume}")
    tvRemote.doubleUp()

    println("Volume: ${tv.volume}")
}
