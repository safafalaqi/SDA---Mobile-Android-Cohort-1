import java.util.Locale.filter

data class Player(val name: String, val age: Int, val height:Int)
fun main(){
    //Find one function (with no parameters) you have used in the past and rewrite it using a lambda expression
    fun guessNum(){
        print("Enter your guess: ")
       val guessedNum=readLine()!!.toInt()
       println("Your guess is $guessedNum")
    }
    //call guessNum()
    guessNum()
    //----Lambda version-----
    val guessnumber = { print("Lambda: Enter your guess: ")
        println("Lambda: Your guess is  ${readLine()!!.toInt()}")}
    guessnumber()


    //Find two functions that take in one or more parameters and rewrite them using a lambda expression
    //a function that validate operator
    val op='*'
    fun opValidator(op: Char): Boolean {
        when (op) {
            '*' -> return true
            '+' -> return true
            '-' -> return true
            '/' -> return true
            else -> return false }
    }
    println("Is operator $op ?  ${opValidator(op)}")
    //----Lambda version-----
    val isOperator={op:Char ->
        when (op) {
        '*' ->  true
        '+' ->  true
        '-' ->  true
        '/' ->  true
        else ->  false }
    }
    println("Is operator $op ?Lambda  ${ isOperator(op)}")

    val num="678"
    fun numValidator(num:String): Boolean {
        try {
            num.toInt()
            return true
        } catch (ex: NumberFormatException) {
            return false
        }
    }
    println("Is Number $num ?  ${numValidator(num)}")

    //----Lambda version-----

    val isNumValidator= {num:String -> num.chars().allMatch(Character::isDigit)}
    println("Is Number $num ?Lambda  ${isNumValidator(num)}")

    //Find two functions that return a value and rewrite them using a lambda expression
    //Make sure to show the original function
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
    println(" 3 * 5 =  ${calc(3,"*",5)}")
    //----Lambda version-----

    val calculator= { num1: Int, op: String, num2: Int ->
        when (op) {
            "*" -> (num1 * num2).toFloat()
            "+" -> (num1 + num2).toFloat()
            "-" -> (num1 - num2).toFloat()
            else -> (num1 / num2).toFloat()
    }
    }
    println("Lambda: 3 * 5 =  ${calculator(3,"*",5)}")
    //sum function that returns the sum of two number
    fun sum(num1:Int ,num2:Int): Int{
        val sum= num1+num2
        return sum
    }
    println(" 3 + 5 =  ${sum(3,5)}")
    //----Lambda version-----
    val sumOf={num1:Int ,num2:Int-> num1+num2}
    println("Lambda: 3 + 5 =  ${sumOf(3,5)}")

    //Make use of a data class to create a Player class with attributes name, age, height (in cm)
     val players=listOf(
        Player("Bob", 5,133),
         Player("Sara", 7,145),
         Player("Fred", 3,120),
         Player("Jane", 9,155),
         Player("Arwa", 1,90),
         Player("Badr", 8,145),
         Player("Mary", 6,130),
         Player("Rita", 13,160),
         Player("Mike", 12,155),
         Player("Abdul", 4,136),
         Player("Rahman", 8,150),
         Player("Ali", 5,145),
         Player("Ryan", 14,165),
         Player("Osaim", 2,120),
         Player("Abdullah", 3,125),
         Player("Tamim", 15,170),
         Player("Rama", 10,145),
         Player("Wajd", 1,80),
         Player("Rojeen", 16,165)
    )
    //Create a list of 20 players
    //Use a lambda expression to sort and print the list by each attribute
    //sort by Age
    println("Sort by Age:--------------------------------- ")
    val sortByAge=players.sortedBy { it.age }
    sortByAge.forEach {i -> println("${i.name}  age ${i.age}") }

    //sort by name
    println("Sort by Name:--------------------------------- ")
    val sortByName=players.sortedBy { it.name }
    sortByName.forEach {i -> println("${i.name}  age ${i.age}") }

    //sort by height
    println("Sort by Height (descending order ):--------------------------------- ")
    var sortByHeight=players.sortedBy { it.height }
    sortByHeight=sortByHeight.reversed()
    sortByHeight.forEach {i -> println("${i.name}  age ${i.height}") }

    //get name of people age less than 5
   println("Player less than 5 years old:--------------------------------- ")
    val youngKids=players.filter{ it.age < 5 }
    youngKids.forEach {i -> println("${i.name}  age ${i.age}") }

}

