package dubbo.learn.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by kieren on 18/2/27.
 */
@Component
public class RedisService {

    @Autowired
    RedisTemplate redisTemplate;


    public void set (String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }


}
