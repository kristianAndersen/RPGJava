package prettyPrint;

import heros.Hero;

public class PrettyPrint {

    private static PrettyPrint instance = null;
    private static Object ToPrint;

    private PrettyPrint() {
       // Exists only to defeat instantiation.
    }

    public static PrettyPrint getInstance() {
       if (instance == null) {
          instance = new PrettyPrint();
       }
       return instance;
    }

 
    public static void printItpretty(Hero heroInfo) {

      String kind=heroInfo.getKind();
      int hp =heroInfo.getHealt();
      int str = heroInfo.getStrength();
      int dext=heroInfo.getDexterity();
      int intg=heroInfo.getIntelligence();
      int level=heroInfo.getlevel();

         System.out.printf("%-1s %-20s %-1s","┌","────────────────────","┐\n");
         System.out.printf("%-1s %-20s %-1s","│","      "+kind+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│","────────────────────","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," HP: "+hp+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Str: "+str+"       ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Dex: "+dext+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Int: "+intg+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Lvl: "+level+"     ","│\n");
         System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");

     }
    
}
