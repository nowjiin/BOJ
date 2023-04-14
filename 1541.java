/*
90+30-20+50-30+60-70+30+20
=> (90+30)-(20+50)-(30+60)-(70+80)
*/


import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String data = scanner.next();
    int result = 0;
    
    int minusIndex = data.indexOf("-");
    if(minusIndex == -1){//-가 없는 경우
      String[] arr = data.split("\\+");
      for(String x: arr){
        result += Integer.parseInt(x);
      }
    }
    else { //-가 있는 경우
      // 첫째 마이너스(-) 앞 부분 문자열
      String add = data.substring(0, minusIndex);
      // 첫째 마이너스(-) 뒤 부분 문자열
      String minus = data.substring(minusIndex + 1);
      // 앞 부분은 모두 더하기
      String[] arr = add.split("\\+");
      for (String x: arr) {
        result += Integer.parseInt(x);
      }
      // 뒤 부분은 모두 뺴기
      arr = minus.split("-");
      for (String x: arr) {
        String[] subArr = x.split("\\+");
        for (String y: subArr) {
           result -= Integer.parseInt(y);
        }
      }
    }
    System.out.println(result);
  }
}
