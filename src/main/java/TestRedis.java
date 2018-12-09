import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * Created by wangzhen on 2018/11/18.
 */
public class TestRedis {
    public static void main(String[] args){
        Jedis jedis = new Jedis("149.28.96.211");
        jedis.auth("123456a?");
        System.out.println(jedis.ping());
        jedis.set("test", "testVal");
        System.out.println(jedis.get("test"));

        jedis.lpush("testList", "1");
        jedis.lpush("testList", "2");
        jedis.lpush("testList", "3");

        List<String> list = jedis.lrange("testList", 0, 5);
        for (String val: list
             ) {
            System.out.println(val);
        }

        Set<String> set = jedis.keys("*");
        for (String val: set
             ) {
            System.out.println(val);
        }
    }
}
