package src;
public class Pokemon {
    private PokemonType type;
    private String name;

    public void setType(PokemonType type) {
        this.type = type;
    }

    public PokemonType getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void takeDamage(PokemonType type){
        this.type.takeDamage(type);
    }
}
