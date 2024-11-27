fun main() {
    var x = readln()
    var y = readln()
    var numbersOnlyX = x.filter { it.isDigit() }
    var numbersOnlyY = y.filter { it.isDigit() }
    if (numbersOnlyX.isEmpty()) {
        numbersOnlyX = "0"
        numbersOnlyX.toInt()
    }
    if (numbersOnlyY.isEmpty()) {
        numbersOnlyY = "0"
        numbersOnlyY.toInt()
    }
    var numX = numbersOnlyX.toDouble()
    var numY = numbersOnlyY.toDouble()
    var z = numX / numY
    if (z.isNaN()){
        println("ნულზე გაყოფა შეუძლებელია")
    }else{
        println("X და Y განაყოფი არის: $z")
    }

    println("გსურთ ახალი პროექტის დაწყება<Y/N>?")
    val ANSWER = readln()
    if (ANSWER == "დიახ") {
        println("ხელახლა დაწყება")
        main()
    } else if (ANSWER == "არა") {
        println("დასასრული")
    } else {
        println("პასუხი არასწორად აკრიფეთ.")
        main()
    }
}

