class Song (
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int
    )
{
    var isPopular = this.playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $year")
    }
}
fun main() {
    var song = Song("a title", "an artist", 1987, 35)
    var songTwo = Song("another title", "an artist", 1987, 1035)

    println(song.isPopular)
    println(songTwo.isPopular)

    song.printDescription()
    songTwo.printDescription()
}