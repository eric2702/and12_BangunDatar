class Persegi (val lebar: Double, val panjang: Double) :BangunDatar{
    override fun hitungLuas() {
        println("Luas persegi ${this.lebar}x${this.panjang} adalah ${this.lebar * this.pamjang}")
    }

    override fun hitungKeliling() {
        println("Keliling persegi dengan panjang ${this.panjang} dan lebar ${this.lebar} adalah ${this.lebar * 2 + 2 * this.tinggi}")
    }
    
}