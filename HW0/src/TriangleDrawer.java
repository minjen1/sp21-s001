public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int row = 0;
        int Size = N;
        while (row < N){
            int col = 0;
            row = row + 1;
            System.out.println();
            while (col < row){
                col = col + 1;
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
