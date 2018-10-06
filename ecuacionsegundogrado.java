public class EcuacionDeSegundoGrado {


    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Escribe A "));
        B = Integer.parseInt( JOptionPane.showInputDialog("Escribe B"));
        C = Integer.parseInt( JOptionPane.showInputDialog("Escribe C"));
        
       double raiz = Math.sqrt((B*B)- 4*(A*C));
       double resultado1 = (-B+( raiz))/(2*A);
       double resultado2 = (-B-( raiz))/(2*A);
       
       if(resultado1 < resultado2){
        
        System.out.println("X1 = " + resultado1);
        System.out.println("X2 = " + resultado2);
    }
       else{
        System.out.println("X1 = " + resultado2);
        System.out.println("X2 = " + resultado1);
               }
                
             }
}
    
