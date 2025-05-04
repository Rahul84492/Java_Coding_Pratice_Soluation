public class diceRoll {
    public static void main(String[] args) {
        System.out.println("welcome to print the Dice roll: ");
        double dice = Math.random()*6;
        System.out.println((int)Math.ceil(dice));
    }
}
