package com.example.fragmentruntimeexample;

import android.os.Parcel;
import android.os.Parcelable;
public class Allfragments implements Parcelable {

    private String name;
    private String address;
    private String email;
    private String phno;
    private String patientname;
    private String patientaddress;
    private String patientemail;
    private String patientcontno;
    private String companyname;
    private String designation;
    private String companyemail;
    private String salary;

    public Allfragments(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientaddress() {
        return patientaddress;
    }

    public void setPatientaddress(String patientaddress) {
        this.patientaddress = patientaddress;
    }

    public String getPatientemail() {
        return patientemail;
    }

    public void setPatientemail(String patientemail) {
        this.patientemail = patientemail;
    }

    public String getPatientcontno() {
        return patientcontno;
    }

    public void setPatientcontno(String patientcontno) {
        this.patientcontno = patientcontno;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyemail() {
        return companyemail;
    }

    public void setCompanyemail(String companyemail) {
        this.companyemail = companyemail;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    protected Allfragments(Parcel in) {
        name = in.readString();
        address = in.readString();
        email = in.readString();
        phno = in.readString();
        patientname = in.readString();
        patientaddress = in.readString();
        patientemail = in.readString();
        patientcontno = in.readString();
        companyname = in.readString();
        designation = in.readString();
        companyemail = in.readString();
        salary = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(email);
        dest.writeString(phno);
        dest.writeString(patientname);
        dest.writeString(patientaddress);
        dest.writeString(patientemail);
        dest.writeString(patientcontno);
        dest.writeString(companyname);
        dest.writeString(designation);
        dest.writeString(companyemail);
        dest.writeString(salary);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Allfragments> CREATOR = new Parcelable.Creator<Allfragments>() {
        @Override
        public Allfragments createFromParcel(Parcel in) {
            return new Allfragments(in);
        }

        @Override
        public Allfragments[] newArray(int size) {
            return new Allfragments[size];
        }
    };
}