package com.zixi.codetest;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * @author 封烟救人三十起
 * @Classname TestField
 * @Description TODO
 * @Date 2022/11/29 15:23
 */
public class TestField {

    private String headNo ;

    private String headName;

    private JRBeanCollectionDataSource tableList;

    public String getHeadNo() {
        return headNo;
    }

    public void setHeadNo(String headNo) {
        this.headNo = headNo;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public JRBeanCollectionDataSource getTableList() {
        return tableList;
    }

    public void setTableList(JRBeanCollectionDataSource tableList) {
        this.tableList = tableList;
    }
}
