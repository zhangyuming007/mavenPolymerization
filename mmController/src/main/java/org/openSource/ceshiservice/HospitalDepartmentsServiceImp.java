package org.openSource.ceshiservice;

import org.openSource.ceshidao.HospitalDepartmentsMapper;
import org.openSource.pojo.DoctorBean;
import org.openSource.pojo.HospitalDepartmentsBean;
import org.openSource.service.HospitalDepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "hospitalDepartmentsService")
public class HospitalDepartmentsServiceImp implements HospitalDepartmentsService {

    @Autowired
    private HospitalDepartmentsMapper hospitalDepartmentsMapper;

    @Override
    public List<HospitalDepartmentsBean> getKeShi() {
        return hospitalDepartmentsMapper.getKeShi();
    }

    @Override
    public List<DoctorBean> getDoctor1(int doctorId) {
        return hospitalDepartmentsMapper.getDoctor1(doctorId);
    }
}
