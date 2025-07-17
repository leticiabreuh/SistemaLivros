public class LivroLivraria extends Livro{ 
    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;
 
    // métodos
    //GET
    //Preço get
    public double getPreco(){
        return preco;
    }
     //Novo ou usado get
    public String getNovoUsado(){
        return novoUsado;
    }
     //Local get
    public String getLocalPrateleira(){
        return localPrateleira;
    }
     //Categoria get
    public String getCategoria(){
        return categoria;
    }

    //SET
    //Preço Set
    public void setPreco(double preco){
        this.preco=preco;
    }
     //Novo ou usado set
    public void setNovoUsado(String novoUsado){
        this.novoUsado=novoUsado;
    }
     //Local set
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira=localPrateleira;
    }
     //Categoria set
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }


    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}