class PersegiPanjang(lebar: Double, tinggi: Double) : BangunDatar(lebar, tinggi) {
    override fun hitungLuas() {
        println("Luas persegi panjang ${this.lebar}x${this.tinggi} adalah ${this.lebar * this.tinggi}")
    }

    override fun hitungKeliling() {
        println("Keliling persegi panjang dengan panjang ${this.tinggi} dan lebar ${this.lebar} adalah ${this.lebar * 2 + 2 * this.tinggi}")
    }
}