
package pizza;

public class Pizza {

 
   private Tipo tipo;
   private String tamaño;
   private boolean estado; 
  private static int totalPedidos = 0;
  private static int totalServido = 0;
  
  
  public Pizza(Tipo tipo, String tamaño, boolean estado){
      this.tamaño = tamaño;
      this.tipo = tipo; 
      this.estado = estado;
      totalPedidos = totalPedidos +1;
 }
  public Pizza(){
    this.tamaño = "mediama";
    this.tipo = Tipo.MARGARITA;
    this.estado = false;
    
    totalPedidos = totalPedidos +1;
  }
  
    public Pizza(Tipo tipo, String tamaño){
      this.tamaño = tamaño;
      this.tipo = tipo; 
    
    totalPedidos = totalPedidos +1;
    
 }


    public static int getTotalPedidas() {
        return totalPedidos;
    }

    public static int getTotalServidas() {
        return totalServido;
    }
   
  public void sirve(){
      System.out.println("esa piza ya se ha servido");
     totalServido = totalServido +1;
      totalPedidos = totalPedidos-1;
  }
  
  public enum Tipo {
      
      MARGARITA, FUNGHI, CUATRO_QUESO;
  }

   
   
    public Tipo getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public boolean isEstado() {
        return estado;
    }
  
  public String MostrarTodo(){
      
      String estadoString = "";
      if (estado){
          
          estadoString = "servida";
      }
      else{
          estadoString= "pedida";
      }
      return ("pizza: " + this.tipo + "// tamaño: " + this.tamaño + "// " + estadoString).toLowerCase();
  }
  
}
