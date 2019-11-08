package agenda.br.com;

import com.google.gson.Gson;

/**
 *
 * @author: Yarles Ivan Torres Nogueira
 */
public class Principal {
    
    public static void main(String[] args) {
       //Instanciando a classe Contato;
       Contato contato = new Contato();
       //Instanciando o Gson
       Gson gson = new Gson();
       
       //"Setando" valores nos atribuntos;
       contato.setNomeContato("Tulio Vidal");
       contato.setTelefoneContato("(88)91234-5678");
       
       String serialized = gson.toJson(contato);
       Contato deserialized = gson.fromJson(serialized, Contato.class);
       
       //Exibindo dados para o usuário
       System.out.println("Serializando: "+serialized);
       System.out.println("Desserializando: " +contato.toString());      
       
       
    }
}
