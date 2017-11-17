package com.closer.jxls.web;

import com.closer.jxls.common.JxlsExcelView;
import com.closer.jxls.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by Zhang Jinlong(150429) on 2016/3/17.
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @RequestMapping(value = "/report")
    public ModelAndView export() {
        Map<String, Object> model = new HashMap<>();
        model.put("report_year", 2015);
        model.put("report_month", 8);
        List<Employee> userList = generateSampleEmployeeData();
        model.put("employees", userList);
        return new ModelAndView(new JxlsExcelView("template.xls","output"), model);
    }

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
}
