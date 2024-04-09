package org.launchcode;
//There are many modifiers that gives different kinds of access to the code
//1.Public - Anyone can access our fields and methods
//2.Private - Restricts the access to the fields and methods that can only be used within the class.
public class Helloworld {
  private String message = "Hello World"; // The message must only be used by sayHello so we are setting it into private
  public void sayHello(){ //sayHello can be usable by anyone as we are using 'public'
      System.out.println(message);
   }
}


//GETTER AND SETTER
//**Field should always be private unless we have reason to make them public
//In order provide access to the private field we are using getter and setter method

