fun main() {    
    val myFirstDice = Dice(6, "orange")
    println("Your ${myFirstDice.color} ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20, "green")
    println("Your ${mySecondDice.color} ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
    
    val myCoin = Coin();
    println("\nThe result of tossing the coin is ${myCoin.toss()}")
}

class Dice(val numSides: Int, val color: String) {
    fun roll(): Int {
    	return (1..numSides).random()
    }
}

class Coin() {
    fun toss(): String {
        if ((0..1).random() == 0) {
            return "heads"
        } else {
            return "tails"
        }
    }
}