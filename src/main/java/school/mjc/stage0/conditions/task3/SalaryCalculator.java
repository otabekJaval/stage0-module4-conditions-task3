package school.mjc.stage0.conditions.task3;

import java.util.Calendar;

public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {

    }
    public void isEnglishSymbol(char symbol) {
        if (Character.isAlphabetic(symbol)&&symbol!='Ł'&&symbol!='ł') {
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
