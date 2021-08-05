package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Around(value = "@annotation(aspect.LogExecution)")
	public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object procced =  joinPoint.proceed();
		
		long executionTime = System.currentTimeMillis() - start;
		
		System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
		return procced;
	}
	
	@Before("execution(* com.zhangmagle.service.*.*.hello(..)) and args(name)")
	public void testBefore(String name) {
		System.out.println("test before apect:" + name);
	}
	
	
	@After("execution(* com.zhangmagle.service.*.*.hello(..)) and args(name)")
	public void testAfter(String name) {
		System.out.println("test after apect:" + name);
	}
	

}
