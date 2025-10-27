package jeremy.kotlincourses.chapter3

fun main() {
    val bob = MedicalAccount("bob")
    bob.notification()

    val tom = DoctorAccount("Tom")
    tom.notification()

    val jane = PatientAccount("Jane")
    jane.notification()
}

open class MedicalAccount (val username: String){
    open fun notification() {
        println("General notification for $username")
    }
}

class DoctorAccount(patientName: String): MedicalAccount(patientName) {
    override fun notification() {
        println("Doctor alert for $username")
    }
}

class PatientAccount(patientName: String): MedicalAccount(patientName) {
    override fun notification() {
        println("Patient reminder for $username")
    }
}

