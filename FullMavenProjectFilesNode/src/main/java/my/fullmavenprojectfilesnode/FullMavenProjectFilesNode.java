package my.fullmavenprojectfilesnode;

import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

/**
 *
 * @author geertjanwielenga
 */
public class FullMavenProjectFilesNode extends FilterNode {
    
    public FullMavenProjectFilesNode(Node original) throws DataObjectNotFoundException {
        super(original, new FullMavenProjectFilesChildren(original));
    }
    
    @Override
    public String getDisplayName() {
        return "Project Files";
    }
    
}
