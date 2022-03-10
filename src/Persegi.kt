import kotlin.math.pow

class Persegi(var panjang: Double): BangunDatar(panjang) {
    override fun hitungLuas() {
        println("Luas persegi dengan panjang ${this.panjang} adalah ${this.panjang.pow(2)}")
    }

    override fun hitungKeliling() {
        println("Keliling persegi dengan panjang ${this.panjang} adalah ${this.panjang * 4}")
    }
}