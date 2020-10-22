package com.example.demo.forms

import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class PersonForm(
        val name: String = "",
        val age: Int = 0
)