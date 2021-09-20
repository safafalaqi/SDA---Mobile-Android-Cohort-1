

fun main(){
     /*
    - Import Random and use it to generate a random number between 0 and 10 to make the game different each time
    - Use a for or while loop to allow users to guess multiple times
    - Limit the number of guesses to 3 without counting invalid guesses (any characters other than numbers)
    - Give the user an option to quit the program by typing 'quit' at any point during the game
    - Use a when block instead of if/else statements to handle conditions*/
    // a random number between 0 and 10 inclusive
    val num= (0..10).random()
    try {
        print("Guess a number between 0 to 10 ")
        var guessedNum=readLine()!!.toInt()
        //to check if the number between 0 and 10
        while(guessedNum<0 || guessedNum>10) {
            println("The number must be between 0 and 10 , Please Guess a number between 0 to 10 ")
            guessedNum = readLine()!!.toInt()
        }
        if(num==guessedNum)
            println("You got it!")
        else
            println("Wrong guess. The answer was $num")

    }catch (e:Exception)
    {
        println("Please enter number only!")
    }
    println("Game Over")

}