//task1
fun fizzbuz(n : Int = 0) : Array<String>
{
    val array = Array(n){0}
    val arrayAnswer = Array(n){""}
    var b = 0
    for (i in array.indices)
        array[i] = b++
    array.forEach { item -> if(item % 3 == 0 && item % 5 == 0) arrayAnswer[item] = "FizzBuzz"
                            else if(item % 3 == 0) arrayAnswer[item] = "Fizz"
                            else if(item % 5 == 0) arrayAnswer[item] = "Buzz"
                            else arrayAnswer[item] = item.toString()}
    return arrayAnswer
}
//task2
fun sumofTwo (numbers : IntArray, target: Int) : IntArray
{
    val answer = IntArray(numbers.size)
    val debag = IntArray(numbers.size)
    for (i in numbers.indices) {
        for (j in i + 1..<numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                debag[i]++
                debag[j]++
                answer[i] = i
                answer[j] = j
            }
        }
    }
    return if(debag.any { it != 0 })answer else throw IllegalArgumentException("Нет подходящих значений")

}


fun main() {
    fizzbuz(readlnOrNull()?.toIntOrNull() ?: 0).forEach { println(it) }
    sumofTwo(intArrayOf(2, 0), 9).forEach { println(it) }
}