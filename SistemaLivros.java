public class SistemaLivros{
    public static void main(String[] args){

        Livro livro = new Livro();
        livro.codigo =1;
        livro.titulo="Codigo da Vinci";
        livro.editora="Editora Xyz";
        livro.nrPaginas=100;
        livro.edicao=3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Biblioteca */
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();
        livrobiblioteca.codigo =11;
        livrobiblioteca.titulo="Cinderela";
        livrobiblioteca.autor="Autor Desconhecido";
        livrobiblioteca.editora="Editora 123";
        livrobiblioteca.nrPaginas=200;
        livrobiblioteca.edicao=6;
        livrobiblioteca.localPrateleira = "Prateleira AB2";
        livrobiblioteca.categori = "Animacao";
        livrobiblioteca.prazoEntrega= 20;
        livrobiblioteca.nomeQuemEmprestou = "Leticia";
        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Livraria */
        LivroLivraria livrolivraria = new LivroLivraria();
         livrolivraria.codigo =122;
         livrolivraria.titulo="Ursinhos Carinhosos";
         livrolivraria.autor="Autor Desconhecido";
         livrolivraria.editora="Editora não sei";
         livrolivraria.nrPaginas=120;
         livrolivraria.edicao=5;
         livrolivraria.localPrateleira = "Prateleira B2";
         livrobiblioteca.categori = "Animacao";

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();
        


    }
}