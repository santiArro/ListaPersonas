import java.util.ArrayList;
import java.util.Objects;

public class Persona {

    //creamos la variables
    private String nombre;
    private String apellido;

    //creamos los array String
    private final String[] nombres = {"Andres", "Santiago", "Felipe", "Luis", "Camilo",};

    private final String[] apellidos = {"arroyave", "Parra", "Agudelo", "Lopez", "Jaramillo"};

    //creamos los constructores para pasar el nombre y los apellidos al asar
    public Persona() {
        this.nombre= getRandomItem(nombres);
        this.apellido= getRandomItem(apellidos);

    }

    private String getRandomItem (String[] Listado){
        int randomIndex = (int) Math.round(Math.random()*(Listado.length-1));
        //retormanos posision de elemento
        return Listado[randomIndex];
    }

    //creamos el toString para separar el hasCode
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }



    //creamos los parametros hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return getNombre().equals(persona.getNombre()) && getApellido().equals(persona.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido());
    }

    //generamos los Get and Set de los nombre y apellodo por encapsulamiento Private
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //creamos el metodo que nos va devolver los dastos en funcion lambda
    public static ArrayList<Persona> sortPersonas(ArrayList<Persona> listado, String SortBy){
        switch (SortBy){
            case "nombre"->listado.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()) );
            case "apellido" -> listado.sort((o1, o2) -> o2.getApellido().compareTo(o1.getApellido()));
            default->{
            }
        }
        return listado;
    }
}
