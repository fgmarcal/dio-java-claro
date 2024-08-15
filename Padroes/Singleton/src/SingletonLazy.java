
/**
 * Singleton "Preguiçoso"
 * @author Felipe
 * No padrão "singleton" o construtor é privado para não ser instanciado diretamente, devendo sempre usar o método
 * getInstance() para realizar a instanciação.
 * */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
