package boletin28;


/**
 *
 * @author acabezaslopez
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al = new Alumno("Andrea", 5,"Roade",36);

        al.amosar();
        al.cambiarNota(8);
        al.amosar();
        al.enderezoNovo("lirios", 22);
        al.amosar();
    }

}
