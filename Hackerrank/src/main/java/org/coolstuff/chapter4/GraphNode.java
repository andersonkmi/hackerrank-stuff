package org.coolstuff.chapter4;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class GraphNode {
    private String name;
    private List<GraphNode> children = new LinkedList<>();
    private boolean marked = false;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<GraphNode> getChildren() {
        return children;
    }

    public void add(GraphNode node) {
        children.add(node);
    }

    public boolean isMarked() {
        return marked;
    }

    public void markVisited() {
        marked = true;
    }
}
