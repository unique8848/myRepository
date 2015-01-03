package com.ktw.kf.model;

/**
 * Created by kevin on 12/30/14.
 */
public class Organization {
    private Integer id;
    private Integer parentId;
    private String orgSn;
    private String orgName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOrgSn() {
        return orgSn;
    }

    public void setOrgSn(String orgSn) {
        this.orgSn = orgSn;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
