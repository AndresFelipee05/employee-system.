fun main() {

    val diseñador = Designer("Benjamin", 800.0)
    val desarrollador = Developer("Andrés", 6000.0)
    val gerente = Manager("Pablo", 1200.0)

    val lista = arrayOf(diseñador, desarrollador, gerente)
    for (item in lista){
        println("-------------------")
        item.work()
        item.details()
        item.calculateAnnualBonus()

        if (item is Developer || item is Designer){
            item.evaluatePerformance()
            println("-------------------")
        }
    }
}