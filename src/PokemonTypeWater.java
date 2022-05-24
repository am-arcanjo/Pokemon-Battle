package src;

public class PokemonTypeWater extends PokemonType {

    @Override
	public void takeDamage(PokemonType type) {
		System.out.println("This Pokemon Type is Water");
	}
}
