import javax.swing.*;

public class Cheque extends Pagamento{
   private String numeroDoCheque;
   
   public Cheque(){
      super();
      numeroDoCheque = "001256-7" ;
   }
   public Cheque(String nC, String n, String c, double v){
      super(n, c, v);
      setNumeroDoCheque(nC);
        
   }
   
   //metodos de acesso
   public String getNumeroDoCheque(){
      return numeroDoCheque;
   }
   
   //metodo modificadores
   public void setNumeroDoCheque (String nC){
      numeroDoCheque = nC;
   }
}