package com.tensquare.common.code;

import java.util.List;

/**
 * @auther tangh
 * @date 2019/1/5 0005 13:05
 */
public class PageResult<T> {

    private List<T> list;

    public PageResult(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
