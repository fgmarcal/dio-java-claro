
/**
 * Singleton "Apressado"
 * @author Felipe
 * No padrão "singleton" o construtor é privado para não ser instanciado diretamente, devendo sempre usar o método
 * getInstance() para realizar a instanciação.
 * */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
