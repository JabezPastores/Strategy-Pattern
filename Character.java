public class Character {
    private final Attack attackStrategy;
    private final Defense defenseStrategy;

    // Inject strategies at creation time
    public Character(Attack attackStrategy, Defense defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }
}