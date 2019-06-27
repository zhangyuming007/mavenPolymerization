package org.openSource.pojo;

public class HospitalDepartmentsBean {

    private Integer hospitalDepartmentsId;

    private String hospitalDepartmentsName;

    private String hospitalDepartmentsAddress;

    public HospitalDepartmentsBean() {
    }

    public Integer getHospitalDepartmentsId() {
        return this.hospitalDepartmentsId;
    }

    public String getHospitalDepartmentsName() {
        return this.hospitalDepartmentsName;
    }

    public String getHospitalDepartmentsAddress() {
        return this.hospitalDepartmentsAddress;
    }

    public void setHospitalDepartmentsId(Integer hospitalDepartmentsId) {
        this.hospitalDepartmentsId = hospitalDepartmentsId;
    }

    public void setHospitalDepartmentsName(String hospitalDepartmentsName) {
        this.hospitalDepartmentsName = hospitalDepartmentsName;
    }

    public void setHospitalDepartmentsAddress(String hospitalDepartmentsAddress) {
        this.hospitalDepartmentsAddress = hospitalDepartmentsAddress;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HospitalDepartmentsBean)) return false;
        final HospitalDepartmentsBean other = (HospitalDepartmentsBean) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$hospitalDepartmentsId = this.getHospitalDepartmentsId();
        final Object other$hospitalDepartmentsId = other.getHospitalDepartmentsId();
        if (this$hospitalDepartmentsId == null ? other$hospitalDepartmentsId != null : !this$hospitalDepartmentsId.equals(other$hospitalDepartmentsId))
            return false;
        final Object this$hospitalDepartmentsName = this.getHospitalDepartmentsName();
        final Object other$hospitalDepartmentsName = other.getHospitalDepartmentsName();
        if (this$hospitalDepartmentsName == null ? other$hospitalDepartmentsName != null : !this$hospitalDepartmentsName.equals(other$hospitalDepartmentsName))
            return false;
        final Object this$hospitalDepartmentsAddress = this.getHospitalDepartmentsAddress();
        final Object other$hospitalDepartmentsAddress = other.getHospitalDepartmentsAddress();
        if (this$hospitalDepartmentsAddress == null ? other$hospitalDepartmentsAddress != null : !this$hospitalDepartmentsAddress.equals(other$hospitalDepartmentsAddress))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HospitalDepartmentsBean;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $hospitalDepartmentsId = this.getHospitalDepartmentsId();
        result = result * PRIME + ($hospitalDepartmentsId == null ? 43 : $hospitalDepartmentsId.hashCode());
        final Object $hospitalDepartmentsName = this.getHospitalDepartmentsName();
        result = result * PRIME + ($hospitalDepartmentsName == null ? 43 : $hospitalDepartmentsName.hashCode());
        final Object $hospitalDepartmentsAddress = this.getHospitalDepartmentsAddress();
        result = result * PRIME + ($hospitalDepartmentsAddress == null ? 43 : $hospitalDepartmentsAddress.hashCode());
        return result;
    }

    public String toString() {
        return "HospitalDepartmentsBean(hospitalDepartmentsId=" + this.getHospitalDepartmentsId() + ", hospitalDepartmentsName=" + this.getHospitalDepartmentsName() + ", hospitalDepartmentsAddress=" + this.getHospitalDepartmentsAddress() + ")";
    }
}
