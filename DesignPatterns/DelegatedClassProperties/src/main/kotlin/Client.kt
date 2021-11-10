import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

data class Client(private val data: Map<String, Any>) {
    val name: String by data
    val email: String by data
    val creditCards: List<CreditCard> by data

    /**
     * Function for serializing instance of Client class into JSON format
     **/
    fun toJson(): String = gson.toJson(data)

    companion object {
        private val gson = Gson()
        /**
         * Utility function for instantiating Client class from JSON string
         */
        fun fromJson(json: String): Client {
            val mapType = object : TypeToken<Map<String, Any>>() {}.type
            val data: Map<String, Any> = gson.fromJson(json, mapType)
            return Client(data)
        }
    }
}