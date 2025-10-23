package jeremy.kotlincourses.chapter3.unit5.task1


fun main () {
    val bank = bankaccount()

    bank.deposit(200.00)
    val bal = bank.getBalance()
    println(bal)

//    println(bank.balance) -> Cannot access 'var balance: Double': it is private in
}