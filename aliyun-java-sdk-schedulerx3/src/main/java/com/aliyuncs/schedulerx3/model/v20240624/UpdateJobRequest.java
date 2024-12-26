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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateJobRequest extends RpcAcsRequest<UpdateJobResponse> {
	   

	private Integer executorBlockStrategy;

	private String timezone;

	private Integer routeStrategy;

	private String description;

	private Integer attemptInterval;

	private Long startTime;

	private Long jobId;

	private String appName;

	@SerializedName("noticeContacts")
	private List<NoticeContacts> noticeContacts;

	@SerializedName("noticeConfig")
	private NoticeConfig noticeConfig;

	private String calendar;

	private Integer maxAttempt;

	private String clusterId;

	private Integer priority;

	private String timeExpression;

	private String name;

	private Integer maxConcurrency;

	private Integer timeType;

	private String parameters;

	private String jobHandler;
	public UpdateJobRequest() {
		super("SchedulerX3", "2024-06-24", "UpdateJob");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getExecutorBlockStrategy() {
		return this.executorBlockStrategy;
	}

	public void setExecutorBlockStrategy(Integer executorBlockStrategy) {
		this.executorBlockStrategy = executorBlockStrategy;
		if(executorBlockStrategy != null){
			putBodyParameter("ExecutorBlockStrategy", executorBlockStrategy.toString());
		}
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
		if(timezone != null){
			putBodyParameter("Timezone", timezone);
		}
	}

	public Integer getRouteStrategy() {
		return this.routeStrategy;
	}

	public void setRouteStrategy(Integer routeStrategy) {
		this.routeStrategy = routeStrategy;
		if(routeStrategy != null){
			putBodyParameter("RouteStrategy", routeStrategy.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Integer getAttemptInterval() {
		return this.attemptInterval;
	}

	public void setAttemptInterval(Integer attemptInterval) {
		this.attemptInterval = attemptInterval;
		if(attemptInterval != null){
			putBodyParameter("AttemptInterval", attemptInterval.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public List<NoticeContacts> getNoticeContacts() {
		return this.noticeContacts;
	}

	public void setNoticeContacts(List<NoticeContacts> noticeContacts) {
		this.noticeContacts = noticeContacts;	
		if (noticeContacts != null) {
			putBodyParameter("NoticeContacts" , new Gson().toJson(noticeContacts));
		}	
	}

	public NoticeConfig getNoticeConfig() {
		return this.noticeConfig;
	}

	public void setNoticeConfig(NoticeConfig noticeConfig) {
		this.noticeConfig = noticeConfig;	
		if (noticeConfig != null) {
			putBodyParameter("NoticeConfig" , new Gson().toJson(noticeConfig));
		}	
	}

	public String getCalendar() {
		return this.calendar;
	}

	public void setCalendar(String calendar) {
		this.calendar = calendar;
		if(calendar != null){
			putBodyParameter("Calendar", calendar);
		}
	}

	public Integer getMaxAttempt() {
		return this.maxAttempt;
	}

	public void setMaxAttempt(Integer maxAttempt) {
		this.maxAttempt = maxAttempt;
		if(maxAttempt != null){
			putBodyParameter("MaxAttempt", maxAttempt.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
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

	public String getTimeExpression() {
		return this.timeExpression;
	}

	public void setTimeExpression(String timeExpression) {
		this.timeExpression = timeExpression;
		if(timeExpression != null){
			putBodyParameter("TimeExpression", timeExpression);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getMaxConcurrency() {
		return this.maxConcurrency;
	}

	public void setMaxConcurrency(Integer maxConcurrency) {
		this.maxConcurrency = maxConcurrency;
		if(maxConcurrency != null){
			putBodyParameter("MaxConcurrency", maxConcurrency.toString());
		}
	}

	public Integer getTimeType() {
		return this.timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
		if(timeType != null){
			putBodyParameter("TimeType", timeType.toString());
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putBodyParameter("Parameters", parameters);
		}
	}

	public String getJobHandler() {
		return this.jobHandler;
	}

	public void setJobHandler(String jobHandler) {
		this.jobHandler = jobHandler;
		if(jobHandler != null){
			putBodyParameter("JobHandler", jobHandler);
		}
	}

	public static class NoticeContacts {

		@SerializedName("ContactType")
		private Integer contactType;

		@SerializedName("Name")
		private String name;

		public Integer getContactType() {
			return this.contactType;
		}

		public void setContactType(Integer contactType) {
			this.contactType = contactType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class NoticeConfig {

		@SerializedName("TimeoutKillEnable")
		private Boolean timeoutKillEnable;

		@SerializedName("FailEnable")
		private Boolean failEnable;

		@SerializedName("webhookIsAtAll")
		private Boolean webhookIsAtAll;

		@SerializedName("SuccessNotice")
		private Boolean successNotice;

		@SerializedName("FailLimitTimes")
		private Integer failLimitTimes;

		@SerializedName("SendChannel")
		private String sendChannel;

		@SerializedName("TimeoutEnable")
		private Boolean timeoutEnable;

		@SerializedName("MissWorkerEnable")
		private Boolean missWorkerEnable;

		@SerializedName("Timeout")
		private Long timeout;

		public Boolean getTimeoutKillEnable() {
			return this.timeoutKillEnable;
		}

		public void setTimeoutKillEnable(Boolean timeoutKillEnable) {
			this.timeoutKillEnable = timeoutKillEnable;
		}

		public Boolean getFailEnable() {
			return this.failEnable;
		}

		public void setFailEnable(Boolean failEnable) {
			this.failEnable = failEnable;
		}

		public Boolean getWebhookIsAtAll() {
			return this.webhookIsAtAll;
		}

		public void setWebhookIsAtAll(Boolean webhookIsAtAll) {
			this.webhookIsAtAll = webhookIsAtAll;
		}

		public Boolean getSuccessNotice() {
			return this.successNotice;
		}

		public void setSuccessNotice(Boolean successNotice) {
			this.successNotice = successNotice;
		}

		public Integer getFailLimitTimes() {
			return this.failLimitTimes;
		}

		public void setFailLimitTimes(Integer failLimitTimes) {
			this.failLimitTimes = failLimitTimes;
		}

		public String getSendChannel() {
			return this.sendChannel;
		}

		public void setSendChannel(String sendChannel) {
			this.sendChannel = sendChannel;
		}

		public Boolean getTimeoutEnable() {
			return this.timeoutEnable;
		}

		public void setTimeoutEnable(Boolean timeoutEnable) {
			this.timeoutEnable = timeoutEnable;
		}

		public Boolean getMissWorkerEnable() {
			return this.missWorkerEnable;
		}

		public void setMissWorkerEnable(Boolean missWorkerEnable) {
			this.missWorkerEnable = missWorkerEnable;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}
	}

	@Override
	public Class<UpdateJobResponse> getResponseClass() {
		return UpdateJobResponse.class;
	}

}
