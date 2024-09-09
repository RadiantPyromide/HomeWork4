public class Task8 {
    public static void main(String[] args) {
        int hours1, minets1,  m1,m2,m3,counter;
        hours1 = 0;
        minets1 = 0;
        m1 = 0;
        m2=0;
        m3=0;
        counter=0;
        for (hours1 = 0; hours1<=23; ++hours1) {
            for (minets1 = 0; minets1<=59; ++minets1){
                    m1=minets1/10;m2=minets1-m1*10;m3=m2*10+m1;
                    if (m3==hours1){++counter;
                        System.out.println(hours1+":"+minets1);
                    }
                }

            }
        System.out.println("Число комбинацией:"+counter );
        }}








