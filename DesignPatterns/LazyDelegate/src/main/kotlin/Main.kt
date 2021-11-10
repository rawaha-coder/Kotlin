fun main() {
    println("\n*** Lazy Delegate Code ***\n")

    val coffeMaker: CoffeeMaker by lazy { CoffeeMaker() }
    
    println("Is the CoffeMaker created already?")

    coffeMaker.makeEspresso()
    coffeMaker.makeAmericano()

}