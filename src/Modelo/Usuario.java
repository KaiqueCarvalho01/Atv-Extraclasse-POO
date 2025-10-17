package Modelo;

public class Usuario {
    private String nome;
    private String email;
    private String dataCadastro;

    /**
     * Construtor da classe Modelo.Usuario.
     * @param nome O nome completo do usuário.
     * @param email O endereço de email do usuário.
     * @param dataCadastro A data em que o usuário foi cadastrado no sistema.
     */
    public Usuario(String nome, String email, String dataCadastro) {
        // Inicializa todos os atributos
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * Retorna uma String formatada com as informações básicas do usuário.
     * @return String contendo nome, email e data de cadastro.
     * */
    public String exibirDados() {
        return "Nome: " + nome +
                "\nEmail: " + email +
                "\nData de Cadastro: " + dataCadastro;
    }

    /**
     * Método que define as ações disponíveis para um Modelo.Usuario.
     * Será sobrescrito nas subclasses para exibir as ações específicas de cada perfil.
     * @return String descrevendo as ações disponíveis.
     */
    public String exibirAcoesDisponiveis() {
        return "Ações básicas do sistema: Apenas acesso ao perfil.";
    }

}
