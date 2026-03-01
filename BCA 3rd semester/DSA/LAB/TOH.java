package DsA;

public class TOH {
    static void towerOfHanoi(int n,char src,char aux,char dest) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, src, dest, aux);
        System.out.println(" move " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, aux, src, dest);

    }
        public static void main(String... args){
        int n=3;
        char src='A';
        char aux='B';
        char dest='C';
        towerOfHanoi(n,src,aux,dest);


        }
}

