package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

public static void main(String[] args) {
// TODO 自動生成されたメソッド・スタブ


{
//      問① 下記の配列はString型しか格納できないように修正してください。
//   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
      List<String> array = new ArrayList<String>();
//    <以下記述>
      array.add("faa");
      array.add("fuu");
      array.add("foo");
     
//      問② 前から二つ目の要素を"bar"にしましょう。
// 　<以下記述>
      array.set(1, "bar");
      System.out.println(array);
     
//      問③ fooが格納されているインデックスを出力してください。
// 　<以下記述>
      System.out.println("foo が格納されているインデックスは : " + array.indexOf("foo"));

}

{
     
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
Map<String, Object> map = new HashMap<>();
// 　<以下記述>
map.put("address", "/////");
map.put("name", "Kosuke");
map.put("age", 29);
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//    <以下記述>
for (String key : map.keySet()) {
System.out.println("key : " +key);
}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//    <以下記述>
for (Object val : map.values()) {
System.out.println("value : " +val);
}

}

{

//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
          Calendar cal = Calendar.getInstance();
//    <以下記述>
          int[] arrayDate = new int[3];
          arrayDate[0] = cal.get(Calendar.YEAR);
          arrayDate[1] = cal.get(Calendar.MONTH) +1;
          arrayDate[2] = cal.get(Calendar.DATE);
         
//      問⑧ 配列arrayDateをList型に変更しましょう。
//    <以下記述>
          List array = new ArrayList(); 
          for(int num :arrayDate) {
           array.add(num);
          }
//          List<int[]> list = Arrays.asList(arrayDate);
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//    <以下記述>
          for (int i = 0; i < array.size(); i++) {
              //System.out.println(Arrays.toString(list.get(i)));
          System.out.println(array.get(i));
          }
         
}

}

}