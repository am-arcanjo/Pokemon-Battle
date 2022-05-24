package src;

public class PokemonTypeGrass extends PokemonType {
	public PokemonTypeGrass(){
		this.name = "Grass";
	}

    @Override
	public void takeDamage(PokemonType type) {
		System.out.println("This Pokemon Type is Grass");
	}
}
