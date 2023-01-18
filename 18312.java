import java.util.*;
//시각
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();

    int result = 0;
    for (int hour = 0; hour <= n; hour++) {
      for (int minute = 0; minute <= 59; minute++) {
        for (int second = 0; second <= 59; second++) {
          String current = "" + hour + minute + second;
          if(k == 0){
            if(hour < 10 || minute < 10 || second < 10){
              result += 1;
              continue;
            }
          }
          if(current.contains(k + ""))
            result += 1;
          }
        }
      }
    
    System.out.println(result);

    scanner.close();
  }
}
