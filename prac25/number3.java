import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String text = "The prices are 25.98 USD, 50.25 RUВ, and 75.50 EU.";
    Pattern pattern = Pattern.compile("(\\d+\\.\\d+) (USD|RUВ|EU)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      String price = matcher.group(1);
      String currency = matcher.group(2);
      System.out.println(price + " " + currency);
    }
  }
}
