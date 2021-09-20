

fun main(){

    fun numValidator(num:String): Boolean {
     try {
      num.toInt()
      return true
     } catch (ex: NumberFormatException) {
      return false
     }
    }//end of numValidator

     //a function that validate operator
     fun opValidator(op: String): Boolean {
      when (op) {
          "*" -> return true
          "+" -> return true
          "-" -> return true
          "/" -> return true
          else -> return false }
     }

    // a function that perform addition, subtraction, division, and multiplication
    fun calc(num1:Int, op:String,num2:Int): Float
    {
        when (op) {
            "*" -> return (num1 * num2).toFloat()
            "+" -> return (num1 + num2).toFloat()
            "-" -> return (num1 - num2).toFloat()
            else -> return (num1 / num2).toFloat()
             }
    }


    print("Enter first number: ")
    var num1=readLine()//first number

    //validate if correct input
    while(!numValidator(num1.toString())){
    print("Enter a valid number: ")
     num1=readLine()
    }

    println("$num1")

    print("Enter operator: ")
    var operator=readLine()  // for the operator

    //check if valid operator
    while(!opValidator(operator.toString())){
     print("Enter a valid operator: ")
     operator=readLine()  // for the operator
    }
    println("$num1$operator")

    print("Enter second number: ")
    var num2= readLine()//second number

    //validate if correct input
    while(!numValidator(num2.toString())){
     print("Enter a valid number: ")
     num2=readLine()
     }

    if(operator=="/" && num2!!.toInt()==0)
        print("You can not divide by 0")
    else
         print("$num1 $operator $num2 = "+calc(num1!!.toInt(),operator.toString(),num2!!.toInt()))

}