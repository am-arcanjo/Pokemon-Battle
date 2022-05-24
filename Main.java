import src.Pokemon;
import src.PokemonType;
import src.PokemonTypeFire;
import src.PokemonTypeWater;

public class Main {
    public static void main(String[] args) {
        Pokemon blastoise = new Pokemon();
        PokemonType water = new PokemonTypeWater();
        PokemonType fire = new PokemonTypeFire();

        blastoise.setName("Blastoise");
        blastoise.setType(water);
        blastoise.takeDamage(water);
        System.out.println(blastoise.getName());
    }
}