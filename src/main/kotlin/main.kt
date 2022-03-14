fun main() {
    val likes = 999
    val x = (likes - 1) % 10
    if (x != 0 || likes == 11) println("Понравилось $likes людям") else println("Понравилось $likes человеку")
}