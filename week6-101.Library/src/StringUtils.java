import java.lang.*;
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word == null || searched==null) return false;

        String w = word.toUpperCase ();
        String s = searched.toUpperCase ();

        w = w.trim ();
        s = s.trim ();

        if (w.contains (s))
            return true;
        else
            return false;

    }
}
