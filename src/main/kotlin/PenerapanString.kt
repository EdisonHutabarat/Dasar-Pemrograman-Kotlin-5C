fun main(args: Array<String>) {
    //Character occurence  in a sentence analysis
    //the string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    // counters initialization
    var vowelCount = 0
    var consonantCount = 0

    //definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    //main Loop
    for (c in s) {
        if (vowels.contains(c)){
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("length of string : ${s.length}")
    println("Other Characters: ${s.length - (vowelCount + consonantCount)}") //109-(55+33)=21
}