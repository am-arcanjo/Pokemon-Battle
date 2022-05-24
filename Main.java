import src.Pokemon;
import src.PokemonType;
import src.PokemonTypeFire;
import src.PokemonTypeGrass;
import src.PokemonTypeWater;

public class Main {
    public static void main(String[] args) {
        Pokemon blastoise = new Pokemon();
        Pokemon charizard = new Pokemon();
        Pokemon venusaur = new Pokemon();

        PokemonType water = new PokemonTypeWater();
        PokemonType fire = new PokemonTypeFire();
        PokemonType grass = new PokemonTypeGrass();

        blastoise.setName("Blastoise");
        charizard.setName("Charizard");
        venusaur.setName("Venusaur");
        
        
        blastoise.setType(water);
        charizard.setType(fire);
        venusaur.setType(grass);

        blastoise.takeDamage(grass);
        charizard.takeDamage(water);
        venusaur.takeDamage(fire);
 
    }
}