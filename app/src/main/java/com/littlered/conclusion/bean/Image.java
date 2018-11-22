package com.littlered.conclusion.bean;

import java.util.List;

public class Image extends BaseData {
    private List<String> tabs;

    public List<String> getList() {
        return tabs;
    }

    public void setList(List<String> tabs) {
        this.tabs = tabs;
    }
}
