fun main() {
    println("შეიყვანეთ X-ის მნიშვნელობა:")
    var X = readln()
    println("შეიყვანეთ Y-ის მნიშვნელობა:")
    var Y = readln()
    var numbersOnlyX = X.filter { it.isDigit() }
    var numbersOnlyY = Y.filter { it.isDigit() }
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
    var Z = numX / numY
    if (Z.isNaN()){
        println("ნულზე გაყოფა შეუძლებელია")
    }else{
        println("X და Y განაყოფი არის: $Z")
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

