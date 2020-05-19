import javax.swing.*;

public class Pagamento{
   private String nomeDoPagador;
   private String cpf;
   double valorPago;
   
   public Pagamento(){
    nomeDoPagador = "Luis Fabiano";
    cpf = "485.354.654-51";
    valorPago = 500.00;
   }
 
   public Pagamento (String n, String c, double v){
      nomeDoPagador = n;
      cpf = c;
      valorPago = v;
   }
   
   //metodo de acesso
   public String getNomeDopagador(){
      return nomeDoPagador;
   }
   public String getCpf(){
      return cpf;
   }
   public double getValorPago(){
      return valorPago;
   }
   
   //metodo modificadores
   public void setNomeDoPagador (String n){
      nomeDoPagador = n;
   }
   public void setCpf (String c){
      cpf = c;
   }
   public void setValorPago (double v){
      valorPago = v;
   }
}