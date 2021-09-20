fun main(){

    val minAge=18
    try {
        print("Enter your age: ")
        val Age=readLine()!!.toInt()
        if(Age>minAge)
            println("Welcome!")
        else
            println("you ar not old enough...")
    }catch (e:Exception)
    {
        println("Please enter number only!")
    }

}