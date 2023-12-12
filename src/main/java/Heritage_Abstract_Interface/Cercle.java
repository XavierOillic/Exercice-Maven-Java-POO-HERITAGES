package Heritage_Abstract_Interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cercle extends Forme implements Calculable {
	 private float rayon;
	 
	 
	 @Override
	 public float perimetre() {
		return (float) (Math.PI * (rayon * 2));
		
		 
	 }
	 
	 @Override
	public float aire() {
		return (float) Math.PI * (rayon * rayon);
		
	}
}
