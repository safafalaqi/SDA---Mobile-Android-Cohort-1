import kotlin.random.Random

fun main(){

  // Generate a random number between 0 and 10
    val randomNumber=Random.nextInt(11)
    var correctInput=true
    var userNumber1=0
    var userNumber2=0
    //Ask the user to enter two numbers (making sure they do not enter any illegal characters)
    while(correctInput) {

        try {
            print("Enter your first number: ")
            userNumber1 = readLine()!!.toInt()

            print("Enter your second number: ")
            userNumber2 = readLine()!!.toInt()

            correctInput=false

        } catch (e: Exception) {
            println("\nPlease enter numbers only ")
        }
    }//end of while
     var sum =userNumber1 * randomNumber + userNumber2

    println("\n$userNumber1 * X + $userNumber2 = $sum")



    print("What is X? >> " )
    val guess= readLine()!!.toInt()
    if(guess==randomNumber)
        println("you got it!")
    else
        println("Wrong answer!")


}