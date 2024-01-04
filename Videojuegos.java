public class Videojuegos {
    private String Nombre;
    private int AñoLanzamiento;
public Videojuegos(String Nombre,int AñoLanzamiento){
    this.Nombre=Nombre;
    this.AñoLanzamiento=AñoLanzamiento;
}
    public void setNombre(){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;
    }


    public  void  setAñoLanzamiento(){
        this.AñoLanzamiento=AñoLanzamiento;
    }
    public int getAñoLanzamiento(){
        return AñoLanzamiento;
    }
    public void Iniciar(){
        System.out.print("El videojuego esta iniciando");
    }
}
class Battleroyal extends Videojuegos{
    public int NumJugadores;

    public  Battleroyal(String Nombre,int AñoLanzammiento,int NumJugadores){
        super(Nombre,AñoLanzammiento);
        this.NumJugadores=NumJugadores;
    }
    public  void  setNumJugadores(){
        this.NumJugadores=NumJugadores;
    }
    public int getNumJugadores(){
        return NumJugadores;
    }

    public void ConteoJugadores(){
        System.out.println("\nel videojuego"+getNombre()+"tiene: "+ getNumJugadores() +" jugadores");
    }
}
class Juego extends Battleroyal{
    public int vida;

    public Juego(String Nombre,int AñoLanzamiento,int Numjugadores,int vida){
        super(Nombre,AñoLanzamiento,Numjugadores);
        this.vida=vida;
    }
    public void Daño(){
        System.out.println("\nEsta recibiendo daño");

    }
}



