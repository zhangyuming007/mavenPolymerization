package org.openSource.ceshidao;

import org.openSource.pojo.PageHelper;
import org.openSource.pojo.PatientBean;

import java.util.List;

public interface PatientMapper {

    public abstract List<PatientBean> getAllPatient(PageHelper pageHelper);

    public abstract int getAllRows(PageHelper pageHelper);

}
