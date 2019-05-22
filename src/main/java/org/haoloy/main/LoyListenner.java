package org.haoloy.main;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoyListenner {
	public static void main(String[] args) {
		// 获取上下文对象
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		// 添加监听
		context.addApplicationListener(new ApplicationListener<MyApplicationEvent>() {
			@Override
			public void onApplicationEvent(MyApplicationEvent event) {
				System.out.println(event.getSource());				
			}
		});
		
		context.refresh();

		// 发布事件
		context.publishEvent(new MyApplicationEvent("LOY LIFE"));
	}
	
	// 设置事件
	private static class MyApplicationEvent extends ApplicationEvent{

		public MyApplicationEvent(Object source) {
			super(source);
		}
		
	}
}
