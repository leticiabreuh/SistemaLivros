public class Livro{
    //private int codigo;
    protected int codigo;
    public String titulo;
    public String autor;
    public String editora;
    public int nrPaginas;
    public int edicao;


    //Metodos

    //Pegando uma informação com o get
    //Sempre com retorno
    public int getCodigo(){
        return codigo;
    }
    //Gravando um dado do atributo com o set
    //Sempre void, recebendo parametro
    public void setCodigo(int valor){
        codigo = valor;
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