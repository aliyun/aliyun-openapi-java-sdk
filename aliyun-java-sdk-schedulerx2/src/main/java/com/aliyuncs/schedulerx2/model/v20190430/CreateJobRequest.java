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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.schedulerx2.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateJobRequest extends RpcAcsRequest<CreateJobResponse> {
	   

	private String namespaceSource;

	private String description;

	private Integer attemptInterval;

	private String content;

	private Long timeout;

	private Boolean timeoutKillEnable;

	private Integer pageSize;

	private Integer consumerSize;

	private String jarUrl;

	private String calendar;

	private Boolean failEnable;

	private String sendChannel;

	private Integer dataOffset;

	private String groupId;

	private Integer taskMaxAttempt;

	private Integer maxAttempt;

	private Integer dispatcherSize;

	private String jobType;

	private Integer taskAttemptInterval;

	private String executeMode;

	private Integer queueSize;

	private String timeExpression;

	private String className;

	private Boolean timeoutEnable;

	private List<ContactInfo> contactInfos;

	private String name;

	private String namespace;

	private Integer maxConcurrency;

	private Integer timeType;

	private String parameters;
	public CreateJobRequest() {
		super("schedulerx2", "2019-04-30", "CreateJob");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getConsumerSize() {
		return this.consumerSize;
	}

	public void setConsumerSize(Integer consumerSize) {
		this.consumerSize = consumerSize;
		if(consumerSize != null){
			putBodyParameter("ConsumerSize", consumerSize.toString());
		}
	}

	public String getJarUrl() {
		return this.jarUrl;
	}

	public void setJarUrl(String jarUrl) {
		this.jarUrl = jarUrl;
		if(jarUrl != null){
			putBodyParameter("JarUrl", jarUrl);
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

	public Integer getDataOffset() {
		return this.dataOffset;
	}

	public void setDataOffset(Integer dataOffset) {
		this.dataOffset = dataOffset;
		if(dataOffset != null){
			putBodyParameter("DataOffset", dataOffset.toString());
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

	public Integer getTaskMaxAttempt() {
		return this.taskMaxAttempt;
	}

	public void setTaskMaxAttempt(Integer taskMaxAttempt) {
		this.taskMaxAttempt = taskMaxAttempt;
		if(taskMaxAttempt != null){
			putBodyParameter("TaskMaxAttempt", taskMaxAttempt.toString());
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

	public Integer getDispatcherSize() {
		return this.dispatcherSize;
	}

	public void setDispatcherSize(Integer dispatcherSize) {
		this.dispatcherSize = dispatcherSize;
		if(dispatcherSize != null){
			putBodyParameter("DispatcherSize", dispatcherSize.toString());
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

	public Integer getQueueSize() {
		return this.queueSize;
	}

	public void setQueueSize(Integer queueSize) {
		this.queueSize = queueSize;
		if(queueSize != null){
			putBodyParameter("QueueSize", queueSize.toString());
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

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
		if(className != null){
			putBodyParameter("ClassName", className);
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
				putBodyParameter("ContactInfo." + (depth1 + 1) + ".UserPhone" , contactInfos.get(depth1).getUserPhone());
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
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

	public static class ContactInfo {

		private String userPhone;

		private String userName;

		public String getUserPhone() {
			return this.userPhone;
		}

		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
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
