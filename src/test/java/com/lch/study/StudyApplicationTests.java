package com.lch.study;


import com.lch.study.strategy.demo2.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudyApplicationTests {

	@Test
	void contextLoads() {
	}

	// 工厂模式+策略模式
	@Test
	public void testFactory() {
		CashSuper cs = CashFactory.createCashAccept("打8折");
		double result = cs.acceptCash(300);
		System.out.println(result);
	}

	// 策略模式：将使用具体策略的方法写在客户端代码内，显得有点冗余
	@Test
	public void testContext() {
		CashContext context = null;

		/*CashContext  context = new CashContext(new CashRebate(8));
		double money = context.getResult(300);
		System.out.println(money);*/

		// 根据strategy参数来动态生成不同的具体策略CashContext，这里strategy是在内部定义死的
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

	// 策略模式
	@Test
	public void testCashContextStrategy() {
		CashContextStrategy context = null;
		double money = 0.0;
		// 根据传递的strategy参数动态生成CashContextStrategy，简洁代码
		String strategy = "打8折";
		context = new CashContextStrategy(strategy);
		money = context.getResult(300);
		System.out.println(money);
	}


	// 策略高级用法
	@Test
	public void test() {
		CashContextReflect context = null;
		double money = 0.0;
		String className = "com.zhaowa.course.design.strategy.CashRebate";  //
		Class[] paramTypes = {double.class};
		Object[] params = {8.0};
		// 通过反射来创建具体策略对象CashRebate，需传递三个参数
		// className：反射创建对象的目标类类全限定名称
		// paramTypes:反射创建的对象如CashRebate对应有参构造函数的参数类型
		// params:反射创建的对象如CashRebate对应有参构造函数的实参
		context = new CashContextReflect(className, paramTypes, params);
		// 通过反射成功创建CashRebate策略对象
		money = context.getResult(300);
		System.out.println(money);
	}

}
