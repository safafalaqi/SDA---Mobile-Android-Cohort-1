

fun main(){
   /*Create an array of five empty strings
    Ask the user to enter their top 5 movies
    The user has to enter exactly 5 movies
    Add each movie to the array by updating all strings in the array
    Print each movie with a for loop*/

    //Create an array of five empty strings
    var movies = arrayOf("","","","","")

    //Ask the user to enter their top 5 movies
    println("Enter your top 5 movies: ")
    for (i in 0..movies.size - 1) {
        print(""+ (i+1) +"- ")
        movies[i]= readLine()!!
    }
    println("Your top 5 movies are: ")
    for (movie in movies) {
        println(movie)
    }

}