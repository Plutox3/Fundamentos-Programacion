public class Feliz2main17161056 {
  
  
    public static void main(String[] args) 
{ 
    int n = Integer.parseInt(args[0]); 
    if (sinumerofeliz(n)) 
        System.out.println(1); 
    else
        System.out.println(0); 
} 

static int nuevasumacuadrados(int n) 
{ 
    int sumacuadrados = 0; 
    while (n!= 0) 
    { 
        sumacuadrados += (n % 10) * (n % 10); 
        n /= 10; 
    } 
    return sumacuadrados; 
} 
    
static boolean sinumerofeliz(int n) 
{ 
    int d, s; 
   
 
    d = s = n; 
    do
    { 

        d = nuevasumacuadrados(d); 
   
    
        s = nuevasumacuadrados(nuevasumacuadrados(s)); 
   
    } 
    while (d != s); 
   
 
    return (d == 1); 
} 
   
 

} 
