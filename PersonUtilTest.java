import com.company.Person;
import com.company.PersonUtil;
import org.junit.Assert;
import org.junit.Test;

public class PersonUtilTest  {

    @Test
    public void test_isEqualsSerializingAndDesirializing_returns_correct_object(){
        Person expected = new Person("Piter","Parker","Man",30);
        String jsonFormat = PersonUtil.toJson(expected);
        Person result = PersonUtil.fromJson(jsonFormat);
        Assert.assertEquals(expected,result);
    }

}
