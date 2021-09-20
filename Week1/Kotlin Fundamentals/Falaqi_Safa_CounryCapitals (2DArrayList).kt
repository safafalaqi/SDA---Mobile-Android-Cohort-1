
fun main() {

    //Create an ArrayList of ArrayLists containing two strings (country and capital)
    val assign = ArrayList<ArrayList<String>>()

    //Ask the user to enter a country and capital
    println("Enter a country and its capital city ")
    for (i in 0..2) {
        print("country: ")
        // Create a string variable to hold a country and a string variable to hold a capital
        val country = readLine()!!
        print("capital city: ")
        val capital = readLine()!!
        // Ask the user to enter a country and capital, then add the pair to the 2d ArrayList
        assign.add(ArrayList(arrayListOf(country, capital)))
    }

    //  print each country and its capital
    for (i in 0..2)
            println("The capital city of " + assign[i][0] + " is " + assign[i][1])
    }



