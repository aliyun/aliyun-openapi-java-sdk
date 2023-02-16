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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateEventSourceRequest extends RpcAcsRequest<UpdateEventSourceResponse> {
	   

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

	@SerializedName("sourceHttpEventParameters")
	private SourceHttpEventParameters sourceHttpEventParameters;

	private String eventSourceName;
	public UpdateEventSourceRequest() {
		super("eventbridge", "2020-04-01", "UpdateEventSource");
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
		private String isBase64Decode;

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

		public String getIsBase64Decode() {
			return this.isBase64Decode;
		}

		public void setIsBase64Decode(String isBase64Decode) {
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

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("Offset")
		private String offset;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("GroupId")
		private String groupId;

		@SerializedName("Topic")
		private String topic;

		@SerializedName("Tag")
		private String tag;

		@SerializedName("Timestamp")
		private Float timestamp;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOffset() {
			return this.offset;
		}

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Float getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Float timestamp) {
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
	public Class<UpdateEventSourceResponse> getResponseClass() {
		return UpdateEventSourceResponse.class;
	}

}
