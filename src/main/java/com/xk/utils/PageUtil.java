package com.xk.utils;

import java.util.List;

public class PageUtil<T> {
    private int pageNum;// 当前页
    private int pageSize;//每页显示条数
    private int pageCount;//总页数
    private int sumCount;//总条数
    private List<T> list;//每页显示的数据

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSumCount() {
        return sumCount;
    }

    public void setSumCount(int sumCount) {
        this.sumCount = sumCount;
        if (sumCount % pageSize == 0) {
            this.pageCount = sumCount / pageSize;
        } else {
            this.pageCount = (sumCount / pageSize) + 1;
        }
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
