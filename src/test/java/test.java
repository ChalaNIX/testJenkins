import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void test(){
        String a = "Hello world";
        System.out.println(a);
        assert a.equals("Hello world");
    }

}
