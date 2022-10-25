package fightersService;

public class FighterService {
    public boolean willFighterWin(Fighter firstFighter, Fighter secondFighter, int hits) {
        int totalDamage = firstFighter.getDamagePerHit() * hits;
        if (totalDamage >= secondFighter.getHealth()){
            return true;
        }
        else { return false;
        }



        //return secondFighter.getHealth() <= firstFighter.getDamagePerHit() * hits;
        //fixme delete comment
    }
}