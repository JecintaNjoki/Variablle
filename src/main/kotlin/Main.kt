fun main(args: Array<String>) {

    var agestudents = arrayOf(23, 22, 21)
    var numberstudent = arrayOf(92765, 56755, 895632)
    var weightstudents = arrayOf( 68, 52, 72)

    val isAkenyanCitizen = true
    val student1 = arrayOf("Ann Wanja", agestudents[0], numberstudent[0], weightstudents[0], isAkenyanCitizen)
    val student2 = arrayOf("Eunice Musenyia",agestudents[1], numberstudent[1], weightstudents[1], (isAkenyanCitizen))
    val student3 = arrayOf("Jecinta Njoki", agestudents[2], numberstudent[2], weightstudents[2], (isAkenyanCitizen)
    )
    println(student1.contentToString())
    println(student2.contentToString())
    println(student3.contentToString())

}