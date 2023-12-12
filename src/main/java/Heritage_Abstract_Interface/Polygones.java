package Heritage_Abstract_Interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Polygones extends Forme implements Calculable {
	 private float largeur;
	 private float longueur; 

	 
	 @Override
	 public float perimetre() {
		 return (largeur * 2) + (longueur * 2);
		 
	 }
	 
	 @Override
	public float aire() {
		return largeur * longueur;
	}
	

}
