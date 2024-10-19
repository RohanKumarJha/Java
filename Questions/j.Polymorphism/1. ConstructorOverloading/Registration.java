public class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licenseNo;
    private long[] telephoneNo;

    Registration(String customerName,String passportNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }
    Registration(String customerName,int licenseNo,String panCardNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
    }
    Registration(String customerName,int voterId,int licenseNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
    }
    Registration(String customerName,String panCardNo,int voterId,long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getPanCardNo() {
        return panCardNo;
    }
    public int getVoterId() {
        return voterId;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public int getLicenseNo() {
        return licenseNo;
    }
    public long[] getTelephoneNo() {
        return telephoneNo;
    }
}