package com.zccpro.model;

public class QuartzParam {

	private String taskId;//任务Id
	
	private String taskName;//任务名称
	
	private String taskGroupName;//任务组
	
	private String triggerName;//触发器组名称
	
	private String triggerGroupName;//触发器组名称
	
	private String cronExp;//定时表达式
	
	private String sql;//sql

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskGroupName() {
		return taskGroupName;
	}

	public void setTaskGroupName(String taskGroupName) {
		this.taskGroupName = taskGroupName;
	}

	public String getCronExp() {
		return cronExp;
	}

	public void setCronExp(String cronExp) {
		this.cronExp = cronExp;
	}

	public String getTriggerGroupName() {
		return triggerGroupName;
	}

	public void setTriggerGroupName(String triggerGroupName) {
		this.triggerGroupName = triggerGroupName;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}
	
	
}
