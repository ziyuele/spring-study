package com.kj.application.di.collectiondi.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionList {

    List list;
    Set set;
    Map map;
    Properties properties;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionList{"
                + "list=" + list
                + ", set=" + set
                + ", map=" + map
                + ", properties=" + properties
                + '}';
    }
}
