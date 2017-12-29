package my.fullmavenprojectfilesnode;

import org.netbeans.api.project.Project;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

/**
 *
 * @author geertjanwielenga
 */
public class FullMavenProjectFilesNode extends FilterNode {
    
    public FullMavenProjectFilesNode(Project proj) throws DataObjectNotFoundException {
        super(DataObject.find(proj.getProjectDirectory()).getNodeDelegate(), 
                new FullMavenProjectFilesChildren(DataObject.find(proj.getProjectDirectory()).getNodeDelegate()));
    }
    
    @Override
    public String getDisplayName() {
        return "Project Files";
    }
    
}
