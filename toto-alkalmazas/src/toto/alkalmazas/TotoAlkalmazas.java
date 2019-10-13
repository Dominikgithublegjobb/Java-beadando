
package toto.alkalmazas;

import java.io.*; 
import java.util.ArrayList;


 
public class TotoAlkalmazas 
{ 
  public static void main(String[] args)throws Exception 
  { 
    ArrayList<TotoAlkalmazas> sorok = new ArrayList<TotoAlkalmazas>();
    
    
  File file = new File("C:\\Users\\Overlord\\Desktop\\Addattervezes_5\\toto.csv"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
   String st; 
  while ((st = br.readLine()) != null) 
  {
    System.out.println(st); 
     String halo[] = st.split(";");
    TotoAlkalmazas sor;
      sor = new TotoAlkalmazas();
  }
      //ha sikerult volna feltolteni az objektumot a megoldasok
      
    //
    
  } 
  
} 
