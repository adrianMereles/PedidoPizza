
package pizza;

import java.util.Scanner;
import pizza.Pizza.Tipo;


public class PedidosPizza {
    
    public static void main(String[] args) {
        
        
        
   /*    Pizza p1 = new Pizza(Tipo.MARGARITA, "mediana");
         Pizza p2 = new Pizza(Tipo.FUNGHI, "familiar");
         Pizza p3 = new Pizza(Tipo.CUATRO_QUESO, "mediana");
         
         System.out.println(p1.MostrarTodo());
         System.out.println(p2.MostrarTodo());
         System.out.println(p3.MostrarTodo());
          p2.sirve();
         p3.sirve();
          System.out.println("servidas: " + Pizza.getTotalServidas());
          System.out.println("pedidas: " + Pizza.getTotalPedidas()); */
   
   
   Scanner sc = new Scanner(System.in);
   int tipo, tamaño;
   Tipo tipoSelec = null;
   String tmaSelc = null;
        System.out.println("PROGRAMA PARA HACER PEDIDO DE PIZA"
        +"\n Seleccione el tipo de piza:" + "\n1: Maragarita"+ "\n2: Cuatro Queso"+ "\n3: Funghi");
        System.out.println("-----------------------------------");
        
        tipo = sc.nextInt();
        
        System.out.println(" Seleccione el Tamaño:" + "\n1: Mediana" + "\n2: Familiar");
        tamaño= sc.nextInt();
        
        switch(tipo){
            case 1:
                    tipoSelec = Tipo.MARGARITA;
                    break;
            case 2: 
                    tipoSelec = Tipo.CUATRO_QUESO;
                    break;
            case 3: 
                    tipoSelec = Tipo.FUNGHI;
                    break;
           default:
                 System.out.println("Ingrese una opcion correcata del tipo de pizza");
            
        }
        
        switch (tamaño){
            
            case 1:
                    tmaSelc= "Mediano";
                    break;
            case 2:
                    tmaSelc= "Familiar";
                    break;
            default:
                 System.out.println("Ingrese una opcion correcta ");
        
        }
        
        Pizza p1 = new Pizza(tipoSelec,tmaSelc);
   
        System.out.println(p1.MostrarTodo());

    }
}
