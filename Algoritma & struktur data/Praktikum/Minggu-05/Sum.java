public class Sum{
  double keuntungan[];

  Sum(int el){
    keuntungan = new double[el];
  }

  double totalBF(){
    double total = 0;
    for(int i = 0; i < keuntungan.length; i++){
      total += keuntungan[i];
    }
    return total;
  }

  double totalDC(double arr[], int i, int r){
    if(i == r){
      return arr[i];
    }else{
      int mid = (i + r) / 2;
      double lsum = totalDC(arr, i, mid);
      double rsum = totalDC(arr, mid + 1, r);
      return lsum + rsum;
    }
  }
}