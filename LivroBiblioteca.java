public class LivroBiblioteca extends Livro{    
    //Atributos
    String localPrateleira;
    String categoria;
    int prazoEntrega;
    String nomeQuemEmprestou;

    //Metodos
    public void Alugar(){
        System.out.println("Estou alugando..");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo..");
    }
}