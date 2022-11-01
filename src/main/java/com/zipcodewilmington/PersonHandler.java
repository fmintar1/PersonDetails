package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler{
    private final Person[] personArray;
    String personCounter = "";

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i = 0;
        // while `counter` is less than length of array
        while (i < personArray.length) {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            currentPerson.getFirstName();
            currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result+=currentPerson.toString();
            i++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        for(int i = 0; i < personArray.length; i++) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            currentPerson.getFirstName();
            currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result+=currentPerson.toString();
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        for (Person personCounter : personArray) {
            // begin loop
            // get `string Representation` of `currentPerson`
            personCounter.getFirstName();
            personCounter.getLastName();
            // append `stringRepresentation` to `result` variable
            result+=personCounter.toString();
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
