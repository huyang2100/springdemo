package com.aop;

import com.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午4:28
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class MyTargetTest {

    @Autowired
    private MyTarget target;

    @Test
    public void save() {
        target.save();
    }
}
