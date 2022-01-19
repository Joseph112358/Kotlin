import java.util.*
//when is like a switch statement in C like languages
fun main(){
    for(x in 0..5) {
        when (x) {
            1 -> println("you sprain your wrist and drop your sword in disbelief")
            2 -> println("your sword bounces of the armour")
            3 -> println("Your sword penetrates the armour")
            4 -> println("You deal a critical blow")
            else -> {
                println("default state")
            }
        }
    }
    }