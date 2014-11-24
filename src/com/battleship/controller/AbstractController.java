package com.battleship.controller;

import com.battleship.model.Coordinates;
import com.battleship.model.AbstractModel;

public abstract class AbstractController {

	
	protected AbstractModel ship;
	protected Coordinates coordinates = new Coordinates(0,0); /*Initialization coordonnées à 0*/
	


	public AbstractController(AbstractModel ship){
		this.ship=ship;
	}

	//Efface (methode aussi dans AbstractModel)
	  public void reset(){
	     this.ship.reset();
	  }
	  
	//M�thode de contr�le
	  abstract void control();
	}


/* invoquer control(); dans chaque action c�d chaq m�thode d�finie 
  Celle-ci va v�rifier les donn�es et informer le mod�le en cons�quence
*/

