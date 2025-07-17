package com.atJsleasing.demo;

import com.atJsleasing.demo.impl.CalculatorImpl;
import com.atJsleasing.demo.spring.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * ClassName: test
 * Package: com.atJsleasing.demo
 * Description：
 *
 * @Author dingtao
 * Create 2025/7/179:23
 * @Version 1.0
 */
public class JunitTest {
    @Test
    public void testCalculator() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
