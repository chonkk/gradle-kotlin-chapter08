// interface 구현 방법
class TVRemote(val tv: TV) : Remote {
    override fun up() {
        tv.volume++
    }

    override fun down() {
        tv.volume--
    }

    override fun toString(): String {
        return "${tv.javaClass} : ${tv.volume}"
    }
    // doubleUp()은 구현하지 않아도 된다.
}