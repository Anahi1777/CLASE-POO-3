public class Celular {

    String marca;
    String modelo;
    int bateria = 100; 
    /*
    * 
    *firma del metodo
    *publico
    *void --> no retorna
    *el metodo tiene como nombre "llamar"
    *tiene un parametro y es de tipo entero
    */
    public void llamar(String numero) {
        System.out.println("Llamando al " + numero +"...");
        this.bateria -= 5;
    }
}