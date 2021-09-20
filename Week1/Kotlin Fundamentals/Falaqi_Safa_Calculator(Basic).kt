

fun main(){

    //checker function to check if input is correct
    fun checker(num: String?): Int {
       try {
           num!!.toInt()
           return num.toInt()
        } catch (ex: NumberFormatException) {
            return 0
        }
    }
    //sum function that returns the sum of two number
    fun sum(num1:Int ,num2:Int): Int{
        val sum= num1+num2
        return sum
    }

    var porceed="y"
     while(porceed=="y")
     {
         print("Enter your first number: ")
         val num1=checker(readLine())
         print("Enter your second number: ")
         val num2=checker(readLine())

         println("$num1 + $num2 = "+sum(num1,num2))
         print("Would you like to add more number? (Y/N) >> ")
         porceed = readLine()!!.lowercase()

     }
}