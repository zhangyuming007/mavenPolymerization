package org.openSource.pojo;

/**
 * @author 李芳元
 * @see 对应表 patient
 * 表字段: patientId doctorId patientName patientAge patientSex patientMarital patientTel patientAddress patientBedId pratientMoney
 */
public class PatientBean {

    /**
     * 病人id
     */
    private  String  patientId;

    /**
     * 病人所挂医生的id
     */
    private  String doctorId;

    /**
     * 病人名字
     */
    private  String  patientName;

    /**
     * 病人年龄
     */
    private  Integer  patientAge;

    /**
     * 病人的性别
     */
    private  String patientSex;

    /**
     * 病人是否已婚
     */
    private  String patientMarital;

    /**
     * 病人的电话
     */
    private  String patientTel;

    /**
     * 病人的地址
     */
    private  String patientAddress;

    /**
     * 病人的床位号
     */
    private  String patientBedId;

    /**
     * 病人的余额
     */
    private  Double pratientMoney;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientMarital() {
        return patientMarital;
    }

    public void setPatientMarital(String patientMarital) {
        this.patientMarital = patientMarital;
    }

    public String getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(String patientTel) {
        this.patientTel = patientTel;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientBedId() {
        return patientBedId;
    }

    public void setPatientBedId(String patientBedId) {
        this.patientBedId = patientBedId;
    }

    public Double getPratientMoney() {
        return pratientMoney;
    }

    public void setPratientMoney(Double pratientMoney) {
        this.pratientMoney = pratientMoney;
    }

    @Override
    public String toString() {
        return "PatientBean{" +
                "patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientSex='" + patientSex + '\'' +
                ", patientMarital='" + patientMarital + '\'' +
                ", patientTel='" + patientTel + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientBedId='" + patientBedId + '\'' +
                ", pratientMoney=" + pratientMoney +
                '}';
    }
}
