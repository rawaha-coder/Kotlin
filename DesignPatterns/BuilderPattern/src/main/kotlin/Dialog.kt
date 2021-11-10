class Dialog {
    lateinit var title: String
    lateinit var message: String
    lateinit var messageColor: String
    lateinit var image: ByteArray
    fun show() = println("Dialog...\n$this")
    override fun toString() = "Title: $title \nImage: $image \nMessage:$message"
}