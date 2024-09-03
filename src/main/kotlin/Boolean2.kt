fun main(args: Array<String>) {
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)
    var varInt : Int = 1
//    if(varInt)
        println("varInt bernilai " + varInt)

    //dalam bahasa pemrograman kotlin kondisi if harus bertype data boolean
    ///terjadi kesalahan kompilasi karena varInt bukan bertipe boolean.
}