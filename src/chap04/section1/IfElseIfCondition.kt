package chap04.section1

fun main() {
    print("Enter the score : ")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0) {
        grade = 'B'
    } else if (score >= 70.0) {
        grade = 'C'
    }
    println("Score : $score, Grade : $grade")

    // else if(score in 80.0 .. 89.9) 로 바꿀수 있다
}