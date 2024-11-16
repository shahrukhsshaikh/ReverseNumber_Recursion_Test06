//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun reverseNumberHelper(number: Int, reversed: Int): Int {
    if (number == 0) return reversed
    return reverseNumberHelper(number / 10, reversed * 10 + number % 10)
}
fun reverseNumber(number: Int): Int {
    return reverseNumberHelper(number, 0)
}
fun main() {
    val number = 98765
    val reversed = reverseNumber(number)
    println(reversed)
}