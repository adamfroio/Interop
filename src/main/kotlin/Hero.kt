
@file:JvmName("Hero")

fun main() {
    val adversary = Jhava()
    println(adversary.utterGreeting()) 

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.lowercase() ?: "It's complicated")

    val adversaryHitPoints: Int = adversary.hitPoints
    println(adversary.hitPoints.coerceAtMost(100))
    println(adversaryHitPoints.javaClass)

    adversary.greeting = "Hello, Hero."
    println(adversary.utterGreeting())
}

fun makeProclamation() = "Greetings, beast!"