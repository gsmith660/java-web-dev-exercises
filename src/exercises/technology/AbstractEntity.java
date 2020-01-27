package exercises.technology;

public abstract class AbstractEntity {
    private static int nextId = 0;
    private int Id;

    // Setters
    public void setId() {
        this.Id = nextId++;
    }

    // Getters
    public int getId() {
        return Id;
    }
}
