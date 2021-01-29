package com.lch.study;


import com.lch.study.strategy.demo2.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudyApplicationTests {

	@Test
	void contextLoads() {
	}

	// 工厂模式
	@Test
	public void testFactory() {
		CashSuper cs = CashFactory.createCashAccept("打8折");
		double result = cs.acceptCash(300);
		System.out.println(result);
	}

	// 有不同的策略，正常的写法，一大堆策略业务逻辑封装，代码很长
	@Test
	public void testContext() {
		CashContext context = null;
		double money = 0.0;
		String strategy = "打8折";
		switch (strategy) {
			case "正常收费":
				context = new CashContext(new CashNormal());
				break;
			case "打8折":
				context = new CashContext(new CashRebate(8));
				break;
			case "满300减100":
				context = new CashContext(new CashReturn(300, 100));
				break;

			default:
				break;
		}

		money = context.getResult(300);
		System.out.println(money);
	}

	// 策略模式，代码可读性增强
	@Test
	public void testCashContextStrategy() {
		CashContextStrategy context = null;
		double money = 0.0;
		String strategy = "打8折";
		context = new CashContextStrategy(strategy);
		money = context.getResult(300);
		System.out.println(money);
	}


	// 策略高级用法
	// todo 学习反射知识点后再巩固此处
	@Test
	public void test() {
		CashContextReflect context = null;
		double money = 0.0;
		String type = "com.zhaowa.course.design.strategy.CashRebate";
		Class[] paramTypes = {double.class};
		Object[] params = {8.0};
		context = new CashContextReflect(type, paramTypes, params);
		money = context.getResult(300);
		System.out.println(money);
	}

}
