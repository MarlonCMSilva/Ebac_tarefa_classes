/**
 * @ Marlon.Silva
 * Criaçã da classe cliente
 *
 */

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return o valor atribuido a variavel nome
     *
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);

    }

    public void imprimirEdenreco(){
        System.out.println(this.endereco);
    }
}
