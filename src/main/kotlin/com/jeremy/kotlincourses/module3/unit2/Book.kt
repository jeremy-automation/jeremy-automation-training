package org.example.com.jeremy.kotlincourses.module3.library

class Book(val _title: String, val _author: String) {

    val description: String
        get(){
            return "Book: $_title by $_author"
        }

    var title: String = _title
        set(value){
            if(value.isNotEmpty()){
                field = value
            }
        }
        get(){
            return title
        }
}