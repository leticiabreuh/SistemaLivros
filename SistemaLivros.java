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
         livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

    }
}