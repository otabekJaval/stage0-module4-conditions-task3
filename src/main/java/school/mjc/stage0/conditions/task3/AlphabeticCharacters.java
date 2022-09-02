package school.mjc.stage0.conditions.task3;

import javax.security.auth.callback.CallbackHandler;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'u' ||
                character == 'o' || character == 'i') {
            System.out.println("Vowel");
        } else if (character >= 65 && character <= 122) {
            System.out.println("Consonant");
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
