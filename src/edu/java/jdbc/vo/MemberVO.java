package edu.java.jdbc.vo;


import java.sql.Date;

// Value Object
// t_member 테이블의 칼럼들과 매핑이 되는 필드 선언, *게터 세터 그리고 필요시 생성자
public class MemberVO {

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    private String mid;
    private String mname;
    private String mpw;
    private String email;
    private String gender;
    private String photo;
    public String birthDate;
    public Date join_date;

    // mid VarChar(20) PK
    // mname varchar(20)
    // mpw varchar (20)
    // email varchar(50)
    // gender char(1)
    // photo varchar(50)
    // birth_date date
    // join_data date



}
