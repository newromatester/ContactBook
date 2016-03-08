package Connection;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

@Resource.Classpath("connection.properties")
public interface PropertyManager {

    @Property("db.host")
    String getHost();

    @Property("db.user")
    String getUser();

    @Property("db.password")
    String getPassword();



}
