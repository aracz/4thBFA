import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    @Test
    public void testSetYearPassed(){
        Employee john = new Employee("John",0123, 19911223, 1234, false);
        assertEquals(false, john.isUniform());
        john.setYearPassed();
        assertEquals(true, john.isUniform());

    }

}
