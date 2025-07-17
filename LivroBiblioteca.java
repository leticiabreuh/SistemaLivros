public class LivroBiblioteca extends Livro{    
    //Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //Metodos

    //GET
    //Local get
    public String getLocalPrateleira(){
        return localPrateleira;
    }
    //Categoria get
    public String getCategoria(){
        return categoria;
    }
    //Prazo de Entrega get
    public int getPrazoEntrega(){
        return prazoEntrega;
    }
    //Nome de quem emprestou get
    public String getNomeQuemEmprestou(){
        return nomeQuemEmprestou;
    }

    //SET
    //Local Set
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira=localPrateleira;
    }
    //Categoria set
    public void setCategoria(String categoria){
         this.categoria=categoria;
    }
    //Prazo de Entrega set
    public void setPrazoEntrega(int prazoEntrega){
      this.prazoEntrega=prazoEntrega;
    }
    //Nome de quem emprestou set
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