import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        //procedemos agregar a las personas en un listado de ArrayList

        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(persona1);
        listado.add(persona2);
        listado.add(persona3);
        listado.add(persona4);

        System.out.println(
                listado.get(0).getNombre()+"-"+
                listado.get(1).getNombre()+"-"+
                listado.get(2).getNombre()+"-"+
                listado.get(3).getNombre()+"-");
//la forma en que lo quiero ordenar
        ArrayList<Persona>listadoOrdenadoPorNombre = Persona.sortPersonas(listado, "nombre");

        System.out.println(
                listadoOrdenadoPorNombre.get(0).getNombre()+ "-"+
                listadoOrdenadoPorNombre.get(1).getNombre()+ "-"+
                listadoOrdenadoPorNombre.get(2).getNombre()+ "-"+
                listadoOrdenadoPorNombre.get(3).getNombre()+ "-");


        System.out.println(persona1);
        System.out.println(persona2);
    }
}
