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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.ListEventStreamingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventStreamingsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer total;

		private List<EventStreamingsItem> eventStreamings;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<EventStreamingsItem> getEventStreamings() {
			return this.eventStreamings;
		}

		public void setEventStreamings(List<EventStreamingsItem> eventStreamings) {
			this.eventStreamings = eventStreamings;
		}

		public static class EventStreamingsItem {

			private String eventStreamingName;

			private String description;

			private String filterPattern;

			private String status;

			private String tag;

			private List<TransformsItem> transforms;

			private List<TagsItem> tags;

			private Source source;

			private Sink sink;

			private RunOptions runOptions;

			public String getEventStreamingName() {
				return this.eventStreamingName;
			}

			public void setEventStreamingName(String eventStreamingName) {
				this.eventStreamingName = eventStreamingName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getFilterPattern() {
				return this.filterPattern;
			}

			public void setFilterPattern(String filterPattern) {
				this.filterPattern = filterPattern;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<TransformsItem> getTransforms() {
				return this.transforms;
			}

			public void setTransforms(List<TransformsItem> transforms) {
				this.transforms = transforms;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public Source getSource() {
				return this.source;
			}

			public void setSource(Source source) {
				this.source = source;
			}

			public Sink getSink() {
				return this.sink;
			}

			public void setSink(Sink sink) {
				this.sink = sink;
			}

			public RunOptions getRunOptions() {
				return this.runOptions;
			}

			public void setRunOptions(RunOptions runOptions) {
				this.runOptions = runOptions;
			}

			public static class TransformsItem {

				private String arn;

				private DashScopeTransformParameters dashScopeTransformParameters;

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

					private String model;

					private String apiKey;

					private String structuredOutputJsonSchema;

					private Long requestPerMinute;

					private Long tokenPerMinute;

					private List<MessagesItem> messages;

					public String getModel() {
						return this.model;
					}

					public void setModel(String model) {
						this.model = model;
					}

					public String getApiKey() {
						return this.apiKey;
					}

					public void setApiKey(String apiKey) {
						this.apiKey = apiKey;
					}

					public String getStructuredOutputJsonSchema() {
						return this.structuredOutputJsonSchema;
					}

					public void setStructuredOutputJsonSchema(String structuredOutputJsonSchema) {
						this.structuredOutputJsonSchema = structuredOutputJsonSchema;
					}

					public Long getRequestPerMinute() {
						return this.requestPerMinute;
					}

					public void setRequestPerMinute(Long requestPerMinute) {
						this.requestPerMinute = requestPerMinute;
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

					public static class MessagesItem {

						private String role;

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class BaiLianAgentTransformParameters {

					private String applicationId;

					private String apiKey;

					private Long requestPerMinute;

					private Long tokenPerMinute;

					private Prompt prompt;

					public String getApplicationId() {
						return this.applicationId;
					}

					public void setApplicationId(String applicationId) {
						this.applicationId = applicationId;
					}

					public String getApiKey() {
						return this.apiKey;
					}

					public void setApiKey(String apiKey) {
						this.apiKey = apiKey;
					}

					public Long getRequestPerMinute() {
						return this.requestPerMinute;
					}

					public void setRequestPerMinute(Long requestPerMinute) {
						this.requestPerMinute = requestPerMinute;
					}

					public Long getTokenPerMinute() {
						return this.tokenPerMinute;
					}

					public void setTokenPerMinute(Long tokenPerMinute) {
						this.tokenPerMinute = tokenPerMinute;
					}

					public Prompt getPrompt() {
						return this.prompt;
					}

					public void setPrompt(Prompt prompt) {
						this.prompt = prompt;
					}

					public static class Prompt {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}
			}

			public static class TagsItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Source {

				private SourceMNSParameters sourceMNSParameters;

				private SourceRabbitMQParameters sourceRabbitMQParameters;

				private SourceRocketMQParameters sourceRocketMQParameters;

				private SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters;

				private SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters;

				private SourceKafkaParameters sourceKafkaParameters;

				private SourceMQTTParameters sourceMQTTParameters;

				private SourceDTSParameters sourceDTSParameters;

				private SourceSLSParameters sourceSLSParameters;

				private SourcePrometheusParameters sourcePrometheusParameters;

				private SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters;

				private SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters;

				private SourceApacheKafkaParameters sourceApacheKafkaParameters;

				private SourceOSSParameters sourceOSSParameters;

				private SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters;

				private SourceEventBusParameters sourceEventBusParameters;

				private SourceMySQLParameters sourceMySQLParameters;

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

				public SourceRocketMQParameters getSourceRocketMQParameters() {
					return this.sourceRocketMQParameters;
				}

				public void setSourceRocketMQParameters(SourceRocketMQParameters sourceRocketMQParameters) {
					this.sourceRocketMQParameters = sourceRocketMQParameters;
				}

				public SourceRocketMQCheckpointParameters getSourceRocketMQCheckpointParameters() {
					return this.sourceRocketMQCheckpointParameters;
				}

				public void setSourceRocketMQCheckpointParameters(SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters) {
					this.sourceRocketMQCheckpointParameters = sourceRocketMQCheckpointParameters;
				}

				public SourceApacheRocketMQCheckpointParameters getSourceApacheRocketMQCheckpointParameters() {
					return this.sourceApacheRocketMQCheckpointParameters;
				}

				public void setSourceApacheRocketMQCheckpointParameters(SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters) {
					this.sourceApacheRocketMQCheckpointParameters = sourceApacheRocketMQCheckpointParameters;
				}

				public SourceKafkaParameters getSourceKafkaParameters() {
					return this.sourceKafkaParameters;
				}

				public void setSourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
					this.sourceKafkaParameters = sourceKafkaParameters;
				}

				public SourceMQTTParameters getSourceMQTTParameters() {
					return this.sourceMQTTParameters;
				}

				public void setSourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
					this.sourceMQTTParameters = sourceMQTTParameters;
				}

				public SourceDTSParameters getSourceDTSParameters() {
					return this.sourceDTSParameters;
				}

				public void setSourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
					this.sourceDTSParameters = sourceDTSParameters;
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

				public SourceCustomizedKafkaParameters getSourceCustomizedKafkaParameters() {
					return this.sourceCustomizedKafkaParameters;
				}

				public void setSourceCustomizedKafkaParameters(SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters) {
					this.sourceCustomizedKafkaParameters = sourceCustomizedKafkaParameters;
				}

				public SourceCustomizedKafkaConnectorParameters getSourceCustomizedKafkaConnectorParameters() {
					return this.sourceCustomizedKafkaConnectorParameters;
				}

				public void setSourceCustomizedKafkaConnectorParameters(SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters) {
					this.sourceCustomizedKafkaConnectorParameters = sourceCustomizedKafkaConnectorParameters;
				}

				public SourceApacheKafkaParameters getSourceApacheKafkaParameters() {
					return this.sourceApacheKafkaParameters;
				}

				public void setSourceApacheKafkaParameters(SourceApacheKafkaParameters sourceApacheKafkaParameters) {
					this.sourceApacheKafkaParameters = sourceApacheKafkaParameters;
				}

				public SourceOSSParameters getSourceOSSParameters() {
					return this.sourceOSSParameters;
				}

				public void setSourceOSSParameters(SourceOSSParameters sourceOSSParameters) {
					this.sourceOSSParameters = sourceOSSParameters;
				}

				public SourceOpenSourceRabbitMQParameters getSourceOpenSourceRabbitMQParameters() {
					return this.sourceOpenSourceRabbitMQParameters;
				}

				public void setSourceOpenSourceRabbitMQParameters(SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters) {
					this.sourceOpenSourceRabbitMQParameters = sourceOpenSourceRabbitMQParameters;
				}

				public SourceEventBusParameters getSourceEventBusParameters() {
					return this.sourceEventBusParameters;
				}

				public void setSourceEventBusParameters(SourceEventBusParameters sourceEventBusParameters) {
					this.sourceEventBusParameters = sourceEventBusParameters;
				}

				public SourceMySQLParameters getSourceMySQLParameters() {
					return this.sourceMySQLParameters;
				}

				public void setSourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
					this.sourceMySQLParameters = sourceMySQLParameters;
				}

				public static class SourceMNSParameters {

					private String regionId;

					private String queueName;

					private Boolean isBase64Decode;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getQueueName() {
						return this.queueName;
					}

					public void setQueueName(String queueName) {
						this.queueName = queueName;
					}

					public Boolean getIsBase64Decode() {
						return this.isBase64Decode;
					}

					public void setIsBase64Decode(Boolean isBase64Decode) {
						this.isBase64Decode = isBase64Decode;
					}
				}

				public static class SourceRabbitMQParameters {

					private String regionId;

					private String instanceId;

					private String virtualHostName;

					private String queueName;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getVirtualHostName() {
						return this.virtualHostName;
					}

					public void setVirtualHostName(String virtualHostName) {
						this.virtualHostName = virtualHostName;
					}

					public String getQueueName() {
						return this.queueName;
					}

					public void setQueueName(String queueName) {
						this.queueName = queueName;
					}
				}

				public static class SourceRocketMQParameters {

					private String regionId;

					private String instanceId;

					private String topic;

					private String tag;

					private String offset;

					private String groupID;

					private Long timestamp;

					private String instanceType;

					private String instanceEndpoint;

					private String authType;

					private String instanceUsername;

					private String instancePassword;

					private String instanceVpcId;

					private String instanceVSwitchIds;

					private String instanceSecurityGroupId;

					private String instanceNetwork;

					private String bodyDataType;

					private String network;

					private String filterType;

					private String filterSql;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
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

					public String getTag() {
						return this.tag;
					}

					public void setTag(String tag) {
						this.tag = tag;
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

					public Long getTimestamp() {
						return this.timestamp;
					}

					public void setTimestamp(Long timestamp) {
						this.timestamp = timestamp;
					}

					public String getInstanceType() {
						return this.instanceType;
					}

					public void setInstanceType(String instanceType) {
						this.instanceType = instanceType;
					}

					public String getInstanceEndpoint() {
						return this.instanceEndpoint;
					}

					public void setInstanceEndpoint(String instanceEndpoint) {
						this.instanceEndpoint = instanceEndpoint;
					}

					public String getAuthType() {
						return this.authType;
					}

					public void setAuthType(String authType) {
						this.authType = authType;
					}

					public String getInstanceUsername() {
						return this.instanceUsername;
					}

					public void setInstanceUsername(String instanceUsername) {
						this.instanceUsername = instanceUsername;
					}

					public String getInstancePassword() {
						return this.instancePassword;
					}

					public void setInstancePassword(String instancePassword) {
						this.instancePassword = instancePassword;
					}

					public String getInstanceVpcId() {
						return this.instanceVpcId;
					}

					public void setInstanceVpcId(String instanceVpcId) {
						this.instanceVpcId = instanceVpcId;
					}

					public String getInstanceVSwitchIds() {
						return this.instanceVSwitchIds;
					}

					public void setInstanceVSwitchIds(String instanceVSwitchIds) {
						this.instanceVSwitchIds = instanceVSwitchIds;
					}

					public String getInstanceSecurityGroupId() {
						return this.instanceSecurityGroupId;
					}

					public void setInstanceSecurityGroupId(String instanceSecurityGroupId) {
						this.instanceSecurityGroupId = instanceSecurityGroupId;
					}

					public String getInstanceNetwork() {
						return this.instanceNetwork;
					}

					public void setInstanceNetwork(String instanceNetwork) {
						this.instanceNetwork = instanceNetwork;
					}

					public String getBodyDataType() {
						return this.bodyDataType;
					}

					public void setBodyDataType(String bodyDataType) {
						this.bodyDataType = bodyDataType;
					}

					public String getNetwork() {
						return this.network;
					}

					public void setNetwork(String network) {
						this.network = network;
					}

					public String getFilterType() {
						return this.filterType;
					}

					public void setFilterType(String filterType) {
						this.filterType = filterType;
					}

					public String getFilterSql() {
						return this.filterSql;
					}

					public void setFilterSql(String filterSql) {
						this.filterSql = filterSql;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
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
				}

				public static class SourceRocketMQCheckpointParameters {

					private String regionId;

					private String instanceType;

					private String instanceId;

					private List<String> topics;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getInstanceType() {
						return this.instanceType;
					}

					public void setInstanceType(String instanceType) {
						this.instanceType = instanceType;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public List<String> getTopics() {
						return this.topics;
					}

					public void setTopics(List<String> topics) {
						this.topics = topics;
					}
				}

				public static class SourceApacheRocketMQCheckpointParameters {

					private String regionId;

					private String instanceEndpoint;

					private String instanceUsername;

					private String instancePassword;

					private String networkType;

					private String vpcId;

					private String vSwitchId;

					private String securityGroupId;

					private List<String> topics1;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getInstanceEndpoint() {
						return this.instanceEndpoint;
					}

					public void setInstanceEndpoint(String instanceEndpoint) {
						this.instanceEndpoint = instanceEndpoint;
					}

					public String getInstanceUsername() {
						return this.instanceUsername;
					}

					public void setInstanceUsername(String instanceUsername) {
						this.instanceUsername = instanceUsername;
					}

					public String getInstancePassword() {
						return this.instancePassword;
					}

					public void setInstancePassword(String instancePassword) {
						this.instancePassword = instancePassword;
					}

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
					}

					public String getVSwitchId() {
						return this.vSwitchId;
					}

					public void setVSwitchId(String vSwitchId) {
						this.vSwitchId = vSwitchId;
					}

					public String getSecurityGroupId() {
						return this.securityGroupId;
					}

					public void setSecurityGroupId(String securityGroupId) {
						this.securityGroupId = securityGroupId;
					}

					public List<String> getTopics1() {
						return this.topics1;
					}

					public void setTopics1(List<String> topics1) {
						this.topics1 = topics1;
					}
				}

				public static class SourceKafkaParameters {

					private String regionId;

					private String instanceId;

					private String topic;

					private String consumerGroup;

					private String offsetReset;

					private String network;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					private String valueDataType;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
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

					public String getConsumerGroup() {
						return this.consumerGroup;
					}

					public void setConsumerGroup(String consumerGroup) {
						this.consumerGroup = consumerGroup;
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

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
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

					public String getValueDataType() {
						return this.valueDataType;
					}

					public void setValueDataType(String valueDataType) {
						this.valueDataType = valueDataType;
					}
				}

				public static class SourceMQTTParameters {

					private String regionId;

					private String instanceId;

					private String topic;

					private String bodyDataType;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
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

					public String getBodyDataType() {
						return this.bodyDataType;
					}

					public void setBodyDataType(String bodyDataType) {
						this.bodyDataType = bodyDataType;
					}
				}

				public static class SourceDTSParameters {

					private String taskId;

					private String brokerUrl;

					private String topic;

					private String sid;

					private String username;

					private String password;

					private String initCheckPoint;

					public String getTaskId() {
						return this.taskId;
					}

					public void setTaskId(String taskId) {
						this.taskId = taskId;
					}

					public String getBrokerUrl() {
						return this.brokerUrl;
					}

					public void setBrokerUrl(String brokerUrl) {
						this.brokerUrl = brokerUrl;
					}

					public String getTopic() {
						return this.topic;
					}

					public void setTopic(String topic) {
						this.topic = topic;
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

					public String getPassword() {
						return this.password;
					}

					public void setPassword(String password) {
						this.password = password;
					}

					public String getInitCheckPoint() {
						return this.initCheckPoint;
					}

					public void setInitCheckPoint(String initCheckPoint) {
						this.initCheckPoint = initCheckPoint;
					}
				}

				public static class SourceSLSParameters {

					private String project;

					private String logStore;

					private String consumerGroup;

					private String consumePosition;

					private String roleName;

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

					public String getConsumerGroup() {
						return this.consumerGroup;
					}

					public void setConsumerGroup(String consumerGroup) {
						this.consumerGroup = consumerGroup;
					}

					public String getConsumePosition() {
						return this.consumePosition;
					}

					public void setConsumePosition(String consumePosition) {
						this.consumePosition = consumePosition;
					}

					public String getRoleName() {
						return this.roleName;
					}

					public void setRoleName(String roleName) {
						this.roleName = roleName;
					}
				}

				public static class SourcePrometheusParameters {

					private String regionId;

					private String clusterId;

					private String dataType;

					private String labels;

					private String roleName;

					private String externalLabels;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getClusterId() {
						return this.clusterId;
					}

					public void setClusterId(String clusterId) {
						this.clusterId = clusterId;
					}

					public String getDataType() {
						return this.dataType;
					}

					public void setDataType(String dataType) {
						this.dataType = dataType;
					}

					public String getLabels() {
						return this.labels;
					}

					public void setLabels(String labels) {
						this.labels = labels;
					}

					public String getRoleName() {
						return this.roleName;
					}

					public void setRoleName(String roleName) {
						this.roleName = roleName;
					}

					public String getExternalLabels() {
						return this.externalLabels;
					}

					public void setExternalLabels(String externalLabels) {
						this.externalLabels = externalLabels;
					}
				}

				public static class SourceCustomizedKafkaParameters {

					private String instanceId;

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}
				}

				public static class SourceCustomizedKafkaConnectorParameters {

					private String connectorPackageUrl;

					private Map<Object,Object> workerParameters;

					private ConnectorParameters connectorParameters;

					public String getConnectorPackageUrl() {
						return this.connectorPackageUrl;
					}

					public void setConnectorPackageUrl(String connectorPackageUrl) {
						this.connectorPackageUrl = connectorPackageUrl;
					}

					public Map<Object,Object> getWorkerParameters() {
						return this.workerParameters;
					}

					public void setWorkerParameters(Map<Object,Object> workerParameters) {
						this.workerParameters = workerParameters;
					}

					public ConnectorParameters getConnectorParameters() {
						return this.connectorParameters;
					}

					public void setConnectorParameters(ConnectorParameters connectorParameters) {
						this.connectorParameters = connectorParameters;
					}

					public static class ConnectorParameters {

						private String name;

						private Map<Object,Object> config;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Map<Object,Object> getConfig() {
							return this.config;
						}

						public void setConfig(Map<Object,Object> config) {
							this.config = config;
						}
					}
				}

				public static class SourceApacheKafkaParameters {

					private String bootstraps;

					private String topic;

					private String consumerGroup;

					private String offsetReset;

					private String valueDataType;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					private String networkType;

					private String securityProtocol;

					private String saslMechanism;

					private String saslUser;

					private String saslPassword;

					public String getBootstraps() {
						return this.bootstraps;
					}

					public void setBootstraps(String bootstraps) {
						this.bootstraps = bootstraps;
					}

					public String getTopic() {
						return this.topic;
					}

					public void setTopic(String topic) {
						this.topic = topic;
					}

					public String getConsumerGroup() {
						return this.consumerGroup;
					}

					public void setConsumerGroup(String consumerGroup) {
						this.consumerGroup = consumerGroup;
					}

					public String getOffsetReset() {
						return this.offsetReset;
					}

					public void setOffsetReset(String offsetReset) {
						this.offsetReset = offsetReset;
					}

					public String getValueDataType() {
						return this.valueDataType;
					}

					public void setValueDataType(String valueDataType) {
						this.valueDataType = valueDataType;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
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

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getSecurityProtocol() {
						return this.securityProtocol;
					}

					public void setSecurityProtocol(String securityProtocol) {
						this.securityProtocol = securityProtocol;
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

					public String getSaslPassword() {
						return this.saslPassword;
					}

					public void setSaslPassword(String saslPassword) {
						this.saslPassword = saslPassword;
					}
				}

				public static class SourceOSSParameters {

					private String roleName;

					private String bucketName;

					private String prefix;

					private String loadMode;

					private String loadFormat;

					private String delimiter;

					public String getRoleName() {
						return this.roleName;
					}

					public void setRoleName(String roleName) {
						this.roleName = roleName;
					}

					public String getBucketName() {
						return this.bucketName;
					}

					public void setBucketName(String bucketName) {
						this.bucketName = bucketName;
					}

					public String getPrefix() {
						return this.prefix;
					}

					public void setPrefix(String prefix) {
						this.prefix = prefix;
					}

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

					public String getDelimiter() {
						return this.delimiter;
					}

					public void setDelimiter(String delimiter) {
						this.delimiter = delimiter;
					}
				}

				public static class SourceOpenSourceRabbitMQParameters {

					private String endpoint;

					private String virtualHostName;

					private String queueName;

					private String bodyDataType;

					private String username;

					private String password;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					private String networkType;

					private String authType;

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

					public String getQueueName() {
						return this.queueName;
					}

					public void setQueueName(String queueName) {
						this.queueName = queueName;
					}

					public String getBodyDataType() {
						return this.bodyDataType;
					}

					public void setBodyDataType(String bodyDataType) {
						this.bodyDataType = bodyDataType;
					}

					public String getUsername() {
						return this.username;
					}

					public void setUsername(String username) {
						this.username = username;
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

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getAuthType() {
						return this.authType;
					}

					public void setAuthType(String authType) {
						this.authType = authType;
					}
				}

				public static class SourceEventBusParameters {

					private String eventBusName;

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

				public static class SourceMySQLParameters {

					private String includeSchemaChanges;

					private String user;

					private String vSwitchIds;

					private String snapshotMode;

					private String securityGroupId;

					private Integer port;

					private String databaseName;

					private String vpcId;

					private String networkType;

					private String tableNames;

					private String regionId;

					private String hostName;

					private String password;

					public String getIncludeSchemaChanges() {
						return this.includeSchemaChanges;
					}

					public void setIncludeSchemaChanges(String includeSchemaChanges) {
						this.includeSchemaChanges = includeSchemaChanges;
					}

					public String getUser() {
						return this.user;
					}

					public void setUser(String user) {
						this.user = user;
					}

					public String getVSwitchIds() {
						return this.vSwitchIds;
					}

					public void setVSwitchIds(String vSwitchIds) {
						this.vSwitchIds = vSwitchIds;
					}

					public String getSnapshotMode() {
						return this.snapshotMode;
					}

					public void setSnapshotMode(String snapshotMode) {
						this.snapshotMode = snapshotMode;
					}

					public String getSecurityGroupId() {
						return this.securityGroupId;
					}

					public void setSecurityGroupId(String securityGroupId) {
						this.securityGroupId = securityGroupId;
					}

					public Integer getPort() {
						return this.port;
					}

					public void setPort(Integer port) {
						this.port = port;
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

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getTableNames() {
						return this.tableNames;
					}

					public void setTableNames(String tableNames) {
						this.tableNames = tableNames;
					}

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
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
				}
			}

			public static class Sink {

				private SinkMNSParameters sinkMNSParameters;

				private SinkFcParameters sinkFcParameters;

				private SinkRabbitMQParameters sinkRabbitMQParameters;

				private SinkKafkaParameters sinkKafkaParameters;

				private SinkApacheKafkaParameters sinkApacheKafkaParameters;

				private SinkRocketMQParameters sinkRocketMQParameters;

				private SinkDorisParameters sinkDorisParameters;

				private SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters;

				private SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters;

				private SinkSLSParameters sinkSLSParameters;

				private SinkFnfParameters sinkFnfParameters;

				private SinkDataHubParameters sinkDataHubParameters;

				private SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters;

				private SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters;

				private SinkDashVectorParameters sinkDashVectorParameters;

				private SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters;

				private SinkBaiLianParameters sinkBaiLianParameters;

				private SinkHttpsParameters sinkHttpsParameters;

				private SinkApiDestinationParameters sinkApiDestinationParameters;

				public SinkMNSParameters getSinkMNSParameters() {
					return this.sinkMNSParameters;
				}

				public void setSinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
					this.sinkMNSParameters = sinkMNSParameters;
				}

				public SinkFcParameters getSinkFcParameters() {
					return this.sinkFcParameters;
				}

				public void setSinkFcParameters(SinkFcParameters sinkFcParameters) {
					this.sinkFcParameters = sinkFcParameters;
				}

				public SinkRabbitMQParameters getSinkRabbitMQParameters() {
					return this.sinkRabbitMQParameters;
				}

				public void setSinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
					this.sinkRabbitMQParameters = sinkRabbitMQParameters;
				}

				public SinkKafkaParameters getSinkKafkaParameters() {
					return this.sinkKafkaParameters;
				}

				public void setSinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
					this.sinkKafkaParameters = sinkKafkaParameters;
				}

				public SinkApacheKafkaParameters getSinkApacheKafkaParameters() {
					return this.sinkApacheKafkaParameters;
				}

				public void setSinkApacheKafkaParameters(SinkApacheKafkaParameters sinkApacheKafkaParameters) {
					this.sinkApacheKafkaParameters = sinkApacheKafkaParameters;
				}

				public SinkRocketMQParameters getSinkRocketMQParameters() {
					return this.sinkRocketMQParameters;
				}

				public void setSinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
					this.sinkRocketMQParameters = sinkRocketMQParameters;
				}

				public SinkDorisParameters getSinkDorisParameters() {
					return this.sinkDorisParameters;
				}

				public void setSinkDorisParameters(SinkDorisParameters sinkDorisParameters) {
					this.sinkDorisParameters = sinkDorisParameters;
				}

				public SinkRocketMQCheckpointParameters getSinkRocketMQCheckpointParameters() {
					return this.sinkRocketMQCheckpointParameters;
				}

				public void setSinkRocketMQCheckpointParameters(SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters) {
					this.sinkRocketMQCheckpointParameters = sinkRocketMQCheckpointParameters;
				}

				public SinkApacheRocketMQCheckpointParameters getSinkApacheRocketMQCheckpointParameters() {
					return this.sinkApacheRocketMQCheckpointParameters;
				}

				public void setSinkApacheRocketMQCheckpointParameters(SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters) {
					this.sinkApacheRocketMQCheckpointParameters = sinkApacheRocketMQCheckpointParameters;
				}

				public SinkSLSParameters getSinkSLSParameters() {
					return this.sinkSLSParameters;
				}

				public void setSinkSLSParameters(SinkSLSParameters sinkSLSParameters) {
					this.sinkSLSParameters = sinkSLSParameters;
				}

				public SinkFnfParameters getSinkFnfParameters() {
					return this.sinkFnfParameters;
				}

				public void setSinkFnfParameters(SinkFnfParameters sinkFnfParameters) {
					this.sinkFnfParameters = sinkFnfParameters;
				}

				public SinkDataHubParameters getSinkDataHubParameters() {
					return this.sinkDataHubParameters;
				}

				public void setSinkDataHubParameters(SinkDataHubParameters sinkDataHubParameters) {
					this.sinkDataHubParameters = sinkDataHubParameters;
				}

				public SinkCustomizedKafkaParameters getSinkCustomizedKafkaParameters() {
					return this.sinkCustomizedKafkaParameters;
				}

				public void setSinkCustomizedKafkaParameters(SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters) {
					this.sinkCustomizedKafkaParameters = sinkCustomizedKafkaParameters;
				}

				public SinkCustomizedKafkaConnectorParameters getSinkCustomizedKafkaConnectorParameters() {
					return this.sinkCustomizedKafkaConnectorParameters;
				}

				public void setSinkCustomizedKafkaConnectorParameters(SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters) {
					this.sinkCustomizedKafkaConnectorParameters = sinkCustomizedKafkaConnectorParameters;
				}

				public SinkDashVectorParameters getSinkDashVectorParameters() {
					return this.sinkDashVectorParameters;
				}

				public void setSinkDashVectorParameters(SinkDashVectorParameters sinkDashVectorParameters) {
					this.sinkDashVectorParameters = sinkDashVectorParameters;
				}

				public SinkOpenSourceRabbitMQParameters getSinkOpenSourceRabbitMQParameters() {
					return this.sinkOpenSourceRabbitMQParameters;
				}

				public void setSinkOpenSourceRabbitMQParameters(SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters) {
					this.sinkOpenSourceRabbitMQParameters = sinkOpenSourceRabbitMQParameters;
				}

				public SinkBaiLianParameters getSinkBaiLianParameters() {
					return this.sinkBaiLianParameters;
				}

				public void setSinkBaiLianParameters(SinkBaiLianParameters sinkBaiLianParameters) {
					this.sinkBaiLianParameters = sinkBaiLianParameters;
				}

				public SinkHttpsParameters getSinkHttpsParameters() {
					return this.sinkHttpsParameters;
				}

				public void setSinkHttpsParameters(SinkHttpsParameters sinkHttpsParameters) {
					this.sinkHttpsParameters = sinkHttpsParameters;
				}

				public SinkApiDestinationParameters getSinkApiDestinationParameters() {
					return this.sinkApiDestinationParameters;
				}

				public void setSinkApiDestinationParameters(SinkApiDestinationParameters sinkApiDestinationParameters) {
					this.sinkApiDestinationParameters = sinkApiDestinationParameters;
				}

				public static class SinkMNSParameters {

					private QueueName queueName;

					private Body body;

					private IsBase64Encode isBase64Encode;

					public QueueName getQueueName() {
						return this.queueName;
					}

					public void setQueueName(QueueName queueName) {
						this.queueName = queueName;
					}

					public Body getBody() {
						return this.body;
					}

					public void setBody(Body body) {
						this.body = body;
					}

					public IsBase64Encode getIsBase64Encode() {
						return this.isBase64Encode;
					}

					public void setIsBase64Encode(IsBase64Encode isBase64Encode) {
						this.isBase64Encode = isBase64Encode;
					}

					public static class QueueName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class IsBase64Encode {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkFcParameters {

					private ServiceName serviceName;

					private FunctionName functionName;

					private Concurrency concurrency;

					private Qualifier qualifier;

					private InvocationType invocationType;

					private Body2 body2;

					private DataFormat dataFormat;

					public ServiceName getServiceName() {
						return this.serviceName;
					}

					public void setServiceName(ServiceName serviceName) {
						this.serviceName = serviceName;
					}

					public FunctionName getFunctionName() {
						return this.functionName;
					}

					public void setFunctionName(FunctionName functionName) {
						this.functionName = functionName;
					}

					public Concurrency getConcurrency() {
						return this.concurrency;
					}

					public void setConcurrency(Concurrency concurrency) {
						this.concurrency = concurrency;
					}

					public Qualifier getQualifier() {
						return this.qualifier;
					}

					public void setQualifier(Qualifier qualifier) {
						this.qualifier = qualifier;
					}

					public InvocationType getInvocationType() {
						return this.invocationType;
					}

					public void setInvocationType(InvocationType invocationType) {
						this.invocationType = invocationType;
					}

					public Body2 getBody2() {
						return this.body2;
					}

					public void setBody2(Body2 body2) {
						this.body2 = body2;
					}

					public DataFormat getDataFormat() {
						return this.dataFormat;
					}

					public void setDataFormat(DataFormat dataFormat) {
						this.dataFormat = dataFormat;
					}

					public static class ServiceName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class FunctionName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Concurrency {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Qualifier {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class InvocationType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body2 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class DataFormat {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkRabbitMQParameters {

					private InstanceId instanceId;

					private VirtualHostName virtualHostName;

					private TargetType targetType;

					private Exchange exchange;

					private RoutingKey routingKey;

					private QueueName3 queueName3;

					private Body4 body4;

					private MessageId messageId;

					private Properties properties;

					public InstanceId getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(InstanceId instanceId) {
						this.instanceId = instanceId;
					}

					public VirtualHostName getVirtualHostName() {
						return this.virtualHostName;
					}

					public void setVirtualHostName(VirtualHostName virtualHostName) {
						this.virtualHostName = virtualHostName;
					}

					public TargetType getTargetType() {
						return this.targetType;
					}

					public void setTargetType(TargetType targetType) {
						this.targetType = targetType;
					}

					public Exchange getExchange() {
						return this.exchange;
					}

					public void setExchange(Exchange exchange) {
						this.exchange = exchange;
					}

					public RoutingKey getRoutingKey() {
						return this.routingKey;
					}

					public void setRoutingKey(RoutingKey routingKey) {
						this.routingKey = routingKey;
					}

					public QueueName3 getQueueName3() {
						return this.queueName3;
					}

					public void setQueueName3(QueueName3 queueName3) {
						this.queueName3 = queueName3;
					}

					public Body4 getBody4() {
						return this.body4;
					}

					public void setBody4(Body4 body4) {
						this.body4 = body4;
					}

					public MessageId getMessageId() {
						return this.messageId;
					}

					public void setMessageId(MessageId messageId) {
						this.messageId = messageId;
					}

					public Properties getProperties() {
						return this.properties;
					}

					public void setProperties(Properties properties) {
						this.properties = properties;
					}

					public static class InstanceId {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VirtualHostName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class TargetType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Exchange {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class RoutingKey {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class QueueName3 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body4 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class MessageId {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Properties {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkKafkaParameters {

					private InstanceId5 instanceId5;

					private Topic topic;

					private Acks acks;

					private Key key;

					private Value value;

					private SaslUser saslUser;

					public InstanceId5 getInstanceId5() {
						return this.instanceId5;
					}

					public void setInstanceId5(InstanceId5 instanceId5) {
						this.instanceId5 = instanceId5;
					}

					public Topic getTopic() {
						return this.topic;
					}

					public void setTopic(Topic topic) {
						this.topic = topic;
					}

					public Acks getAcks() {
						return this.acks;
					}

					public void setAcks(Acks acks) {
						this.acks = acks;
					}

					public Key getKey() {
						return this.key;
					}

					public void setKey(Key key) {
						this.key = key;
					}

					public Value getValue() {
						return this.value;
					}

					public void setValue(Value value) {
						this.value = value;
					}

					public SaslUser getSaslUser() {
						return this.saslUser;
					}

					public void setSaslUser(SaslUser saslUser) {
						this.saslUser = saslUser;
					}

					public static class InstanceId5 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Topic {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Acks {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Key {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Value {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class SaslUser {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkApacheKafkaParameters {

					private String bootstraps;

					private String topic;

					private String acks;

					private String securityProtocol;

					private String saslMechanism;

					private String saslUser;

					private String saslPassword;

					private Key6 key6;

					private Value7 value7;

					private VpcId vpcId;

					private VSwitchIds vSwitchIds;

					private SecurityGroupId securityGroupId;

					private NetworkType networkType;

					public String getBootstraps() {
						return this.bootstraps;
					}

					public void setBootstraps(String bootstraps) {
						this.bootstraps = bootstraps;
					}

					public String getTopic() {
						return this.topic;
					}

					public void setTopic(String topic) {
						this.topic = topic;
					}

					public String getAcks() {
						return this.acks;
					}

					public void setAcks(String acks) {
						this.acks = acks;
					}

					public String getSecurityProtocol() {
						return this.securityProtocol;
					}

					public void setSecurityProtocol(String securityProtocol) {
						this.securityProtocol = securityProtocol;
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

					public String getSaslPassword() {
						return this.saslPassword;
					}

					public void setSaslPassword(String saslPassword) {
						this.saslPassword = saslPassword;
					}

					public Key6 getKey6() {
						return this.key6;
					}

					public void setKey6(Key6 key6) {
						this.key6 = key6;
					}

					public Value7 getValue7() {
						return this.value7;
					}

					public void setValue7(Value7 value7) {
						this.value7 = value7;
					}

					public VpcId getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(VpcId vpcId) {
						this.vpcId = vpcId;
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

					public NetworkType getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(NetworkType networkType) {
						this.networkType = networkType;
					}

					public static class Key6 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Value7 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VpcId {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VSwitchIds {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class SecurityGroupId {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class NetworkType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkRocketMQParameters {

					private InstanceId8 instanceId8;

					private Topic9 topic9;

					private Body10 body10;

					private Properties11 properties11;

					private Keys keys;

					private Tags12 tags12;

					private InstanceType instanceType;

					private InstanceEndpoint instanceEndpoint;

					private InstanceUsername instanceUsername;

					private InstancePassword instancePassword;

					private VpcId13 vpcId13;

					private VSwitchIds14 vSwitchIds14;

					private SecurityGroupId15 securityGroupId15;

					private Network network;

					private DeliveryOrderType deliveryOrderType;

					private ShardingKey shardingKey;

					public InstanceId8 getInstanceId8() {
						return this.instanceId8;
					}

					public void setInstanceId8(InstanceId8 instanceId8) {
						this.instanceId8 = instanceId8;
					}

					public Topic9 getTopic9() {
						return this.topic9;
					}

					public void setTopic9(Topic9 topic9) {
						this.topic9 = topic9;
					}

					public Body10 getBody10() {
						return this.body10;
					}

					public void setBody10(Body10 body10) {
						this.body10 = body10;
					}

					public Properties11 getProperties11() {
						return this.properties11;
					}

					public void setProperties11(Properties11 properties11) {
						this.properties11 = properties11;
					}

					public Keys getKeys() {
						return this.keys;
					}

					public void setKeys(Keys keys) {
						this.keys = keys;
					}

					public Tags12 getTags12() {
						return this.tags12;
					}

					public void setTags12(Tags12 tags12) {
						this.tags12 = tags12;
					}

					public InstanceType getInstanceType() {
						return this.instanceType;
					}

					public void setInstanceType(InstanceType instanceType) {
						this.instanceType = instanceType;
					}

					public InstanceEndpoint getInstanceEndpoint() {
						return this.instanceEndpoint;
					}

					public void setInstanceEndpoint(InstanceEndpoint instanceEndpoint) {
						this.instanceEndpoint = instanceEndpoint;
					}

					public InstanceUsername getInstanceUsername() {
						return this.instanceUsername;
					}

					public void setInstanceUsername(InstanceUsername instanceUsername) {
						this.instanceUsername = instanceUsername;
					}

					public InstancePassword getInstancePassword() {
						return this.instancePassword;
					}

					public void setInstancePassword(InstancePassword instancePassword) {
						this.instancePassword = instancePassword;
					}

					public VpcId13 getVpcId13() {
						return this.vpcId13;
					}

					public void setVpcId13(VpcId13 vpcId13) {
						this.vpcId13 = vpcId13;
					}

					public VSwitchIds14 getVSwitchIds14() {
						return this.vSwitchIds14;
					}

					public void setVSwitchIds14(VSwitchIds14 vSwitchIds14) {
						this.vSwitchIds14 = vSwitchIds14;
					}

					public SecurityGroupId15 getSecurityGroupId15() {
						return this.securityGroupId15;
					}

					public void setSecurityGroupId15(SecurityGroupId15 securityGroupId15) {
						this.securityGroupId15 = securityGroupId15;
					}

					public Network getNetwork() {
						return this.network;
					}

					public void setNetwork(Network network) {
						this.network = network;
					}

					public DeliveryOrderType getDeliveryOrderType() {
						return this.deliveryOrderType;
					}

					public void setDeliveryOrderType(DeliveryOrderType deliveryOrderType) {
						this.deliveryOrderType = deliveryOrderType;
					}

					public ShardingKey getShardingKey() {
						return this.shardingKey;
					}

					public void setShardingKey(ShardingKey shardingKey) {
						this.shardingKey = shardingKey;
					}

					public static class InstanceId8 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Topic9 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body10 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Properties11 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Keys {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Tags12 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class InstanceType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class InstanceEndpoint {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class InstanceUsername {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class InstancePassword {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VpcId13 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VSwitchIds14 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class SecurityGroupId15 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Network {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class DeliveryOrderType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ShardingKey {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkDorisParameters {

					private QueryEndpoint queryEndpoint;

					private FeHttpEndpoint feHttpEndpoint;

					private BeHttpEndpoint beHttpEndpoint;

					private UserName userName;

					private Password password;

					private Database database;

					private Table table;

					private Body16 body16;

					private NetworkType17 networkType17;

					private VpcId18 vpcId18;

					private VSwitchIds19 vSwitchIds19;

					private SecurityGroupId20 securityGroupId20;

					public QueryEndpoint getQueryEndpoint() {
						return this.queryEndpoint;
					}

					public void setQueryEndpoint(QueryEndpoint queryEndpoint) {
						this.queryEndpoint = queryEndpoint;
					}

					public FeHttpEndpoint getFeHttpEndpoint() {
						return this.feHttpEndpoint;
					}

					public void setFeHttpEndpoint(FeHttpEndpoint feHttpEndpoint) {
						this.feHttpEndpoint = feHttpEndpoint;
					}

					public BeHttpEndpoint getBeHttpEndpoint() {
						return this.beHttpEndpoint;
					}

					public void setBeHttpEndpoint(BeHttpEndpoint beHttpEndpoint) {
						this.beHttpEndpoint = beHttpEndpoint;
					}

					public UserName getUserName() {
						return this.userName;
					}

					public void setUserName(UserName userName) {
						this.userName = userName;
					}

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

					public Table getTable() {
						return this.table;
					}

					public void setTable(Table table) {
						this.table = table;
					}

					public Body16 getBody16() {
						return this.body16;
					}

					public void setBody16(Body16 body16) {
						this.body16 = body16;
					}

					public NetworkType17 getNetworkType17() {
						return this.networkType17;
					}

					public void setNetworkType17(NetworkType17 networkType17) {
						this.networkType17 = networkType17;
					}

					public VpcId18 getVpcId18() {
						return this.vpcId18;
					}

					public void setVpcId18(VpcId18 vpcId18) {
						this.vpcId18 = vpcId18;
					}

					public VSwitchIds19 getVSwitchIds19() {
						return this.vSwitchIds19;
					}

					public void setVSwitchIds19(VSwitchIds19 vSwitchIds19) {
						this.vSwitchIds19 = vSwitchIds19;
					}

					public SecurityGroupId20 getSecurityGroupId20() {
						return this.securityGroupId20;
					}

					public void setSecurityGroupId20(SecurityGroupId20 securityGroupId20) {
						this.securityGroupId20 = securityGroupId20;
					}

					public static class QueryEndpoint {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class FeHttpEndpoint {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class BeHttpEndpoint {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class UserName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Password {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Database {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Table {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body16 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class NetworkType17 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VpcId18 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class VSwitchIds19 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class SecurityGroupId20 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkRocketMQCheckpointParameters {

					private String instanceType;

					private String instanceId;

					private Topic21 topic21;

					private Group group;

					private ConsumeTimestamp consumeTimestamp;

					public String getInstanceType() {
						return this.instanceType;
					}

					public void setInstanceType(String instanceType) {
						this.instanceType = instanceType;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public Topic21 getTopic21() {
						return this.topic21;
					}

					public void setTopic21(Topic21 topic21) {
						this.topic21 = topic21;
					}

					public Group getGroup() {
						return this.group;
					}

					public void setGroup(Group group) {
						this.group = group;
					}

					public ConsumeTimestamp getConsumeTimestamp() {
						return this.consumeTimestamp;
					}

					public void setConsumeTimestamp(ConsumeTimestamp consumeTimestamp) {
						this.consumeTimestamp = consumeTimestamp;
					}

					public static class Topic21 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Group {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ConsumeTimestamp {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkApacheRocketMQCheckpointParameters {

					private String instanceEndpoint;

					private String instanceUsername;

					private String instancePassword;

					private String networkType;

					private String vpcId;

					private String vSwitchId;

					private String securityGroupId;

					private Topic22 topic22;

					private Group23 group23;

					private ConsumeTimestamp24 consumeTimestamp24;

					public String getInstanceEndpoint() {
						return this.instanceEndpoint;
					}

					public void setInstanceEndpoint(String instanceEndpoint) {
						this.instanceEndpoint = instanceEndpoint;
					}

					public String getInstanceUsername() {
						return this.instanceUsername;
					}

					public void setInstanceUsername(String instanceUsername) {
						this.instanceUsername = instanceUsername;
					}

					public String getInstancePassword() {
						return this.instancePassword;
					}

					public void setInstancePassword(String instancePassword) {
						this.instancePassword = instancePassword;
					}

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
					}

					public String getVSwitchId() {
						return this.vSwitchId;
					}

					public void setVSwitchId(String vSwitchId) {
						this.vSwitchId = vSwitchId;
					}

					public String getSecurityGroupId() {
						return this.securityGroupId;
					}

					public void setSecurityGroupId(String securityGroupId) {
						this.securityGroupId = securityGroupId;
					}

					public Topic22 getTopic22() {
						return this.topic22;
					}

					public void setTopic22(Topic22 topic22) {
						this.topic22 = topic22;
					}

					public Group23 getGroup23() {
						return this.group23;
					}

					public void setGroup23(Group23 group23) {
						this.group23 = group23;
					}

					public ConsumeTimestamp24 getConsumeTimestamp24() {
						return this.consumeTimestamp24;
					}

					public void setConsumeTimestamp24(ConsumeTimestamp24 consumeTimestamp24) {
						this.consumeTimestamp24 = consumeTimestamp24;
					}

					public static class Topic22 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Group23 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ConsumeTimestamp24 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkSLSParameters {

					private Project project;

					private LogStore logStore;

					private Topic25 topic25;

					private Body26 body26;

					private RoleName roleName;

					private ContentType contentType;

					private ContentSchema contentSchema;

					public Project getProject() {
						return this.project;
					}

					public void setProject(Project project) {
						this.project = project;
					}

					public LogStore getLogStore() {
						return this.logStore;
					}

					public void setLogStore(LogStore logStore) {
						this.logStore = logStore;
					}

					public Topic25 getTopic25() {
						return this.topic25;
					}

					public void setTopic25(Topic25 topic25) {
						this.topic25 = topic25;
					}

					public Body26 getBody26() {
						return this.body26;
					}

					public void setBody26(Body26 body26) {
						this.body26 = body26;
					}

					public RoleName getRoleName() {
						return this.roleName;
					}

					public void setRoleName(RoleName roleName) {
						this.roleName = roleName;
					}

					public ContentType getContentType() {
						return this.contentType;
					}

					public void setContentType(ContentType contentType) {
						this.contentType = contentType;
					}

					public ContentSchema getContentSchema() {
						return this.contentSchema;
					}

					public void setContentSchema(ContentSchema contentSchema) {
						this.contentSchema = contentSchema;
					}

					public static class Project {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class LogStore {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Topic25 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body26 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class RoleName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ContentType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ContentSchema {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkFnfParameters {

					private FlowName flowName;

					private ExecutionName executionName;

					private Input input;

					private RoleName27 roleName27;

					public FlowName getFlowName() {
						return this.flowName;
					}

					public void setFlowName(FlowName flowName) {
						this.flowName = flowName;
					}

					public ExecutionName getExecutionName() {
						return this.executionName;
					}

					public void setExecutionName(ExecutionName executionName) {
						this.executionName = executionName;
					}

					public Input getInput() {
						return this.input;
					}

					public void setInput(Input input) {
						this.input = input;
					}

					public RoleName27 getRoleName27() {
						return this.roleName27;
					}

					public void setRoleName27(RoleName27 roleName27) {
						this.roleName27 = roleName27;
					}

					public static class FlowName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class ExecutionName {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Input {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class RoleName27 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkDataHubParameters {

					private Project28 project28;

					private Topic29 topic29;

					private TopicType topicType;

					private TopicSchema topicSchema;

					private Body30 body30;

					private RoleName31 roleName31;

					public Project28 getProject28() {
						return this.project28;
					}

					public void setProject28(Project28 project28) {
						this.project28 = project28;
					}

					public Topic29 getTopic29() {
						return this.topic29;
					}

					public void setTopic29(Topic29 topic29) {
						this.topic29 = topic29;
					}

					public TopicType getTopicType() {
						return this.topicType;
					}

					public void setTopicType(TopicType topicType) {
						this.topicType = topicType;
					}

					public TopicSchema getTopicSchema() {
						return this.topicSchema;
					}

					public void setTopicSchema(TopicSchema topicSchema) {
						this.topicSchema = topicSchema;
					}

					public Body30 getBody30() {
						return this.body30;
					}

					public void setBody30(Body30 body30) {
						this.body30 = body30;
					}

					public RoleName31 getRoleName31() {
						return this.roleName31;
					}

					public void setRoleName31(RoleName31 roleName31) {
						this.roleName31 = roleName31;
					}

					public static class Project28 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Topic29 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class TopicType {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class TopicSchema {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body30 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class RoleName31 {

						private String value;

						private String form;

						private String template;

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}

						public String getForm() {
							return this.form;
						}

						public void setForm(String form) {
							this.form = form;
						}

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkCustomizedKafkaParameters {

					private String instanceId;

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}
				}

				public static class SinkCustomizedKafkaConnectorParameters {

					private String connectorPackageUrl;

					private Map<Object,Object> workerParameters;

					private ConnectorParameters32 connectorParameters32;

					public String getConnectorPackageUrl() {
						return this.connectorPackageUrl;
					}

					public void setConnectorPackageUrl(String connectorPackageUrl) {
						this.connectorPackageUrl = connectorPackageUrl;
					}

					public Map<Object,Object> getWorkerParameters() {
						return this.workerParameters;
					}

					public void setWorkerParameters(Map<Object,Object> workerParameters) {
						this.workerParameters = workerParameters;
					}

					public ConnectorParameters32 getConnectorParameters32() {
						return this.connectorParameters32;
					}

					public void setConnectorParameters32(ConnectorParameters32 connectorParameters32) {
						this.connectorParameters32 = connectorParameters32;
					}

					public static class ConnectorParameters32 {

						private String name;

						private Map<Object,Object> config;

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Map<Object,Object> getConfig() {
							return this.config;
						}

						public void setConfig(Map<Object,Object> config) {
							this.config = config;
						}
					}
				}

				public static class SinkDashVectorParameters {

					private String instanceId;

					private String collection;

					private String apiKey;

					private String operation;

					private String network;

					private List<DashVectorSchemaParametersItem> dashVectorSchemaParameters;

					private PrimaryKeyId primaryKeyId;

					private Partition partition;

					private Vector vector;

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getCollection() {
						return this.collection;
					}

					public void setCollection(String collection) {
						this.collection = collection;
					}

					public String getApiKey() {
						return this.apiKey;
					}

					public void setApiKey(String apiKey) {
						this.apiKey = apiKey;
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

					public List<DashVectorSchemaParametersItem> getDashVectorSchemaParameters() {
						return this.dashVectorSchemaParameters;
					}

					public void setDashVectorSchemaParameters(List<DashVectorSchemaParametersItem> dashVectorSchemaParameters) {
						this.dashVectorSchemaParameters = dashVectorSchemaParameters;
					}

					public PrimaryKeyId getPrimaryKeyId() {
						return this.primaryKeyId;
					}

					public void setPrimaryKeyId(PrimaryKeyId primaryKeyId) {
						this.primaryKeyId = primaryKeyId;
					}

					public Partition getPartition() {
						return this.partition;
					}

					public void setPartition(Partition partition) {
						this.partition = partition;
					}

					public Vector getVector() {
						return this.vector;
					}

					public void setVector(Vector vector) {
						this.vector = vector;
					}

					public static class DashVectorSchemaParametersItem {

						private Name name;

						private Type type;

						private Value33 value33;

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

						public Value33 getValue33() {
							return this.value33;
						}

						public void setValue33(Value33 value33) {
							this.value33 = value33;
						}

						public static class Name {

							private String form;

							private String value;

							private String template;

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

							public String getTemplate() {
								return this.template;
							}

							public void setTemplate(String template) {
								this.template = template;
							}
						}

						public static class Type {

							private String form;

							private String value;

							private String template;

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

							public String getTemplate() {
								return this.template;
							}

							public void setTemplate(String template) {
								this.template = template;
							}
						}

						public static class Value33 {

							private String form;

							private String value;

							private String template;

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

							public String getTemplate() {
								return this.template;
							}

							public void setTemplate(String template) {
								this.template = template;
							}
						}
					}

					public static class PrimaryKeyId {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Partition {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Vector {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkOpenSourceRabbitMQParameters {

					private String endpoint;

					private String virtualHostName;

					private String targetType;

					private String exchange;

					private String queueName;

					private String username;

					private String password;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					private String networkType;

					private String authType;

					private RoutingKey34 routingKey34;

					private Body35 body35;

					private MessageId36 messageId36;

					private Properties37 properties37;

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

					public String getTargetType() {
						return this.targetType;
					}

					public void setTargetType(String targetType) {
						this.targetType = targetType;
					}

					public String getExchange() {
						return this.exchange;
					}

					public void setExchange(String exchange) {
						this.exchange = exchange;
					}

					public String getQueueName() {
						return this.queueName;
					}

					public void setQueueName(String queueName) {
						this.queueName = queueName;
					}

					public String getUsername() {
						return this.username;
					}

					public void setUsername(String username) {
						this.username = username;
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

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getAuthType() {
						return this.authType;
					}

					public void setAuthType(String authType) {
						this.authType = authType;
					}

					public RoutingKey34 getRoutingKey34() {
						return this.routingKey34;
					}

					public void setRoutingKey34(RoutingKey34 routingKey34) {
						this.routingKey34 = routingKey34;
					}

					public Body35 getBody35() {
						return this.body35;
					}

					public void setBody35(Body35 body35) {
						this.body35 = body35;
					}

					public MessageId36 getMessageId36() {
						return this.messageId36;
					}

					public void setMessageId36(MessageId36 messageId36) {
						this.messageId36 = messageId36;
					}

					public Properties37 getProperties37() {
						return this.properties37;
					}

					public void setProperties37(Properties37 properties37) {
						this.properties37 = properties37;
					}

					public static class RoutingKey34 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body35 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class MessageId36 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Properties37 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkBaiLianParameters {

					private Object context;

					private String applicationType;

					private Object extend;

					private String workspaceId;

					private Before before;

					private Op op;

					private Partition38 partition38;

					private After after;

					private Offset offset;

					public Object getContext() {
						return this.context;
					}

					public void setContext(Object context) {
						this.context = context;
					}

					public String getApplicationType() {
						return this.applicationType;
					}

					public void setApplicationType(String applicationType) {
						this.applicationType = applicationType;
					}

					public Object getExtend() {
						return this.extend;
					}

					public void setExtend(Object extend) {
						this.extend = extend;
					}

					public String getWorkspaceId() {
						return this.workspaceId;
					}

					public void setWorkspaceId(String workspaceId) {
						this.workspaceId = workspaceId;
					}

					public Before getBefore() {
						return this.before;
					}

					public void setBefore(Before before) {
						this.before = before;
					}

					public Op getOp() {
						return this.op;
					}

					public void setOp(Op op) {
						this.op = op;
					}

					public Partition38 getPartition38() {
						return this.partition38;
					}

					public void setPartition38(Partition38 partition38) {
						this.partition38 = partition38;
					}

					public After getAfter() {
						return this.after;
					}

					public void setAfter(After after) {
						this.after = after;
					}

					public Offset getOffset() {
						return this.offset;
					}

					public void setOffset(Offset offset) {
						this.offset = offset;
					}

					public static class Before {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Op {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Partition38 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class After {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Offset {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkHttpsParameters {

					private String method;

					private String token;

					private String networkType;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

					private URL uRL;

					private Body39 body39;

					public String getBizMethod() {
						return this.method;
					}

					public void setBizMethod(String method) {
						this.method = method;
					}

					public String getToken() {
						return this.token;
					}

					public void setToken(String token) {
						this.token = token;
					}

					public String getNetworkType() {
						return this.networkType;
					}

					public void setNetworkType(String networkType) {
						this.networkType = networkType;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
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

					public URL getURL() {
						return this.uRL;
					}

					public void setURL(URL uRL) {
						this.uRL = uRL;
					}

					public Body39 getBody39() {
						return this.body39;
					}

					public void setBody39(Body39 body39) {
						this.body39 = body39;
					}

					public static class URL {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class Body39 {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}

				public static class SinkApiDestinationParameters {

					private String name;

					private HeaderParameters headerParameters;

					private BodyParameters bodyParameters;

					private QueryStringParameters queryStringParameters;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

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

					public QueryStringParameters getQueryStringParameters() {
						return this.queryStringParameters;
					}

					public void setQueryStringParameters(QueryStringParameters queryStringParameters) {
						this.queryStringParameters = queryStringParameters;
					}

					public static class HeaderParameters {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class BodyParameters {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}

					public static class QueryStringParameters {

						private String form;

						private String value;

						private String template;

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

						public String getTemplate() {
							return this.template;
						}

						public void setTemplate(String template) {
							this.template = template;
						}
					}
				}
			}

			public static class RunOptions {

				private Integer maximumTasks;

				private String errorsTolerance;

				private String roleName;

				private Integer throttling;

				private RetryStrategy retryStrategy;

				private DeadLetterQueue deadLetterQueue;

				private BatchWindow batchWindow;

				private BusinessOption businessOption;

				private LogDelivery logDelivery;

				private ScaledObject scaledObject;

				private Network40 network40;

				private ResourceSpec resourceSpec;

				public Integer getMaximumTasks() {
					return this.maximumTasks;
				}

				public void setMaximumTasks(Integer maximumTasks) {
					this.maximumTasks = maximumTasks;
				}

				public String getErrorsTolerance() {
					return this.errorsTolerance;
				}

				public void setErrorsTolerance(String errorsTolerance) {
					this.errorsTolerance = errorsTolerance;
				}

				public String getRoleName() {
					return this.roleName;
				}

				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}

				public Integer getThrottling() {
					return this.throttling;
				}

				public void setThrottling(Integer throttling) {
					this.throttling = throttling;
				}

				public RetryStrategy getRetryStrategy() {
					return this.retryStrategy;
				}

				public void setRetryStrategy(RetryStrategy retryStrategy) {
					this.retryStrategy = retryStrategy;
				}

				public DeadLetterQueue getDeadLetterQueue() {
					return this.deadLetterQueue;
				}

				public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
					this.deadLetterQueue = deadLetterQueue;
				}

				public BatchWindow getBatchWindow() {
					return this.batchWindow;
				}

				public void setBatchWindow(BatchWindow batchWindow) {
					this.batchWindow = batchWindow;
				}

				public BusinessOption getBusinessOption() {
					return this.businessOption;
				}

				public void setBusinessOption(BusinessOption businessOption) {
					this.businessOption = businessOption;
				}

				public LogDelivery getLogDelivery() {
					return this.logDelivery;
				}

				public void setLogDelivery(LogDelivery logDelivery) {
					this.logDelivery = logDelivery;
				}

				public ScaledObject getScaledObject() {
					return this.scaledObject;
				}

				public void setScaledObject(ScaledObject scaledObject) {
					this.scaledObject = scaledObject;
				}

				public Network40 getNetwork40() {
					return this.network40;
				}

				public void setNetwork40(Network40 network40) {
					this.network40 = network40;
				}

				public ResourceSpec getResourceSpec() {
					return this.resourceSpec;
				}

				public void setResourceSpec(ResourceSpec resourceSpec) {
					this.resourceSpec = resourceSpec;
				}

				public static class RetryStrategy {

					private String pushRetryStrategy;

					private Float maximumEventAgeInSeconds;

					private Float maximumRetryAttempts;

					public String getPushRetryStrategy() {
						return this.pushRetryStrategy;
					}

					public void setPushRetryStrategy(String pushRetryStrategy) {
						this.pushRetryStrategy = pushRetryStrategy;
					}

					public Float getMaximumEventAgeInSeconds() {
						return this.maximumEventAgeInSeconds;
					}

					public void setMaximumEventAgeInSeconds(Float maximumEventAgeInSeconds) {
						this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
					}

					public Float getMaximumRetryAttempts() {
						return this.maximumRetryAttempts;
					}

					public void setMaximumRetryAttempts(Float maximumRetryAttempts) {
						this.maximumRetryAttempts = maximumRetryAttempts;
					}
				}

				public static class DeadLetterQueue {

					private String arn;

					private String network;

					private String vpcId;

					private String vSwitchIds;

					private String securityGroupId;

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

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
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
				}

				public static class BatchWindow {

					private Integer countBasedWindow;

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

					private String businessMode;

					private Long minCapacityUnitCount;

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

				public static class LogDelivery {

					private List<SLSLogParametersItem> sLSLogParameters;

					private List<KafkaLogParametersItem> kafkaLogParameters;

					public List<SLSLogParametersItem> getSLSLogParameters() {
						return this.sLSLogParameters;
					}

					public void setSLSLogParameters(List<SLSLogParametersItem> sLSLogParameters) {
						this.sLSLogParameters = sLSLogParameters;
					}

					public List<KafkaLogParametersItem> getKafkaLogParameters() {
						return this.kafkaLogParameters;
					}

					public void setKafkaLogParameters(List<KafkaLogParametersItem> kafkaLogParameters) {
						this.kafkaLogParameters = kafkaLogParameters;
					}

					public static class SLSLogParametersItem {

						private String projectName;

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

					public static class KafkaLogParametersItem {

						private String endpoint;

						private String instanceId;

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
				}

				public static class ScaledObject {

					private Integer minReplicaCount;

					private Integer maxReplicaCount;

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

						private String type;

						private Metadata metadata;

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public Metadata getMetadata() {
							return this.metadata;
						}

						public void setMetadata(Metadata metadata) {
							this.metadata = metadata;
						}

						public static class Metadata {

							private String type;

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

				public static class Network40 {

					private String vpcId;

					private String securityGroupId;

					private List<String> vSwitchIds41;

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

					public List<String> getVSwitchIds41() {
						return this.vSwitchIds41;
					}

					public void setVSwitchIds41(List<String> vSwitchIds41) {
						this.vSwitchIds41 = vSwitchIds41;
					}
				}

				public static class ResourceSpec {

					private List<ResourcesItem> resources;

					public List<ResourcesItem> getResources() {
						return this.resources;
					}

					public void setResources(List<ResourcesItem> resources) {
						this.resources = resources;
					}

					public static class ResourcesItem {

						private String type;

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
		}
	}

	@Override
	public ListEventStreamingsResponse getInstance(UnmarshallerContext context) {
		return	ListEventStreamingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
