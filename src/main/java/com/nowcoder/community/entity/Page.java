package com.nowcoder.community.entity;

/**
 * 封装分页相关的信息
 */
public class Page {
    //当前页面
    private int current = 1;
    //显示上限
    private int limit = 10;
    //数据总数（用于计算总页数）
    private int rows;
    //查询路径（用于复用分页链接）
    private String path;

    @Override
    public String toString() {
        return "Page{" + "current=" + current + ", limit=" + limit + ", rows=" + rows + ", path='" + path + '\'' + '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >=1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    /**
     * 获取当前页的起始行
     */
    public int getOffset(){
        return (current -1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal(){
        if(rows % limit == 0){
            return rows /limit;
        }
        else{
            return rows / limit + 1;
        }
    }

    /**
     * 获取起始页码
     * @return
     */
    public int getFrom(){
        int from = this.current - 2;
        return from <1 ?1: from;
    }

    public int getTo(){
        int to = this.current + 2;
        int total = this.getTotal();
        return to >total?total:to;
    }
}
