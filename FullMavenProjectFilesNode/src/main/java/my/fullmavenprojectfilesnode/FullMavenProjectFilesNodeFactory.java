package my.fullmavenprojectfilesnode;

import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author geertjanwielenga
 */
@NodeFactory.Registration(projectType = "org-netbeans-modules-maven", position = 10000)
public class FullMavenProjectFilesNodeFactory implements NodeFactory {

    @Override
    public NodeList<?> createNodes(Project prjct) {
        try {
            Node node = DataObject.find(prjct.getProjectDirectory()).getNodeDelegate();
            return NodeFactorySupport.fixedNodeList(new FullMavenProjectFilesNode(node));
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return NodeFactorySupport.fixedNodeList();
    }

}
