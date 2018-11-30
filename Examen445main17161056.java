public class Examen445main17161056 {
	public static void main(String[] args) {
	        int  numero1 = Integer.parseInt(args[0]);
	        
	        if (numero1==1){System.out.print("1"); }
	        
	        else{
	          while (numero1!=1){
	        if (numero1==0){ break;};
	        int numero = numero1%2;
	        
	       if(numero==0){
	         numero1 = numero1/2;
	         System.out.println(numero1);
	         }
	       
	    else{
	    numero1 = (numero1*3)+1;
	    System.out.println(numero1);
	        } 
	                            }
	            }
	        
	         if(numero1==0){System.out.println(numero1);}
	     }
}
