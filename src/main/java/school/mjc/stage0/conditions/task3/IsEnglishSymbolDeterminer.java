package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
         int intSymbol=symbol;
        if ((intSymbol>=97&&intSymbol<=122)||(intSymbol>=65&&intSymbol<=90)){
            System.out.println("English");
        }
        else {
            System.out.println("Non english");
        }
    }
}
