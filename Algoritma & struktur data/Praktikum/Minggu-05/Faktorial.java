public class Faktorial{

public static int faktorialBF(int n){
    int fak = 1;
    int i = 1;
    do {
        fak *= i;
        i++;
    } while (i <= n);
    return fak;
}



public static int faktorialDC(int n){
    if(n == 0){
      return 1;
    }else{
      int fak = n * faktorialDC(n-1);
      return fak;
    }
  }

}