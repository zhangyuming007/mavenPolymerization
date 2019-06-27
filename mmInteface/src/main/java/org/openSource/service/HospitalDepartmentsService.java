package org.openSource.service;

import org.openSource.pojo.DoctorBean;
import org.openSource.pojo.HospitalDepartmentsBean;

import java.util.List;

public interface HospitalDepartmentsService {

    /**
     *
     * @return 获取医院所有的科室,提供挂号服务
     */
    public abstract List<HospitalDepartmentsBean> getKeShi();

    /**
     *
     * @param doctorId 传入科室的id
     * @return 返回当前科室所有医生以及他们各自的挂号人数
     */
    public abstract List<DoctorBean> getDoctor1(int doctorId);

}
