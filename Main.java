public class Main {
    public static void main(String[] args) {
        Character wizard = new Wizard();
        Character knight = new Knight();
        Character archer = new Archer();

        wizard.attack();
        wizard.defend();

        knight.attack();
        knight.defend();

        archer.attack();
        archer.defend();

    }
}