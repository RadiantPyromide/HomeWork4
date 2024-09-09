public class Task4 {
    public static void main(String[] args) {
        int i,j,k,c;

        for (i=1;i<100;++i){
            k=0;
            c=0;
            for (j=1;j<=i;++j){if (i%j==0){k+=j;}
                 if (k==i){
                    System.out.println(i);
                    break;

// не получается отсеить  не совершенные число такие как 24, когда сумма
// делителей становиться равна i программа сразу выдает это число.
                }
                }
            }}}
























