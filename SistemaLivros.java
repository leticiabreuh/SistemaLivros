public class SistemaLivros{
    public static void main(String[] args){

        /*Livro */
        Livro livro = new Livro();
        livro.setCodigo (1);
        livro.setTitulo("Codigo da Vinci");
        livro.setEditora("Editora Xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Biblioteca */
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();
        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo("Cinderela");
        livrobiblioteca.setAutor("Autor Desconhecido");
        livrobiblioteca.setEditora("Editora 123");
        livrobiblioteca.setNrPaginas(200);
        livrobiblioteca.setEdicao(6);
        livrobiblioteca.setLocalPrateleira("Prateleira AB2");
        livrobiblioteca.setCategoria("Animacao");
        livrobiblioteca.setPrazoEntrega(20);
        livrobiblioteca.setNomeQuemEmprestou("Leticia");
        
        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Livraria */
        LivroLivraria livrolivraria = new LivroLivraria();
                
        livrolivraria.setTitulo("Crepusculo");
        livrolivraria.setCodigo(21);
        livrolivraria.setAutor("Autor Desconhecido");
        livrolivraria.setEditora("Editora 111");
        livrolivraria.setNrPaginas(362);
        livrolivraria.setEdicao(10);
        livrolivraria.setLocalPrateleira("Prateleira CB7");
        livrolivraria.setCategoria("Suspense");
        livrolivraria.setPreco(20.00);
        livrolivraria.setNovoUsado("Usado");
 
        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
      
      System.out.println("Codigo do livro Livraria: "+livrolivraria.getCodigo());
      System.out.println("Codigo do livro Biblioteca: "+livrobiblioteca.getCodigo());
      System.out.println("Codigo do livro Biblioteca: "+livro.getCodigo());

        
        


    }
}