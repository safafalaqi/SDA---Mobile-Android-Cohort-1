
fun main(){
    //to check if user want to continue or not
    fun toContinue(s:String): Boolean{
        var input = s.lowercase()

        while(input!="yes" && input!="no")
        {
            print("please enter yes or no ")
            input = readLine().toString().lowercase()
        }

        if(input=="yes")
            return true

        return false
    }

    //Create an ArrayList
    val favoMovies = arrayListOf<String>()
    var mNum=0 //number of movies
    var userAns=""  //for user answer yes or no
    //Ask the user to enter their favorite movies
    println("Enter your favorite movies: ")
    while(true)
    {
        favoMovies.add( readLine()!!)
        mNum++
        if(mNum>= 3)
        {
            print("Would you like to continue (yes/no)? ")
            userAns= readLine()!!
            //If the user says yes, allow them to enter another movie
            if(toContinue(userAns)) {
                println("Enter your favorite movies: ")
                continue
            }
            else
                break
        }

    }//end of loop
    
    //If the user says no, print all movies with a for loop
    for(i in favoMovies)
    {
       println(i)
    }

}