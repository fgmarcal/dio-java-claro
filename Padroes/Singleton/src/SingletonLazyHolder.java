/**
 * Singleton "Preguiçoso com Holder" Lazy Holder
 * @author Felipe
 * No padrão "singleton" o construtor é privado para não ser instanciado diretamente, devendo sempre usar o método
 * getInstance() para realizar a instanciação.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</>
 *
 * */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instance;
    }

    //construtor privado para não ser instanciado fora
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
