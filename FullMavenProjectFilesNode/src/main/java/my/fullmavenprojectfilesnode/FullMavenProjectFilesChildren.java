package my.fullmavenprojectfilesnode;

import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

/**
 *
 * @author geertjanwielenga
 */
public class FullMavenProjectFilesChildren extends FilterNode.Children {
    
    public FullMavenProjectFilesChildren(Node or) {
        super(or);
    }
    
    @Override
    protected Node[] createNodes(Node object) {
        List<Node> result = new ArrayList<Node>();
        for (Node node : super.createNodes(object)) {
            if (accept(node)) {
                result.add(node);
            }
        }
        return result.toArray(new Node[0]);
    }
    private boolean accept(Node node) {
        return !node.getDisplayName().equals("src");
    }
    
}
