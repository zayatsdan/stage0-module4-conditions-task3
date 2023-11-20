package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int intSymbol=character;
        if ((intSymbol>=97&&intSymbol<=122)||(intSymbol>=65&&intSymbol<=90)){
            if(intSymbol!=97&&intSymbol!=101&&intSymbol!=111&&intSymbol!=117&&intSymbol!=105&&intSymbol!=65&&intSymbol!=69&&intSymbol!=79&&intSymbol!=85&&intSymbol!=73){
                System.out.println("Consonant");
            }else {
                System.out.println("Vowel");
            }
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}
