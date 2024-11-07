interface Evaluable {
    fun evaluatePerformance() {
        println("Generic evaluation")
    }
}

abstract class Employee : Evaluable {
    abstract val name: String
    abstract val salary: Double

    abstract fun work()

    abstract fun calculateAnnualBonus()

    fun details() {
        println("Name: $name, salary: $salary")
    }
}

class Developer(override val name: String, override val salary: Double) : Employee() {

    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus() {
        println("Annual bonus: ${(salary * 10) / 100}")
    }
}

class Manager(override val name: String, override val salary: Double) : Employee() {

    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        println("Annual bonus: ${(salary * 20) / 100}")
    }
}

class Designer(override val name: String, override val salary: Double) : Employee() {

    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus() {
        println("Annual bonus: ${(salary * 15) / 100}")
    }
}

