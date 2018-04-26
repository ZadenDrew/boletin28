package boletin28;

/**
 *
 * @author acabezaslopez
 */
public class Alumno {

    String nome;
    int nota;
    Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, int nota, String rua, int num) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = new Enderezo(rua,num);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void cambiarNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    public void enderezoNovo(String rua, int numero) {
        Enderezo novo = new Enderezo(rua, numero);
        this.enderezo = novo;
    }

    public void amosar() {
        System.out.println(Alumno.this);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }

    private class Enderezo {

        String rua;
        int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void amosarEnderezo() {
            System.out.println(Alumno.Enderezo.this);
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }

    }
}
