
/**
 * Main
 */
import prettyPrint.*;
import heros.Hero;

public class Main {

    public static void main(String[] args) {
        PrettyPrint pp =PrettyPrint.getInstance();

        Hero warrior = new Hero("warrior",150,10,3,1,10 );
        
        pp.printItpretty(warrior.getKind(),warrior.getHealt(),warrior.getStrength(),warrior.getDexterity(),warrior.getIntelligence(),
        warrior.getlevel());

    }
}