package com.meng.service.Imp;

import com.meng.mapper.EmployeeMapper;
import com.meng.pojo.Employee;
import com.meng.service.EmployeeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeImp {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Employee getEmpById(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        if (employee !=null){
            return employee;
        }
        return null;
    }


}
