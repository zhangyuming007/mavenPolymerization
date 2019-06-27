package org.openSource.pojo;

/**
 * mysql分页帮助类
 */
public class PageHelper {

    /**
     * 医生的id
     */
    private String doctorId;

    /**
     * 分页参数的开始
     */
    private Integer start;

    /**
     * 分页参数的结束
     */
    private Integer end;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public PageHelper(String doctorId, Integer start, Integer end) {
        this.doctorId = doctorId;
        this.start = start;
        this.end = end;
    }

    public PageHelper() {
    }

    @Override
    public String toString() {
        return "PageHelper{" +
                "doctorId='" + doctorId + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

}
