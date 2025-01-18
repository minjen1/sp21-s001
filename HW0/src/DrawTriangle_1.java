public class DrawTriangle_1 {
    public static void main(String[] args) {
        int row = 0;
        int SIZE = 5;
        while (row < SIZE) {
            int col = 0;
            row = row + 1;
            System.out.println();
            while(col < row){
                col = col + 1;
                System.out.print('*');
            }
        }
    }
}