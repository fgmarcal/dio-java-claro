package subsistema2.cep;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
