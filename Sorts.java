public class Sorts{
  public static void selectionsort(int [] ary){
    int min;
    int larger = 0;
    int indexM = 0;
    int indexL = 0;
    int current = 0;
    int counter = 0;
    for (int i = 0; i < ary.length; i++){
      min = ary[i];
      for (int a = i; a < ary.length; a++){
        if (ary[a] <= min){
          min = ary[a];
          indexM = a;
          larger = ary[a];
        }
      }
    min = ary[indexM];
    ary[indexM] = ary[i];
    ary[i] = min;
    }
  }
}
//   //TEST
//   public static void main(String[] args) {
//     int[] Test = new int[10];
//     Test = {1,3,5,67,73,2,2,-1,23,-41};
//     selectionsort(Test);
//     for (int i = 0; i < Test.length; i++){
//       System.out.println(Test[i]);
//     }
//   }
// }
