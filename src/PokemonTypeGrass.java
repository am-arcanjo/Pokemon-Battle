package src;

public class PokemonTypeGrass extends PokemonType {
	public PokemonTypeGrass(){
		this.name = "Grass";
	}

    @Override
	public void takeDamage(PokemonType type) {
		String typeName = type.getName();
        switch(typeName){
            case "Grass":
            case "Water":
                System.out.println("It's not very effective");
                break;
            case "Fire":
                System.out.println("It's super effective!");
        }
	}
}
