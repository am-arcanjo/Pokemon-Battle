package src;

public class PokemonTypeGrass extends PokemonType {

    @Override
	public void takeDamage(PokemonType type) {
		System.out.println("This Pokemon Type is Grass");
	}
}
