public class program2 {

    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b')); // ababab
        }
        
        /**
        * Дано четное число N (>0) и символы c1 и c2.
        * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        */
        private static String buildString(int n, char first, char second) {
            String str = new String();
            for (int i = 0; i < n; i++) {
                str += (i % 2 == 0) ? first : second;
            }
            return str;
        }
    }