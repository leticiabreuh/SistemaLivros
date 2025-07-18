public class Livro{
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;


    //Metodos Construtor(serve para contruir seu objeto com valores defaul)
    Livro(){
     this.codigo=0;
     this. titulo=" ";
     this.autor=" ";
     this. editora=" ";
     this.nrPaginas=0;
     this.edicao=0;
    }

     Livro(int codigo, String titulo){
     this.codigo= codigo;
     this. titulo= titulo;
     this.autor=" ";
     this. editora=" ";
     this.nrPaginas=0;
     this.edicao=0;
    }

    Livro( int codigo,String titulo, String autor, String editora, int nrPaginas, int edicao){
     this.codigo= codigo;
     this. titulo= titulo;
     this.autor= autor;
     this. editora=editora;
     this.nrPaginas=nrPaginas;
     this.edicao=edicao;
    }
    

    //Pegando uma informação com o get
    //Sempre com retorno
    //Código get
    public int getCodigo(){
        return codigo;
    }
    //GET
    //Titulo get
    public String getTitulo(){
        return titulo;
    }
    //Autor get
    public String getAutor(){
        return autor;
    }

     //Editota get
    public String getEditora(){
        return editora;
    }

    public int getNrPaginas(){
        return nrPaginas;
    }

    public int getEdicao(){
        return edicao;
    }

    //SET

    //Gravando um dado do atributo com o set
    //Sempre void, recebendo parametro
    //Código Set
    public void setCodigo(int valor){
        codigo = valor;
    }
    //Titulo Set
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    //Autor set
    public void setAutor(String autor){
        this.autor=autor;
    }
    //Editora set
    public void setEditora(String editora){
        this.editora=editora;
    }
    //Numero de páginas set
    public void setNrPaginas(int nrPaginas){
        this.nrPaginas=nrPaginas;
    }
    //Edição set
    public void setEdicao(int edicao){
        this.edicao=edicao;
    }
    

   
    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    public void Localizar(){
        System.out.println("Estou localizando...");
    }
}