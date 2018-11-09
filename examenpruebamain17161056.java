public class examenpruebamain17161056 {
    
    	public static void main(String[] args) {
   
            int n = Integer.parseInt(args[0]);
   int n1= 1;
   int n2= 1;
   int total=0;
   for (int i=1;i<=n ;i++ ) {
      n1=n2;
      n2=total;
      total= n1+n2;
      
   }
	System.out.println(total);}

}
