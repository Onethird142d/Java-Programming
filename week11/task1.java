//public class task1 {
   /* public static void main(String[] args){
        int[][] matrix=new int[5][4];
        int[][] matrix1={
                {2,3,4,5},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.err.println("length of matrix1 "+matrix1.length);
        System.err.println("length of first row in matrix1 "+matrix1[0].length);
        System.err.println("value at the first row and 3rd column in matrix1 "+
                matrix1[0][2]);
        int[][] RaggedArray=new int[3][];
        RaggedArray[0]=new int[3];
    }
}
*/
public class task1 {
       public static void main(String[] args) {
           int[][] array = {
                   {1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9},
                   {10, 11, 12}
           };
           System.out.println("数组的行数：" + array.length);
           for (int i = 0; i < array.length; i++) {
               System.out.println("第 " + i + " 行的元素个数：" + array[i].length);
               for (int j = 0; j < array[i].length; j++) {
                   System.out.print(array[i][j] + " ");
               }
               System.out.println();
           }
       }
   }
