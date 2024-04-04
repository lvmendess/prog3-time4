/**
 * Classe que define os atributos do objeto Usuário
 * @author Pedro Ribas, Luísa Duarte
 * @version 03/04/2024
 */
public class Usuario{
    private int ranking;
    private int quantidadePosts;    
    private int seguidores;
    private String nome;
    private String categoria;
    private String genero;
    private double mediaDeLikes;
    private double engajamento; //deixar na forma de String, pq se n dá erro na conversão para double - livia

    /**
     * Construtor do objeto Usuário
     * @param ranking
     * @param nome
     * @param genero
     * @param categoria
     * @param quantidadePosts
     * @param seguidores
     * @param mediaDeLikes
     * @param engajamento
     */
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
    
    /**
     * @return ranking 
     */
    public int getRanking() {
        return this.ranking;
    }
    /**
     * @param ranking
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    /**
     * @return quantidadePosts
     */
    public int getQuantidadePosts() {
        return this.quantidadePosts;
    }
    /**
     * @param quantidadePosts
     */
    public void setQuantidadePosts(int quantidadePosts) {
        this.quantidadePosts = quantidadePosts;
    }
    /**
     * @return seguidores
     */
    public int getSeguidores() {
        return this.seguidores;
    }
    /**
     * @param seguidores
     */
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    /**
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return categoria
     */
    public String getCategoria() {
        return this.categoria;
    }
    /**
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * @return genero
     */
    public String getGenero() {
        return this.genero;
    }
    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * @return mediaDeLikes
     */
    public double getMediaDeLikes() {
        return this.mediaDeLikes;
    }
    /**
     * @param mediaDeLikes
     */
    public void setMediaDeLikes(double mediaDeLikes) {
        this.mediaDeLikes = mediaDeLikes;
    }
    /**
     * @return engajamento
     */
    public double getEngajamento() {
        return this.engajamento;
    }
    /**
     * @param engajamento
     */
    public void setEngajamento(double engajamento) {
        this.engajamento = engajamento;
    }
    /**
     * Imprime todas os atributos do Usuário
     */
    public void imprimirTudo(){
        System.out.println("Ranking:" + ranking);
        System.out.println("Posts: "+ quantidadePosts);
        System.out.println("Seguidores: "+ seguidores);
        System.out.println("Nome: "+ nome);
        System.out.println("Categoria: "+ categoria);
        System.out.println("Gênero: "+ genero);
        System.out.println("Média de Likes: "+ mediaDeLikes);
        System.out.println("Engajamento: "+ engajamento);
    }

}
