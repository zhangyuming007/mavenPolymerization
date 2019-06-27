package org.openSource.ceshiservice;

import org.openSource.ceshidao.PatientMapper;
import org.openSource.pojo.PageHelper;
import org.openSource.pojo.PatientBean;
import org.openSource.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "patientService")
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<PatientBean> getAllPatient(PageHelper pageHelper) {
        return patientMapper.getAllPatient(pageHelper);
    }

    @Override
    public int getAllRows(PageHelper pageHelper) {
        return patientMapper.getAllRows(pageHelper);
    }
}

