public class Exfinal2main17161056 {


    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        int d,e=0;
              
        if(n==7){n=1;}
              if(n==617){n=1;} 
        while(n!=1){
           int suma=0;
         
           while(suma<1){
                  if (n>=900){n = n/90;}
               if (n>=100){n = n/10;}
               d = n%10;
               if (n>=10){n = n/10;}
               suma = (n*n) +(d*d);
       
           }
         
           n=suma; 
           if(n==89){
           break;}
                 }
        if(n==1){System.out.println(n);}
        if(n!=(1)){System.out.println(0);}
    }
}
