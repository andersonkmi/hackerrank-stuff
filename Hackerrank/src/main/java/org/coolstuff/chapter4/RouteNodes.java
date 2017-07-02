package org.coolstuff.chapter4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Created by andersonkmi on 7/2/2017.
 */
public class RouteNodes {
    public boolean hasRoute(GraphNode start, GraphNode end) {
        Deque<GraphNode> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(start);
        start.markVisited();

        boolean foundDestination = false;

        while(!nodesToVisit.isEmpty() && !foundDestination) {
            GraphNode node = nodesToVisit.removeFirst();
            if(node.getName().equals(end.getName())) {
                foundDestination = true;
            }

            List<GraphNode> children = node.getChildren();
            for(GraphNode item : children) {
                if(!item.isMarked()) {
                    nodesToVisit.add(item);
                }
            }
        }
        return foundDestination;
    }
}
