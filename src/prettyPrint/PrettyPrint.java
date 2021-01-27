package prettyPrint;

public class PrettyPrint {

    private static PrettyPrint instance = null;
    private PrettyPrint() {
       // Exists only to defeat instantiation.
    }
 
    public static PrettyPrint getInstance() {
       if(instance == null) {
          instance = new PrettyPrint();
       }
       return instance;
    }

    public static void printItpretty(String kind, int hp, double str, int dext, int intg, int level) {
       
     
         System.out.printf("%-1s %-20s %-1s","┌","────────────────────","┐\n");
         System.out.printf("%-1s %-20s %-1s","│","       "+kind+"     ","│\n");
         System.out.printf("%-1s %-20s %-1s","│","────────────────────","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," HP: "+hp+"         ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Str: "+str+"       ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Dex: "+dext+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Int: "+intg+"      ","│\n");
         System.out.printf("%-1s %-20s %-1s","│"," Lvl: "+level+"     ","│\n");
         System.out.printf("%-1s %-20s %-1s","└","────────────────────","┘\n");

        
        
        // System.out.printf("%-20s %-20s",kind+"\n","HP: "+hp);

        //System.out.println(heroInfo);
     }
    
}
