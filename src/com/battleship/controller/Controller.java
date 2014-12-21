package com.battleship.controller;

import com.battleship.model.Coordinates;
import com.battleship.model.Model;

public abstract class Controller {

	
	protected Model ship;
	protected Coordinates coordinates = new Coordinates(0,0); /*Initialization coordonnées à 0*/
	


	public Controller(Model ship){
		this.ship=ship;
	}

 
	//M�thode de contr�le
	  abstract void control();
	}


/* invoquer control(); dans chaque action c�d chaq m�thode d�finie 
  Celle-ci va v�rifier les donn�es et informer le mod�le en cons�quence
*/

