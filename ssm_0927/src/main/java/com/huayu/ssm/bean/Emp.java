package com.huayu.ssm.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@TableName("emp")
public class Emp {
    @TableId("eid")
    private  Integer eid;
    private  String name;
    private  String age;
    private  String sex;
    private String mail;
    private  String ah;
    private Dept dept;
    private String did;
    private Set<Role> listrole = new HashSet<>();
    private Set<Dept> listemp = new HashSet<>();
    private Emp emp;
    private String mgr;
    private List<Gzjl> gzlist;
    @TableField("deptbh")
    private String deptbh;
    private String rztime;

    public String getRztime() {
        return rztime;
    }

    public void setRztime(String rztime) {
        this.rztime = rztime;
    }

    public String getDeptbh() {
        return deptbh;
    }

    public void setDeptbh(String deptbh) {
        this.deptbh = deptbh;
    }

    public List<Gzjl> getGzlist() {
        return gzlist;
    }

    public void setGzlist(List<Gzjl> gzlist) {
        this.gzlist = gzlist;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Set<Dept> getListemp() {
        return listemp;
    }

    public void setListemp(Set<Dept> listemp) {
        this.listemp = listemp;
    }

    public Set<Role> getListrole() {
        return listrole;
    }

    public void setListrole(Set<Role> listrole) {
        this.listrole = listrole;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", ah='" + ah + '\'' +
                ", dept=" + dept +
                ", did='" + did + '\'' +
                '}';
    }
}
