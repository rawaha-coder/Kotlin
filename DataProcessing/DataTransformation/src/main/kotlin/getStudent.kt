val s1 = Student("Karim", listOf(
    Course("S1C1", Lecturer("L1"), true),
    Course("S1C2", Lecturer("L2")),
    Course("S1C3", Lecturer("L5"))
))

val s2 = Student("Souad", listOf(
    Course("S2C1", Lecturer("L1"), false),
    Course("S2C2", Lecturer("L2"), true),
    Course("S2C3", Lecturer("L4"))
))

val s3 = Student("Souad", listOf(
    Course("S3C1", Lecturer("L1"), true),
    Course("S3C2", Lecturer("L2"), true),
))

fun  getStudents(): List<Student> {
    return listOf(s1, s2, s3)
}


