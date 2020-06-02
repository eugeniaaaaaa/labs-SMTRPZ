import com.company.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

public class PersonEqualTest {
    @Test
    public void test_isEqualsVerifierPassEquals_returns_correct_working_of_equls() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}
