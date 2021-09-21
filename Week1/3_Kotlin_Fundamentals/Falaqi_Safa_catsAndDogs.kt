import kotlin.random.Random

fun main() {
    //Cats and Dogs
    //Create an abstract class Animal with attributes name and age and abstract function talk
    abstract class Animal(val n: String, val a: Int){
            val name = n
            val age = a
        abstract fun talk()
    }

    //Create a class Dog that inherits Animal and barks ('Name: Woof')
    class Dog( n: String, a: Int): Animal(n,a){
        override fun talk() {
            println("$n: Woof")
        }
    }

    //Create a class Cat that inherits Animal and meows ('Name: Meow')
    class Cat(n: String,a: Int): Animal(n,a){
        override fun talk() {
            println("$n: Meow")
        }
    }

//Create a list of five dogs and a list of five cats with random ages

    val dogs = listOf("Rufus","Fred","Spot","Rocky","Lucky")
    val dogList= ArrayList<Dog>()
    val cats = listOf("Lili","Meep","Furball","Snowball","Patchy")
    val catList= ArrayList<Cat>()

    //create a list of cat and dog
    for(i in 0..4)
    {
        dogList.add(Dog(dogs[i],Random.nextInt(1,7)))
        catList.add(Cat(cats[i],Random.nextInt(1,7)))
    }

    //Use a loop to iterate through the list of cats and make each cat meow,
    for(i in 0..4)
    {
        catList[i].talk()
        //println("cat age: "+ catList[i].age+" ")

            //also use a nested loop to make each dog bark if they are older than the meowing cat
            for(j in 0..4)
            {
                //println("dog age: "+ dogList[j].age+" ")
                if(dogList[j].age>catList[i].age)
                {
                    dogList[j].talk()
                }
            }
    }


}
