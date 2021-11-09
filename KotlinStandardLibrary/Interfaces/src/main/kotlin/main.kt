fun main(args: Array<String>) {
    println("\n*** Interface Code ***\n")

    val registrationForm = RegistrationForm()
    println("\nPlease enter your email:")
    var input = false
    while (!input){
        registrationForm.onInputTextUpdated(readLine()!!)
        input = registrationForm.isEmailValid()
    }


}

interface EmailValidator {
    var input: String
    fun isEmailValid(): Boolean = input.contains("@") && input.contains(".")
    fun getUserLogin(): String =
        if (isEmailValid()){
            input.substringBefore("@")
        }else{
            ""
        }
}

class RegistrationForm(override var input: String = "") : EmailValidator{
        fun onInputTextUpdated(newText: String){
            this.input = newText
            if (!isEmailValid()) {
                print("Wait! You've entered wrong email...\n Try again :")
            } else {
                print("Email is correct, thanks: ${getUserLogin()}!")
            }
        }
}