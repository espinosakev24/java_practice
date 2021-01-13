public class Animal {
    private String name;
    private String specie;
    private String description;

    public Animal (String name, String specie, String description) {
        this.name = name;
        this.specie = specie;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    public String getDescription() {
        return description;
    }
}
