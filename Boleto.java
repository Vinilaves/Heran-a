import javax.swing.*;

public class Boleto extends Pagamento{
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;
   
   public Boleto(){
      super();
      numeroDoBoleto = "511897" ;
   }
   public Boleto(String nB, int d, int m, int a, String n, String c, double v){
      super(n, c, v);
      setNumeroDoBoleto(nB);
      setDia (d);
      setMes (m);
      setAno (a);
        
   }
   
   //metodos de acesso
   public String getNumeroDoBoleto(){
      return numeroDoBoleto;
   }
   public int getDia(){
      return dia;
   }
   public int getMes(){
      return mes;
   }
   public int getAno(){
      return ano;
   }
   
   //metodo modificadores
   public void setNumeroDoBoleto (String nB){
      numeroDoBoleto = nB;
   }
   public void setDia (int d){
      dia = d;
   }
   public void setMes (int m){
      mes = m;
   }
   public void setAno (int a){
      ano = a;
   }
   
}