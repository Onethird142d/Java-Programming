public class task4 {
    public static void main(String[] args){
        int[][]matrix=new int[3][3];

        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix.length;column++){
                matrix[row][column]=(int)(Math.random()*20);
            }
        }
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                System.out.println(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
