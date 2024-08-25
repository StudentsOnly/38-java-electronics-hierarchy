## Exercise: Electronics Hierarchy

#### Objective:

Practice using access modifiers and inheritance in Java by creating a hierarchy of electronics classes.

#### Description:

You should create a set of electronics classes using inheritance. There should be a base class ElectronicDevice, and two derived classes: Television and Smartphone. The base class ElectronicDevice should have protected instance variables for the device's brand and price, and should include public methods to set and get these attributes. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific types of electronic devices.

#### Guidelines:

1.	Create an ElectronicDevice class with the following protected instance variables:
    -	String brand
    -	double price
2.	Implement the following public methods in the ElectronicDevice class:
    -	setBrand - to set the device's brand.
    -	getBrand - to get the device's brand.
    -	setPrice - to set the device's price.
    -	getPrice - to get the device's price.
3.	Create a derived class Television that inherits from ElectronicDevice and has the following additional attributes:
    -	int screenSize
4.	Implement the following methods in the Television class:
    -	setScreenSize - to set the screen size of the television.
    -	getScreenSize - to get the screen size of the television.
5.	Create another derived class Smartphone that inherits from ElectronicDevice and has the following additional attributes:
    -	String operatingSystem
6.	Implement the following methods in the Smartphone class:
    -	setOperatingSystem - to set the operating system of the smartphone.
    -	getOperatingSystem - to get the operating system of the smartphone.
7.	In the main method, create instances of Television and Smartphone, set their attributes, and display their information.
