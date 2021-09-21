import java.time.DayOfWeek

fun main() {

    //Create a dictionary that uses numbers 1 - 7 for keys and days of the week as values
    val dayWeek = mapOf(1 to "Monday" , 2 to  "Tuesday" ,
        3 to "Wednesday",4 to "Thursday" ,5 to "Friday"
        ,6 to "Saturday" ,7 to "Sunday" )
     //Print each day of the week using a for loop
     for(i in 1..dayWeek.size)
         println(dayWeek[i])
}




