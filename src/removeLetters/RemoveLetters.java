package removeLetters;

public class RemoveLetters {
     public static char[] removeLetters(String fulltext){
         if (fulltext == null) {
             return new char[0];
         }

         fulltext = fulltext.toLowerCase();

         String[] arr = fulltext.split("");

         String result = "";

         for (String ch: arr) {
             if (ch.equalsIgnoreCase("r")){
                ch = ch.replace("r", "!");
             }
             result += ch;
         }

        return result.toCharArray();
    }
}
