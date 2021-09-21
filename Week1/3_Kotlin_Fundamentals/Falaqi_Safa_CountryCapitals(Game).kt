import kotlin.random.Random

//Country Capitals (Game)
fun main() {

    //Create a Country class with two attributes (name, capital)
    class Country(val name: String, val capital: String) {

        //Create a function that prints the country and its capital
        fun printInfo() {
            println("The capital of $name is $capital")
        }
    }

    fun game(list: ArrayList<Country>) {
        //make 3 question with random countries

        /*
        Bonus: Can you find a way to always ask 3
        unique questions? (Never repeating the same country in a single game)
        Yes, since maps cannot have duplicate keys
        I used it to generate 3 random countries
        as a map keys*/
        val randomQues = mutableMapOf<Country, Int>()
        var i = 1
        //Randomly select three countries and quiz the user to see if they know the capitals
        while (true) {
            randomQues.put(list[Random.nextInt(10)], i)
            i++
            //when 3 countries added to the map break the loop
            if (randomQues.size == 3)
                break
        }

        var points = 0
        for ((key) in randomQues) {
            print("What is capital city of ${key.name} : ")
            val ans = readLine()!!
            if (ans.lowercase() == key.capital.lowercase()) {
                println("Correct!")
                points++
            } else {
                //If the user guesses incorrectly call the capital function to show the answer
                println("Wrong answer!")
                key.printInfo()
            }

        }
        println("Your Final score is: $points out of 3")
    }//end of game


    //Create ten countries and place them inside  a list
    val country = listOf(
        "Saudi Arabia", "Bahrain", "Spain", "Egypt", "Italy",
        "Germany", "Russia", "Canada", "China", "France"
    )
    val capital = listOf(
        "Riyadh", "Manama", "Madrid", "Cairo", "Rome", "Berlin", "Moscow", "Ottawa", "Beijing", "Paris"
    )

    val countries = arrayListOf<Country>()

    for (i in capital.indices) {
        countries.add(Country(country[i], capital[i]))
    }



    while (true) {

        game(countries)
        //Start a new game if they want to play again


        print("Would you like to play again? (Y/N) ")
        var ans= readLine()!!.lowercase()
        val yOrN= listOf("y","n")
        //to get correct input either y or n
         while(true)
         {

             if(!yOrN.contains(ans)) {
                 print("Would you like to play again? (Y/N) ")
                 ans = readLine()!!.lowercase()
             }
             else
                 break
         }
        if(ans=="y")
            continue
        else
            break

    }
}