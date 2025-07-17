public class LivroBiblioteca extends Livro{    
    //Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //Métodos

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
}