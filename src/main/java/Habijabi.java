public class Habijabi {
    
    public static void greek(){
        char roman = 'a', greek = 'α';
        for (int i = 0 ; i < 26; i++, roman++, greek++) {
            System.out.println(roman+" - "+greek);
        }
    }
    
    
    public static void bengaliDevnagari(){
        char bengali = 0x0980, devnagari= 0x0900;
        for (int i = 0 ; i < 0x80; i++, bengali++, devnagari++) {
            System.out.println(bengali+" - "+devnagari);
        }
    }
    
    public static void main(String[] args) {
        bengaliDevnagari();
    }
}
