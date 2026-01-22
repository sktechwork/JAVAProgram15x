    package ex_01_Java_basics;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class string_BufferReader {

        static void main(String[] args) throws IOException {

            //buffer reader is used to read a input string from user.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: ");
            String str = br.readLine();
            System.out.println("YOU HAVE ENTERED :" + str);
            System.out.println("lENGTH OF STRING :" + str.length());
            System.out.println("YOU HAVE ENTERED :" + str.charAt(0));
            System.out.println("Lower Case :" + str.toLowerCase()); // convert to lower case
            System.out.println("Upper Case :" + str.toUpperCase()); // convert to upper case
            System.out.println("Replace character of the String :" + str.replace(str.charAt(0), str.charAt(1))); //replace the  string character
            System.out.println("Replace character :" + str.replace('a', 's'));

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println(rev);

            if(str.equals(rev)){
                System.out.println("String is Palindrome");
            }
            else{
                System.out.println("String is not Palindrome");
        }
      }
    }
