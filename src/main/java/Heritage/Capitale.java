package Heritage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString (callSuper = true) // Me permet d'afficher class, et args dans le SysOUt en une ligne

@Getter
@Setter

public class Capitale extends Ville{
	
	private List<Monument> monumentS = new ArrayList<>();

	
	public Capitale (String nom, int nbHabitants) {
		super(nom, nbHabitants);
		if (nom == null && nom.isBlank()) {
			throw new IllegalArgumentException("This field cannot be empty ");
		}
		if (nbHabitants == 0) {
			throw new IllegalArgumentException("This field cannot be empty !");
		}
	}
	
	public void ajouterMonument (Monument monumentS) {
		if (!this.monumentS.contains(monumentS))
			this.monumentS.add(monumentS);
	}
	public List<Monument> getMonumentS (String nom){
		return Collections.unmodifiableList (monumentS);
		
	}
	
	
	
	
}
