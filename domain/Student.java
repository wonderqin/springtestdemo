package com.hantele.domain;

import java.io.Serializable;
import javax.persistence.*;

public class Student implements Serializable {
    @Id
    @Column(name = "Sid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;

    @Column(name = "Sname")
    private String sname;

    @Column(name = "Ssex")
    private String ssex;

    @Column(name = "Sscore")
    private Double sscore;

    @Column(name = "Cid")
    private Integer cid;

    private static final long serialVersionUID = 1L;

    /**
     * @return Sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return Sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return Ssex
     */
    public String getSsex() {
        return ssex;
    }

    /**
     * @param ssex
     */
    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    /**
     * @return Sscore
     */
    public Double getSscore() {
        return sscore;
    }

    /**
     * @param sscore
     */
    public void setSscore(Double sscore) {
        this.sscore = sscore;
    }

    /**
     * @return Cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", ssex=").append(ssex);
        sb.append(", sscore=").append(sscore);
        sb.append(", cid=").append(cid);
        sb.append("]");
        return sb.toString();
    }
}