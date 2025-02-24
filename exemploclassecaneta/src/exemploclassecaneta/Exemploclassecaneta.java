
package exemploclassecaneta;
//classe princial
public class Exemploclassecaneta {
    
    public static void main(String[] args) {
    Caneta caneta1 = new Caneta();
    caneta1.cor = "Azul";
    caneta1.carga = 100;
    caneta1.marca = "bic";
    caneta1.ponta = 0.7;
    caneta1.tampada = true;
    caneta1.status();
    caneta1.rabiscar();
    
        System.out.println("----------------");
        
        Caneta caneta2 = new Caneta();
        caneta2.marca = "bic";
        caneta2.carga = 100;
        caneta2.cor = "vermelho";
        caneta2.tampada = false;
        caneta2.ponta = 0.7;
        caneta2.rabiscar();
        caneta2.status();
    }
    
}
