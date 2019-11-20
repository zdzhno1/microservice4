package com.wcy.microservice4;

import com.wcy.microservice4.beans.Dept;
import com.wcy.microservice4.service.DeptFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptFeignController {

    @Autowired
    private DeptFeign deptFein;

    @RequestMapping("/consumer/depts/{deptNo}")
    public Dept findDeptByDeptNo(@PathVariable("deptNo") Long deptNo){
        return deptFein.findDeptByDeptNo(deptNo);
    }

}
