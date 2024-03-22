interface Car {
    fun assemble()
}

class BasicCar : Car {
    override fun assemble() {
        print("Basic Car.")
    }
}

abstract class CarDecorator(protected val decoratedCar: Car) : Car {
    override fun assemble() {
        decoratedCar.assemble()
    }
}

class SportPackage(decoratedCar: Car) : CarDecorator(decoratedCar) {
    override fun assemble() {
        super.assemble() // Собираем базовый автомобиль
        print(" Adding features of Sports Car.")
    }
}

class LuxuryPackage(decoratedCar: Car) : CarDecorator(decoratedCar) {
    override fun assemble() {
        super.assemble() // Собираем базовый автомобиль
        print(" Adding features of Luxury Car.")
    }
}

fun main() {
    val sportsCar = SportPackage(BasicCar())
    sportsCar.assemble()
    println("\n-----")

    val sportsLuxuryCar = LuxuryPackage(SportPackage(BasicCar()))
    sportsLuxuryCar.assemble()
}