package jeremy.kotlincourses.chapter3.unit5.task1

class bankaccount {
    private var balance: Double = 0.0

   fun deposit(amount: Double) {
        balance += amount
    }

    fun getBalance() : Double {
        return balance
    }

}