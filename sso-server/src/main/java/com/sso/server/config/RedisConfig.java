package com.sso.server.config;

import com.awesome.util.spring.RedisOperation;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by mjd on 2020/4/15 20:03
 */
@Configuration
@Import(RedisOperation.class)
public class RedisConfig {
}
