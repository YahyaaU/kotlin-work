// Task 2.3

fun main() {

    val myAge = 29u  // prediction: unsigned integer   ✅
    val universeAge = 13_800_000_000L // prediction: long integer ✅
    val status = 'M' // prediction: character ✅
    val name = "Sarah" // prediction: string ✅
    val height = 1.78f // prediction: float ✅
    val root2 = Math.sqrt(2.0) // prediction: double ✅

println(myAge::class)
println(universeAge::class)
println(status::class)
println(name::class)
println(height::class)
println(root2::class)

}

// all predictions are correct. ✅