package org.openSource.controller;

import org.openSource.ceshidao.HospitalDepartmentsMapper;
import org.openSource.pojo.*;
import org.openSource.service.HospitalDepartmentsService;
import org.openSource.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller(value = "hospitalController")
@RequestMapping(value = "/hospital")
public class HospitalController {

    @Autowired
    private HospitalDepartmentsService hospitalDepartmentsService;

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/getKeShi")
    public String gets(
            Model md
    ) {
        List<HospitalDepartmentsBean> arr = hospitalDepartmentsService.getKeShi();
        md.addAttribute("list", arr);
        return "user/guahao::dateScope1";
    }

    @RequestMapping(value = "/showDoctor")
    public String showDoctor(
            Model md,
            @RequestParam(value = "id", defaultValue = "22") int id
    ) {
        List<DoctorBean> arr = hospitalDepartmentsService.getDoctor1(id);
        md.addAttribute("list", arr);
        return "user/doctorList";
    }

    /**
     * 用来查询当前'诊断医师'下的所有挂号病人
     * @return
     */
    @RequestMapping(value = "/getRows")
    public String getList(
            Model md,
            @RequestParam(value = "goPage", defaultValue = "1") int goPage
    ) {
        //这个id是医生登录之后从session中获取的医生的id
        String did = "000001";
        int start = (goPage - 1) * 6;
        int end = 6;
        PageHelper pageHelper = new PageHelper(did, start, end);
        List<PatientBean> list = patientService.getAllPatient(pageHelper);
        System.out.println("============" + list);
        md.addAttribute("list", list);
        return "hospital/doctor/list::dateScope";
    }

    /**
     * 用来获取当前'诊断医师'下的所有挂号病人的分页数据
     */
    @RequestMapping(value = "/getPage")
    public String getPage(
            Model md,
            @RequestParam(value = "goPage", defaultValue = "1") int goPage
    ) {
        String did = "000001";
        int start = (goPage - 1) * 6;
        int end = 6;
        PageHelper pageHelper = new PageHelper(did, start, end);
        int num = patientService.getAllRows(pageHelper);
        PageTools pt = new PageTools();
        pt.setRowsNumber(num);
        pt.setGoPage(goPage);
        md.addAttribute("page", pt);
        return "hospital/doctor/list::pageNumberScope";
    }

}
