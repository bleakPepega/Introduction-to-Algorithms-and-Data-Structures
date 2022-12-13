import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String password = "F032_Password";
    Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$");
    Matcher matcher = pattern.matcher(password);
    if (matcher.matches()) {
      System.out.println("The password is strong.");
    } else {
      System.out.println("The password is not strong.");
    }
  }
}
