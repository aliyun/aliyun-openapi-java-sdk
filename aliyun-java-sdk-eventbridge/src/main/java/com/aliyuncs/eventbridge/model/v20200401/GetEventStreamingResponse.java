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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.GetEventStreamingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEventStreamingResponse extends AcsResponse {

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

		private String eventStreamingName;

		private String description;

		private String filterPattern;

		private String tag;

		private String status;

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

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public static class Source {

			private SourceMNSParameters sourceMNSParameters;

			private SourceRabbitMQParameters sourceRabbitMQParameters;

			private SourceRocketMQParameters sourceRocketMQParameters;

			private SourceKafkaParameters sourceKafkaParameters;

			private SourceMQTTParameters sourceMQTTParameters;

			private SourceDTSParameters sourceDTSParameters;

			private SourceSLSParameters sourceSLSParameters;

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
			}

			public static class SourceMQTTParameters {

				private String regionId;

				private String instanceId;

				private String topic;

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
		}

		public static class Sink {

			private SinkMNSParameters sinkMNSParameters;

			private SinkRabbitMQParameters sinkRabbitMQParameters;

			private SinkFcParameters sinkFcParameters;

			private SinkKafkaParameters sinkKafkaParameters;

			private SinkRocketMQParameters sinkRocketMQParameters;

			private SinkSLSParameters sinkSLSParameters;

			public SinkMNSParameters getSinkMNSParameters() {
				return this.sinkMNSParameters;
			}

			public void setSinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
				this.sinkMNSParameters = sinkMNSParameters;
			}

			public SinkRabbitMQParameters getSinkRabbitMQParameters() {
				return this.sinkRabbitMQParameters;
			}

			public void setSinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
				this.sinkRabbitMQParameters = sinkRabbitMQParameters;
			}

			public SinkFcParameters getSinkFcParameters() {
				return this.sinkFcParameters;
			}

			public void setSinkFcParameters(SinkFcParameters sinkFcParameters) {
				this.sinkFcParameters = sinkFcParameters;
			}

			public SinkKafkaParameters getSinkKafkaParameters() {
				return this.sinkKafkaParameters;
			}

			public void setSinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
				this.sinkKafkaParameters = sinkKafkaParameters;
			}

			public SinkRocketMQParameters getSinkRocketMQParameters() {
				return this.sinkRocketMQParameters;
			}

			public void setSinkRocketMQParameters(SinkRocketMQParameters sinkRocketMQParameters) {
				this.sinkRocketMQParameters = sinkRocketMQParameters;
			}

			public SinkSLSParameters getSinkSLSParameters() {
				return this.sinkSLSParameters;
			}

			public void setSinkSLSParameters(SinkSLSParameters sinkSLSParameters) {
				this.sinkSLSParameters = sinkSLSParameters;
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

			public static class SinkRabbitMQParameters {

				private InstanceId instanceId;

				private VirtualHostName virtualHostName;

				private TargetType targetType;

				private Exchange exchange;

				private RoutingKey routingKey;

				private QueueName1 queueName1;

				private Body2 body2;

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

				public QueueName1 getQueueName1() {
					return this.queueName1;
				}

				public void setQueueName1(QueueName1 queueName1) {
					this.queueName1 = queueName1;
				}

				public Body2 getBody2() {
					return this.body2;
				}

				public void setBody2(Body2 body2) {
					this.body2 = body2;
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

				public static class QueueName1 {

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

			public static class SinkFcParameters {

				private ServiceName serviceName;

				private FunctionName functionName;

				private Concurrency concurrency;

				private Qualifier qualifier;

				private InvocationType invocationType;

				private Body3 body3;

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

				public Body3 getBody3() {
					return this.body3;
				}

				public void setBody3(Body3 body3) {
					this.body3 = body3;
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

				public static class Body3 {

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

				private InstanceId4 instanceId4;

				private Topic topic;

				private Acks acks;

				private Key key;

				private Value value;

				private SaslUser saslUser;

				public InstanceId4 getInstanceId4() {
					return this.instanceId4;
				}

				public void setInstanceId4(InstanceId4 instanceId4) {
					this.instanceId4 = instanceId4;
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

				public static class InstanceId4 {

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

			public static class SinkRocketMQParameters {

				private InstanceId5 instanceId5;

				private Topic6 topic6;

				private Body7 body7;

				private Properties8 properties8;

				private Keys keys;

				private Tags tags;

				public InstanceId5 getInstanceId5() {
					return this.instanceId5;
				}

				public void setInstanceId5(InstanceId5 instanceId5) {
					this.instanceId5 = instanceId5;
				}

				public Topic6 getTopic6() {
					return this.topic6;
				}

				public void setTopic6(Topic6 topic6) {
					this.topic6 = topic6;
				}

				public Body7 getBody7() {
					return this.body7;
				}

				public void setBody7(Body7 body7) {
					this.body7 = body7;
				}

				public Properties8 getProperties8() {
					return this.properties8;
				}

				public void setProperties8(Properties8 properties8) {
					this.properties8 = properties8;
				}

				public Keys getKeys() {
					return this.keys;
				}

				public void setKeys(Keys keys) {
					this.keys = keys;
				}

				public Tags getTags() {
					return this.tags;
				}

				public void setTags(Tags tags) {
					this.tags = tags;
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

				public static class Topic6 {

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

				public static class Body7 {

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

				public static class Properties8 {

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

				public static class Tags {

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

				private Topic9 topic9;

				private Body10 body10;

				private RoleName roleName;

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

				public RoleName getRoleName() {
					return this.roleName;
				}

				public void setRoleName(RoleName roleName) {
					this.roleName = roleName;
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
			}
		}

		public static class RunOptions {

			private Integer maximumTasks;

			private String errorsTolerance;

			private RetryStrategy retryStrategy;

			private DeadLetterQueue deadLetterQueue;

			private BatchWindow batchWindow;

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

				public String getArn() {
					return this.arn;
				}

				public void setArn(String arn) {
					this.arn = arn;
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
		}
	}

	@Override
	public GetEventStreamingResponse getInstance(UnmarshallerContext context) {
		return	GetEventStreamingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
