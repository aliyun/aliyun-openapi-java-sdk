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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBaselineRequest extends RpcAcsRequest<UpdateBaselineResponse> {
	   

	private String owner;

	private Integer alertMarginThreshold;

	private String removeTaskIds;

	@SerializedName("overtimeSettings")
	private List<OvertimeSettings> overtimeSettings;

	private Integer priority;

	private String taskIds;

	private Long baselineId;

	private Boolean enabled;

	private String baselineType;

	private Boolean alertEnabled;

	@SerializedName("alertSettings")
	private List<AlertSettings> alertSettings;

	private String baselineName;

	private Long projectId;
	public UpdateBaselineRequest() {
		super("dataworks-public", "2020-05-18", "UpdateBaseline");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public Integer getAlertMarginThreshold() {
		return this.alertMarginThreshold;
	}

	public void setAlertMarginThreshold(Integer alertMarginThreshold) {
		this.alertMarginThreshold = alertMarginThreshold;
		if(alertMarginThreshold != null){
			putBodyParameter("AlertMarginThreshold", alertMarginThreshold.toString());
		}
	}

	public String getRemoveTaskIds() {
		return this.removeTaskIds;
	}

	public void setRemoveTaskIds(String removeTaskIds) {
		this.removeTaskIds = removeTaskIds;
		if(removeTaskIds != null){
			putBodyParameter("RemoveTaskIds", removeTaskIds);
		}
	}

	public List<OvertimeSettings> getOvertimeSettings() {
		return this.overtimeSettings;
	}

	public void setOvertimeSettings(List<OvertimeSettings> overtimeSettings) {
		this.overtimeSettings = overtimeSettings;	
		if (overtimeSettings != null) {
			putBodyParameter("OvertimeSettings" , new Gson().toJson(overtimeSettings));
		}	
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public String getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(String taskIds) {
		this.taskIds = taskIds;
		if(taskIds != null){
			putBodyParameter("TaskIds", taskIds);
		}
	}

	public Long getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(Long baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putBodyParameter("BaselineId", baselineId.toString());
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putBodyParameter("Enabled", enabled.toString());
		}
	}

	public String getBaselineType() {
		return this.baselineType;
	}

	public void setBaselineType(String baselineType) {
		this.baselineType = baselineType;
		if(baselineType != null){
			putBodyParameter("BaselineType", baselineType);
		}
	}

	public Boolean getAlertEnabled() {
		return this.alertEnabled;
	}

	public void setAlertEnabled(Boolean alertEnabled) {
		this.alertEnabled = alertEnabled;
		if(alertEnabled != null){
			putBodyParameter("AlertEnabled", alertEnabled.toString());
		}
	}

	public List<AlertSettings> getAlertSettings() {
		return this.alertSettings;
	}

	public void setAlertSettings(List<AlertSettings> alertSettings) {
		this.alertSettings = alertSettings;	
		if (alertSettings != null) {
			putBodyParameter("AlertSettings" , new Gson().toJson(alertSettings));
		}	
	}

	public String getBaselineName() {
		return this.baselineName;
	}

	public void setBaselineName(String baselineName) {
		this.baselineName = baselineName;
		if(baselineName != null){
			putBodyParameter("BaselineName", baselineName);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public static class OvertimeSettings {

		@SerializedName("Time")
		private String time;

		@SerializedName("Cycle")
		private Integer cycle;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Integer getCycle() {
			return this.cycle;
		}

		public void setCycle(Integer cycle) {
			this.cycle = cycle;
		}
	}

	public static class AlertSettings {

		@SerializedName("DingRobots")
		private List<DingRobotsItem> dingRobots;

		@SerializedName("AlertType")
		private String alertType;

		@SerializedName("AlertMaximum")
		private Integer alertMaximum;

		@SerializedName("SilenceStartTime")
		private String silenceStartTime;

		@SerializedName("Webhooks")
		private List<String> webhooks;

		@SerializedName("BaselineAlertEnabled")
		private Boolean baselineAlertEnabled;

		@SerializedName("AlertRecipientType")
		private String alertRecipientType;

		@SerializedName("AlertInterval")
		private Integer alertInterval;

		@SerializedName("TopicTypes")
		private List<String> topicTypes;

		@SerializedName("AlertRecipient")
		private String alertRecipient;

		@SerializedName("AlertMethods")
		private List<String> alertMethods;

		@SerializedName("SilenceEndTime")
		private String silenceEndTime;

		public List<DingRobotsItem> getDingRobots() {
			return this.dingRobots;
		}

		public void setDingRobots(List<DingRobotsItem> dingRobots) {
			this.dingRobots = dingRobots;
		}

		public String getAlertType() {
			return this.alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public Integer getAlertMaximum() {
			return this.alertMaximum;
		}

		public void setAlertMaximum(Integer alertMaximum) {
			this.alertMaximum = alertMaximum;
		}

		public String getSilenceStartTime() {
			return this.silenceStartTime;
		}

		public void setSilenceStartTime(String silenceStartTime) {
			this.silenceStartTime = silenceStartTime;
		}

		public List<String> getWebhooks() {
			return this.webhooks;
		}

		public void setWebhooks(List<String> webhooks) {
			this.webhooks = webhooks;
		}

		public Boolean getBaselineAlertEnabled() {
			return this.baselineAlertEnabled;
		}

		public void setBaselineAlertEnabled(Boolean baselineAlertEnabled) {
			this.baselineAlertEnabled = baselineAlertEnabled;
		}

		public String getAlertRecipientType() {
			return this.alertRecipientType;
		}

		public void setAlertRecipientType(String alertRecipientType) {
			this.alertRecipientType = alertRecipientType;
		}

		public Integer getAlertInterval() {
			return this.alertInterval;
		}

		public void setAlertInterval(Integer alertInterval) {
			this.alertInterval = alertInterval;
		}

		public List<String> getTopicTypes() {
			return this.topicTypes;
		}

		public void setTopicTypes(List<String> topicTypes) {
			this.topicTypes = topicTypes;
		}

		public String getAlertRecipient() {
			return this.alertRecipient;
		}

		public void setAlertRecipient(String alertRecipient) {
			this.alertRecipient = alertRecipient;
		}

		public List<String> getAlertMethods() {
			return this.alertMethods;
		}

		public void setAlertMethods(List<String> alertMethods) {
			this.alertMethods = alertMethods;
		}

		public String getSilenceEndTime() {
			return this.silenceEndTime;
		}

		public void setSilenceEndTime(String silenceEndTime) {
			this.silenceEndTime = silenceEndTime;
		}

		public static class DingRobotsItem {

			@SerializedName("AtAll")
			private Boolean atAll;

			@SerializedName("WebUrl")
			private String webUrl;

			public Boolean getAtAll() {
				return this.atAll;
			}

			public void setAtAll(Boolean atAll) {
				this.atAll = atAll;
			}

			public String getWebUrl() {
				return this.webUrl;
			}

			public void setWebUrl(String webUrl) {
				this.webUrl = webUrl;
			}
		}
	}

	@Override
	public Class<UpdateBaselineResponse> getResponseClass() {
		return UpdateBaselineResponse.class;
	}

}
