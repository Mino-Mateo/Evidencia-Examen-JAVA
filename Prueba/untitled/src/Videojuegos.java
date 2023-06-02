
//Clase Publica Videojuegos
public class Videojuegos
{
    //Atributos
    String nombre;
    String desarrolladora;
    String tipo;
    String plataforma;
    int rate;

    /*##########################################################################################################*/

    //Setters y Getters
    //Nombre Videojuego
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Desarrolladora Videojuego
    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    //Tipo Videojuego
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Plataforma Videojuego
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    //Rate Videojuego
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    /*##########################################################################################################*/

    //Metodos
    //Constructor
    public Videojuegos(String nombre, String desarrolladora, String tipo, String plataforma,int rate ){
        //Establecer los atributos
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.tipo = tipo;
        this.plataforma = plataforma;
        this.rate = rate;
    }
}

