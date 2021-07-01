// 간단한 interface
interface Remote {
    // 구현 필수 메소드
    fun up()
    fun down()

    // 구현하고 싶을 경우 오버라이드하여 구현하는 메소드
    fun doubleUp() {
        up()
        up()
    }
    // static method 구현
    companion object {
        fun combine(first: Remote, second: Remote): Remote = object : Remote {
            override fun up() {
                first.up()
                second.up()
            }

            override fun down() {
                first.down()
                second.down()
            }

        }

    }
}