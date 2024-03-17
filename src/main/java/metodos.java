/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erik
 */
public class metodos {
    private String chain;
    private double resul;
    private boolean plus;
    private boolean res;
    private boolean mul;
    private boolean div;
    private boolean rai;
    private boolean sen;
    private boolean cos;
    private boolean tan;
    private boolean cot;
    private boolean sec;
    private boolean csc;
    private boolean to2;
    private boolean toy;
    private boolean sig;
    
      public metodos(){
   
       chain = "";
       plus = false;
       res = false;
       mul = false;
       div = false;
       rai = false;
       sen = false;
       cos = false;
       tan = false;
       cot = false;
       sec = false;
       csc= false;
       to2 = false;
       toy = false;
       sig = false;
       
   
   }
   
   public String conca(String cade){
       this.chain = this.chain + cade;
       return this.chain;  
   }
   
   public void suma(String cade){
       this.resul = Double.parseDouble(cade);
       plus = true;
       this.chain = "";
   }
   
    public void resta(String cade){
       this.resul = Double.parseDouble(cade);
       res = true;
       this.chain = "";
   }
   
     public void multi(String cade){
       this.resul = Double.parseDouble(cade);
       mul = true;
       this.chain = "";
   }
     
     public void divi(String cade){
       this.resul = Double.parseDouble(cade);
       div = true;
       this.chain = "";
   }
     
      public void raiz(String cade){
       this.resul = Double.parseDouble(cade);
       rai = true;
       this.chain = "";
   }
      
      public void seno(String cade){
       this.resul = Double.parseDouble(cade);
       sen = true;
       this.chain = "";
   }
      
      public void cosen(String cade){
       this.resul = Double.parseDouble(cade);
       cos = true;
       this.chain = "";
   }
      
      public void tangen(String cade){
       this.resul = Double.parseDouble(cade);
       tan = true;
       this.chain = "";
   }
      
      public void cotan(String cade){
       this.resul = Double.parseDouble(cade);
       cot = true;
       this.chain = "";
   }
      
      public void secan(String cade){
       this.resul = Double.parseDouble(cade);
       sec = true;
       this.chain = "";
   }
      
      public void cosec(String cade){
       this.resul = Double.parseDouble(cade);
       csc = true;
       this.chain = "";
   }
      
      public void cuadra(String cade){
       this.resul = Double.parseDouble(cade);
       to2 = true;
       this.chain = "";
   }
      
      public void poten(String cade){
       this.resul = Double.parseDouble(cade);
       toy = true;
       this.chain = "";
   }
      public void signo(String cade){
       this.resul = Double.parseDouble(cade);
       sig = true;
       this.chain = "";
   }
      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
               
   public double resul(String num){
       if(plus == true){
           resul = resul + Double.parseDouble(num);
       }
       else if(res == true){
           resul = resul - Double.parseDouble(num);
       }
       else if(mul == true){
           resul = resul * Double.parseDouble(num);
       }
       else if(div == true){
           resul = resul / Double.parseDouble(num);
       }
       else if(rai == true){
           resul = Math.sqrt(Double.parseDouble(num));
       }
       else if(sen == true){
           double senn = Math.toRadians(resul);
           resul = Math.sin(senn);
       }
       else if(cos == true){
           double coss = Math.toRadians(resul);
           resul = Math.cos(coss);
       }
       else if(tan == true){
           double tann = Math.toRadians(resul);
           resul = Math.tan(tann);
       }
       else if(cot == true){
           double cota = Math.toRadians(resul);
           resul = 1 / Math.tan(cota);
       }
       else if(sec == true){
           double seca = Math.toRadians(resul);
           resul = 1 / Math.cos(seca);
       }
       else if(csc == true){
           double cosc = Math.toRadians(resul);
           resul = 1 / Math.sin(cosc);
       }
       else if(to2 == true){
           resul = Math.pow(resul, 2);
       }
       else if(toy == true){
           resul = Math.pow(resul, Double.parseDouble(num));
       }
       else if(sig == true){
           resul = (-1) * Double.parseDouble(num);
       }
       
       plus = false;
       res = false;
       mul = false;
       div = false;
       rai = false;
       sen = false;
       cos = false;
       tan = false;
       cot = false;
       sec = false;
       csc= false;
       to2 = false;
       toy = false;
       
       return resul;
   }
   
}
