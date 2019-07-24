fun main() {
    class aaaa()
    {
        val a = 2
        val b = 3
        val c = a +b
    }
    val str = "a a aa bb cccc"
    val aa = """ |b a c,
    |in a galaxy
    |dafsfdsfds......
    |dsadsadsada""".trimMargin()
    println(aa)

    println(str.toUpperCase())
    println(str.toLowerCase())

    val aaa = str.subSequence(2, 7)

    println(aaa)

    val bb = "aa bb cc"
    val cc = "bb cc dd"
    val dd = "dd ff gg"

    println(bb.length)

    println("$bb mm $cc nn ${dd.toUpperCase()}")

    fun aaa(a: Int, b: Int): Int {
        val c = a + b
        println("aaaa $c")
        return c
    }
    aaa(2,3);

    fun hai(aa: String = "iiiii iiii") {
        println(aa)
    }

    val ww = listOf("aaaaa", "c", "d", "l", "n")
    println(ww.sorted())
    println("llllllllllll ${ww.get(1)}")
    println(ww.last())
    println(ww.contains("c"))
    println(ww.size)

    val gg = arrayListOf("aa", "mm", "ss", "cc", "bb")
    println(gg[2])
    gg.add(2, "aa")
    println(gg)

    gg.add("jj")
    println(gg)

    gg.removeAt(2)
    println(gg)

    gg.remove("cc")
    println(gg)

    val yy = mapOf("b" to "b", "a" to "a")
    println(yy.get("a"))
    println(yy["b"])
    println(yy.values)
    println(yy.getOrDefault("n", "jjj"))
    println(yy)

    val ee = hashMapOf("a" to "ggggg", "b" to "fdsfsd", "l" to "dd", "f" to "qq")
    ee["d"] = "a"
    println(ee)

    ee.put("g", "zzz")
    println(ee)
    println(ee.get("b"))

}
