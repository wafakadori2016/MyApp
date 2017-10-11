package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
   private String message;
   @Autowired

   private Country country;

   @Required
   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }

//public Country getCountry() {
//	return country;
//}
   @Autowired 
public void setCountry(Country country) {
	this.country = country;
}
   
   
   
}