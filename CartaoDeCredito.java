import javax.swing.*;

public class CartaoDeCredito extends Pagamento{
   private String numeroDoCartao;
   
   public CartaoDeCredito(){
      super();
      numeroDoCartao = "4520 5213 5456 4521" ;
   }
   public CartaoDeCredito(String nU, String n, String c, double v){
      super(n, c, v);
      setNumeroDoCartao (nU);
        
   }
   
   //metodos de acesso
   public String getNumeroDoCartao(){
      return numeroDoCartao;
   }
   
   //metodo modificadores
   public void setNumeroDoCartao (String nU){
      numeroDoCartao = nU;
   }
}