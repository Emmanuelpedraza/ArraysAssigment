import java.util.Random;


    public class Arrays {
        public static void main(String[] args) {
            Random rd = new Random();
            int[][] Arrays = new int[10][20];


            int i;
            for (i = 0; i < Arrays.length; i++) ;


            int j;
            for (j = 0; j < Arrays.length; j++) ;

            Arrays[i][j] = rd.nextInt(20);
            System.out.println(Arrays[i][j]);
        }
    }

