package armor;

public class AmorFactory {
    
    public Armors getType(String armorsType) {

        if(armorsType == null){
            return null;
         }
//String coolname, String type, int amorHP, int amorInt, int amorDex, int amorStr
        if (armorsType.equalsIgnoreCase("MELEE")) {

            return new Armors("Conqueror of Ancient Power", armorsType, 15);
        }

        if (armorsType.equalsIgnoreCase("RANGED")) {

            return new Armors("Conqueror of Ancient Power", armorsType, 5);
        }



        return null;
    }

}
