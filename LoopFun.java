 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int res = 1;
          if(number == 0) {
              return 0;
          }
          for(int i = number; i > 0; i --) {
              res *= i;
          }
          return res;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String res = "";
          String[] strArray = phrase.split(" ");
          for(String word : strArray) {
              res += word.charAt(0);
          }
          return res.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
        char[] charArray = word.toCharArray();
        String res = "";
        for(int i = 0; i < charArray.length; i ++) {
            if((charArray[i] >= 'a' && charArray[i] <='z') || (charArray[i] >= 'A' && charArray[i] <='Z')) {
                if((charArray[i] >= 'x' && charArray[i] <='z') || (charArray[i] >= 'X' && charArray[i] <='Z')) {
                    res += (char)(charArray[i] + 3 - 26);
                } else {
                    res += (char)(charArray[i] + 3);
                }
            }
        }
        
        return res;
      }
}
