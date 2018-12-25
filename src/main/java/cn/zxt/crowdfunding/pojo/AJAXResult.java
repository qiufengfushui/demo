package cn.zxt.crowdfunding.pojo;

import cn.zxt.crowdfunding.util.PageBean;

import java.util.List;

public class AJAXResult<T> {
    private boolean success;

    private T object;

    private List<T> list;

    private PageBean<T> pageBean;

    public PageBean<T> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<T> pageBean) {
        this.pageBean = pageBean;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "AJAXResult{" +
                "success=" + success +
                ", object=" + object +
                ", list=" + list +
                ", pageBean=" + pageBean +
                '}';
    }
}
