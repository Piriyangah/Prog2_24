package uebung6_140524;
/*
 * Klausurhinweise:
 * else if nur benutzen wenn es auch einen else am ende gibt, sonst if und if
 * returns sollten angegeben werden, es sollt nicht rot sein
 *
 */
public class Schaltjahr {
    public static boolean istSchaltjahr(int jahr){
     /*   if(jahr % 4 == 0) {
            if (jahr % 400 == 0) {
                return true;
            }
            if (jahr % 100 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

      */

        if(jahr % 4 == 0) {
            if (jahr % 100 == 0 && jahr % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Ein Schaltjahr ist definiert als ein jahr, das durch 4 teilbar ist
        // aber ansonsten nicht durch 100 teilbar ist
        // aber es ist auch durch 400 teilbar

        // 2001 ein typisches Normaljahr

        System.out.println(istSchaltjahr(2001));
        // 1996 ein typisches Schaltjahr
        System.out.println(istSchaltjahr(1996));
        System.out.println(istSchaltjahr(1990));
        System.out.println(istSchaltjahr(2000));
    }
}
