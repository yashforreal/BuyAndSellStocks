// import java.util.*;

// public class Pascal {
//     public static void main(String[] args) {
//         System.out.println(getRow(4));
//     }
//     public static List<Integer> getRow(int rowIndex) {
//         HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
//         if(rowIndex==0) hm.put(0,new ArrayList<Integer>(){{add(1);}});
//         if(rowIndex==1) hm.put(1,new ArrayList<Integer>(){{add(1);add(1);}});
//         for(int i=2;i<=rowIndex;i++){
//             hm.put(i, getList(i, hm));
//         }
//         // List<Integer> opList = new ArrayList<Integer>();
//         // if(rowIndex==0){
//         //     opList.add(1);
//         //     return opList;
//         // }
//         // else if(rowIndex==1){
//         //     opList.add(1);
//         //     opList.add(1);
//         //     return opList;
//         // }
//         // for(int i=0;i<=rowIndex/2;i++){
//         //     opList.add(getSum(i,rowIndex+1));
//         // }
//         // int x=opList.size()-1;
//         // for(int j=(rowIndex/2)+1;j<=rowIndex;j++){
//         //     if(rowIndex%2==0) x--;
//         //     opList.add(opList.get(x));
//         //     x--;
//         // }
//         return new ArrayList<Integer>(){{add(1);}};
//     }
//     public static List<Integer> getList(int n, HashMap<Integer, List<Integer>> hm){
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         for(Iterator jIterator)

//         return list;
//     }
// }
