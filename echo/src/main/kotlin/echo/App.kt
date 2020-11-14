/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package echo

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Hello(val a: Int)

fun main(args: Array<String>) {
  val encodeToString = Json.encodeToString(Hello.serializer(), Hello(12))
  println(encodeToString)
}
