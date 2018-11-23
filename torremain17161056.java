public class torremain17161056 {
	
	public static void main(String[] args) {

		int tablero[][] = new int[8][8];

   int fila_caballo=Integer.parseInt(args[0]);
   int columna_caballo=Integer.parseInt(args[0]);

   String puntofinal = "-01";

   tablero[fila_caballo][columna_caballo]=4;
   for (int veces =0;veces<=1 ;veces++ ) {
	   
	   tablero[fila_caballo][columna_caballo]=4;
	   
	   if (columna_caballo>=1) {tablero[fila_caballo-0][columna_caballo-1]=1;}
	    if (columna_caballo>=2) {tablero[fila_caballo-0][columna_caballo-2]=1;}
	    if (columna_caballo>=3) {tablero[fila_caballo-0][columna_caballo-3]=1;}
	    if (columna_caballo>=4) {tablero[fila_caballo-0][columna_caballo-4]=1;}
	    if (columna_caballo>=5) {tablero[fila_caballo-0][columna_caballo-5]=1;}
	    if (columna_caballo>=6) {tablero[fila_caballo-0][columna_caballo-6]=1;}	
	    if (columna_caballo>=7) {tablero[fila_caballo-0][columna_caballo-7]=1;}	
	    	if (columna_caballo<=6) {tablero[fila_caballo-0][columna_caballo+1]=1;}
	    	if (columna_caballo<=5) {tablero[fila_caballo-0][columna_caballo+2]=1;}
	    	if (columna_caballo<=4) {tablero[fila_caballo-0][columna_caballo+3]=1;}
	    	if (columna_caballo<=3) {tablero[fila_caballo-0][columna_caballo+4]=1;}
	    	if (columna_caballo<=2) {tablero[fila_caballo-0][columna_caballo+5]=1;}
	    	if (columna_caballo<=1) {tablero[fila_caballo-0][columna_caballo+6]=1;}
	    	if (columna_caballo==0) {tablero[fila_caballo-0][columna_caballo+7]=1;}
	    
    
	    if (fila_caballo>=1) {tablero[fila_caballo-1][columna_caballo+0]=1;}  
	    if (fila_caballo>=2) {tablero[fila_caballo-2][columna_caballo+0]=1;}  
	    if (fila_caballo>=3) {tablero[fila_caballo-3][columna_caballo+0]=1;}  
	    if (fila_caballo>=4) {tablero[fila_caballo-4][columna_caballo+0]=1;}  
	    if (fila_caballo>=5) {tablero[fila_caballo-5][columna_caballo+0]=1;}  
	    if (fila_caballo>=6) {tablero[fila_caballo-6][columna_caballo+0]=1;} 
	    if (fila_caballo>=7) {tablero[fila_caballo-7][columna_caballo+0]=1;} 
	    	if (fila_caballo<=6) {tablero[fila_caballo+1][columna_caballo+0]=1;}
	    	if (fila_caballo<=5) {tablero[fila_caballo+2][columna_caballo+0]=1;} 
	    	if (fila_caballo<=4) {tablero[fila_caballo+3][columna_caballo+0]=1;}
	    	if (fila_caballo<=3) {tablero[fila_caballo+4][columna_caballo+0]=1;} 
	    	if (fila_caballo<=2) {tablero[fila_caballo+5][columna_caballo+0]=1;} 
	    	if (fila_caballo<=1) {tablero[fila_caballo+6][columna_caballo+0]=1;} 
	    	if (fila_caballo==0) {tablero[fila_caballo+7][columna_caballo+0]=1;} 

      for (int fila=0;fila<8 ;fila++ ) {
      	for (int columna=0;columna<8 ;columna++ ) {
      		System.out.print(tablero[fila][columna]+" ");
      	}
      	System.out.print("\n");

      }
      System.out.print("\n");
      System.out.print("\n");

      int fila_movimiento=Integer.parseInt(args[2+(veces*2)]);
      int columna_movimiento =Integer.parseInt(args[3+(veces*2)]);


      System.out.println("tablero["+fila_caballo+"+"+fila_movimiento+"]["+columna_caballo+"+"+columna_movimiento+"]"+tablero[fila_caballo+fila_movimiento][columna_caballo+columna_movimiento]);


       if (tablero[fila_caballo+fila_movimiento][columna_caballo+columna_movimiento]==1) {
            fila_caballo +=fila_movimiento;
            columna_caballo +=columna_movimiento;
            puntofinal= fila_caballo+""+columna_caballo;
            System.out.println(puntofinal);
         }else{
            puntofinal= "-01";
            System.out.println(puntofinal);
         }

      for (int fila=0;fila<8 ;fila++ ) {
            for (int columna=0;columna<8 ;columna++ ) {
               tablero[fila][columna]=0;
            }
         }
   }

for (int fila=0;fila<8 ;fila++ ) {
	for (int columna=0;columna<8 ;columna++ ) {
		System.out.print(tablero[fila][columna]+" ");
	}
	System.out.print("\n");

}
      System.out.println(puntofinal);

	}
}
