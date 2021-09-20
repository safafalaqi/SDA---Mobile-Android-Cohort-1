fun main(){


    var message ="Hello user, welcome to my program!"
    print("Enter your name: ")
    var name = readLine()
    println( message.replace("user", name.toString(), ignoreCase = true))
}