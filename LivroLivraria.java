public class LivroLivraria extends Livro{ 
    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;
    private int edicao;
 
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
     //Edicao  Get
    public int getEdicao(){
        return edicao;
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
    //Edicao  Set
    public void getEdicao(int edicao){
        this.edicao=edicao;
    }


    public void Vender(){
        System.out.println("Estou vendendo...");
    }

    
    
    @Override
     public void Ler(){
        System.out.println("Estou lendo o livro que comprei na livraria...");
    }
    
    @Override
    public void Cadastrar(){
        System.out.println("Estou cadastrando o meu livro na livraria...");
    }

    @Override
    public void Localizar(){
        System.out.println("Estou localizando um livro de livraria...");
    }
    
}