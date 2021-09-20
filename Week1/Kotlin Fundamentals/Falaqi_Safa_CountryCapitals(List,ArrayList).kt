
fun main(){

    //Create a list of 3 countries
    val countries = listOf("Saudi Arabia","Canada","United Arab Emirates")
    //Create an empty ArrayList
    val capitals = ArrayList<String>()
    //Ask the user to enter the capital of each country in the list
    println("Enter the capital of each country in the following")
    for(c in countries)
    {
        print("$c :  ")
        //Add each capital to the ArrayList
        capitals.add(readLine()!!)
    }
    //Print all countries and their capitals by iterating through the list and the ArrayList
    for(i in 0..2)
    {
        println("The capital city of "+countries[i] +" is "+ capitals[i] )
        //Add each capital to the ArrayList

    }

}