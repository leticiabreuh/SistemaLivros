public class LivroBiblioteca extends Livro{    
    //Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //Métodos
    //Metodo construtor FILHO
    LivroBiblioteca(){}
    //Metodo construtor FILHO com parametros
    LivroBiblioteca( int codigo,String titulo, String autor, String editora, int nrPaginas, int edicao, String localPrateleira, String categoria, int prazoEntrega, String nomeQuemEmprestou){
       //Super esta atualizando as informações que está no pai, ou seja, no Livro
       //Acesso ao Metodo construtor PAI(livro)
        super(codigo, titulo, autor, editora, nrPaginas, edicao);
        this.localPrateleira = localPrateleira;
        this.categoria=categoria;
        this.prazoEntrega= prazoEntrega;
        this.nomeQuemEmprestou=nomeQuemEmprestou;
    }

    //GET
    //Local Get
    public String getLocalPrateleira(){
        return localPrateleira;
    }
    //Categoria  Get
    public String getCategoria(){
        return categoria;
    }
    //Prazo de Entrega  Get
    public int getPrazoEntrega(){
        return prazoEntrega;
    }
    //Nome de quem emprestou  Get
    public String getNomeQuemEmprestou(){
        return nomeQuemEmprestou;
    }

    //SET
    //Local Set
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira=localPrateleira;
    }
    //Categoria Set
    public void setCategoria(String categoria){
         this.categoria=categoria;
    }
    //Prazo de Entrega Set
    public void setPrazoEntrega(int prazoEntrega){
      this.prazoEntrega=prazoEntrega;
    }
    //Nome de quem emprestou Set
    public void setNomeQuemEmprestou(String nomeQuemEmprestou){
      this.nomeQuemEmprestou=nomeQuemEmprestou;
    }



    public void Alugar(){
        System.out.println("Estou alugando..");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo..");
    }

    @Override
    public void Localizar(){
        System.out.println("Estou localizando um livro de bibilioteca...");
    }
}