import kotlin.math.pow
import kotlin.math.sqrt

val bangunDatar = arrayOf("Persegi", "Persegi Panjang", "Segitiga")

fun cariLuas(a: Int, b: Int? = null, segitiga: Boolean = false): Double {
    return if (segitiga) {
        0.5 * a * b!!
    } else {
        if (b != null) (a * b).toDouble()
        else (a*a).toDouble()
    }
}

fun cariKeliling(a: Int, b: Int? = null, segitiga: Boolean = false): Double {
    return if (segitiga) {
        a + b!! + sqrt((a.toDouble().pow(2.0) + b.toDouble().pow(2.0)))
    } else {
        if (b != null) (2*a + 2*b).toDouble()
        else 4*a.toDouble()
    }
}

fun bacaMasukan(): Int? {
    val xInput = readLine()
    return xInput?.toInt()
}

fun main() {
    for (items in bangunDatar) {
        var luas: Double
        var keliling: Double

        println("============================================")
        println("Cari luas dan Keliling Bangun Datar : $items")
        println("============================================")
        if (items == "Persegi") {
            print("Masukan sisi : ")
            val sisi = bacaMasukan()

            luas = sisi.let { cariLuas(it!!) }
            keliling = sisi.let { cariKeliling(it!!) }
        } else if (items == "Persegi Panjang") {
            print("Masukan panjang : ")
            val panjang = bacaMasukan()

            print("Masukan lebar : ")
            val lebar = bacaMasukan()

            luas = panjang.let { cariLuas(it!!, lebar) }
            keliling = panjang.let { cariKeliling(it!!, lebar) }
        } else {
            print("Masukan nilai alas : ")
            val alas = bacaMasukan()

            print("Masukan nilai tinggi segitiga : ")
            val tinggi = bacaMasukan()

            luas = alas.let { cariLuas(it!!, tinggi, true) }
            keliling = alas.let { cariKeliling(it!!, tinggi, true) }
        }
        println("============================================")
        println("Luas $items : $luas")
        println("Keliling $items : $keliling")
        println("============================================")
    }
}