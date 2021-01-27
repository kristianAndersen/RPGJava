package heros;

/**
 * HeroFactory
 */
public class HeroFactory {

    public Hero getHeroKind(String heroKind) {
        
        if(heroKind == null){
            return null;
         }

        if (heroKind.equalsIgnoreCase("WARIOR")) {

            return new Hero(heroKind, 150, 10, 3, 1, 1);
        }

        if (heroKind.equalsIgnoreCase("RANGER")) {
            return new Hero(heroKind, 120, 5, 10, 2, 1);
        }

        if (heroKind.equalsIgnoreCase("MAGE")) {
            return new Hero(heroKind, 100, 2, 3, 10, 1);
        }

        return null;
    }

	
	
}
