import org.ch4j.chapter1.model.Customer;
import org.ch4j.chapter1.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by 357656 on 2016/9/18.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;
    public CustomerServiceTest(){
        customerService=new CustomerService();
    }
    @Before
    public void init(){

    }
    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList("");
        Assert.assertEquals(2,customerList.size());
    }

}
