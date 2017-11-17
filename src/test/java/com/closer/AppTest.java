package com.closer;

import com.closer.jxls.domain.Employee;
import org.junit.Test;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import com.closer.Master;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static List<Employee> generateSampleEmployeeData() {
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Employee e = new Employee();
            e.setName("employee name " + i);
            e.setBirthDate(new Date());
            e.setBonus(i);
            e.setPayment(1000 + i);
            list.add(e);
        }
        return list;
    }

    @Test
    public void test1() throws IOException {

        List<Employee> employees = generateSampleEmployeeData();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("template.xls")) {
            try (OutputStream os = new FileOutputStream("report.xls")) {
                Context context = new Context();
                context.putVar("report_year", 2015);
                context.putVar("report_month", 8);
                context.putVar("employees", employees);
                context.putVar("title", "测试Jxls");
                JxlsHelper.getInstance().processTemplate(is, os, context);
            }
        }
    }
    
    
    @Test
    public void test2() throws IOException {
    	
    	//List<Employee> employees = generateSampleEmployeeData();
    	try (InputStream is = getClass().getClassLoader().getResourceAsStream("master.xlsx")) {
    		try (OutputStream os = new FileOutputStream("abc.xlsx")) {

    			Master m = new Master();
    			m.setAddress("1234");
    			m.setId(1);
    			m.setMastername("master");
    			m.setRoute("/home");
    			Context context = new Context();
    			context.putVar("m", m);
    			JxlsHelper.getInstance().processTemplate(is, os, context);
    		}
    	}
    }
    
    

}
