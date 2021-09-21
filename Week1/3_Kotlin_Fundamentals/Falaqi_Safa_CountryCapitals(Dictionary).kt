

fun main() {

    val matching = mutableMapOf<String, String>()

    println("Enter 3 countries and their capital city ")

    for (i in 0..2) {
        // Ask users to enter a country and save it as the key
        print("country: ")

        // Ask user to enter a capital and save it as the value
        var country = readLine()!!
            //make sure is not empty input
            while(country.isEmpty())
            {
             print("Please enter a country: ")
                country = readLine()!!
            }
        print("capital city: ")
        var capital = readLine()!!
            //make sure is not empty input
            while(capital.isEmpty())
            {
              print("Please enter a capital city: ")
                capital = readLine()!!
            }
       //add key and value to the mutable map
        matching.put(country,capital)
    }
    //print each country and its capital
    for((key, value) in matching){

        println("The capital city of $key is $value ")
    }

}




