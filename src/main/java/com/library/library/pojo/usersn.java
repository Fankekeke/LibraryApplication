package com.library.library.pojo;

/**
 * 用户表
 */
public class usersn {
    //用户id
    private Integer uid;
    //用户名
    private String uname;
    //保留1
    private String ups;
    //性别
    private String gender;
    //保留2
    private String uppwer;
    //用户注册ip地址
    private String ipAddress;
    //用户注册系统
    private String windows;
    //用户手机号码
    private String phone;
    //用户邮箱
    private String mail;
    //年龄
    private Integer age;
    //密码
    private String pwd;
    //身份证号码
    private String idcard;
    //籍贯
    private String address;
    //出生日期
    private String born;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUppwer() {
        return uppwer;
    }

    public void setUppwer(String uppwer) {
        this.uppwer = uppwer;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 有参构造
     * @param uname
     * @param ups
     * @param gender
     * @param uppwer
     * @param ipAddress
     * @param windows
     * @param phone
     * @param mail
     * @param age
     * @param pwd
     * @param idCard
     * @param address
     * @param born
     */
    public usersn(String uname, String ups, String gender, String uppwer, String ipAddress, String windows, String phone, String mail, Integer age, String pwd, String idCard, String address, String born) {
        this.uname = uname;
        this.ups = ups;
        this.gender = gender;
        this.uppwer = uppwer;
        this.ipAddress = ipAddress;
        this.windows = windows;
        this.phone = phone;
        this.mail = mail;
        this.age = age;
        this.pwd = pwd;
        this.idcard = idCard;
        this.address = address;
        this.born = born;
    }

    /**
     * 无参构造
     */
    public usersn(){}

    @Override
    public String toString() {
        return "usersn{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ups='" + ups + '\'' +
                ", gender='" + gender + '\'' +
                ", uppwer='" + uppwer + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", windows='" + windows + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                ", idCard='" + idcard + '\'' +
                ", address='" + address + '\'' +
                ", born='" + born + '\'' +
                '}';
    }
}
