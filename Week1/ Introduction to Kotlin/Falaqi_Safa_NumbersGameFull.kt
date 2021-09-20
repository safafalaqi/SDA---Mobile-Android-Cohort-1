import kotlin.random.Random

fun main(){
    /*
   - Import Random and use it to generate a random number between 0 and 10 to make the game different each time
   - Use a for or while loop to allow users to guess multiple times
   - Limit the number of guesses to 3 without counting invalid guesses (any characters other than numbers)
   - Give the user an option to quit the program by typing 'quit' at any point during the game
   - Use a when block instead of if/else statements to handle conditions*/

    // a random number between 0 and 10 inclusive
    val num=Random.nextInt(11)
    var numOfGuesses=1 //this should increase till 3
    var guessedNum=""
    while (numOfGuesses<=3) {
        try {

            print("Guess a number between 0 to 10 ")
            guessedNum = readLine().toString()

            when {
                num == guessedNum.toInt() -> {
                    println("You got it!")
                    break
                }
                else ->
                {
                    if(numOfGuesses<3) {
                        println("Wrong guess. Try again ")
                        numOfGuesses++
                    }
                    else{
                        println("Wrong guess.")
                        numOfGuesses++
                    }

                    continue
                }
            }

        } catch (e:Exception) {
            if (guessedNum== "quit")
                break
            else
                continue
        }
    }//end of while

    println("Game Over")

}