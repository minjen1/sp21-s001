public class ClassNameHere {
    public static int max(int[] m) {
        int n = m.length;
        int max = m[0];
        int i = 1;
        while (i < n){
            if (m[i] > max){
                max = m[i];
                 }
            i = i+1;
             }
         return max;
        }

        public static void main(String[] args) {
        int[] number = new int[]{9, 2, 15, 2, 22, 10, 6};
        int maxNumber = max(number);
        System.out.println(maxNumber);
    }
}
