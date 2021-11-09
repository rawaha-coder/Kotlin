import com.google.gson.Gson

fun main() {
    println("\n*** Smart types checking with generic reified parameters code ***\n")

    val json = "{\"firstName\": \"John\", \"lastName\": \"Smith\"}"
    val response = Gson().fromJson<ApiResponse>(json)

    println(response.toString())

}

data class ApiResponse(val gifsWithPandas: List<ByteArray>)

