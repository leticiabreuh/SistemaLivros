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

        String mensagem = "\nCodigo: "+livro.getCodigo()+
                          "\nTitulo: "+livro.getTitulo()+
                          "\n Autor: "+livro.getAutor()+
                          "\nEditora: "+livro.getEditora()+
                          "\nNumeros de paginas: "+livro.getNrPaginas()+
                          "\nEdicao: "+livro.getEdicao();

        String mensagem2 = "\nCodigo: "+livrolivraria.getCodigo()+
                          "\nTitulo: "+livrolivraria.getTitulo()+
                          "\n Autor: "+livrolivraria.getAutor()+
                          "\nEditora: "+livrolivraria.getEditora()+
                          "\nNumeros de paginas: "+livrolivraria.getNrPaginas()+
                          "\nEdicao: "+livrolivraria.getEdicao()+
                          "\nLocal: "+livrolivraria.getLocalPrateleira()+
                          "\nCategoria: "+livrolivraria.getCategoria()+
                          "\nNovo/Usado: "+livrolivraria.getNovoUsado();

        String mensagem3 = "\nCodigo: "+livrobiblioteca.getCodigo()+
                          "\nTitulo: "+livrobiblioteca.getTitulo()+
                          "\n Autor: "+livrobiblioteca.getAutor()+
                          "\nEditora: "+livrobiblioteca.getEditora()+
                          "\nNumeros de paginas: "+livrobiblioteca.getNrPaginas()+
                          "\nEdicao: "+livrobiblioteca.getEdicao()+
                          "\nLocal: "+livrobiblioteca.getLocalPrateleira()+
                          "\nCategoria: "+livrobiblioteca.getCategoria()+
                           "\nPrazo de Entrega: "+livrobiblioteca.getPrazoEntrega()+
                          "\nQuem emprestou: "+livrobiblioteca.getNomeQuemEmprestou();
      
      System.out.println("Livro: "+mensagem);
      System.out.println(" ");
      System.out.println("Livro Livraria: "+mensagem2);
       System.out.println(" ");
      System.out.println("Livro Biblioteca: "+mensagem3);

        //Metodo construtor com parametros
        Livro novoLivro = new Livro();
        System.out.println("Novo livro: "+novoLivro.getTitulo());

        Livro novoLivro2 = new Livro(99, "Titanic");
        System.out.println("Novo livro: "+novoLivro2.getTitulo());

        //Metodo construtor com todos parametros
         Livro novoLivro3 = new Livro(1, "A menina que roubava livros",
                                        "Andreisse",
                                        "Bosch",
                                        600,
                                        1
         );
                                            
        


    }
}