package com.tutorialspoint;

public class Country {
 private String name;
 private String capital;
 
 public String getName() {
     System.out.println("country name : " + name);

	return name;
}

public void setName(String name) {
	this.name = name;
}

public Country() {
	 
 }

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}


}
