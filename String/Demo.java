public class Demo{
    
    public static void main(String [] args) {

        String str = "Hello HI whats up";
        int totalLetters = 0;
        int capitalLetterCont = 0, smallLetterCount = 0;
        int smallWord = 0, capitalWord = 0;

        for(int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

            if(ch == ' '|| i == str.length() - 1) {

                if(i == str.length() - 1 && ch != ' ') {

                     totalLetters++;

                    if(ch >= 'A' && ch <= 'Z')  capitalLetterCont++;
                    if(ch >= 'a' && ch <= 'z')  smallLetterCount++;
                }
            
                    if(capitalLetterCont == totalLetters && totalLetters > 0) {

                        capitalWord++;
                    }
                    if (smallLetterCount == totalLetters && totalLetters > 0) {

                        smallWord++;
                    }
                totalLetters = 0;
                capitalLetterCont = 0;
                smallLetterCount = 0;
            }    
            else {
                    totalLetters++;
                if(ch >= 'A' && ch <= 'Z') {

                    capitalLetterCont++;
                }
                if(ch >= 'a' && ch <= 'z') {

                    smallLetterCount++;
                }
            }
        }
        System.out.println("Capital Word = "+capitalWord);
        System.out.println("Small Word   = "+smallWord);
    }
}