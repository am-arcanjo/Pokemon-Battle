package src;

public class PokemonTypeFire extends PokemonType {
	public PokemonTypeFire(){
		this.name = "Fire";
	}

    @Override
	public void takeDamage(PokemonType type) {
		System.out.println("This Pokemon Type is Fire");
	}
}
