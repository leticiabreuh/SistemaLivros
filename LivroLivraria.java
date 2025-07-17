public class LivroLivraria extends Livro{ 
    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;
 
    // Métodos
    //GET
    //Preço Get
    public double getPreco(){
        return preco;
    }
     //Novo ou usado  Get
    public String getNovoUsado(){
        return novoUsado;
    }
     //Local Get
    public String getLocalPrateleira(){
        return localPrateleira;
    }
     //Categoria  Get
    public String getCategoria(){
        return categoria;
    }

    //SET
    //Preço Set
    public void setPreco(double preco){
        this.preco=preco;
    }
     //Novo ou usado Set
    public void setNovoUsado(String novoUsado){
        this.novoUsado=novoUsado;
    }
     //Local Set
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira=localPrateleira;
    }
     //Categoria Set
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }


    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}