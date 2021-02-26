package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal("dog",40.0,"Denali");
	dog.feed();

	Phone iPhone = new Phone("Apple","7",4.5,"IOS");

	Human me = new Human();
	me.firstName = "Jakub";
	me.lastName = "Zejer";
	me.pet = dog;

	System.out.println("Zwierzak nazywa się" + me.pet.name);



    }
}
