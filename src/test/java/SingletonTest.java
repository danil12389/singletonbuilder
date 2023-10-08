import org.example.singleton.SingletonImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    SingletonImpl singleton;

    SingletonImpl singleton1;


    @Test
    public void shouldCreateOnlyOneInstanceOfClass() {
        singleton = singleton.getSingleton();
        singleton1 = singleton1.getSingleton();

        Assertions.assertTrue(singleton.hashCode() == singleton1.hashCode());
    }
}
