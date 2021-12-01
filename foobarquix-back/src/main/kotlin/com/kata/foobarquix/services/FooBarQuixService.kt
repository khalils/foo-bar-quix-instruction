package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
    
    	val result = StringBuilder()
    	if(inputNumber % 3 == 0){
    		result.append("Foo")
    	}
    	
    	if(inputNumber.toString().contains("3")){
    		result.append("Foo")
    	}
    	
        return result.toString().ifEmpty{
	 		inputNumber.toString()
	 	}
    }

}