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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateEventSourceRequest extends RpcAcsRequest<CreateEventSourceResponse> {
	   

	private String description;

	private String eventBusName;

	@SerializedName("sourceMNSParameters")
	private SourceMNSParameters sourceMNSParameters;

	@SerializedName("sourceRabbitMQParameters")
	private SourceRabbitMQParameters sourceRabbitMQParameters;

	@SerializedName("sourceRocketMQParameters")
	private SourceRocketMQParameters sourceRocketMQParameters;

	@SerializedName("sourceSLSParameters")
	private SourceSLSParameters sourceSLSParameters;

	@SerializedName("sourceScheduledEventParameters")
	private SourceScheduledEventParameters sourceScheduledEventParameters;

	@SerializedName("sourceKafkaParameters")
	private SourceKafkaParameters sourceKafkaParameters;

	@SerializedName("sourceHttpEventParameters")
	private SourceHttpEventParameters sourceHttpEventParameters;

	private String eventSourceName;
	public CreateEventSourceRequest() {
		super("eventbridge", "2020-04-01", "CreateEventSource");
		setMethod(MethodType.POST);
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

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putBodyParameter("EventBusName", eventBusName);
		}
	}

	public SourceMNSParameters getSourceMNSParameters() {
		return this.sourceMNSParameters;
	}

	public void setSourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
		this.sourceMNSParameters = sourceMNSParameters;	
		if (sourceMNSParameters != null) {
			putBodyParameter("SourceMNSParameters" , new Gson().toJson(sourceMNSParameters));
		}	
	}

	public SourceRabbitMQParameters getSourceRabbitMQParameters() {
		return this.sourceRabbitMQParameters;
	}

	public void setSourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
		this.sourceRabbitMQParameters = sourceRabbitMQParameters;	
		if (sourceRabbitMQParameters != null) {
			putBodyParameter("SourceRabbitMQParameters" , new Gson().toJson(sourceRabbitMQParameters));
		}	
	}

	public SourceRocketMQParameters getSourceRocketMQParameters() {
		return this.sourceRocketMQParameters;
	}

	public void setSourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
		this.sourceRocketMQParameters = sourceRocketMQParameters;	
		if (sourceRocketMQParameters != null) {
			putBodyParameter("SourceRocketMQParameters" , new Gson().toJson(sourceRocketMQParameters));
		}	
	}

	public SourceSLSParameters getSourceSLSParameters() {
		return this.sourceSLSParameters;
	}

	public void setSourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
		this.sourceSLSParameters = sourceSLSParameters;	
		if (sourceSLSParameters != null) {
			putBodyParameter("SourceSLSParameters" , new Gson().toJson(sourceSLSParameters));
		}	
	}

	public SourceScheduledEventParameters getSourceScheduledEventParameters() {
		return this.sourceScheduledEventParameters;
	}

	public void setSourceScheduledEventParameters(SourceScheduledEventParameters sourceScheduledEventParameters) {
		this.sourceScheduledEventParameters = sourceScheduledEventParameters;	
		if (sourceScheduledEventParameters != null) {
			putBodyParameter("SourceScheduledEventParameters" , new Gson().toJson(sourceScheduledEventParameters));
		}	
	}

	public SourceKafkaParameters getSourceKafkaParameters() {
		return this.sourceKafkaParameters;
	}

	public void setSourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
		this.sourceKafkaParameters = sourceKafkaParameters;	
		if (sourceKafkaParameters != null) {
			putBodyParameter("SourceKafkaParameters" , new Gson().toJson(sourceKafkaParameters));
		}	
	}

	public SourceHttpEventParameters getSourceHttpEventParameters() {
		return this.sourceHttpEventParameters;
	}

	public void setSourceHttpEventParameters(SourceHttpEventParameters sourceHttpEventParameters) {
		this.sourceHttpEventParameters = sourceHttpEventParameters;	
		if (sourceHttpEventParameters != null) {
			putBodyParameter("SourceHttpEventParameters" , new Gson().toJson(sourceHttpEventParameters));
		}	
	}

	public String getEventSourceName() {
		return this.eventSourceName;
	}

	public void setEventSourceName(String eventSourceName) {
		this.eventSourceName = eventSourceName;
		if(eventSourceName != null){
			putBodyParameter("EventSourceName", eventSourceName);
		}
	}

	public static class SourceMNSParameters {

		@SerializedName("QueueName")
		private String queueName;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("IsBase64Decode")
		private Boolean isBase64Decode;

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getIsBase64Decode() {
			return this.isBase64Decode;
		}

		public void setIsBase64Decode(Boolean isBase64Decode) {
			this.isBase64Decode = isBase64Decode;
		}
	}

	public static class SourceRabbitMQParameters {

		@SerializedName("QueueName")
		private String queueName;

		@SerializedName("VirtualHostName")
		private String virtualHostName;

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("RegionId")
		private String regionId;

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getVirtualHostName() {
			return this.virtualHostName;
		}

		public void setVirtualHostName(String virtualHostName) {
			this.virtualHostName = virtualHostName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class SourceRocketMQParameters {

		@SerializedName("InstanceSecurityGroupId")
		private String instanceSecurityGroupId;

		@SerializedName("Offset")
		private String offset;

		@SerializedName("GroupID")
		private String groupID;

		@SerializedName("InstanceUsername")
		private String instanceUsername;

		@SerializedName("AuthType")
		private String authType;

		@SerializedName("InstancePassword")
		private String instancePassword;

		@SerializedName("InstanceNetwork")
		private String instanceNetwork;

		@SerializedName("InstanceVSwitchIds")
		private String instanceVSwitchIds;

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("InstanceVpcId")
		private String instanceVpcId;

		@SerializedName("InstanceEndpoint")
		private String instanceEndpoint;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("Topic")
		private String topic;

		@SerializedName("InstanceType")
		private String instanceType;

		@SerializedName("Tag")
		private String tag;

		@SerializedName("Timestamp")
		private Long timestamp;

		public String getInstanceSecurityGroupId() {
			return this.instanceSecurityGroupId;
		}

		public void setInstanceSecurityGroupId(String instanceSecurityGroupId) {
			this.instanceSecurityGroupId = instanceSecurityGroupId;
		}

		public String getOffset() {
			return this.offset;
		}

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getGroupID() {
			return this.groupID;
		}

		public void setGroupID(String groupID) {
			this.groupID = groupID;
		}

		public String getInstanceUsername() {
			return this.instanceUsername;
		}

		public void setInstanceUsername(String instanceUsername) {
			this.instanceUsername = instanceUsername;
		}

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public String getInstancePassword() {
			return this.instancePassword;
		}

		public void setInstancePassword(String instancePassword) {
			this.instancePassword = instancePassword;
		}

		public String getInstanceNetwork() {
			return this.instanceNetwork;
		}

		public void setInstanceNetwork(String instanceNetwork) {
			this.instanceNetwork = instanceNetwork;
		}

		public String getInstanceVSwitchIds() {
			return this.instanceVSwitchIds;
		}

		public void setInstanceVSwitchIds(String instanceVSwitchIds) {
			this.instanceVSwitchIds = instanceVSwitchIds;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceVpcId() {
			return this.instanceVpcId;
		}

		public void setInstanceVpcId(String instanceVpcId) {
			this.instanceVpcId = instanceVpcId;
		}

		public String getInstanceEndpoint() {
			return this.instanceEndpoint;
		}

		public void setInstanceEndpoint(String instanceEndpoint) {
			this.instanceEndpoint = instanceEndpoint;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	public static class SourceSLSParameters {

		@SerializedName("RoleName")
		private String roleName;

		@SerializedName("Project")
		private String project;

		@SerializedName("LogStore")
		private String logStore;

		@SerializedName("ConsumePosition")
		private String consumePosition;

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getLogStore() {
			return this.logStore;
		}

		public void setLogStore(String logStore) {
			this.logStore = logStore;
		}

		public String getConsumePosition() {
			return this.consumePosition;
		}

		public void setConsumePosition(String consumePosition) {
			this.consumePosition = consumePosition;
		}
	}

	public static class SourceScheduledEventParameters {

		@SerializedName("Schedule")
		private String schedule;

		@SerializedName("UserData")
		private Map<String,String> userData;

		@SerializedName("TimeZone")
		private String timeZone;

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public Map<String,String> getUserData() {
			return this.userData;
		}

		public void setUserData(Map<String,String> userData) {
			this.userData = userData;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}
	}

	public static class SourceKafkaParameters {

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("ConsumerGroup")
		private String consumerGroup;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("VSwitchIds")
		private String vSwitchIds;

		@SerializedName("VpcId")
		private String vpcId;

		@SerializedName("SecurityGroupId")
		private String securityGroupId;

		@SerializedName("Topic")
		private String topic;

		@SerializedName("OffsetReset")
		private String offsetReset;

		@SerializedName("MaximumTasks")
		private Integer maximumTasks;

		@SerializedName("Network")
		private String network;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getConsumerGroup() {
			return this.consumerGroup;
		}

		public void setConsumerGroup(String consumerGroup) {
			this.consumerGroup = consumerGroup;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(String vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getOffsetReset() {
			return this.offsetReset;
		}

		public void setOffsetReset(String offsetReset) {
			this.offsetReset = offsetReset;
		}

		public Integer getMaximumTasks() {
			return this.maximumTasks;
		}

		public void setMaximumTasks(Integer maximumTasks) {
			this.maximumTasks = maximumTasks;
		}

		public String getNetwork() {
			return this.network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}
	}

	public static class SourceHttpEventParameters {

		@SerializedName("Referer")
		private List<String> referer;

		@SerializedName("Method")
		private List<String> method;

		@SerializedName("Ip")
		private List<String> ip;

		@SerializedName("SecurityConfig")
		private String securityConfig;

		@SerializedName("Type")
		private String type;

		public List<String> getReferer() {
			return this.referer;
		}

		public void setReferer(List<String> referer) {
			this.referer = referer;
		}

		public List<String> getBizMethod() {
			return this.method;
		}

		public void setBizMethod(List<String> method) {
			this.method = method;
		}

		public List<String> getIp() {
			return this.ip;
		}

		public void setIp(List<String> ip) {
			this.ip = ip;
		}

		public String getSecurityConfig() {
			return this.securityConfig;
		}

		public void setSecurityConfig(String securityConfig) {
			this.securityConfig = securityConfig;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<CreateEventSourceResponse> getResponseClass() {
		return CreateEventSourceResponse.class;
	}

}
