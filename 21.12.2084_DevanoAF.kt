fun main(){
    //   Extention Function
    fun Int.keliling (p: Int, l:Int):Int =this * (p+l)

    //   Lambda Function
    val lambda : (Int, Int) -> Int = { p:Int, l:Int ->
        val luas = p * l
        luas
    }

    println("\n=======================")
    println("Luas dan Keliling Persegi")
    println("=======================\n")
    print("Panjang : ")
    var panjangTest = readLine()!!
    var panjang = panjangTest.toInt()
    print("Lebar : ")
    var lebarTest = readLine()!!
    var lebar = lebarTest.toInt()

    val hasil = lambda(panjang,lebar)
    println("Luas : $hasil")



    print("Keliling : ")
    println(2.keliling(panjang,lebar))
}