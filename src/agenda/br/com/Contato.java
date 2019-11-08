package agenda.br.com;

/**
 *
 * @author: Yarles Ivan Torres Nogueira
 */
public class Contato {
    private String nomeContato;
    private String telefoneContato;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Contato{" + "nomeContato=" + nomeContato + ", telefoneContato=" + telefoneContato + '}';
    }
    
    
}
