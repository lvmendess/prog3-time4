public class Usuario{
    private int ranking;
    private int quantidadePosts;    
    private int seguidores;
    private String nome;
    private String categoria;
    private String genero;
    private double mediaDeLikes;
    private double engajamento;

    public Usuario(int ranking, int quantidadePosts, int seguidores, String nome, String categoria, String genero, double mediaDeLikes, double engajamento) {
        this.ranking = ranking;
        this.quantidadePosts = quantidadePosts;
        this.seguidores = seguidores;
        this.nome = nome;
        this.categoria = categoria;
        this.genero = genero;
        this.mediaDeLikes = mediaDeLikes;
        this.engajamento = engajamento;

    }

    public int getQuantidadePosts() {
        
    }
}

