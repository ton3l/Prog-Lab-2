import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JogoDoBicho {
    private String[] bichos = {
            "Avestruz",  // 01
            "Águia",     // 02
            "Burro",     // 03
            "Borboleta", // 04
            "Cachorro",  // 05
            "Cabra",     // 06
            "Carneiro",  // 07
            "Camelo",    // 08
            "Cobra",     // 09
            "Coelho",    // 10
            "Cavalo",    // 11
            "Elefante",  // 12
            "Galo",      // 13
            "Gato",      // 14
            "Jacaré",    // 15
            "Leão",      // 16
            "Macaco",    // 17
            "Porco",     // 18
            "Pavão",     // 19
            "Peru",      // 20
            "Touro",     // 21
            "Tigre",     // 22
            "Urso",      // 23
            "Veado",     // 24
            "Vaca"       // 25
    };

    // Você falou que o override não é obrigatório, mas também falou que o override avisa ao compilador da sobrescrição, sem o override o compilador não identifica a sobrescrição? QUal a relação?

    private List<int[]> apostas = new ArrayList<int[]>();

    public static void main(String[] args) {
        JogoDoBicho jdb = new JogoDoBicho();
    }

    public String getBicho(int id){
        if (id > 25 || id < 1) throw new IllegalArgumentException("Número passado não corresponde a um bicho");
        return this.bichos[id-1];
    }

    public boolean apostar(int[] aposta) {
        if (aposta.length != 5) throw new IllegalArgumentException("A aposta deve ter 5 números");
        for (int n : aposta){
            if () throw new IllegalArgumentException("A aposta deve ter 5 números";
        }
        apostas.add(aposta);
        return true;
    }

    public void getAposta(int id) {

    }
}