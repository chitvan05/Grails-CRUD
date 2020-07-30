package com.rahul

class Player {

	static belongsTo = [team: Team]
	String name
	String age
	String position



    static constraints = {

    	name size: 5..40, blank: false
    	age min: 16
    	position size: 5..40, blank: false
    }

String toString(){
	name
}

}
