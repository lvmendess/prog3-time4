public class Usuario{
    private int ranking;
    private int quantidadePosts;    
    private int seguidores;
    private String nome;
    private String categoria;
    private String genero;
    private double mediaDeLikes;
    private double engajamento; //deixar na forma de String, pq se n dá erro na conversão para double - livia

    //alterei a ordem dos parâmetros para combinar com a ordem em que os atributos aparecem no data.txt para facilitar a leitura - livia
    public Usuario(int ranking, String nome, String genero, String categoria, int quantidadePosts, int seguidores, double mediaDeLikes, double engajamento) {
        this.ranking = ranking;
        this.quantidadePosts = quantidadePosts;
        this.seguidores = seguidores;
        this.nome = nome;
        this.categoria = categoria;
        this.genero = genero;
        this.mediaDeLikes = mediaDeLikes;
        this.engajamento = engajamento;
    }
    
    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getQuantidadePosts() {
        return this.quantidadePosts;
    }

    public void setQuantidadePosts(int quantidadePosts) {
        this.quantidadePosts = quantidadePosts;
    }

    public int getSeguidores() {
        return this.seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getMediaDeLikes() {
        return this.mediaDeLikes;
    }

    public void setMediaDeLikes(double mediaDeLikes) {
        this.mediaDeLikes = mediaDeLikes;
    }

    public double getEngajamento() {
        return this.engajamento;
    }

    public void setEngajamento(double engajamento) {
        this.engajamento = engajamento;
    }
    
    public void imprimirTudo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Ranking:" + ranking);
        System.out.println("Gênero: "+ genero);
        System.out.println("Categoria: "+ categoria);
        System.out.println("Posts: "+ quantidadePosts);
        System.out.println("Seguidores: "+ seguidores);
        System.out.println("Média de Likes: "+ mediaDeLikes);
        System.out.println("Engajamento: "+ engajamento);
        System.out.println();
    }

}
