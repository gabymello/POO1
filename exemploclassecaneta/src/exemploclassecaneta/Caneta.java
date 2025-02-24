package exemploclassecaneta;

public class Caneta {
    //atributos
    String marca, cor ;
    boolean tampada;
    double ponta;
    int carga; 
    
    //métodos
    void tampar(){
      this.tampada = true;
    }
    
    void destampar(){
     this.tampada = false;   
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não é possivel rabiscar");
        }else{
            System.out.println("Estou rabiscando!!");   
        }
    }
    
    void status(){
        System.out.println("marca:" + marca);
        System.out.println("cor:" + cor);
        System.out.println("Está caneta esta tampada:" + tampada);
        System.out.println("Ponta:" + ponta);
        System.out.println("Carga:" + carga);
        
        
    }
}
