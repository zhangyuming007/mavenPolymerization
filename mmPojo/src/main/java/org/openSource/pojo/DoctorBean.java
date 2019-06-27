package org.openSource.pojo;

/**
 * @author 张玉明
 * @see 对应表:doctor
 */
public class DoctorBean {

    /**
     * 医师id:六位工号
     */
    private String doctorId;

    /**
     * 医院科室id
     */
    private Integer hospitalDepartmentsId;

    /**
     * 该医师对应的角色
     */
    private Integer doctorRoleId;

    /**
     * 医生的名字
     */
    private String doctorName;

    /**
     * 医生的性别
     */
    private String doctorSex;

    /**
     * 医生的年龄
     */
    private Integer doctorAge;

    /**
     * 医生的电话
     */
    private String doctorTel;

    /**
     * 医生的挂号人数
     */
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getHospitalDepartmentsId() {
        return hospitalDepartmentsId;
    }

    public void setHospitalDepartmentsId(Integer hospitalDepartmentsId) {
        this.hospitalDepartmentsId = hospitalDepartmentsId;
    }

    public Integer getDoctorRoleId() {
        return doctorRoleId;
    }

    public void setDoctorRoleId(Integer doctorRoleId) {
        this.doctorRoleId = doctorRoleId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }

    public Integer getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(Integer doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }



}
