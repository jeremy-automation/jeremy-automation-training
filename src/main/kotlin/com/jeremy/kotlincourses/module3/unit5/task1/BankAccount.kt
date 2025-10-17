package org.example.com.jeremy.kotlinpractice.module3.unit5.task1

class BankAccount {
    private var balance: Double = 0.0

   fun deposit(amount: Double) {
        balance += amount
    }

    fun getBalance() : Double {
        return balance
    }

}