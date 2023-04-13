package oop

class User(var firstName: String, var lastName: String, var age: Int){
//    var firstName: String
//    init {
//        if (firstName.startsWith('A'))this.firstName = firstName
//        else this.firstName = "User"
//    }
    constructor(firstName: String) : this(firstName, "lastName", 0)

}