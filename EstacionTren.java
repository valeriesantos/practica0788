public class EstacionTren
{
    private TicketMaquina maquina1;
    private TicketMaquina maquina2;
    private int totalDinero;

    public EstacionTren()
    {
        maquina1 = new TicketMaquina(300);
        maquina2 = new TicketMaquina(200);
        totalDinero= 0;
  }
  
  public void imprimirDineroTotal()
    {
        totalDinero = maquina1.obtenerTotal();
        totalDinero = totalDinero + maquina2.obtenerTotal();
    System.out.println(totalDinero);
    }
    
    public void ventaBillete()
     {
        maquina1.insertarDinero(300);
        maquina2.insertarDinero(200);
        maquina1.imprimirTicket();
        maquina2.imprimirTicket();
        }
    

    

}   

