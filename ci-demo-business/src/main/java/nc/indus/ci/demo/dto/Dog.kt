package nc.indus.ci.demo.dto

data class Dog(var name: String?, var color: String? = "brown") {
    // Necessary for MapStruct
    constructor() : this(null, null)
}
