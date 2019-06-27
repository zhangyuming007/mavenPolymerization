package org.openSource.service;

import org.openSource.pojo.PageHelper;
import org.openSource.pojo.PatientBean;

import java.util.List;

public interface PatientService {

    /**
     *
     * @return 返回所有已经挂号的病人
     */
    public abstract List<PatientBean> getAllPatient(PageHelper pageHelper);

    /**
     *
     * @param did 医师id
     * @return 该医生所有的挂号病人人数
     */
    public abstract int getAllRows(PageHelper pageHelper);

}
