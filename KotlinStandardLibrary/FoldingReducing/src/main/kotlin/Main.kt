fun main() {
    println("\n*** Folding and reducing data sets *** \n")

    val album = Album("Sunny side up", listOf(
        Track("10/10", 176),
        Track("Coming Up Easy", 292),
        Track("Growing Up Beside You", 191),
        Track("Candy", 303),
        Track("Tricks of the Trade", 151)
    ))

    println("*** Fold ***")

    println(album.getStartTimeWithFold(Track("Growing Up Beside You", 191)))
    println(album.getStartTimeWithFold(Track("Coming Up Easy", 292)))

    println("*** Reduce ***")
    println(album.getStartTimeWithReduce(Track("Growing Up Beside You", 191)))
    println(album.getStartTimeWithReduce(Track("Coming Up Easy", 292)))

}

fun Album.getStartTimeWithFold(track: Track): Int {
    if (track !in tracks) throw IllegalArgumentException("Bad track")
        val index = tracks.indexOf(track)
    return tracks
        .take(index)
        .map { (name, duration) -> duration }
        .fold(0) { acc, i -> acc + i }
}

fun Album.getStartTimeWithReduce(track: Track): Int {
    if (track !in tracks) throw IllegalArgumentException("Bad track")
    val index = tracks.indexOf(track)
    return tracks
        .take(index)
        .map { (name, duration) -> duration }
        .reduce { acc, i -> acc + i }
}

data class Track(val title: String, val durationInSeconds: Int)
data class Album(val name: String, val tracks: List<Track>)