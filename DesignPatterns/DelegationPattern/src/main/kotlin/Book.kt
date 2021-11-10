import java.time.Instant
import java.util.*

class Book(val publicationDate: Instant,
           val author: String,
           val publication: Publication) :
    Publication by publication, Rentable {
    override var currentUser: Optional<User> = Optional.empty()
}