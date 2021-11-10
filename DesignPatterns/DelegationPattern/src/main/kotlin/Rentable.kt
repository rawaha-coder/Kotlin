import java.util.*

interface Rentable {
    var currentUser: Optional<User>
    fun availableToRent() = !currentUser.isPresent
    fun doRent(user: User): Boolean {
        return if (availableToRent()) {
            currentUser = Optional.of(user)
            true
        } else {
            false
        }
    }
}