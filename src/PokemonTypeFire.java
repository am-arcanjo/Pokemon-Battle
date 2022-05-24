package src;

public class PokemonTypeFire extends PokemonType {
	public PokemonTypeFire(){
		this.name = "Fire";
	}

    @Override
	public void takeDamage(PokemonType type) {
		String typeName = type.getName();
        switch(typeName){
            case "Grass":
            case "Fire":
                System.out.println("It's not very effective");
                break;
            case "Water":
                System.out.println("It's super effective!");
        }
	}
}
