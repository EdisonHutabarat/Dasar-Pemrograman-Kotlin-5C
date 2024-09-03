fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))
    print('\n') //memeriksa nilai true/false

    //toUpperCase() and toLowerCase()
    var config = "Fullscreen shaDows autoSave"
    config = config.toLowerCase() //mengubah seluruh karakter string menjadi huruf kecil
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))
    print('\n') //memeriksa apakah string mengandung substring tertentu

    //replace
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin") //mengganti kata Java menjadi Kotlin
    println(s) //memanggil variabel s dari atas
    println("$strJava is ${strJava.length} characters long.") //memanggil string dengan variabel strJava dan mengembalikan panjang String setelah penggatian kata

    //substring()
    println("I would not banish all of these Internets.".substring(2, 7))
    //menampilkan substring dari string berdasarkan indeks, disini dari ke 7 indeks yang ditampilkan adalah indeks ke 2

    //compareTo()
    println("alpha".compareTo("bravo"))
    //membandingkan 2 string berdasarkan leksikografis atau urutan karakter.
    // jika string1 < string2 = negatif
    // jika string1 = string2 = 0
    // jika string1 > string2 = positif
    //disini a(alpha) < b(bravo) = -1


}