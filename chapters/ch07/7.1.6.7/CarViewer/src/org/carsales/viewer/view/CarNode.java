package org.carsales.viewer.view;

import java.beans.IntrospectionException;
import java.util.List;
import javax.swing.Action;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;

public class CarNode extends BeanNode {
    public CarNode(Car bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
        setDisplayName(bean.getBrand());
        setShortDescription("Year: " + bean.getYear());
    }

@Override
public Action[] getActions(boolean context) {
    List<? extends Action> carActions = Utilities.actionsForPath("PopupMenu/Cars");
    return carActions.toArray(new Action[carActions.size()]);
}
    
}
