public class Main {
  public static void main(String[] args) {
    int i = 1;
    boolean[] d = new boolean[10000];

    while(i < 10001){
      int dnum = i + 1 / 10000 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + i % 10;
      if(dnum <= 10000)
        d[dnum - 1] = true;
      i++;       
    }
    for(i = 0; i < 10000; i++){
      if(d[i]==false)
        System.out.println(i + 1);
    }
  }
}
