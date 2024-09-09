public class Task3 {
    public static void main(String[] args) {

        int d1,d2,d3,c;
        for (int i=100;i<1000;++i){
            d1=0;
            d2=0;
            d3=0;
            c=3;
            if (i<1000&&i>100){d1=i/100;d2=(i-d1*100)/10;d3=i-d1*100-d2*10;}
                if(Math.pow(d1,c)+Math.pow(d2,c)+Math.pow(d3,c)==i)
                    System.out.println(i);
                }
        int d11,d22,d33,d44,c22;
        d11=0;
        d22=0;
        d33=0;
        d44=0;
        c22=4;
        for (int j=1000;j<10000;++j){d11=j/1000;d22=(j-d11*1000)/100;d33=(j-d11*1000-d22*100)/10;d44=j-d11*1000-d22*100-d33*10;
if (Math.pow(d11,c22)+Math.pow(d22,c22)+Math.pow(d33,c22)+Math.pow(d44,c22)==j){
    System.out.println(j);
}



        }

        int dd1,dd2,dd3,dd4,dd5,cc4;
        dd1=0;
        dd2=0;
        dd3=0;
        dd4=0;
        dd5=0;
        cc4=5;
        for (int k=10000;k<100000;++k){dd1=k/10000;dd2=(k-dd1*10000)/1000;dd3=(k-dd1*10000-dd2*1000)/100;dd4=k-(dd1*10000-dd2*1000-dd3*100)/10;dd5=k-dd1*10000-dd2*1000-dd3*100-dd4*10;
            if(Math.pow(dd1,cc4)+Math.pow(dd2,cc4)+Math.pow(dd3,cc4)+Math.pow(dd4,cc4)+Math.pow(dd5,cc4)==k)
                System.out.println(k);

            }


            }}
// Программа может показать все чиста Армстронга от 100 до 10000

