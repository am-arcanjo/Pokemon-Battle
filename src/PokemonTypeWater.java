package src;

public class PokemonTypeWater extends PokemonType {
	public PokemonTypeWater(){
		this.name = "Water";
	}
    @Override
	public void takeDamage(PokemonType type) {
		String typeName = type.getName();
        switch(typeName){
            case "Fire":
            case "Water":
                System.out.println("It's not very effective");
                break;
            case "Grass":
                System.out.println("It's super effective!");
        }
	}
}
