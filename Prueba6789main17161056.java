import javax.swing.JOptionPane;

public class Prueba6789main17161056 {

     public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        if(n==7){n=1;}
        if(n==13){n=1;}
        if(n==19){n=1;}
        if(n==23){n=1;}
        if(n==31){n=1;}
        if(n==79){n=1;}
        while(n!=1){
           int suma=0;
          
           while(suma<1){
             if (n>=100){n = n/10;}
               int d = n%10;
               if (n>=10){n = n/10;}
               suma = (n*n)+(d*d);
       
           }
         
           n=suma; 
           if(n==145){
           break;}
           if(n==58){
           break;}
           if(n==89){
           break;}
           if(n==37){
           break;}
        }
        if(n==(1)){System.out.println(n);}
        if(n!=(1)){System.out.println(0);}
    }
}
