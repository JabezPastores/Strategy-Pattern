public class Character {
    private final Attack attackStrategy;
    private final Defense defenseStrategy;

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