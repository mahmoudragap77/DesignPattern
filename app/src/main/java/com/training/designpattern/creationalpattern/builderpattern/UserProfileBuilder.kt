package com.training.designpattern.creationalpattern.builderpattern

data class UserProfileBuilder(
    var name: String,
    var age: Int,
    var address: String,
    var email: String
)
{
class Builder {
    private var name: String = ""
    private var age: Int = 0
    private var address: String = ""
    private var email: String = ""

    fun setName(name: String) = apply {
        this.name = name
    }

    fun setAge(age: Int) = apply {
        this.age = age
    }

    fun setAddress(address: String) = apply {
        this.address = address
    }

    fun setEmail(email: String) = apply {
        this.email = email
    }

    fun build() = UserProfileBuilder(name, age, address, email)

}
}
