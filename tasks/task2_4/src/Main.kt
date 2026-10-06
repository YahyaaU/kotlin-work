// Task 2.4

/*
fun main() {

    val age = 19
    println(age)

    age = 20 // ❌ error: val cannot be reassigned (REMEMBER: val is immutable, var is mutable)
    println(age)
}
*/

// USE VAR INSTEAD OF VAL TO MAKE IT MUTABLE

fun main() {

    var age = 19
    println(age)

    age = 20 // ✅ var can be reassigned (REMEMBER: val is immutable, var is mutable)
    println(age)
}