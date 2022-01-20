import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    String[] wordmap = {"first", "second", "third", "fourth",
            "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth"};

    String[] songmap = {"a Partridge in a Pear Tree", "two Turtle Doves",
            "three French Hens", "four Calling Birds",
            "five Gold Rings", "six Geese-a-Laying",
            "seven Swans-a-Swimming", "eight Maids-a-Milking",
            "nine Ladies Dancing", "ten Lords-a-Leaping",
            "eleven Pipers Piping", "twelve Drummers Drumming"};

    String verse(int verseNumber) {
        String s = "";
        s += "On the " + wordmap[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        for (int j = verseNumber - 1; j > 0; j--) {
            s += songmap[j];
            s += ", ";
        }
        if (verseNumber != 1) {
            s += "and ";
        }
        s += songmap[0];
        s += ".\n";
        return s;
    }

    String verses(int startVerse, int endVerse) {
        String s = "";
        for (int i = startVerse - 1; i < endVerse; i++) {
            s += "On the " + wordmap[i] + " day of Christmas my true love gave to me: ";
            for (int j = i; j > 0; j--) {
                s += songmap[j];
                s += ", ";
            }
            if (i != 0) {
                s += "and ";
            }
            s += songmap[0];
            s += ".\n";
            if (i != endVerse - 1) {
                s += "\n";
            }
        }
        return s;
    }

    String sing() {
        String s = "";
        for (int i = 0; i < 12; i++) {
            s += "On the " + wordmap[i] + " day of Christmas my true love gave to me: ";
            for (int j = i; j > 0; j--) {
                s += songmap[j];
                s += ", ";
            }
            if (i != 0) {
                s += "and ";
            }
            s += songmap[0];
            s += ".\n";
            if (i != 11) {
                s += "\n";
            }
        }
        return s;
    }

}
