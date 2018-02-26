package com.SkMaury;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private int depthLevel = 0;
    private List<Node> adjacencieList;

    public Node(String name) {
        this.name = name;
        this.adjacencieList = new ArrayList<>();
    }

    public void addNeighbour(Node node){
        this.adjacencieList.add(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Node> getAdjacencieList() {
        return adjacencieList;
    }

    public void setAdjacencieList(List<Node> adjacencieList) {
        this.adjacencieList = adjacencieList;
    }

    @Override
    public String toString() {
        return this.name;

    }
}
