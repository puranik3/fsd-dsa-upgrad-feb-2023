package codewars;

import java.lang.StringBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ConvertToCamelCase {
    static String toCamelCase(String s){
        boolean convertCase = false;
        String output = "";

        for( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt( i );

            if( ch == '_' || ch == '-' ) {
                convertCase = true;
            } else {
                if( convertCase ) {
                    output = output + ( ch + "" ).toUpperCase();
                } else {
                    output = output + ch;
                }

                convertCase = false;
            }
        }

        System.out.println( output );
        return output;
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", toCamelCase(input));
    }

    @Test
    public void testLongOne() {
        String input = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields";
        System.out.println("input: "+input);
        assertEquals("YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields", toCamelCase(input));
    }
}
