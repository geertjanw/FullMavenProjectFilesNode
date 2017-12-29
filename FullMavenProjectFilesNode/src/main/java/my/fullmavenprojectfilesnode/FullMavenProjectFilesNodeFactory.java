package my.fullmavenprojectfilesnode;

import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.loaders.DataObjectNotFoundException;
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
            return NodeFactorySupport.fixedNodeList(new FullMavenProjectFilesNode(prjct));
        } catch (DataObjectNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return NodeFactorySupport.fixedNodeList();
    }

}
