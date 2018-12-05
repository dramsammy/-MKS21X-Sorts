public class Sorts{
  public static void selectionsort(int [] ary){
    int temp;
    int change;
    for (int i = 0; i < ary.length; i++){
      temp = ary[i];
      change = ary[i];
      for (int a = i; a < ary.length; a++){
        if (ary[a] < change){
          temp = ary[a];
          change = a;
        }
      }
      ary[change] = i;
      ary[i] = temp;
    }
  }
  //TEST
  public static void main(String[] args) {
    int[] Test = new int[5];
    Test[0] = 0;
    Test[1] = 3;
    Test[2] = 7;
    Test[3] = 10;
    Test[4] = 4;
    selectionsort(Test);
    for (int i = 0; i < Test.length; i++){
      System.out.println(Test[i]);
    }
  }
}
