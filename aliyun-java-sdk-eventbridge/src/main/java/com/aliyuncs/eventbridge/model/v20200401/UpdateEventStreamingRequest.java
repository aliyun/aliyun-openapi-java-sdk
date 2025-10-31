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
public class UpdateEventStreamingRequest extends RpcAcsRequest<UpdateEventStreamingResponse> {
	   

	@SerializedName("transforms")
	private List<Transforms> transforms;

	private String description;

	@SerializedName("source")
	private Source source;

	@SerializedName("sink")
	private Sink sink;

	private String filterPattern;

	@SerializedName("runOptions")
	private RunOptions runOptions;

	private String eventStreamingName;
	public UpdateEventStreamingRequest() {
		super("eventbridge", "2020-04-01", "UpdateEventStreaming");
		setMethod(MethodType.POST);
	}

	public List<Transforms> getTransforms() {
		return this.transforms;
	}

	public void setTransforms(List<Transforms> transforms) {
		this.transforms = transforms;	
		if (transforms != null) {
			putBodyParameter("Transforms" , new Gson().toJson(transforms));
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

	public Source getSource() {
		return this.source;
	}

	public void setSource(Source source) {
		this.source = source;	
		if (source != null) {
			putBodyParameter("Source" , new Gson().toJson(source));
		}	
	}

	public Sink getSink() {
		return this.sink;
	}

	public void setSink(Sink sink) {
		this.sink = sink;	
		if (sink != null) {
			putBodyParameter("Sink" , new Gson().toJson(sink));
		}	
	}

	public String getFilterPattern() {
		return this.filterPattern;
	}

	public void setFilterPattern(String filterPattern) {
		this.filterPattern = filterPattern;
		if(filterPattern != null){
			putBodyParameter("FilterPattern", filterPattern);
		}
	}

	public RunOptions getRunOptions() {
		return this.runOptions;
	}

	public void setRunOptions(RunOptions runOptions) {
		this.runOptions = runOptions;	
		if (runOptions != null) {
			putBodyParameter("RunOptions" , new Gson().toJson(runOptions));
		}	
	}

	public String getEventStreamingName() {
		return this.eventStreamingName;
	}

	public void setEventStreamingName(String eventStreamingName) {
		this.eventStreamingName = eventStreamingName;
		if(eventStreamingName != null){
			putBodyParameter("EventStreamingName", eventStreamingName);
		}
	}

	public static class Transforms {

		@SerializedName("Arn")
		private String arn;

		@SerializedName("DashScopeTransformParameters")
		private DashScopeTransformParameters dashScopeTransformParameters;

		@SerializedName("BaiLianAgentTransformParameters")
		private BaiLianAgentTransformParameters baiLianAgentTransformParameters;

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public DashScopeTransformParameters getDashScopeTransformParameters() {
			return this.dashScopeTransformParameters;
		}

		public void setDashScopeTransformParameters(DashScopeTransformParameters dashScopeTransformParameters) {
			this.dashScopeTransformParameters = dashScopeTransformParameters;
		}

		public BaiLianAgentTransformParameters getBaiLianAgentTransformParameters() {
			return this.baiLianAgentTransformParameters;
		}

		public void setBaiLianAgentTransformParameters(BaiLianAgentTransformParameters baiLianAgentTransformParameters) {
			this.baiLianAgentTransformParameters = baiLianAgentTransformParameters;
		}

		public static class DashScopeTransformParameters {

			@SerializedName("RequestPerMinute")
			private Long requestPerMinute;

			@SerializedName("StructuredOutputJsonSchema")
			private String structuredOutputJsonSchema;

			@SerializedName("ApiKey")
			private String apiKey;

			@SerializedName("TokenPerMinute")
			private Long tokenPerMinute;

			@SerializedName("Messages")
			private List<MessagesItem> messages;

			@SerializedName("Model")
			private String model;

			public Long getRequestPerMinute() {
				return this.requestPerMinute;
			}

			public void setRequestPerMinute(Long requestPerMinute) {
				this.requestPerMinute = requestPerMinute;
			}

			public String getStructuredOutputJsonSchema() {
				return this.structuredOutputJsonSchema;
			}

			public void setStructuredOutputJsonSchema(String structuredOutputJsonSchema) {
				this.structuredOutputJsonSchema = structuredOutputJsonSchema;
			}

			public String getApiKey() {
				return this.apiKey;
			}

			public void setApiKey(String apiKey) {
				this.apiKey = apiKey;
			}

			public Long getTokenPerMinute() {
				return this.tokenPerMinute;
			}

			public void setTokenPerMinute(Long tokenPerMinute) {
				this.tokenPerMinute = tokenPerMinute;
			}

			public List<MessagesItem> getMessages() {
				return this.messages;
			}

			public void setMessages(List<MessagesItem> messages) {
				this.messages = messages;
			}

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public static class MessagesItem {

				@SerializedName("Template")
				private String template;

				@SerializedName("Role")
				private String role;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class BaiLianAgentTransformParameters {

			@SerializedName("RequestPerMinute")
			private Long requestPerMinute;

			@SerializedName("ApiKey")
			private String apiKey;

			@SerializedName("TokenPerMinute")
			private Long tokenPerMinute;

			@SerializedName("ApplicationId")
			private String applicationId;

			@SerializedName("Prompt")
			private Prompt prompt;

			public Long getRequestPerMinute() {
				return this.requestPerMinute;
			}

			public void setRequestPerMinute(Long requestPerMinute) {
				this.requestPerMinute = requestPerMinute;
			}

			public String getApiKey() {
				return this.apiKey;
			}

			public void setApiKey(String apiKey) {
				this.apiKey = apiKey;
			}

			public Long getTokenPerMinute() {
				return this.tokenPerMinute;
			}

			public void setTokenPerMinute(Long tokenPerMinute) {
				this.tokenPerMinute = tokenPerMinute;
			}

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}

			public Prompt getPrompt() {
				return this.prompt;
			}

			public void setPrompt(Prompt prompt) {
				this.prompt = prompt;
			}

			public static class Prompt {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	public static class Source {

		@SerializedName("SourceCustomizedKafkaConnectorParameters")
		private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

		@SerializedName("SourceApacheRocketMQCheckpointParameters")
		private SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

		@SerializedName("SourceRocketMQCheckpointParameters")
		private SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

		@SerializedName("SourceDTSParameters")
		private SourceDTSParameters sourceDTSParameters;

		@SerializedName("SourceCustomizedKafkaParameters")
		private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

		@SerializedName("SourceMNSParameters")
		private SourceMNSParameters sourceMNSParameters;

		@SerializedName("SourceRabbitMQParameters")
		private SourceRabbitMQParameters sourceRabbitMQParameters;

		@SerializedName("SourceOSSParameters")
		private SourceOSSParameters sourceOSSParameters;

		@SerializedName("SourceMQTTParameters")
		private SourceMQTTParameters sourceMQTTParameters;

		@SerializedName("SourceEventBusParameters")
		private SourceEventBusParameters sourceEventBusParameters;

		@SerializedName("SourceRocketMQParameters")
		private SourceRocketMQParameters sourceRocketMQParameters;

		@SerializedName("SourceSLSParameters")
		private SourceSLSParameters sourceSLSParameters;

		@SerializedName("SourcePrometheusParameters")
		private SourcePrometheusParameters sourcePrometheusParameters;

		@SerializedName("SourceKafkaParameters")
		private SourceKafkaParameters sourceKafkaParameters;

		@SerializedName("SourceApacheKafkaParameters")
		private SourceApacheKafkaParameters sourceApacheKafkaParameters;

		@SerializedName("SourceOpenSourceRabbitMQParameters")
		private SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

		@SerializedName("SourceMySQLParameters")
		private SourceMySQLParameters sourceMySQLParameters;

		public SourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
			return this.sourceCustomizedKafkaConnectorParameters;
		}

		public void setSourceCustomizedKafkaConnectorParameters(SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
			this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
		}

		public SourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
			return this.sourceApacheRocketMQCheckpointParameters;
		}

		public void setSourceApacheRocketMQCheckpointParameters(SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
			this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
		}

		public SourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
			return this.sourceRocketMQCheckpointParameters;
		}

		public void setSourceRocketMQCheckpointParameters(SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
			this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
		}

		public SourceDTSParameters getSourceDTSParameters() {
			return this.sourceDTSParameters;
		}

		public void setSourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
			this.sourceDTSParameters = sourceDTSParameters;
		}

		public SourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
			return this.sourceCustomizedKafkaParameters;
		}

		public void setSourceCustomizedKafkaParameters(SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
			this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
		}

		public SourceMNSParameters getSourceMNSParameters() {
			return this.sourceMNSParameters;
		}

		public void setSourceMNSParameters(SourceMNSParameters sourceMNSParameters) {
			this.sourceMNSParameters = sourceMNSParameters;
		}

		public SourceRabbitMQParameters getSourceRabbitMQParameters() {
			return this.sourceRabbitMQParameters;
		}

		public void setSourceRabbitMQParameters(SourceRabbitMQParameters sourceRabbitMQParameters) {
			this.sourceRabbitMQParameters = sourceRabbitMQParameters;
		}

		public SourceOSSParameters getSourceOSSParameters() {
			return this.sourceOSSParameters;
		}

		public void setSourceOSSParameters(SourceOSSParameters sourceOSSParameters) {
			this.sourceOSSParameters = sourceOSSParameters;
		}

		public SourceMQTTParameters getSourceMQTTParameters() {
			return this.sourceMQTTParameters;
		}

		public void setSourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
			this.sourceMQTTParameters = sourceMQTTParameters;
		}

		public SourceEventBusParameters getSourceEventBusParameters() {
			return this.sourceEventBusParameters;
		}

		public void setSourceEventBusParameters(SourceEventBusParameters sourceEventBusParameters) {
			this.sourceEventBusParameters = sourceEventBusParameters;
		}

		public SourceRocketMQParameters getSourceRocketMQParameters() {
			return this.sourceRocketMQParameters;
		}

		public void setSourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
			this.sourceRocketMQParameters = sourceRocketMQParameters;
		}

		public SourceSLSParameters getSourceSLSParameters() {
			return this.sourceSLSParameters;
		}

		public void setSourceSLSParameters(SourceSLSParameters sourceSLSParameters) {
			this.sourceSLSParameters = sourceSLSParameters;
		}

		public SourcePrometheusParameters getSourcePrometheusParameters() {
			return this.sourcePrometheusParameters;
		}

		public void setSourcePrometheusParameters(SourcePrometheusParameters sourcePrometheusParameters) {
			this.sourcePrometheusParameters = sourcePrometheusParameters;
		}

		public SourceKafkaParameters getSourceKafkaParameters() {
			return this.sourceKafkaParameters;
		}

		public void setSourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
			this.sourceKafkaParameters = sourceKafkaParameters;
		}

		public SourceApacheKafkaParameters getSourceApacheKafkaParameters() {
			return this.sourceApacheKafkaParameters;
		}

		public void setSourceApacheKafkaParameters(SourceApacheKafkaParameters sourceApacheKafkaParameters) {
			this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
		}

		public SourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
			return this.sourceOpenSourceRabbitMQParameters;
		}

		public void setSourceOpenSourceRabbitMQParameters(SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
			this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
		}

		public SourceMySQLParameters getSourceMySQLParameters() {
			return this.sourceMySQLParameters;
		}

		public void setSourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
			this.sourceMySQLParameters = sourceMySQLParameters;
		}

		public static class SourceCustomizedKafkaConnectorParameters {

			@SerializedName("ConnectorPackageUrl")
			private String connectorPackageUrl;

			@SerializedName("WorkerParameters")
			private Map<String,String> workerParameters;

			@SerializedName("ConnectorParameters")
			private ConnectorParameters connectorParameters;

			public String getConnectorPackageUrl() {
				return this.connectorPackageUrl;
			}

			public void setConnectorPackageUrl(String connectorPackageUrl) {
				this.connectorPackageUrl = connectorPackageUrl;
			}

			public Map<String,String> getWorkerParameters() {
				return this.workerParameters;
			}

			public void setWorkerParameters(Map<String,String> workerParameters) {
				this.workerParameters = workerParameters;
			}

			public ConnectorParameters getConnectorParameters() {
				return this.connectorParameters;
			}

			public void setConnectorParameters(ConnectorParameters connectorParameters) {
				this.connectorParameters = connectorParameters;
			}

			public static class ConnectorParameters {

				@SerializedName("Name")
				private String name;

				@SerializedName("Config")
				private Map<String,String> config;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Map<String,String> getConfig() {
					return this.config;
				}

				public void setConfig(Map<String,String> config) {
					this.config = config;
				}
			}
		}

		public static class SourceApacheRocketMQCheckpointParameters {

			@SerializedName("InstancePassword")
			private String instancePassword;

			@SerializedName("VSwitchId")
			private String vSwitchId;

			@SerializedName("InstanceEndpoint")
			private String instanceEndpoint;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("Topics")
			private List<String> topics;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("InstanceUsername")
			private String instanceUsername;

			@SerializedName("NetworkType")
			private String networkType;

			public String getInstancePassword() {
				return this.instancePassword;
			}

			public void setInstancePassword(String instancePassword) {
				this.instancePassword = instancePassword;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
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

			public List<String> getTopics() {
				return this.topics;
			}

			public void setTopics(List<String> topics) {
				this.topics = topics;
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

			public String getInstanceUsername() {
				return this.instanceUsername;
			}

			public void setInstanceUsername(String instanceUsername) {
				this.instanceUsername = instanceUsername;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}
		}

		public static class SourceRocketMQCheckpointParameters {

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("Topics")
			private List<String> topics;

			@SerializedName("InstanceType")
			private String instanceType;

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

			public List<String> getTopics() {
				return this.topics;
			}

			public void setTopics(List<String> topics) {
				this.topics = topics;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class SourceDTSParameters {

			@SerializedName("BrokerUrl")
			private String brokerUrl;

			@SerializedName("Password")
			private String password;

			@SerializedName("InitCheckPoint")
			private Long initCheckPoint;

			@SerializedName("Topic")
			private String topic;

			@SerializedName("TaskId")
			private String taskId;

			@SerializedName("Sid")
			private String sid;

			@SerializedName("Username")
			private String username;

			public String getBrokerUrl() {
				return this.brokerUrl;
			}

			public void setBrokerUrl(String brokerUrl) {
				this.brokerUrl = brokerUrl;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Long getInitCheckPoint() {
				return this.initCheckPoint;
			}

			public void setInitCheckPoint(Long initCheckPoint) {
				this.initCheckPoint = initCheckPoint;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getSid() {
				return this.sid;
			}

			public void setSid(String sid) {
				this.sid = sid;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}
		}

		public static class SourceCustomizedKafkaParameters {

			@SerializedName("InstanceId")
			private String instanceId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

		public static class SourceOSSParameters {

			@SerializedName("LoadMode")
			private String loadMode;

			@SerializedName("LoadFormat")
			private String loadFormat;

			@SerializedName("RoleName")
			private String roleName;

			@SerializedName("Prefix")
			private String prefix;

			@SerializedName("Delimiter")
			private String delimiter;

			@SerializedName("BucketName")
			private String bucketName;

			public String getLoadMode() {
				return this.loadMode;
			}

			public void setLoadMode(String loadMode) {
				this.loadMode = loadMode;
			}

			public String getLoadFormat() {
				return this.loadFormat;
			}

			public void setLoadFormat(String loadFormat) {
				this.loadFormat = loadFormat;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getPrefix() {
				return this.prefix;
			}

			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}

			public String getDelimiter() {
				return this.delimiter;
			}

			public void setDelimiter(String delimiter) {
				this.delimiter = delimiter;
			}

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}
		}

		public static class SourceMQTTParameters {

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("BodyDataType")
			private String bodyDataType;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("Topic")
			private String topic;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getBodyDataType() {
				return this.bodyDataType;
			}

			public void setBodyDataType(String bodyDataType) {
				this.bodyDataType = bodyDataType;
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
		}

		public static class SourceEventBusParameters {

			@SerializedName("EventBusName")
			private String eventBusName;

			@SerializedName("EventRuleName")
			private String eventRuleName;

			public String getEventBusName() {
				return this.eventBusName;
			}

			public void setEventBusName(String eventBusName) {
				this.eventBusName = eventBusName;
			}

			public String getEventRuleName() {
				return this.eventRuleName;
			}

			public void setEventRuleName(String eventRuleName) {
				this.eventRuleName = eventRuleName;
			}
		}

		public static class SourceRocketMQParameters {

			@SerializedName("FilterSql")
			private String filterSql;

			@SerializedName("InstanceSecurityGroupId")
			private String instanceSecurityGroupId;

			@SerializedName("BodyDataType")
			private String bodyDataType;

			@SerializedName("Offset")
			private String offset;

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("GroupID")
			private String groupID;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("InstanceUsername")
			private String instanceUsername;

			@SerializedName("FilterType")
			private String filterType;

			@SerializedName("AuthType")
			private String authType;

			@SerializedName("Network")
			private String network;

			@SerializedName("InstancePassword")
			private String instancePassword;

			@SerializedName("InstanceVSwitchIds")
			private String instanceVSwitchIds;

			@SerializedName("InstanceNetwork")
			private String instanceNetwork;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("InstanceEndpoint")
			private String instanceEndpoint;

			@SerializedName("InstanceVpcId")
			private String instanceVpcId;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("Topic")
			private String topic;

			@SerializedName("InstanceType")
			private String instanceType;

			@SerializedName("Tag")
			private String tag;

			@SerializedName("Timestamp")
			private Long timestamp;

			public String getFilterSql() {
				return this.filterSql;
			}

			public void setFilterSql(String filterSql) {
				this.filterSql = filterSql;
			}

			public String getInstanceSecurityGroupId() {
				return this.instanceSecurityGroupId;
			}

			public void setInstanceSecurityGroupId(String instanceSecurityGroupId) {
				this.instanceSecurityGroupId = instanceSecurityGroupId;
			}

			public String getBodyDataType() {
				return this.bodyDataType;
			}

			public void setBodyDataType(String bodyDataType) {
				this.bodyDataType = bodyDataType;
			}

			public String getOffset() {
				return this.offset;
			}

			public void setOffset(String offset) {
				this.offset = offset;
			}

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getGroupID() {
				return this.groupID;
			}

			public void setGroupID(String groupID) {
				this.groupID = groupID;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getInstanceUsername() {
				return this.instanceUsername;
			}

			public void setInstanceUsername(String instanceUsername) {
				this.instanceUsername = instanceUsername;
			}

			public String getFilterType() {
				return this.filterType;
			}

			public void setFilterType(String filterType) {
				this.filterType = filterType;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public String getInstancePassword() {
				return this.instancePassword;
			}

			public void setInstancePassword(String instancePassword) {
				this.instancePassword = instancePassword;
			}

			public String getInstanceVSwitchIds() {
				return this.instanceVSwitchIds;
			}

			public void setInstanceVSwitchIds(String instanceVSwitchIds) {
				this.instanceVSwitchIds = instanceVSwitchIds;
			}

			public String getInstanceNetwork() {
				return this.instanceNetwork;
			}

			public void setInstanceNetwork(String instanceNetwork) {
				this.instanceNetwork = instanceNetwork;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceEndpoint() {
				return this.instanceEndpoint;
			}

			public void setInstanceEndpoint(String instanceEndpoint) {
				this.instanceEndpoint = instanceEndpoint;
			}

			public String getInstanceVpcId() {
				return this.instanceVpcId;
			}

			public void setInstanceVpcId(String instanceVpcId) {
				this.instanceVpcId = instanceVpcId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
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

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}
		}

		public static class SourcePrometheusParameters {

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("DataType")
			private String dataType;

			@SerializedName("RoleName")
			private String roleName;

			@SerializedName("ClusterId")
			private String clusterId;

			@SerializedName("ExternalLabels")
			private String externalLabels;

			@SerializedName("Labels")
			private String labels;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getExternalLabels() {
				return this.externalLabels;
			}

			public void setExternalLabels(String externalLabels) {
				this.externalLabels = externalLabels;
			}

			public String getLabels() {
				return this.labels;
			}

			public void setLabels(String labels) {
				this.labels = labels;
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

			@SerializedName("ValueDataType")
			private String valueDataType;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("Topic")
			private String topic;

			@SerializedName("OffsetReset")
			private String offsetReset;

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

			public String getValueDataType() {
				return this.valueDataType;
			}

			public void setValueDataType(String valueDataType) {
				this.valueDataType = valueDataType;
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

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}
		}

		public static class SourceApacheKafkaParameters {

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("ValueDataType")
			private String valueDataType;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("OffsetReset")
			private String offsetReset;

			@SerializedName("SecurityProtocol")
			private String securityProtocol;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("ConsumerGroup")
			private String consumerGroup;

			@SerializedName("Bootstraps")
			private String bootstraps;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("Topic")
			private String topic;

			@SerializedName("SaslPassword")
			private String saslPassword;

			@SerializedName("SaslMechanism")
			private String saslMechanism;

			@SerializedName("SaslUser")
			private String saslUser;

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getValueDataType() {
				return this.valueDataType;
			}

			public void setValueDataType(String valueDataType) {
				this.valueDataType = valueDataType;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getOffsetReset() {
				return this.offsetReset;
			}

			public void setOffsetReset(String offsetReset) {
				this.offsetReset = offsetReset;
			}

			public String getSecurityProtocol() {
				return this.securityProtocol;
			}

			public void setSecurityProtocol(String securityProtocol) {
				this.securityProtocol = securityProtocol;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getConsumerGroup() {
				return this.consumerGroup;
			}

			public void setConsumerGroup(String consumerGroup) {
				this.consumerGroup = consumerGroup;
			}

			public String getBootstraps() {
				return this.bootstraps;
			}

			public void setBootstraps(String bootstraps) {
				this.bootstraps = bootstraps;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getSaslPassword() {
				return this.saslPassword;
			}

			public void setSaslPassword(String saslPassword) {
				this.saslPassword = saslPassword;
			}

			public String getSaslMechanism() {
				return this.saslMechanism;
			}

			public void setSaslMechanism(String saslMechanism) {
				this.saslMechanism = saslMechanism;
			}

			public String getSaslUser() {
				return this.saslUser;
			}

			public void setSaslUser(String saslUser) {
				this.saslUser = saslUser;
			}
		}

		public static class SourceOpenSourceRabbitMQParameters {

			@SerializedName("QueueName")
			private String queueName;

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("VirtualHostName")
			private String virtualHostName;

			@SerializedName("Password")
			private String password;

			@SerializedName("BodyDataType")
			private String bodyDataType;

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("Username")
			private String username;

			@SerializedName("AuthType")
			private String authType;

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getVirtualHostName() {
				return this.virtualHostName;
			}

			public void setVirtualHostName(String virtualHostName) {
				this.virtualHostName = virtualHostName;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getBodyDataType() {
				return this.bodyDataType;
			}

			public void setBodyDataType(String bodyDataType) {
				this.bodyDataType = bodyDataType;
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

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}
		}

		public static class SourceMySQLParameters {

			@SerializedName("SnapshotMode")
			private String snapshotMode;

			@SerializedName("TableNames")
			private String tableNames;

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("IncludeSchemaChanges")
			private String includeSchemaChanges;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("HostName")
			private String hostName;

			@SerializedName("Password")
			private String password;

			@SerializedName("Port")
			private Integer port;

			@SerializedName("RegionId")
			private String regionId;

			@SerializedName("DatabaseName")
			private String databaseName;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("User")
			private String user;

			public String getSnapshotMode() {
				return this.snapshotMode;
			}

			public void setSnapshotMode(String snapshotMode) {
				this.snapshotMode = snapshotMode;
			}

			public String getTableNames() {
				return this.tableNames;
			}

			public void setTableNames(String tableNames) {
				this.tableNames = tableNames;
			}

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getIncludeSchemaChanges() {
				return this.includeSchemaChanges;
			}

			public void setIncludeSchemaChanges(String includeSchemaChanges) {
				this.includeSchemaChanges = includeSchemaChanges;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}
		}
	}

	public static class Sink {

		@SerializedName("SinkHttpsParameters")
		private SinkHttpsParameters sinkHttpsParameters;

		@SerializedName("SinkOpenSourceRabbitMQParameters")
		private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

		@SerializedName("SinkRabbitMQParameters")
		private SinkRabbitMQParameters sinkRabbitMQParameters;

		@SerializedName("SinkRocketMQCheckpointParameters")
		private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

		@SerializedName("SinkApacheKafkaParameters")
		private SinkApacheKafkaParameters sinkApacheKafkaParameters;

		@SerializedName("SinkBaiLianParameters")
		private SinkBaiLianParameters sinkBaiLianParameters;

		@SerializedName("SinkApiDestinationParameters")
		private SinkApiDestinationParameters sinkApiDestinationParameters;

		@SerializedName("SinkDataHubParameters")
		private SinkDataHubParameters sinkDataHubParameters;

		@SerializedName("SinkCustomizedKafkaConnectorParameters")
		private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

		@SerializedName("SinkFnfParameters")
		private SinkFnfParameters sinkFnfParameters;

		@SerializedName("SinkSLSParameters")
		private SinkSLSParameters sinkSLSParameters;

		@SerializedName("SinkRocketMQParameters")
		private SinkRocketMQParameters sinkRocketMQParameters;

		@SerializedName("SinkDataWorksTriggerParameters")
		private SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters;

		@SerializedName("SinkDorisParameters")
		private SinkDorisParameters sinkDorisParameters;

		@SerializedName("SinkApacheRocketMQCheckpointParameters")
		private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

		@SerializedName("SinkMNSParameters")
		private SinkMNSParameters sinkMNSParameters;

		@SerializedName("SinkKafkaParameters")
		private SinkKafkaParameters sinkKafkaParameters;

		@SerializedName("SinkDashVectorParameters")
		private SinkDashVectorParameters sinkDashVectorParameters;

		@SerializedName("SinkFcParameters")
		private SinkFcParameters sinkFcParameters;

		@SerializedName("SinkPrometheusParameters")
		private SinkPrometheusParameters sinkPrometheusParameters;

		@SerializedName("SinkCustomizedKafkaParameters")
		private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

		public SinkHttpsParameters getSinkHttpsParameters() {
			return this.sinkHttpsParameters;
		}

		public void setSinkHttpsParameters(SinkHttpsParameters sinkHttpsParameters) {
			this.sinkHttpsParameters = sinkHttpsParameters;
		}

		public SinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
			return this.sinkOpenSourceRabbitMQParameters;
		}

		public void setSinkOpenSourceRabbitMQParameters(SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
			this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
		}

		public SinkRabbitMQParameters getSinkRabbitMQParameters() {
			return this.sinkRabbitMQParameters;
		}

		public void setSinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
			this.sinkRabbitMQParameters = sinkRabbitMQParameters;
		}

		public SinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
			return this.sinkRocketMQCheckpointParameters;
		}

		public void setSinkRocketMQCheckpointParameters(SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
			this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
		}

		public SinkApacheKafkaParameters getSinkApacheKafkaParameters() {
			return this.sinkApacheKafkaParameters;
		}

		public void setSinkApacheKafkaParameters(SinkApacheKafkaParameters sinkApacheKafkaParameters) {
			this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
		}

		public SinkBaiLianParameters getSinkBaiLianParameters() {
			return this.sinkBaiLianParameters;
		}

		public void setSinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
			this.sinkBaiLianParameters = sinkBaiLianParameters;
		}

		public SinkApiDestinationParameters getSinkApiDestinationParameters() {
			return this.sinkApiDestinationParameters;
		}

		public void setSinkApiDestinationParameters(SinkApiDestinationParameters sinkApiDestinationParameters) {
			this.sinkApiDestinationParameters = sinkApiDestinationParameters;
		}

		public SinkDataHubParameters getSinkDataHubParameters() {
			return this.sinkDataHubParameters;
		}

		public void setSinkDataHubParameters(SinkDataHubParameters sinkDataHubParameters) {
			this.sinkDataHubParameters = sinkDataHubParameters;
		}

		public SinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
			return this.sinkCustomizedKafkaConnectorParameters;
		}

		public void setSinkCustomizedKafkaConnectorParameters(SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
			this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
		}

		public SinkFnfParameters getSinkFnfParameters() {
			return this.sinkFnfParameters;
		}

		public void setSinkFnfParameters(SinkFnfParameters sinkFnfParameters) {
			this.sinkFnfParameters = sinkFnfParameters;
		}

		public SinkSLSParameters getSinkSLSParameters() {
			return this.sinkSLSParameters;
		}

		public void setSinkSLSParameters(SinkSLSParameters sinkSLSParameters) {
			this.sinkSLSParameters = sinkSLSParameters;
		}

		public SinkRocketMQParameters getSinkRocketMQParameters() {
			return this.sinkRocketMQParameters;
		}

		public void setSinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
			this.sinkRocketMQParameters = sinkRocketMQParameters;
		}

		public SinkDataWorksTriggerParameters getSinkDataWorksTriggerParameters() {
			return this.sinkDataWorksTriggerParameters;
		}

		public void setSinkDataWorksTriggerParameters(SinkDataWorksTriggerParameters sinkDataWorksTriggerParameters) {
			this.sinkDataWorksTriggerParameters = sinkDataWorksTriggerParameters;
		}

		public SinkDorisParameters getSinkDorisParameters() {
			return this.sinkDorisParameters;
		}

		public void setSinkDorisParameters(SinkDorisParameters sinkDorisParameters) {
			this.sinkDorisParameters = sinkDorisParameters;
		}

		public SinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
			return this.sinkApacheRocketMQCheckpointParameters;
		}

		public void setSinkApacheRocketMQCheckpointParameters(SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
			this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
		}

		public SinkMNSParameters getSinkMNSParameters() {
			return this.sinkMNSParameters;
		}

		public void setSinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
			this.sinkMNSParameters = sinkMNSParameters;
		}

		public SinkKafkaParameters getSinkKafkaParameters() {
			return this.sinkKafkaParameters;
		}

		public void setSinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
			this.sinkKafkaParameters = sinkKafkaParameters;
		}

		public SinkDashVectorParameters getSinkDashVectorParameters() {
			return this.sinkDashVectorParameters;
		}

		public void setSinkDashVectorParameters(SinkDashVectorParameters sinkDashVectorParameters) {
			this.sinkDashVectorParameters = sinkDashVectorParameters;
		}

		public SinkFcParameters getSinkFcParameters() {
			return this.sinkFcParameters;
		}

		public void setSinkFcParameters(SinkFcParameters sinkFcParameters) {
			this.sinkFcParameters = sinkFcParameters;
		}

		public SinkPrometheusParameters getSinkPrometheusParameters() {
			return this.sinkPrometheusParameters;
		}

		public void setSinkPrometheusParameters(SinkPrometheusParameters sinkPrometheusParameters) {
			this.sinkPrometheusParameters = sinkPrometheusParameters;
		}

		public SinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
			return this.sinkCustomizedKafkaParameters;
		}

		public void setSinkCustomizedKafkaParameters(SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
			this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
		}

		public static class SinkHttpsParameters {

			@SerializedName("Method")
			private String method;

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("Body")
			private Body body;

			@SerializedName("URL")
			private URL uRL;

			@SerializedName("Token")
			private String token;

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
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

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public URL getURL() {
				return this.uRL;
			}

			public void setURL(URL uRL) {
				this.uRL = uRL;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class URL {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkOpenSourceRabbitMQParameters {

			@SerializedName("QueueName")
			private String queueName;

			@SerializedName("TargetType")
			private String targetType;

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("MessageId")
			private MessageId messageId;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("Body")
			private Body body;

			@SerializedName("AuthType")
			private String authType;

			@SerializedName("RoutingKey")
			private RoutingKey routingKey;

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("VirtualHostName")
			private String virtualHostName;

			@SerializedName("Password")
			private String password;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("Exchange")
			private String exchange;

			@SerializedName("Properties")
			private Properties properties;

			@SerializedName("Username")
			private String username;

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public MessageId getMessageId() {
				return this.messageId;
			}

			public void setMessageId(MessageId messageId) {
				this.messageId = messageId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public RoutingKey getRoutingKey() {
				return this.routingKey;
			}

			public void setRoutingKey(RoutingKey routingKey) {
				this.routingKey = routingKey;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getVirtualHostName() {
				return this.virtualHostName;
			}

			public void setVirtualHostName(String virtualHostName) {
				this.virtualHostName = virtualHostName;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getExchange() {
				return this.exchange;
			}

			public void setExchange(String exchange) {
				this.exchange = exchange;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public static class MessageId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class RoutingKey {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Properties {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkRabbitMQParameters {

			@SerializedName("RoutingKey")
			private RoutingKey routingKey;

			@SerializedName("QueueName")
			private QueueName queueName;

			@SerializedName("VirtualHostName")
			private VirtualHostName virtualHostName;

			@SerializedName("InstanceId")
			private InstanceId instanceId;

			@SerializedName("TargetType")
			private TargetType targetType;

			@SerializedName("MessageId")
			private MessageId messageId;

			@SerializedName("Exchange")
			private Exchange exchange;

			@SerializedName("Body")
			private Body body;

			@SerializedName("Properties")
			private Properties properties;

			public RoutingKey getRoutingKey() {
				return this.routingKey;
			}

			public void setRoutingKey(RoutingKey routingKey) {
				this.routingKey = routingKey;
			}

			public QueueName getQueueName() {
				return this.queueName;
			}

			public void setQueueName(QueueName queueName) {
				this.queueName = queueName;
			}

			public VirtualHostName getVirtualHostName() {
				return this.virtualHostName;
			}

			public void setVirtualHostName(VirtualHostName virtualHostName) {
				this.virtualHostName = virtualHostName;
			}

			public InstanceId getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(InstanceId instanceId) {
				this.instanceId = instanceId;
			}

			public TargetType getTargetType() {
				return this.targetType;
			}

			public void setTargetType(TargetType targetType) {
				this.targetType = targetType;
			}

			public MessageId getMessageId() {
				return this.messageId;
			}

			public void setMessageId(MessageId messageId) {
				this.messageId = messageId;
			}

			public Exchange getExchange() {
				return this.exchange;
			}

			public void setExchange(Exchange exchange) {
				this.exchange = exchange;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
			}

			public static class RoutingKey {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class QueueName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VirtualHostName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class TargetType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class MessageId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Exchange {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Properties {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkRocketMQCheckpointParameters {

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("InstanceType")
			private String instanceType;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("ConsumeTimestamp")
			private ConsumeTimestamp consumeTimestamp;

			@SerializedName("Group")
			private Group group;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public ConsumeTimestamp getConsumeTimestamp() {
				return this.consumeTimestamp;
			}

			public void setConsumeTimestamp(ConsumeTimestamp consumeTimestamp) {
				this.consumeTimestamp = consumeTimestamp;
			}

			public Group getGroup() {
				return this.group;
			}

			public void setGroup(Group group) {
				this.group = group;
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ConsumeTimestamp {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Group {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkApacheKafkaParameters {

			@SerializedName("Headers")
			private Headers headers;

			@SerializedName("VSwitchIds")
			private VSwitchIds vSwitchIds;

			@SerializedName("Acks")
			private String acks;

			@SerializedName("SecurityGroupId")
			private SecurityGroupId securityGroupId;

			@SerializedName("SecurityProtocol")
			private String securityProtocol;

			@SerializedName("NetworkType")
			private NetworkType networkType;

			@SerializedName("Bootstraps")
			private String bootstraps;

			@SerializedName("VpcId")
			private VpcId vpcId;

			@SerializedName("Topic")
			private String topic;

			@SerializedName("SaslPassword")
			private String saslPassword;

			@SerializedName("SaslMechanism")
			private String saslMechanism;

			@SerializedName("SaslUser")
			private String saslUser;

			@SerializedName("Value")
			private Value value;

			@SerializedName("Key")
			private Key key;

			public Headers getHeaders() {
				return this.headers;
			}

			public void setHeaders(Headers headers) {
				this.headers = headers;
			}

			public VSwitchIds getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(VSwitchIds vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getAcks() {
				return this.acks;
			}

			public void setAcks(String acks) {
				this.acks = acks;
			}

			public SecurityGroupId getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(SecurityGroupId securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getSecurityProtocol() {
				return this.securityProtocol;
			}

			public void setSecurityProtocol(String securityProtocol) {
				this.securityProtocol = securityProtocol;
			}

			public NetworkType getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(NetworkType networkType) {
				this.networkType = networkType;
			}

			public String getBootstraps() {
				return this.bootstraps;
			}

			public void setBootstraps(String bootstraps) {
				this.bootstraps = bootstraps;
			}

			public VpcId getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(VpcId vpcId) {
				this.vpcId = vpcId;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getSaslPassword() {
				return this.saslPassword;
			}

			public void setSaslPassword(String saslPassword) {
				this.saslPassword = saslPassword;
			}

			public String getSaslMechanism() {
				return this.saslMechanism;
			}

			public void setSaslMechanism(String saslMechanism) {
				this.saslMechanism = saslMechanism;
			}

			public String getSaslUser() {
				return this.saslUser;
			}

			public void setSaslUser(String saslUser) {
				this.saslUser = saslUser;
			}

			public Value getValue() {
				return this.value;
			}

			public void setValue(Value value) {
				this.value = value;
			}

			public Key getKey() {
				return this.key;
			}

			public void setKey(Key key) {
				this.key = key;
			}

			public static class Headers {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VSwitchIds {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class SecurityGroupId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class NetworkType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VpcId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Value {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Key {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkBaiLianParameters {

			@SerializedName("Extend")
			private Object extend;

			@SerializedName("Op")
			private Op op;

			@SerializedName("Partition")
			private Partition partition;

			@SerializedName("Offset")
			private Offset offset;

			@SerializedName("Before")
			private Before before;

			@SerializedName("Context")
			private Object context;

			@SerializedName("After")
			private After after;

			@SerializedName("ApplicationType")
			private String applicationType;

			@SerializedName("WorkspaceId")
			private String workspaceId;

			public Object getExtend() {
				return this.extend;
			}

			public void setExtend(Object extend) {
				this.extend = extend;
			}

			public Op getOp() {
				return this.op;
			}

			public void setOp(Op op) {
				this.op = op;
			}

			public Partition getPartition() {
				return this.partition;
			}

			public void setPartition(Partition partition) {
				this.partition = partition;
			}

			public Offset getOffset() {
				return this.offset;
			}

			public void setOffset(Offset offset) {
				this.offset = offset;
			}

			public Before getBefore() {
				return this.before;
			}

			public void setBefore(Before before) {
				this.before = before;
			}

			public Object getContext() {
				return this.context;
			}

			public void setContext(Object context) {
				this.context = context;
			}

			public After getAfter() {
				return this.after;
			}

			public void setAfter(After after) {
				this.after = after;
			}

			public String getApplicationType() {
				return this.applicationType;
			}

			public void setApplicationType(String applicationType) {
				this.applicationType = applicationType;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public static class Op {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Partition {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Offset {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Before {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class After {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkApiDestinationParameters {

			@SerializedName("HeaderParameters")
			private HeaderParameters headerParameters;

			@SerializedName("BodyParameters")
			private BodyParameters bodyParameters;

			@SerializedName("Name")
			private String name;

			@SerializedName("QueryStringParameters")
			private QueryStringParameters queryStringParameters;

			public HeaderParameters getHeaderParameters() {
				return this.headerParameters;
			}

			public void setHeaderParameters(HeaderParameters headerParameters) {
				this.headerParameters = headerParameters;
			}

			public BodyParameters getBodyParameters() {
				return this.bodyParameters;
			}

			public void setBodyParameters(BodyParameters bodyParameters) {
				this.bodyParameters = bodyParameters;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public QueryStringParameters getQueryStringParameters() {
				return this.queryStringParameters;
			}

			public void setQueryStringParameters(QueryStringParameters queryStringParameters) {
				this.queryStringParameters = queryStringParameters;
			}

			public static class HeaderParameters {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class BodyParameters {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class QueryStringParameters {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkDataHubParameters {

			@SerializedName("RoleName")
			private RoleName roleName;

			@SerializedName("Project")
			private Project project;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("ContentSchema")
			private ContentSchema contentSchema;

			@SerializedName("TopicType")
			private TopicType topicType;

			@SerializedName("Body")
			private Body body;

			@SerializedName("TopicSchema")
			private TopicSchema topicSchema;

			@SerializedName("ContentType")
			private ContentType contentType;

			public RoleName getRoleName() {
				return this.roleName;
			}

			public void setRoleName(RoleName roleName) {
				this.roleName = roleName;
			}

			public Project getProject() {
				return this.project;
			}

			public void setProject(Project project) {
				this.project = project;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public ContentSchema getContentSchema() {
				return this.contentSchema;
			}

			public void setContentSchema(ContentSchema contentSchema) {
				this.contentSchema = contentSchema;
			}

			public TopicType getTopicType() {
				return this.topicType;
			}

			public void setTopicType(TopicType topicType) {
				this.topicType = topicType;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public TopicSchema getTopicSchema() {
				return this.topicSchema;
			}

			public void setTopicSchema(TopicSchema topicSchema) {
				this.topicSchema = topicSchema;
			}

			public ContentType getContentType() {
				return this.contentType;
			}

			public void setContentType(ContentType contentType) {
				this.contentType = contentType;
			}

			public static class RoleName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Project {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ContentSchema {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class TopicType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class TopicSchema {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ContentType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkCustomizedKafkaConnectorParameters {

			@SerializedName("ConnectorPackageUrl")
			private String connectorPackageUrl;

			@SerializedName("WorkerParameters")
			private Map<String,String> workerParameters;

			@SerializedName("ConnectorParameters")
			private ConnectorParameters connectorParameters;

			public String getConnectorPackageUrl() {
				return this.connectorPackageUrl;
			}

			public void setConnectorPackageUrl(String connectorPackageUrl) {
				this.connectorPackageUrl = connectorPackageUrl;
			}

			public Map<String,String> getWorkerParameters() {
				return this.workerParameters;
			}

			public void setWorkerParameters(Map<String,String> workerParameters) {
				this.workerParameters = workerParameters;
			}

			public ConnectorParameters getConnectorParameters() {
				return this.connectorParameters;
			}

			public void setConnectorParameters(ConnectorParameters connectorParameters) {
				this.connectorParameters = connectorParameters;
			}

			public static class ConnectorParameters {

				@SerializedName("Name")
				private String name;

				@SerializedName("Config")
				private Map<String,String> config;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Map<String,String> getConfig() {
					return this.config;
				}

				public void setConfig(Map<String,String> config) {
					this.config = config;
				}
			}
		}

		public static class SinkFnfParameters {

			@SerializedName("Input")
			private Input input;

			@SerializedName("ExecutionName")
			private ExecutionName executionName;

			@SerializedName("RoleName")
			private RoleName roleName;

			@SerializedName("FlowName")
			private FlowName flowName;

			public Input getInput() {
				return this.input;
			}

			public void setInput(Input input) {
				this.input = input;
			}

			public ExecutionName getExecutionName() {
				return this.executionName;
			}

			public void setExecutionName(ExecutionName executionName) {
				this.executionName = executionName;
			}

			public RoleName getRoleName() {
				return this.roleName;
			}

			public void setRoleName(RoleName roleName) {
				this.roleName = roleName;
			}

			public FlowName getFlowName() {
				return this.flowName;
			}

			public void setFlowName(FlowName flowName) {
				this.flowName = flowName;
			}

			public static class Input {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ExecutionName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class RoleName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class FlowName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkSLSParameters {

			@SerializedName("RoleName")
			private RoleName roleName;

			@SerializedName("Project")
			private Project project;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("ContentSchema")
			private ContentSchema contentSchema;

			@SerializedName("Body")
			private Body body;

			@SerializedName("LogStore")
			private LogStore logStore;

			@SerializedName("ContentType")
			private ContentType contentType;

			public RoleName getRoleName() {
				return this.roleName;
			}

			public void setRoleName(RoleName roleName) {
				this.roleName = roleName;
			}

			public Project getProject() {
				return this.project;
			}

			public void setProject(Project project) {
				this.project = project;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public ContentSchema getContentSchema() {
				return this.contentSchema;
			}

			public void setContentSchema(ContentSchema contentSchema) {
				this.contentSchema = contentSchema;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public LogStore getLogStore() {
				return this.logStore;
			}

			public void setLogStore(LogStore logStore) {
				this.logStore = logStore;
			}

			public ContentType getContentType() {
				return this.contentType;
			}

			public void setContentType(ContentType contentType) {
				this.contentType = contentType;
			}

			public static class RoleName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Project {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ContentSchema {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class LogStore {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ContentType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkRocketMQParameters {

			@SerializedName("DeliveryOrderType")
			private DeliveryOrderType deliveryOrderType;

			@SerializedName("Keys")
			private Keys keys;

			@SerializedName("VSwitchIds")
			private VSwitchIds vSwitchIds;

			@SerializedName("SecurityGroupId")
			private SecurityGroupId securityGroupId;

			@SerializedName("InstanceUsername")
			private InstanceUsername instanceUsername;

			@SerializedName("Body")
			private Body body;

			@SerializedName("Tags")
			private Tags tags;

			@SerializedName("Network")
			private Network network;

			@SerializedName("InstancePassword")
			private InstancePassword instancePassword;

			@SerializedName("InstanceId")
			private InstanceId instanceId;

			@SerializedName("InstanceEndpoint")
			private InstanceEndpoint instanceEndpoint;

			@SerializedName("VpcId")
			private VpcId vpcId;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("InstanceType")
			private InstanceType instanceType;

			@SerializedName("ShardingKey")
			private ShardingKey shardingKey;

			@SerializedName("Properties")
			private Properties properties;

			public DeliveryOrderType getDeliveryOrderType() {
				return this.deliveryOrderType;
			}

			public void setDeliveryOrderType(DeliveryOrderType deliveryOrderType) {
				this.deliveryOrderType = deliveryOrderType;
			}

			public Keys getKeys() {
				return this.keys;
			}

			public void setKeys(Keys keys) {
				this.keys = keys;
			}

			public VSwitchIds getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(VSwitchIds vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public SecurityGroupId getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(SecurityGroupId securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public InstanceUsername getInstanceUsername() {
				return this.instanceUsername;
			}

			public void setInstanceUsername(InstanceUsername instanceUsername) {
				this.instanceUsername = instanceUsername;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public Tags getTags() {
				return this.tags;
			}

			public void setTags(Tags tags) {
				this.tags = tags;
			}

			public Network getNetwork() {
				return this.network;
			}

			public void setNetwork(Network network) {
				this.network = network;
			}

			public InstancePassword getInstancePassword() {
				return this.instancePassword;
			}

			public void setInstancePassword(InstancePassword instancePassword) {
				this.instancePassword = instancePassword;
			}

			public InstanceId getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(InstanceId instanceId) {
				this.instanceId = instanceId;
			}

			public InstanceEndpoint getInstanceEndpoint() {
				return this.instanceEndpoint;
			}

			public void setInstanceEndpoint(InstanceEndpoint instanceEndpoint) {
				this.instanceEndpoint = instanceEndpoint;
			}

			public VpcId getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(VpcId vpcId) {
				this.vpcId = vpcId;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public InstanceType getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(InstanceType instanceType) {
				this.instanceType = instanceType;
			}

			public ShardingKey getShardingKey() {
				return this.shardingKey;
			}

			public void setShardingKey(ShardingKey shardingKey) {
				this.shardingKey = shardingKey;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
			}

			public static class DeliveryOrderType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Keys {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VSwitchIds {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class SecurityGroupId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceUsername {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Tags {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Network {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstancePassword {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceEndpoint {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VpcId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ShardingKey {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Properties {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkDataWorksTriggerParameters {

			@SerializedName("Enable")
			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}

		public static class SinkDorisParameters {

			@SerializedName("Password")
			private Password password;

			@SerializedName("Database")
			private Database database;

			@SerializedName("BeHttpEndpoint")
			private BeHttpEndpoint beHttpEndpoint;

			@SerializedName("VSwitchIds")
			private VSwitchIds vSwitchIds;

			@SerializedName("FeHttpEndpoint")
			private FeHttpEndpoint feHttpEndpoint;

			@SerializedName("VpcId")
			private VpcId vpcId;

			@SerializedName("SecurityGroupId")
			private SecurityGroupId securityGroupId;

			@SerializedName("QueryEndpoint")
			private QueryEndpoint queryEndpoint;

			@SerializedName("NetworkType")
			private NetworkType networkType;

			@SerializedName("Body")
			private Body body;

			@SerializedName("Table")
			private Table table;

			@SerializedName("UserName")
			private UserName userName;

			public Password getPassword() {
				return this.password;
			}

			public void setPassword(Password password) {
				this.password = password;
			}

			public Database getDatabase() {
				return this.database;
			}

			public void setDatabase(Database database) {
				this.database = database;
			}

			public BeHttpEndpoint getBeHttpEndpoint() {
				return this.beHttpEndpoint;
			}

			public void setBeHttpEndpoint(BeHttpEndpoint beHttpEndpoint) {
				this.beHttpEndpoint = beHttpEndpoint;
			}

			public VSwitchIds getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(VSwitchIds vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public FeHttpEndpoint getFeHttpEndpoint() {
				return this.feHttpEndpoint;
			}

			public void setFeHttpEndpoint(FeHttpEndpoint feHttpEndpoint) {
				this.feHttpEndpoint = feHttpEndpoint;
			}

			public VpcId getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(VpcId vpcId) {
				this.vpcId = vpcId;
			}

			public SecurityGroupId getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(SecurityGroupId securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public QueryEndpoint getQueryEndpoint() {
				return this.queryEndpoint;
			}

			public void setQueryEndpoint(QueryEndpoint queryEndpoint) {
				this.queryEndpoint = queryEndpoint;
			}

			public NetworkType getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(NetworkType networkType) {
				this.networkType = networkType;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public Table getTable() {
				return this.table;
			}

			public void setTable(Table table) {
				this.table = table;
			}

			public UserName getUserName() {
				return this.userName;
			}

			public void setUserName(UserName userName) {
				this.userName = userName;
			}

			public static class Password {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Database {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class BeHttpEndpoint {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VSwitchIds {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class FeHttpEndpoint {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VpcId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class SecurityGroupId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class QueryEndpoint {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class NetworkType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Table {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class UserName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkApacheRocketMQCheckpointParameters {

			@SerializedName("InstancePassword")
			private String instancePassword;

			@SerializedName("VSwitchId")
			private String vSwitchId;

			@SerializedName("InstanceEndpoint")
			private String instanceEndpoint;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("InstanceUsername")
			private String instanceUsername;

			@SerializedName("NetworkType")
			private String networkType;

			@SerializedName("ConsumeTimestamp")
			private ConsumeTimestamp consumeTimestamp;

			@SerializedName("Group")
			private Group group;

			public String getInstancePassword() {
				return this.instancePassword;
			}

			public void setInstancePassword(String instancePassword) {
				this.instancePassword = instancePassword;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getInstanceEndpoint() {
				return this.instanceEndpoint;
			}

			public void setInstanceEndpoint(String instanceEndpoint) {
				this.instanceEndpoint = instanceEndpoint;
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

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public String getInstanceUsername() {
				return this.instanceUsername;
			}

			public void setInstanceUsername(String instanceUsername) {
				this.instanceUsername = instanceUsername;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public ConsumeTimestamp getConsumeTimestamp() {
				return this.consumeTimestamp;
			}

			public void setConsumeTimestamp(ConsumeTimestamp consumeTimestamp) {
				this.consumeTimestamp = consumeTimestamp;
			}

			public Group getGroup() {
				return this.group;
			}

			public void setGroup(Group group) {
				this.group = group;
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ConsumeTimestamp {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Group {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkMNSParameters {

			@SerializedName("QueueName")
			private QueueName queueName;

			@SerializedName("IsBase64Encode")
			private IsBase64Encode isBase64Encode;

			@SerializedName("Body")
			private Body body;

			public QueueName getQueueName() {
				return this.queueName;
			}

			public void setQueueName(QueueName queueName) {
				this.queueName = queueName;
			}

			public IsBase64Encode getIsBase64Encode() {
				return this.isBase64Encode;
			}

			public void setIsBase64Encode(IsBase64Encode isBase64Encode) {
				this.isBase64Encode = isBase64Encode;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public static class QueueName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class IsBase64Encode {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkKafkaParameters {

			@SerializedName("Headers")
			private Headers headers;

			@SerializedName("InstanceId")
			private InstanceId instanceId;

			@SerializedName("Acks")
			private Acks acks;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("SaslUser")
			private SaslUser saslUser;

			@SerializedName("Value")
			private Value value;

			@SerializedName("Key")
			private Key key;

			public Headers getHeaders() {
				return this.headers;
			}

			public void setHeaders(Headers headers) {
				this.headers = headers;
			}

			public InstanceId getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(InstanceId instanceId) {
				this.instanceId = instanceId;
			}

			public Acks getAcks() {
				return this.acks;
			}

			public void setAcks(Acks acks) {
				this.acks = acks;
			}

			public Topic getTopic() {
				return this.topic;
			}

			public void setTopic(Topic topic) {
				this.topic = topic;
			}

			public SaslUser getSaslUser() {
				return this.saslUser;
			}

			public void setSaslUser(SaslUser saslUser) {
				this.saslUser = saslUser;
			}

			public Value getValue() {
				return this.value;
			}

			public void setValue(Value value) {
				this.value = value;
			}

			public Key getKey() {
				return this.key;
			}

			public void setKey(Key key) {
				this.key = key;
			}

			public static class Headers {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class InstanceId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Acks {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Topic {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class SaslUser {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Value {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Key {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkDashVectorParameters {

			@SerializedName("PrimaryKeyId")
			private PrimaryKeyId primaryKeyId;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("Partition")
			private Partition partition;

			@SerializedName("ApiKey")
			private String apiKey;

			@SerializedName("DashVectorSchemaParameters")
			private List<DashVectorSchemaParametersItem> dashVectorSchemaParameters;

			@SerializedName("Vector")
			private Vector vector;

			@SerializedName("Collection")
			private String collection;

			@SerializedName("Operation")
			private String operation;

			@SerializedName("Network")
			private String network;

			public PrimaryKeyId getPrimaryKeyId() {
				return this.primaryKeyId;
			}

			public void setPrimaryKeyId(PrimaryKeyId primaryKeyId) {
				this.primaryKeyId = primaryKeyId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Partition getPartition() {
				return this.partition;
			}

			public void setPartition(Partition partition) {
				this.partition = partition;
			}

			public String getApiKey() {
				return this.apiKey;
			}

			public void setApiKey(String apiKey) {
				this.apiKey = apiKey;
			}

			public List<DashVectorSchemaParametersItem> getDashVectorSchemaParameters() {
				return this.dashVectorSchemaParameters;
			}

			public void setDashVectorSchemaParameters(List<DashVectorSchemaParametersItem> dashVectorSchemaParameters) {
				this.dashVectorSchemaParameters = dashVectorSchemaParameters;
			}

			public Vector getVector() {
				return this.vector;
			}

			public void setVector(Vector vector) {
				this.vector = vector;
			}

			public String getCollection() {
				return this.collection;
			}

			public void setCollection(String collection) {
				this.collection = collection;
			}

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public static class PrimaryKeyId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Partition {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class DashVectorSchemaParametersItem {

				@SerializedName("Name")
				private Name name;

				@SerializedName("Type")
				private Type type;

				@SerializedName("Value")
				private Value value;

				public Name getName() {
					return this.name;
				}

				public void setName(Name name) {
					this.name = name;
				}

				public Type getType() {
					return this.type;
				}

				public void setType(Type type) {
					this.type = type;
				}

				public Value getValue() {
					return this.value;
				}

				public void setValue(Value value) {
					this.value = value;
				}

				public static class Name {

					@SerializedName("Template")
					private String template;

					@SerializedName("Form")
					private String form;

					@SerializedName("Value")
					private String value;

					public String getTemplate() {
						return this.template;
					}

					public void setTemplate(String template) {
						this.template = template;
					}

					public String getForm() {
						return this.form;
					}

					public void setForm(String form) {
						this.form = form;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Type {

					@SerializedName("Template")
					private String template;

					@SerializedName("Form")
					private String form;

					@SerializedName("Value")
					private String value;

					public String getTemplate() {
						return this.template;
					}

					public void setTemplate(String template) {
						this.template = template;
					}

					public String getForm() {
						return this.form;
					}

					public void setForm(String form) {
						this.form = form;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Value {

					@SerializedName("Template")
					private String template;

					@SerializedName("Form")
					private String form;

					@SerializedName("Value")
					private String value;

					public String getTemplate() {
						return this.template;
					}

					public void setTemplate(String template) {
						this.template = template;
					}

					public String getForm() {
						return this.form;
					}

					public void setForm(String form) {
						this.form = form;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}

			public static class Vector {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkFcParameters {

			@SerializedName("InvocationType")
			private InvocationType invocationType;

			@SerializedName("DataFormat")
			private DataFormat dataFormat;

			@SerializedName("FunctionName")
			private FunctionName functionName;

			@SerializedName("Qualifier")
			private Qualifier qualifier;

			@SerializedName("ServiceName")
			private ServiceName serviceName;

			@SerializedName("Body")
			private Body body;

			@SerializedName("Concurrency")
			private Concurrency concurrency;

			public InvocationType getInvocationType() {
				return this.invocationType;
			}

			public void setInvocationType(InvocationType invocationType) {
				this.invocationType = invocationType;
			}

			public DataFormat getDataFormat() {
				return this.dataFormat;
			}

			public void setDataFormat(DataFormat dataFormat) {
				this.dataFormat = dataFormat;
			}

			public FunctionName getFunctionName() {
				return this.functionName;
			}

			public void setFunctionName(FunctionName functionName) {
				this.functionName = functionName;
			}

			public Qualifier getQualifier() {
				return this.qualifier;
			}

			public void setQualifier(Qualifier qualifier) {
				this.qualifier = qualifier;
			}

			public ServiceName getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(ServiceName serviceName) {
				this.serviceName = serviceName;
			}

			public Body getBody() {
				return this.body;
			}

			public void setBody(Body body) {
				this.body = body;
			}

			public Concurrency getConcurrency() {
				return this.concurrency;
			}

			public void setConcurrency(Concurrency concurrency) {
				this.concurrency = concurrency;
			}

			public static class InvocationType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class DataFormat {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class FunctionName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Qualifier {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class ServiceName {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Body {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Concurrency {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkPrometheusParameters {

			@SerializedName("VSwitchId")
			private VSwitchId vSwitchId;

			@SerializedName("Password")
			private Password password;

			@SerializedName("Data")
			private Data data;

			@SerializedName("HeaderParameters")
			private HeaderParameters headerParameters;

			@SerializedName("VpcId")
			private VpcId vpcId;

			@SerializedName("SecurityGroupId")
			private SecurityGroupId securityGroupId;

			@SerializedName("AuthorizationType")
			private AuthorizationType authorizationType;

			@SerializedName("NetworkType")
			private NetworkType networkType;

			@SerializedName("URL")
			private URL uRL;

			@SerializedName("Username")
			private Username username;

			public VSwitchId getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(VSwitchId vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Password getPassword() {
				return this.password;
			}

			public void setPassword(Password password) {
				this.password = password;
			}

			public Data getData() {
				return this.data;
			}

			public void setData(Data data) {
				this.data = data;
			}

			public HeaderParameters getHeaderParameters() {
				return this.headerParameters;
			}

			public void setHeaderParameters(HeaderParameters headerParameters) {
				this.headerParameters = headerParameters;
			}

			public VpcId getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(VpcId vpcId) {
				this.vpcId = vpcId;
			}

			public SecurityGroupId getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(SecurityGroupId securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public AuthorizationType getAuthorizationType() {
				return this.authorizationType;
			}

			public void setAuthorizationType(AuthorizationType authorizationType) {
				this.authorizationType = authorizationType;
			}

			public NetworkType getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(NetworkType networkType) {
				this.networkType = networkType;
			}

			public URL getURL() {
				return this.uRL;
			}

			public void setURL(URL uRL) {
				this.uRL = uRL;
			}

			public Username getUsername() {
				return this.username;
			}

			public void setUsername(Username username) {
				this.username = username;
			}

			public static class VSwitchId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Password {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Data {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class HeaderParameters {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VpcId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class SecurityGroupId {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class AuthorizationType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class NetworkType {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class URL {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Username {

				@SerializedName("Template")
				private String template;

				@SerializedName("Form")
				private String form;

				@SerializedName("Value")
				private String value;

				public String getTemplate() {
					return this.template;
				}

				public void setTemplate(String template) {
					this.template = template;
				}

				public String getForm() {
					return this.form;
				}

				public void setForm(String form) {
					this.form = form;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class SinkCustomizedKafkaParameters {

			@SerializedName("InstanceId")
			private String instanceId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}
	}

	public static class RunOptions {

		@SerializedName("BatchWindow")
		private BatchWindow batchWindow;

		@SerializedName("Throttling")
		private Integer throttling;

		@SerializedName("BusinessOption")
		private BusinessOption businessOption;

		@SerializedName("RoleName")
		private String roleName;

		@SerializedName("RetryStrategy")
		private RetryStrategy retryStrategy;

		@SerializedName("LogDelivery")
		private LogDelivery logDelivery;

		@SerializedName("DeadLetterQueue")
		private DeadLetterQueue deadLetterQueue;

		@SerializedName("ResourceSpec")
		private ResourceSpec resourceSpec;

		@SerializedName("MaximumTasks")
		private Long maximumTasks;

		@SerializedName("ScaledObject")
		private ScaledObject scaledObject;

		@SerializedName("ErrorsTolerance")
		private String errorsTolerance;

		@SerializedName("Network")
		private Network network;

		public BatchWindow getBatchWindow() {
			return this.batchWindow;
		}

		public void setBatchWindow(BatchWindow batchWindow) {
			this.batchWindow = batchWindow;
		}

		public Integer getThrottling() {
			return this.throttling;
		}

		public void setThrottling(Integer throttling) {
			this.throttling = throttling;
		}

		public BusinessOption getBusinessOption() {
			return this.businessOption;
		}

		public void setBusinessOption(BusinessOption businessOption) {
			this.businessOption = businessOption;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public RetryStrategy getRetryStrategy() {
			return this.retryStrategy;
		}

		public void setRetryStrategy(RetryStrategy retryStrategy) {
			this.retryStrategy = retryStrategy;
		}

		public LogDelivery getLogDelivery() {
			return this.logDelivery;
		}

		public void setLogDelivery(LogDelivery logDelivery) {
			this.logDelivery = logDelivery;
		}

		public DeadLetterQueue getDeadLetterQueue() {
			return this.deadLetterQueue;
		}

		public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
			this.deadLetterQueue = deadLetterQueue;
		}

		public ResourceSpec getResourceSpec() {
			return this.resourceSpec;
		}

		public void setResourceSpec(ResourceSpec resourceSpec) {
			this.resourceSpec = resourceSpec;
		}

		public Long getMaximumTasks() {
			return this.maximumTasks;
		}

		public void setMaximumTasks(Long maximumTasks) {
			this.maximumTasks = maximumTasks;
		}

		public ScaledObject getScaledObject() {
			return this.scaledObject;
		}

		public void setScaledObject(ScaledObject scaledObject) {
			this.scaledObject = scaledObject;
		}

		public String getErrorsTolerance() {
			return this.errorsTolerance;
		}

		public void setErrorsTolerance(String errorsTolerance) {
			this.errorsTolerance = errorsTolerance;
		}

		public Network getNetwork() {
			return this.network;
		}

		public void setNetwork(Network network) {
			this.network = network;
		}

		public static class BatchWindow {

			@SerializedName("CountBasedWindow")
			private Integer countBasedWindow;

			@SerializedName("TimeBasedWindow")
			private Integer timeBasedWindow;

			public Integer getCountBasedWindow() {
				return this.countBasedWindow;
			}

			public void setCountBasedWindow(Integer countBasedWindow) {
				this.countBasedWindow = countBasedWindow;
			}

			public Integer getTimeBasedWindow() {
				return this.timeBasedWindow;
			}

			public void setTimeBasedWindow(Integer timeBasedWindow) {
				this.timeBasedWindow = timeBasedWindow;
			}
		}

		public static class BusinessOption {

			@SerializedName("BusinessMode")
			private String businessMode;

			@SerializedName("MinCapacityUnitCount")
			private Long minCapacityUnitCount;

			@SerializedName("MaxCapacityUnitCount")
			private Long maxCapacityUnitCount;

			public String getBusinessMode() {
				return this.businessMode;
			}

			public void setBusinessMode(String businessMode) {
				this.businessMode = businessMode;
			}

			public Long getMinCapacityUnitCount() {
				return this.minCapacityUnitCount;
			}

			public void setMinCapacityUnitCount(Long minCapacityUnitCount) {
				this.minCapacityUnitCount = minCapacityUnitCount;
			}

			public Long getMaxCapacityUnitCount() {
				return this.maxCapacityUnitCount;
			}

			public void setMaxCapacityUnitCount(Long maxCapacityUnitCount) {
				this.maxCapacityUnitCount = maxCapacityUnitCount;
			}
		}

		public static class RetryStrategy {

			@SerializedName("PushRetryStrategy")
			private String pushRetryStrategy;

			@SerializedName("MaximumRetryAttempts")
			private Long maximumRetryAttempts;

			@SerializedName("MaximumEventAgeInSeconds")
			private Long maximumEventAgeInSeconds;

			public String getPushRetryStrategy() {
				return this.pushRetryStrategy;
			}

			public void setPushRetryStrategy(String pushRetryStrategy) {
				this.pushRetryStrategy = pushRetryStrategy;
			}

			public Long getMaximumRetryAttempts() {
				return this.maximumRetryAttempts;
			}

			public void setMaximumRetryAttempts(Long maximumRetryAttempts) {
				this.maximumRetryAttempts = maximumRetryAttempts;
			}

			public Long getMaximumEventAgeInSeconds() {
				return this.maximumEventAgeInSeconds;
			}

			public void setMaximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
				this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
			}
		}

		public static class LogDelivery {

			@SerializedName("KafkaLogParameters")
			private List<KafkaLogParametersItem> kafkaLogParameters;

			@SerializedName("SLSLogParameters")
			private List<SLSLogParametersItem> sLSLogParameters;

			public List<KafkaLogParametersItem> getKafkaLogParameters() {
				return this.kafkaLogParameters;
			}

			public void setKafkaLogParameters(List<KafkaLogParametersItem> kafkaLogParameters) {
				this.kafkaLogParameters = kafkaLogParameters;
			}

			public List<SLSLogParametersItem> getSLSLogParameters() {
				return this.sLSLogParameters;
			}

			public void setSLSLogParameters(List<SLSLogParametersItem> sLSLogParameters) {
				this.sLSLogParameters = sLSLogParameters;
			}

			public static class KafkaLogParametersItem {

				@SerializedName("Endpoint")
				private String endpoint;

				@SerializedName("InstanceId")
				private String instanceId;

				@SerializedName("Topic")
				private String topic;

				public String getEndpoint() {
					return this.endpoint;
				}

				public void setEndpoint(String endpoint) {
					this.endpoint = endpoint;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getTopic() {
					return this.topic;
				}

				public void setTopic(String topic) {
					this.topic = topic;
				}
			}

			public static class SLSLogParametersItem {

				@SerializedName("ProjectName")
				private String projectName;

				@SerializedName("LogstoreName")
				private String logstoreName;

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getLogstoreName() {
					return this.logstoreName;
				}

				public void setLogstoreName(String logstoreName) {
					this.logstoreName = logstoreName;
				}
			}
		}

		public static class DeadLetterQueue {

			@SerializedName("VSwitchIds")
			private String vSwitchIds;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			@SerializedName("Arn")
			private String arn;

			@SerializedName("Network")
			private String network;

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

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}
		}

		public static class ResourceSpec {

			@SerializedName("Resources")
			private List<ResourcesItem> resources;

			public List<ResourcesItem> getResources() {
				return this.resources;
			}

			public void setResources(List<ResourcesItem> resources) {
				this.resources = resources;
			}

			public static class ResourcesItem {

				@SerializedName("Type")
				private String type;

				@SerializedName("Value")
				private Integer value;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Integer getValue() {
					return this.value;
				}

				public void setValue(Integer value) {
					this.value = value;
				}
			}
		}

		public static class ScaledObject {

			@SerializedName("MinReplicaCount")
			private Integer minReplicaCount;

			@SerializedName("MaxReplicaCount")
			private Integer maxReplicaCount;

			@SerializedName("Triggers")
			private List<TriggersItem> triggers;

			public Integer getMinReplicaCount() {
				return this.minReplicaCount;
			}

			public void setMinReplicaCount(Integer minReplicaCount) {
				this.minReplicaCount = minReplicaCount;
			}

			public Integer getMaxReplicaCount() {
				return this.maxReplicaCount;
			}

			public void setMaxReplicaCount(Integer maxReplicaCount) {
				this.maxReplicaCount = maxReplicaCount;
			}

			public List<TriggersItem> getTriggers() {
				return this.triggers;
			}

			public void setTriggers(List<TriggersItem> triggers) {
				this.triggers = triggers;
			}

			public static class TriggersItem {

				@SerializedName("Metadata")
				private Metadata metadata;

				@SerializedName("Type")
				private String type;

				public Metadata getMetadata() {
					return this.metadata;
				}

				public void setMetadata(Metadata metadata) {
					this.metadata = metadata;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public static class Metadata {

					@SerializedName("Type")
					private String type;

					@SerializedName("Value")
					private Integer value;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Integer getValue() {
						return this.value;
					}

					public void setValue(Integer value) {
						this.value = value;
					}
				}
			}
		}

		public static class Network {

			@SerializedName("VSwitchIds")
			private List<String> vSwitchIds;

			@SerializedName("VpcId")
			private String vpcId;

			@SerializedName("SecurityGroupId")
			private String securityGroupId;

			public List<String> getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(List<String> vSwitchIds) {
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
		}
	}

	@Override
	public Class<UpdateEventStreamingResponse> getResponseClass() {
		return UpdateEventStreamingResponse.class;
	}

}
