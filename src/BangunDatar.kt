abstract class BangunDatar(val lebar: Double, val tinggi: Double) {
    constructor(panjang: Double): this(panjang, panjang) {

    }
    abstract fun hitungLuas()

    abstract fun hitungKeliling()
}