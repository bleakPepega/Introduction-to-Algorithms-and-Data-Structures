import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String regex = "^abcdefghijklmnopqrstuv18340$";
    String str1 = "abcdefghijklmnopqrstuv18340";
    String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
    boolean isMatch1 = Pattern.matches(regex, str1);
    boolean isMatch2 = Pattern.matches(regex, str2);
    System.out.println(isMatch1); 
    System.out.println(isMatch2);  
  }
}