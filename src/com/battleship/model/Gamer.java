package com.battleship.model;


//les imports

/**
 * @author 
 * Sayadi Atef
 * Maamma Halima
 * Seurin Audrey
 * Zerrouq Noha
 */
public class Gamer {

	private Ship s1;
	private Ship s2;
	private Ship s3;
	private Ship s4;
	private Ship s5;
	
	public Gamer(Ship s1,Ship s2,Ship s3, Ship s4, Ship s5){
	
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	this.s4=s4;
	this.s5=s5;
	
}
public void shoot (Coordinates c){
	
	//renvoi si c'est toucher ou pas 
	
	
}
	public Ship getS1() {
		return s1;
	}

	public void setS1(Ship s1) {
		this.s1 = s1;
	}

	public Ship getS2() {
		return s2;
	}

	public void setS2(Ship s2) {
		this.s2 = s2;
	}

	public Ship getS3() {
		return s3;
	}

	public void setS3(Ship s3) {
		this.s3 = s3;
	}

	public Ship getS4() {
		return s4;
	}

	public void setS4(Ship s4) {
		this.s4 = s4;
	}

	public Ship getS5() {
		return s5;
	}

	public void setS5(Ship s5) {
		this.s5 = s5;
	}	
	
}