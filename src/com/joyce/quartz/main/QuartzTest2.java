/**
 * @Description: 
 *
 * @Title: QuartzTest.java
 * @Package com.joyce.quartz.main
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-6-26 下午03:35:05
 * @version V2.0
 */
package com.joyce.quartz.main;

import java.util.ArrayList;

import com.zccpro.model.QuartzParam;
import com.zccpro.quartz.QuartzJob;
import com.zccpro.quartz.QuartzManager;

/**
 * @Description: 测试类
 *
 * @ClassName: QuartzTest
 * @Copyright: Copyright (c) 2014
 *
 * @author Comsys-LZP
 * @date 2014-6-26 下午03:35:05
 * @version V2.0
 */
public class QuartzTest2 {
	public static void main(String[] args) {
		ArrayList<QuartzParam> arrayList = new ArrayList<QuartzParam>();
		
		QuartzParam quartzParam = new QuartzParam();
		quartzParam.setTaskId("task1");
		quartzParam.setTaskName("任务1");
		quartzParam.setTaskGroupName("taskGroupName1");
		quartzParam.setTriggerName("triggergname1");
		quartzParam.setTriggerGroupName("triggergroupname1");
		quartzParam.setCronExp("0/1 * * * * ?");
		quartzParam.setSql("select * from user");
		arrayList.add(quartzParam);
		
//		QuartzParam quartzParam1 = new QuartzParam();
//		quartzParam1.setTaskId("task2");
//		quartzParam1.setTaskName("任务2");
//		quartzParam1.setTaskGroupName("taskGroupName1");
//		quartzParam1.setTriggerName("triggergname1");
//		quartzParam1.setTriggerGroupName("triggergroupname1");
//		quartzParam1.setCronExp("0/1 * * * * ?");
//		quartzParam1.setSql("select * from user1");
//		arrayList.add(quartzParam1);
//		
//		
//		QuartzParam quartzParam2 = new QuartzParam();
//		quartzParam2.setTaskId("task3");
//		quartzParam2.setTaskName("任务3");
//		quartzParam2.setTaskGroupName("taskGroupName1");
//		quartzParam2.setTriggerName("triggergname1");
//		quartzParam2.setTriggerGroupName("triggergroupname1");
//		quartzParam2.setCronExp("0/1 * * * * ?");
//		quartzParam2.setSql("select * from user2");
//		arrayList.add(quartzParam2);
		
		try {
			//增加
			for (QuartzParam quartzParam4: arrayList) {
				System.out.println("【系统启动】开始(每1秒输出一次)...");  
				QuartzManager.addJob(quartzParam4, QuartzJob.class);  
				
			}
			
			Thread.sleep(5000);
			//修改
			for (QuartzParam quartzParam4: arrayList) {
				quartzParam4.setCronExp("10/2 * * * * ?");
				System.out.println("【修改时间】开始(每2秒输出一次)...");  
				QuartzManager.modifyJobTime(quartzParam4, QuartzJob.class); 
				
			}
//			//删除
//			for (QuartzParam quartzParam4: arrayList) {
//				System.out.println("【系统启动】开始(每1秒输出一次)...");  
//				QuartzManager.addJob(quartzParam4, QuartzJob.class);  
//				
//			}
			
			
//			Thread.sleep(5000);  
//			System.out.println("【修改时间】开始(每2秒输出一次)...");  
//			QuartzManager.modifyJobTime(job_name, "10/2 * * * * ?");  
//			Thread.sleep(6000);  
//			System.out.println("【移除定时】开始...");  
//			QuartzManager.removeJob(job_name);
//			System.out.println("【移除定时】成功");  
			
//			System.out.println("【再次添加定时任务】开始(每10秒输出一次)...");  
//			QuartzManager.addJob(job_name, QuartzJob.class, "*/10 * * * * ?");  
//			Thread.sleep(60000);  
//			System.out.println("【移除定时】开始...");  
//			QuartzManager.removeJob(job_name);  
//			System.out.println("【移除定时】成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
