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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateJobRequest extends RpcAcsRequest<CreateJobResponse> {
	   

	private Integer attemptInterval;

	private Integer failTimes;

	private Integer consumerSize;

	private String groupId;

	private Integer dataOffset;

	private Integer taskMaxAttempt;

	private Integer dispatcherSize;

	private Integer priority;

	private String jobType;

	private Integer taskAttemptInterval;

	private String executeMode;

	private String timeExpression;

	private Boolean timeoutEnable;

	private List<ContactInfo> contactInfos;

	private String name;

	private Integer timeType;

	private String parameters;

	private Integer status;

	private String namespaceSource;

	private String timezone;

	private String description;

	private String content;

	private Long timeout;

	private Boolean timeoutKillEnable;

	private Integer pageSize;

	private String calendar;

	private Boolean failEnable;

	private String sendChannel;

	private Integer maxAttempt;

	private Boolean missWorkerEnable;

	private Boolean successNoticeEnable;

	private Integer queueSize;

	private String className;

	private String namespace;

	private String xAttrs;

	private Integer maxConcurrency;
	public CreateJobRequest() {
		super("schedulerx2", "2019-04-30", "CreateJob", "schedulerx2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getFailTimes() {
		return this.failTimes;
	}

	public void setFailTimes(Integer failTimes) {
		this.failTimes = failTimes;
		if(failTimes != null){
			putBodyParameter("FailTimes", failTimes.toString());
		}
	}

	public Integer getConsumerSize() {
		return this.consumerSize;
	}

	public void setConsumerSize(Integer consumerSize) {
		this.consumerSize = consumerSize;
		if(consumerSize != null){
			putBodyParameter("ConsumerSize", consumerSize.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public Integer getDataOffset() {
		return this.dataOffset;
	}

	public void setDataOffset(Integer dataOffset) {
		this.dataOffset = dataOffset;
		if(dataOffset != null){
			putBodyParameter("DataOffset", dataOffset.toString());
		}
	}

	public Integer getTaskMaxAttempt() {
		return this.taskMaxAttempt;
	}

	public void setTaskMaxAttempt(Integer taskMaxAttempt) {
		this.taskMaxAttempt = taskMaxAttempt;
		if(taskMaxAttempt != null){
			putBodyParameter("TaskMaxAttempt", taskMaxAttempt.toString());
		}
	}

	public Integer getDispatcherSize() {
		return this.dispatcherSize;
	}

	public void setDispatcherSize(Integer dispatcherSize) {
		this.dispatcherSize = dispatcherSize;
		if(dispatcherSize != null){
			putBodyParameter("DispatcherSize", dispatcherSize.toString());
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putBodyParameter("JobType", jobType);
		}
	}

	public Integer getTaskAttemptInterval() {
		return this.taskAttemptInterval;
	}

	public void setTaskAttemptInterval(Integer taskAttemptInterval) {
		this.taskAttemptInterval = taskAttemptInterval;
		if(taskAttemptInterval != null){
			putBodyParameter("TaskAttemptInterval", taskAttemptInterval.toString());
		}
	}

	public String getExecuteMode() {
		return this.executeMode;
	}

	public void setExecuteMode(String executeMode) {
		this.executeMode = executeMode;
		if(executeMode != null){
			putBodyParameter("ExecuteMode", executeMode);
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

	public Boolean getTimeoutEnable() {
		return this.timeoutEnable;
	}

	public void setTimeoutEnable(Boolean timeoutEnable) {
		this.timeoutEnable = timeoutEnable;
		if(timeoutEnable != null){
			putBodyParameter("TimeoutEnable", timeoutEnable.toString());
		}
	}

	public List<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}

	public void setContactInfos(List<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;	
		if (contactInfos != null) {
			for (int depth1 = 0; depth1 < contactInfos.size(); depth1++) {
				putBodyParameter("ContactInfo." + (depth1 + 1) + ".Ding" , contactInfos.get(depth1).getDing());
				putBodyParameter("ContactInfo." + (depth1 + 1) + ".UserPhone" , contactInfos.get(depth1).getUserPhone());
				putBodyParameter("ContactInfo." + (depth1 + 1) + ".UserMail" , contactInfos.get(depth1).getUserMail());
				putBodyParameter("ContactInfo." + (depth1 + 1) + ".UserName" , contactInfos.get(depth1).getUserName());
			}
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public String getNamespaceSource() {
		return this.namespaceSource;
	}

	public void setNamespaceSource(String namespaceSource) {
		this.namespaceSource = namespaceSource;
		if(namespaceSource != null){
			putBodyParameter("NamespaceSource", namespaceSource);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public Boolean getTimeoutKillEnable() {
		return this.timeoutKillEnable;
	}

	public void setTimeoutKillEnable(Boolean timeoutKillEnable) {
		this.timeoutKillEnable = timeoutKillEnable;
		if(timeoutKillEnable != null){
			putBodyParameter("TimeoutKillEnable", timeoutKillEnable.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
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

	public Boolean getFailEnable() {
		return this.failEnable;
	}

	public void setFailEnable(Boolean failEnable) {
		this.failEnable = failEnable;
		if(failEnable != null){
			putBodyParameter("FailEnable", failEnable.toString());
		}
	}

	public String getSendChannel() {
		return this.sendChannel;
	}

	public void setSendChannel(String sendChannel) {
		this.sendChannel = sendChannel;
		if(sendChannel != null){
			putBodyParameter("SendChannel", sendChannel);
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

	public Boolean getMissWorkerEnable() {
		return this.missWorkerEnable;
	}

	public void setMissWorkerEnable(Boolean missWorkerEnable) {
		this.missWorkerEnable = missWorkerEnable;
		if(missWorkerEnable != null){
			putBodyParameter("MissWorkerEnable", missWorkerEnable.toString());
		}
	}

	public Boolean getSuccessNoticeEnable() {
		return this.successNoticeEnable;
	}

	public void setSuccessNoticeEnable(Boolean successNoticeEnable) {
		this.successNoticeEnable = successNoticeEnable;
		if(successNoticeEnable != null){
			putBodyParameter("SuccessNoticeEnable", successNoticeEnable.toString());
		}
	}

	public Integer getQueueSize() {
		return this.queueSize;
	}

	public void setQueueSize(Integer queueSize) {
		this.queueSize = queueSize;
		if(queueSize != null){
			putBodyParameter("QueueSize", queueSize.toString());
		}
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
		if(className != null){
			putBodyParameter("ClassName", className);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getXAttrs() {
		return this.xAttrs;
	}

	public void setXAttrs(String xAttrs) {
		this.xAttrs = xAttrs;
		if(xAttrs != null){
			putBodyParameter("XAttrs", xAttrs);
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

	public static class ContactInfo {

		private String ding;

		private String userPhone;

		private String userMail;

		private String userName;

		public String getDing() {
			return this.ding;
		}

		public void setDing(String ding) {
			this.ding = ding;
		}

		public String getUserPhone() {
			return this.userPhone;
		}

		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
		}

		public String getUserMail() {
			return this.userMail;
		}

		public void setUserMail(String userMail) {
			this.userMail = userMail;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
