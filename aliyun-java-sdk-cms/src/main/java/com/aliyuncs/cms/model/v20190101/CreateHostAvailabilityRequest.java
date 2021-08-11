/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateHostAvailabilityRequest extends RpcAcsRequest<CreateHostAvailabilityResponse> {
	   

	private String taskOptionHttpMethod;

	private String taskOptionHttpHeader;

	private List<AlertConfigEscalationList> alertConfigEscalationLists;

	private String taskName;

	private Integer alertConfigSilenceTime;

	private String taskOptionHttpResponseCharset;

	private Boolean taskOptionHttpNegative;

	private Integer taskOptionInterval;

	private Integer alertConfigNotifyType;

	private String taskOptionTelnetOrPingHost;

	private String taskOptionHttpResponseMatchContent;

	private List<String> instanceLists;

	private String taskType;

	private Long groupId;

	private Integer alertConfigEndTime;

	private String taskOptionHttpURI;

	private String taskScope;

	private String taskOptionHttpPostContent;

	private Integer alertConfigStartTime;

	private String alertConfigWebHook;
	public CreateHostAvailabilityRequest() {
		super("Cms", "2019-01-01", "CreateHostAvailability", "cms");
		setMethod(MethodType.POST);
	}

	public String getTaskOptionHttpMethod() {
		return this.taskOptionHttpMethod;
	}

	public void setTaskOptionHttpMethod(String taskOptionHttpMethod) {
		this.taskOptionHttpMethod = taskOptionHttpMethod;
		if(taskOptionHttpMethod != null){
			putQueryParameter("TaskOption.HttpMethod", taskOptionHttpMethod);
		}
	}

	public String getTaskOptionHttpHeader() {
		return this.taskOptionHttpHeader;
	}

	public void setTaskOptionHttpHeader(String taskOptionHttpHeader) {
		this.taskOptionHttpHeader = taskOptionHttpHeader;
		if(taskOptionHttpHeader != null){
			putQueryParameter("TaskOption.HttpHeader", taskOptionHttpHeader);
		}
	}

	public List<AlertConfigEscalationList> getAlertConfigEscalationLists() {
		return this.alertConfigEscalationLists;
	}

	public void setAlertConfigEscalationLists(List<AlertConfigEscalationList> alertConfigEscalationLists) {
		this.alertConfigEscalationLists = alertConfigEscalationLists;	
		if (alertConfigEscalationLists != null) {
			for (int depth1 = 0; depth1 < alertConfigEscalationLists.size(); depth1++) {
				putQueryParameter("AlertConfigEscalationList." + (depth1 + 1) + ".Times" , alertConfigEscalationLists.get(depth1).getTimes());
				putQueryParameter("AlertConfigEscalationList." + (depth1 + 1) + ".MetricName" , alertConfigEscalationLists.get(depth1).getMetricName());
				putQueryParameter("AlertConfigEscalationList." + (depth1 + 1) + ".Value" , alertConfigEscalationLists.get(depth1).getValue());
				putQueryParameter("AlertConfigEscalationList." + (depth1 + 1) + ".Operator" , alertConfigEscalationLists.get(depth1).getOperator());
				putQueryParameter("AlertConfigEscalationList." + (depth1 + 1) + ".Aggregate" , alertConfigEscalationLists.get(depth1).getAggregate());
			}
		}	
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public Integer getAlertConfigSilenceTime() {
		return this.alertConfigSilenceTime;
	}

	public void setAlertConfigSilenceTime(Integer alertConfigSilenceTime) {
		this.alertConfigSilenceTime = alertConfigSilenceTime;
		if(alertConfigSilenceTime != null){
			putQueryParameter("AlertConfig.SilenceTime", alertConfigSilenceTime.toString());
		}
	}

	public String getTaskOptionHttpResponseCharset() {
		return this.taskOptionHttpResponseCharset;
	}

	public void setTaskOptionHttpResponseCharset(String taskOptionHttpResponseCharset) {
		this.taskOptionHttpResponseCharset = taskOptionHttpResponseCharset;
		if(taskOptionHttpResponseCharset != null){
			putQueryParameter("TaskOption.HttpResponseCharset", taskOptionHttpResponseCharset);
		}
	}

	public Boolean getTaskOptionHttpNegative() {
		return this.taskOptionHttpNegative;
	}

	public void setTaskOptionHttpNegative(Boolean taskOptionHttpNegative) {
		this.taskOptionHttpNegative = taskOptionHttpNegative;
		if(taskOptionHttpNegative != null){
			putQueryParameter("TaskOption.HttpNegative", taskOptionHttpNegative.toString());
		}
	}

	public Integer getTaskOptionInterval() {
		return this.taskOptionInterval;
	}

	public void setTaskOptionInterval(Integer taskOptionInterval) {
		this.taskOptionInterval = taskOptionInterval;
		if(taskOptionInterval != null){
			putQueryParameter("TaskOption.Interval", taskOptionInterval.toString());
		}
	}

	public Integer getAlertConfigNotifyType() {
		return this.alertConfigNotifyType;
	}

	public void setAlertConfigNotifyType(Integer alertConfigNotifyType) {
		this.alertConfigNotifyType = alertConfigNotifyType;
		if(alertConfigNotifyType != null){
			putQueryParameter("AlertConfig.NotifyType", alertConfigNotifyType.toString());
		}
	}

	public String getTaskOptionTelnetOrPingHost() {
		return this.taskOptionTelnetOrPingHost;
	}

	public void setTaskOptionTelnetOrPingHost(String taskOptionTelnetOrPingHost) {
		this.taskOptionTelnetOrPingHost = taskOptionTelnetOrPingHost;
		if(taskOptionTelnetOrPingHost != null){
			putQueryParameter("TaskOption.TelnetOrPingHost", taskOptionTelnetOrPingHost);
		}
	}

	public String getTaskOptionHttpResponseMatchContent() {
		return this.taskOptionHttpResponseMatchContent;
	}

	public void setTaskOptionHttpResponseMatchContent(String taskOptionHttpResponseMatchContent) {
		this.taskOptionHttpResponseMatchContent = taskOptionHttpResponseMatchContent;
		if(taskOptionHttpResponseMatchContent != null){
			putQueryParameter("TaskOption.HttpResponseMatchContent", taskOptionHttpResponseMatchContent);
		}
	}

	public List<String> getInstanceLists() {
		return this.instanceLists;
	}

	public void setInstanceLists(List<String> instanceLists) {
		this.instanceLists = instanceLists;	
		if (instanceLists != null) {
			for (int i = 0; i < instanceLists.size(); i++) {
				putQueryParameter("InstanceList." + (i + 1) , instanceLists.get(i));
			}
		}	
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public Integer getAlertConfigEndTime() {
		return this.alertConfigEndTime;
	}

	public void setAlertConfigEndTime(Integer alertConfigEndTime) {
		this.alertConfigEndTime = alertConfigEndTime;
		if(alertConfigEndTime != null){
			putQueryParameter("AlertConfig.EndTime", alertConfigEndTime.toString());
		}
	}

	public String getTaskOptionHttpURI() {
		return this.taskOptionHttpURI;
	}

	public void setTaskOptionHttpURI(String taskOptionHttpURI) {
		this.taskOptionHttpURI = taskOptionHttpURI;
		if(taskOptionHttpURI != null){
			putQueryParameter("TaskOption.HttpURI", taskOptionHttpURI);
		}
	}

	public String getTaskScope() {
		return this.taskScope;
	}

	public void setTaskScope(String taskScope) {
		this.taskScope = taskScope;
		if(taskScope != null){
			putQueryParameter("TaskScope", taskScope);
		}
	}

	public String getTaskOptionHttpPostContent() {
		return this.taskOptionHttpPostContent;
	}

	public void setTaskOptionHttpPostContent(String taskOptionHttpPostContent) {
		this.taskOptionHttpPostContent = taskOptionHttpPostContent;
		if(taskOptionHttpPostContent != null){
			putQueryParameter("TaskOption.HttpPostContent", taskOptionHttpPostContent);
		}
	}

	public Integer getAlertConfigStartTime() {
		return this.alertConfigStartTime;
	}

	public void setAlertConfigStartTime(Integer alertConfigStartTime) {
		this.alertConfigStartTime = alertConfigStartTime;
		if(alertConfigStartTime != null){
			putQueryParameter("AlertConfig.StartTime", alertConfigStartTime.toString());
		}
	}

	public String getAlertConfigWebHook() {
		return this.alertConfigWebHook;
	}

	public void setAlertConfigWebHook(String alertConfigWebHook) {
		this.alertConfigWebHook = alertConfigWebHook;
		if(alertConfigWebHook != null){
			putQueryParameter("AlertConfig.WebHook", alertConfigWebHook);
		}
	}

	public static class AlertConfigEscalationList {

		private Integer times;

		private String metricName;

		private String value;

		private String operator;

		private String aggregate;

		public Integer getTimes() {
			return this.times;
		}

		public void setTimes(Integer times) {
			this.times = times;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getAggregate() {
			return this.aggregate;
		}

		public void setAggregate(String aggregate) {
			this.aggregate = aggregate;
		}
	}

	@Override
	public Class<CreateHostAvailabilityResponse> getResponseClass() {
		return CreateHostAvailabilityResponse.class;
	}

}
