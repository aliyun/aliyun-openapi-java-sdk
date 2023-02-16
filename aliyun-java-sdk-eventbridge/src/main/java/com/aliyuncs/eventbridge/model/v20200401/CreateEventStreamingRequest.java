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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateEventStreamingRequest extends RpcAcsRequest<CreateEventStreamingResponse> {
	   

	@SerializedName("sink")
	private Sink sink;

	private String description;

	private String filterPattern;

	@SerializedName("source")
	private Source source;

	@SerializedName("runOptions")
	private RunOptions runOptions;

	private String eventStreamingName;
	public CreateEventStreamingRequest() {
		super("eventbridge", "2020-04-01", "CreateEventStreaming");
		setMethod(MethodType.POST);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
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

	public Source getSource() {
		return this.source;
	}

	public void setSource(Source source) {
		this.source = source;	
		if (source != null) {
			putBodyParameter("Source" , new Gson().toJson(source));
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

	public static class Sink {

		@SerializedName("SinkRabbitMQParameters")
		private SinkRabbitMQParameters sinkRabbitMQParameters;

		@SerializedName("SinkMNSParameters")
		private SinkMNSParameters sinkMNSParameters;

		@SerializedName("SinkDataHubParameters")
		private SinkDataHubParameters sinkDataHubParameters;

		@SerializedName("SinkKafkaParameters")
		private SinkKafkaParameters sinkKafkaParameters;

		@SerializedName("SinkFcParameters")
		private SinkFcParameters sinkFcParameters;

		@SerializedName("SinkSLSParameters")
		private SinkSLSParameters sinkSLSParameters;

		@SerializedName("SinkRocketMQParameters")
		private SinkRocketMQParameters sinkRocketMQParameters;

		public SinkRabbitMQParameters getSinkRabbitMQParameters() {
			return this.sinkRabbitMQParameters;
		}

		public void setSinkRabbitMQParameters(SinkRabbitMQParameters sinkRabbitMQParameters) {
			this.sinkRabbitMQParameters = sinkRabbitMQParameters;
		}

		public SinkMNSParameters getSinkMNSParameters() {
			return this.sinkMNSParameters;
		}

		public void setSinkMNSParameters(SinkMNSParameters sinkMNSParameters) {
			this.sinkMNSParameters = sinkMNSParameters;
		}

		public SinkDataHubParameters getSinkDataHubParameters() {
			return this.sinkDataHubParameters;
		}

		public void setSinkDataHubParameters(SinkDataHubParameters sinkDataHubParameters) {
			this.sinkDataHubParameters = sinkDataHubParameters;
		}

		public SinkKafkaParameters getSinkKafkaParameters() {
			return this.sinkKafkaParameters;
		}

		public void setSinkKafkaParameters(SinkKafkaParameters sinkKafkaParameters) {
			this.sinkKafkaParameters = sinkKafkaParameters;
		}

		public SinkFcParameters getSinkFcParameters() {
			return this.sinkFcParameters;
		}

		public void setSinkFcParameters(SinkFcParameters sinkFcParameters) {
			this.sinkFcParameters = sinkFcParameters;
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

		public static class SinkDataHubParameters {

			@SerializedName("RoleName")
			private RoleName roleName;

			@SerializedName("Project")
			private Project project;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("TopicType")
			private TopicType topicType;

			@SerializedName("Body")
			private Body body;

			@SerializedName("TopicSchema")
			private TopicSchema topicSchema;

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
		}

		public static class SinkKafkaParameters {

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

		public static class SinkFcParameters {

			@SerializedName("InvocationType")
			private InvocationType invocationType;

			@SerializedName("FunctionName")
			private FunctionName functionName;

			@SerializedName("Qualifier")
			private Qualifier qualifier;

			@SerializedName("ServiceName")
			private ServiceName serviceName;

			@SerializedName("Body")
			private Body body;

			public InvocationType getInvocationType() {
				return this.invocationType;
			}

			public void setInvocationType(InvocationType invocationType) {
				this.invocationType = invocationType;
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
		}

		public static class SinkSLSParameters {

			@SerializedName("RoleName")
			private RoleName roleName;

			@SerializedName("Project")
			private Project project;

			@SerializedName("Topic")
			private Topic topic;

			@SerializedName("Body")
			private Body body;

			@SerializedName("LogStore")
			private LogStore logStore;

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
		}

		public static class SinkRocketMQParameters {

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

			@SerializedName("Properties")
			private Properties properties;

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

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
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
	}

	public static class Source {

		@SerializedName("SourceMQTTParameters")
		private SourceMQTTParameters sourceMQTTParameters;

		@SerializedName("SourceRocketMQParameters")
		private SourceRocketMQParameters sourceRocketMQParameters;

		@SerializedName("SourceSLSParameters")
		private SourceSLSParameters sourceSLSParameters;

		@SerializedName("SourceDTSParameters")
		private SourceDTSParameters sourceDTSParameters;

		@SerializedName("SourceKafkaParameters")
		private SourceKafkaParameters sourceKafkaParameters;

		@SerializedName("SourceMNSParameters")
		private SourceMNSParameters sourceMNSParameters;

		@SerializedName("SourceRabbitMQParameters")
		private SourceRabbitMQParameters sourceRabbitMQParameters;

		public SourceMQTTParameters getSourceMQTTParameters() {
			return this.sourceMQTTParameters;
		}

		public void setSourceMQTTParameters(SourceMQTTParameters sourceMQTTParameters) {
			this.sourceMQTTParameters = sourceMQTTParameters;
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

		public SourceDTSParameters getSourceDTSParameters() {
			return this.sourceDTSParameters;
		}

		public void setSourceDTSParameters(SourceDTSParameters sourceDTSParameters) {
			this.sourceDTSParameters = sourceDTSParameters;
		}

		public SourceKafkaParameters getSourceKafkaParameters() {
			return this.sourceKafkaParameters;
		}

		public void setSourceKafkaParameters(SourceKafkaParameters sourceKafkaParameters) {
			this.sourceKafkaParameters = sourceKafkaParameters;
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

		public static class SourceMQTTParameters {

			@SerializedName("InstanceId")
			private String instanceId;

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

		public static class SourceRocketMQParameters {

			@SerializedName("FilterSql")
			private String filterSql;

			@SerializedName("InstanceSecurityGroupId")
			private String instanceSecurityGroupId;

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

			@SerializedName("Network")
			private String network;

			@SerializedName("AuthType")
			private String authType;

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

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
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

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
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
	}

	public static class RunOptions {

		@SerializedName("BatchWindow")
		private BatchWindow batchWindow;

		@SerializedName("RetryStrategy")
		private RetryStrategy retryStrategy;

		@SerializedName("DeadLetterQueue")
		private DeadLetterQueue deadLetterQueue;

		@SerializedName("MaximumTasks")
		private Long maximumTasks;

		@SerializedName("ErrorsTolerance")
		private String errorsTolerance;

		public BatchWindow getBatchWindow() {
			return this.batchWindow;
		}

		public void setBatchWindow(BatchWindow batchWindow) {
			this.batchWindow = batchWindow;
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

		public Long getMaximumTasks() {
			return this.maximumTasks;
		}

		public void setMaximumTasks(Long maximumTasks) {
			this.maximumTasks = maximumTasks;
		}

		public String getErrorsTolerance() {
			return this.errorsTolerance;
		}

		public void setErrorsTolerance(String errorsTolerance) {
			this.errorsTolerance = errorsTolerance;
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

		public static class DeadLetterQueue {

			@SerializedName("Arn")
			private String arn;

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}
		}
	}

	@Override
	public Class<CreateEventStreamingResponse> getResponseClass() {
		return CreateEventStreamingResponse.class;
	}

}
