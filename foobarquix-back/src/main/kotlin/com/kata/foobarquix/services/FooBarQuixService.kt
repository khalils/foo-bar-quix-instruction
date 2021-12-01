package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
	    
	    val result = StringBuilder()
	    val fooBarMap = mapOf(3 to "Foo", 5 to "Bar")
	    
	    fooBarMap.forEach { k, v ->
        	if ( inputNumber % k == 0) {
            	result.append(v)
        	}
    	}
	    
	    val fooBarQuixMap = fooBarMap + Pair(7,"Quix")

	    for(digit in inputNumber.toString()) {
	    	val number = Integer.valueOf(digit.toString())
	    	if(fooBarQuixMap.keys.contains(number)){
	    		result.append(fooBarQuixMap[number])
	    	}
	    }

        return result.toString().ifEmpty{
	 		inputNumber.toString()
	 	}
    }

}