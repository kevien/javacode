import java.util.HashMap;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.map.LazyMap;
import org.junit.Test;

public class LazyMapTest
{
    @Test
    public void test()
    {
        Factory factory = new Factory()
        {
            @Override
            public Object create()
            {
                return "NULL";
            }
        };
        LazyMap lazyMap = LazyMap.lazyMap(new HashMap<String, String>(), factory);
        lazyMap.put("name", "jianggujin");
        System.out.println(lazyMap);
        System.out.println(lazyMap.get("hello"));
    }
}