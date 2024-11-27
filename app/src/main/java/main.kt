fun main(){
    var x  = readln()
    var y  = readln()
    var numbersOnlyX = x.filter { it.isDigit() }
    var numbersOnlyY = y.filter{ it.isDigit() }
    if (numbersOnlyX.isEmpty() || numbersOnlyY.isEmpty()) {
        numbersOnlyX = "0"
        numbersOnlyY = "0"
        var numX = numbersOnlyX.toInt()
        var numY = numbersOnlyY.toInt()
        var z: Int = numX / numY
        println("X და Y განაყოფი არის: $z")
    }else{
        var numX = numbersOnlyX.toDouble()
        var numY = numbersOnlyY.toDouble()
        var z: Double = numX / numY
        println("X და Y განაყოფი არის: $z")
    }
    println("გსურთ ახალი პროექტის დაწყება<Y/N>?")
    val ANSWER = readln()
    if (ANSWER == "დიახ"){
        println("ხელახლა დაწყება")
        main()
    }else if(ANSWER == "არა"){
        println("დასასრული")
    }else{
        println("პასუხი არასწორად აკრიფეთ.")
    }
}