package org.openSource.ceshidao;

import org.openSource.pojo.DoctorBean;
import org.openSource.pojo.HospitalDepartmentsBean;

import java.util.List;

public interface HospitalDepartmentsMapper {

    public abstract List<HospitalDepartmentsBean> getKeShi();

    public abstract List<DoctorBean> getDoctor1(int doctorId);

}
