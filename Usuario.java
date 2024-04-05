/**
 * Classe que define os atributos do objeto Usuário
 */
public class Usuario{
    private int ranking;
    private int quantidadePosts;    
    private long seguidores;
    private String nome;
    private String categoria;
    private String genero;
    private double mediaDeLikes;
    private double engajamento;

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
    public Usuario(int ranking, String nome, String genero, String categoria, int quantidadePosts, long seguidores, double mediaDeLikes, double engajamento) {
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
     * @return ranking do usuario
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
     * @return quantidadePosts do usuario
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
     * @return seguidores do usuario
     */
    public long getSeguidores() {
        return this.seguidores;
    }
    /**
     * @param seguidores
     */
    public void setSeguidores(long seguidores) {
        this.seguidores = seguidores;
    }
    /**
     * @return nome do usuario
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
     * @return categoria do usuario
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
     * @return genero do usuario
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
     * @return mediaDeLikes do usuario
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
     * @return engajamento do usuario
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
     * Imprime os atributos do usuário
     */
    public void imprimirTudo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Ranking: " + ranking);
        System.out.println("Gênero: "+ genero);
        System.out.println("Categoria: "+ categoria);
        System.out.println("Posts: "+ quantidadePosts);
        System.out.println("Seguidores: "+ seguidores);
        System.out.println("Média de Likes: "+ mediaDeLikes);
        System.out.println("Engajamento: "+ engajamento);
        System.out.println();
    }

}
