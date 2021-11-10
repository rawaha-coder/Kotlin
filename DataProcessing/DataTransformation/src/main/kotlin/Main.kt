fun main() {
    println("\n *** Data transformation code *** \n")

    println(getCourses())

    println(getLecturesOfCoursesWithSubscribedStudents())
}

fun getCourses() = getStudents().flatMap { student -> student.courses }
    .distinct()

fun getLecturesOfCoursesWithSubscribedStudents() =
    getStudents().flatMap { student -> student.courses }
        .distinct()
        .map { course ->  course.lecturer }
        .distinct()

class Course(val name: String, val lecturer: Lecturer, val isPaid: Boolean = false){
    override fun toString(): String {
        return name
    }
}
data class Student(val name: String, val courses: List<Course>)

data class Lecturer(val name: String)