import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class StudentBeanIntrospection {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class);

        System.out.println("Properties of StudentBean:");
        for (PropertyDescriptor property : info.getPropertyDescriptors()) {
            System.out.println("Property: " + property.getName()
                    + ", type: " + property.getPropertyType()
                    + ", getter: " + property.getReadMethod()
                    + ", setter: " + property.getWriteMethod());
        }

        System.out.println("\\nPublic methods of StudentBean:");
        for (Method method : StudentBean.class.getMethods()) {
            System.out.println(method.getName());
        }
    }
}
