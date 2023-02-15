package org.dalychallenge;

import org.passay.*;

public class Validator {
    /*
        n this exercise, you will understand how we can generate a strong password having
        - at least two lowercase characters,
        - two uppercase characters,
        - two digits,
        - and two special characters.
     */

    public String generatePassword(){

        CharacterRule alphabetical = new CharacterRule(EnglishCharacterData.Alphabetical);
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        return passwordGenerator.generatePassword(25, alphabetical);
    }



}
