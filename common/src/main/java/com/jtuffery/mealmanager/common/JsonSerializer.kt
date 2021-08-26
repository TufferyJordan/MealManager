import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

val jsonSerializer = Json {
    ignoreUnknownKeys = true
    coerceInputValues = true
}

@InternalSerializationApi
inline fun <reified T : Any> T.serialize(): String =
    jsonSerializer.encodeToString(T::class.serializer(), this)

@InternalSerializationApi
inline fun <reified T : Any> String.deserialize(): T =
    jsonSerializer.decodeFromString(T::class.serializer(), this)

@InternalSerializationApi
inline fun <reified T : Any> List<T>.serializeList(): String =
    jsonSerializer.encodeToString(ListSerializer(T::class.serializer()), this)

@InternalSerializationApi
inline fun <reified T : Any> String.deserializeList(): List<T> =
    jsonSerializer.decodeFromString(ListSerializer(T::class.serializer()), this)