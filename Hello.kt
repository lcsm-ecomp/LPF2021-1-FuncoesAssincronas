

fun main() {
    val ESC : Char = (0x1b).toChar()
    println("ola para todos")
    Thread.sleep(2000)
    print("${ESC}[2J")
    println("vou me embora.")
}