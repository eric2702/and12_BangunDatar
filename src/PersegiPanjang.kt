class PersegiPanjang(lebar: Double, tinggi: Double) : BangunDatar(lebar, tinggi) {
    override fun hitungLuas() {
        println("Luas persegi panjang ${this.lebar}x${this.tinggi} adalah ${this.lebar * this.tinggi}")
    }
}