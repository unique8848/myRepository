package com.ktw.kf.model;

/**
 * Created by kevin on 12/30/14.
 */
public class Function {
    private Integer id;
    private Integer parentId;
    private String funcNo;
    private String funcName;
    private Integer funcSn;
    private String funcDesc;

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

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Integer getFuncSn() {
        return funcSn;
    }

    public void setFuncSn(Integer funcSn) {
        this.funcSn = funcSn;
    }

    public String getFuncDesc() {
        return funcDesc;
    }

    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc;
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", funcNo='" + funcNo + '\'' +
                ", funcName='" + funcName + '\'' +
                ", funcSn=" + funcSn +
                ", funcDesc='" + funcDesc + '\'' +
                '}';
    }
}
