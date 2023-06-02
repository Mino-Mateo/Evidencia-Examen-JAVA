/*
Crear 5 Instancias de Videojuegos
Aplicar lo Visto en clase: Setter, Getters, Constructores y Meotdos
Codigo Comentado

Entrega
PDF con capturas
Link del Repositorio en GitHub
*/

//Librerias
import java.util.Scanner;

//Menu
public class Menu
{
    public static void main(String[] args)
    {

        //Objetos
        Videojuegos MarioBros = new Videojuegos(
                "Super Mario Bros",
                "Nintendo",
                "Plataforma",
                "NES",
                9
        ) ;

        Videojuegos GeometryDash = new Videojuegos(
                "Geometry Dash",
                "RobTop Games",
                "Plataforma",
                "PC y Moviles",
                8
        ) ;

        Videojuegos LegendofZelda = new Videojuegos(
                "Legend of Zelda : Ocarina of Time",
                "Nintendo",
                "Aventura",
                "Nintendo 64, PC",
                10
        ) ;

        Videojuegos GodofWar = new Videojuegos(
                "God of War",
                "Sony - Santamonica",
                "Accion - Aventura",
                "PlayStation 5",
                9
        ) ;

        Videojuegos CallofDuty = new Videojuegos(
                "Call of Duty",
                "Activision",
                "Accion",
                "Xbox, PlayStation y Moviles",
                8
        ) ;

        //Impresion en Pantalla
        System.out.println("Selecciona el Videojuego que quieres ver: \n");

        System.out.println("1) Super Mario Bros");
        System.out.println("2) Geometry Dash");
        System.out.println("3) Legend of Zelda : Ocarina of Time");
        System.out.println("4) God of War");
        System.out.println("5) Call of Duty");
        System.out.println("Ingresa tu seleccion: ");
        Scanner Entrada = new Scanner(System.in);
        int numero = Entrada.nextInt(); //Ingreso de Datos

        //Switch de seleccion
        switch (numero) {
            //Mario Bros
            case 1 -> {
                System.out.println("Opción 1 seleccionada.");
                System.out.println("Nombre: " + MarioBros.getNombre());
                System.out.println("Desarrolladora: " + MarioBros.getDesarrolladora());
                System.out.println("Tipo: " + MarioBros.getTipo());
                System.out.println("Plataforma: " + MarioBros.getPlataforma());
                System.out.println("Rate: " + MarioBros.getRate());
            }

            //Geometry Dash
            case 2 -> {
                System.out.println("Opción 2 seleccionada.");
                System.out.println("Nombre: " + GeometryDash.getNombre());
                System.out.println("Desarrolladora: " + GeometryDash.getDesarrolladora());
                System.out.println("Tipo: " + GeometryDash.getTipo());
                System.out.println("Plataforma: " + GeometryDash.getPlataforma());
                System.out.println("Rate: " + GeometryDash.getRate());
            }

            //Legend of Zelda
            case 3 -> {
                System.out.println("Opción 3 seleccionada.");
                System.out.println("Nombre: " + LegendofZelda.getNombre());
                System.out.println("Desarrolladora: " + LegendofZelda.getDesarrolladora());
                System.out.println("Tipo: " + LegendofZelda.getTipo());
                System.out.println("Plataforma: " + LegendofZelda.getPlataforma());
                System.out.println("Rate: " + LegendofZelda.getRate());
            }

            //God of War
            case 4 -> {
                System.out.println("Opción 4 seleccionada.");
                System.out.println("Nombre: " + GodofWar.getNombre());
                System.out.println("Desarrolladora: " + GodofWar.getDesarrolladora());
                System.out.println("Tipo: " + GodofWar.getTipo());
                System.out.println("Plataforma: " + GodofWar.getPlataforma());
                System.out.println("Rate: " + GodofWar.getRate());
            }

            //Call of Duty
            case 5 -> {
                System.out.println("Opción 5 seleccionada.");
                System.out.println("Nombre: " + CallofDuty.getNombre());
                System.out.println("Desarrolladora: " + CallofDuty.getDesarrolladora());
                System.out.println("Tipo: " + CallofDuty.getTipo());
                System.out.println("Plataforma: " + CallofDuty.getPlataforma());
                System.out.println("Rate: " + CallofDuty.getRate());
            }

            //Default
            default -> System.out.println("Opcion Invalida");
        }
}
}
