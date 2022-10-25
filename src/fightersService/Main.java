package fightersService;

public class Main {
    public static void main(String[] args) {
        Fighter firstFighter  = new Fighter();
        Fighter secondFighter = new Fighter();

        secondFighter.setHealth(30);
        firstFighter.setDamagePerHit(10);


        System.out.println("First fighter HP : " + firstFighter.getHealth());
        System.out.println("Second fighter HP : " + secondFighter.getHealth());
        System.out.println("First fighter damage : " + firstFighter.getDamagePerHit());
        System.out.println("Second fighter damage : " + secondFighter.getDamagePerHit());

        FighterService service = new FighterService();
        System.out.println(service.willFighterWin(firstFighter, secondFighter, 10));
    }

}
