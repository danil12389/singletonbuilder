import org.example.builder.IpsEmployeeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    IpsEmployeeBuilder employeeBuilder;

    @Test
    public void shouldCreateEntityWithBuilderWay() {
        employeeBuilder = new IpsEmployeeBuilder.Builder()
                .name("Danila")
                .role("Junior")
                .age(24)
                .location("Izhevsk")
                .phone("+77777777777")
                .build();

        Assertions.assertTrue(employeeBuilder.getName().equals("Danila"));
    }
}
