public class LivroLivraria extends Livro{ 
    //Atributos
    public String localPrateleira;
    public String categoria;
    public String PrazoEmprestimo;
    public String nomeQuemEmprestou;

    //Metodos
    public void AlugarLivro(){
        System.out.println("Livro alugado...");
    }

    public void DevolverLivro(){
        System.out.println("Livro devolvido...");
    }


}