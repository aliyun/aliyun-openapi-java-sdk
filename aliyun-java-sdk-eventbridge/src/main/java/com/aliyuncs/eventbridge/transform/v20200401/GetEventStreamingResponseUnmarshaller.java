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

package com.aliyuncs.eventbridge.transform.v20200401;

import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.RunOptions;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.RunOptions.BatchWindow;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.RunOptions.DeadLetterQueue;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.RunOptions.RetryStrategy;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.Body3;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.Concurrency;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.FunctionName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.InvocationType;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.Qualifier;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFcParameters.ServiceName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFnfParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFnfParameters.ExecutionName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFnfParameters.FlowName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFnfParameters.Input;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkFnfParameters.RoleName11;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Acks;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.InstanceId4;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Key;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.SaslUser;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Topic;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Value;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkMNSParameters.Body;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkMNSParameters.IsBase64Encode;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkMNSParameters.QueueName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Body2;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Exchange;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.InstanceId;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.MessageId;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Properties;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.QueueName1;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.RoutingKey;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.TargetType;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.VirtualHostName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Body7;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.InstanceId5;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Keys;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Properties8;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Tags;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Topic6;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Body10;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters.LogStore;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Project;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters.RoleName;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Topic9;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceDTSParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceMQTTParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.GetEventStreamingResponse.Data.Source.SourceSLSParameters;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventStreamingResponseUnmarshaller {

	public static GetEventStreamingResponse unmarshall(GetEventStreamingResponse getEventStreamingResponse, UnmarshallerContext _ctx) {
		
		getEventStreamingResponse.setRequestId(_ctx.stringValue("GetEventStreamingResponse.RequestId"));
		getEventStreamingResponse.setMessage(_ctx.stringValue("GetEventStreamingResponse.Message"));
		getEventStreamingResponse.setCode(_ctx.stringValue("GetEventStreamingResponse.Code"));
		getEventStreamingResponse.setSuccess(_ctx.booleanValue("GetEventStreamingResponse.Success"));

		Data data = new Data();
		data.setEventStreamingName(_ctx.stringValue("GetEventStreamingResponse.Data.EventStreamingName"));
		data.setDescription(_ctx.stringValue("GetEventStreamingResponse.Data.Description"));
		data.setFilterPattern(_ctx.stringValue("GetEventStreamingResponse.Data.FilterPattern"));
		data.setTag(_ctx.stringValue("GetEventStreamingResponse.Data.Tag"));
		data.setStatus(_ctx.stringValue("GetEventStreamingResponse.Data.Status"));

		Source source = new Source();

		SourceMNSParameters sourceMNSParameters = new SourceMNSParameters();
		sourceMNSParameters.setRegionId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceMNSParameters.RegionId"));
		sourceMNSParameters.setQueueName(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceMNSParameters.QueueName"));
		sourceMNSParameters.setIsBase64Decode(_ctx.booleanValue("GetEventStreamingResponse.Data.Source.SourceMNSParameters.IsBase64Decode"));
		source.setSourceMNSParameters(sourceMNSParameters);

		SourceRabbitMQParameters sourceRabbitMQParameters = new SourceRabbitMQParameters();
		sourceRabbitMQParameters.setRegionId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRabbitMQParameters.RegionId"));
		sourceRabbitMQParameters.setInstanceId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRabbitMQParameters.InstanceId"));
		sourceRabbitMQParameters.setVirtualHostName(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRabbitMQParameters.VirtualHostName"));
		sourceRabbitMQParameters.setQueueName(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRabbitMQParameters.QueueName"));
		source.setSourceRabbitMQParameters(sourceRabbitMQParameters);

		SourceRocketMQParameters sourceRocketMQParameters = new SourceRocketMQParameters();
		sourceRocketMQParameters.setRegionId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.RegionId"));
		sourceRocketMQParameters.setInstanceId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceId"));
		sourceRocketMQParameters.setTopic(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.Topic"));
		sourceRocketMQParameters.setTag(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.Tag"));
		sourceRocketMQParameters.setOffset(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.Offset"));
		sourceRocketMQParameters.setGroupID(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.GroupID"));
		sourceRocketMQParameters.setTimestamp(_ctx.longValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.Timestamp"));
		sourceRocketMQParameters.setInstanceType(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceType"));
		sourceRocketMQParameters.setInstanceEndpoint(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceEndpoint"));
		sourceRocketMQParameters.setAuthType(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.AuthType"));
		sourceRocketMQParameters.setInstanceUsername(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceUsername"));
		sourceRocketMQParameters.setInstancePassword(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstancePassword"));
		sourceRocketMQParameters.setInstanceVpcId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceVpcId"));
		sourceRocketMQParameters.setInstanceVSwitchIds(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceVSwitchIds"));
		sourceRocketMQParameters.setInstanceSecurityGroupId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceSecurityGroupId"));
		sourceRocketMQParameters.setInstanceNetwork(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceRocketMQParameters.InstanceNetwork"));
		source.setSourceRocketMQParameters(sourceRocketMQParameters);

		SourceKafkaParameters sourceKafkaParameters = new SourceKafkaParameters();
		sourceKafkaParameters.setRegionId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.RegionId"));
		sourceKafkaParameters.setInstanceId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.InstanceId"));
		sourceKafkaParameters.setTopic(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.Topic"));
		sourceKafkaParameters.setConsumerGroup(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.ConsumerGroup"));
		sourceKafkaParameters.setOffsetReset(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.OffsetReset"));
		sourceKafkaParameters.setNetwork(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.Network"));
		sourceKafkaParameters.setVpcId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.VpcId"));
		sourceKafkaParameters.setVSwitchIds(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.VSwitchIds"));
		sourceKafkaParameters.setSecurityGroupId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceKafkaParameters.SecurityGroupId"));
		source.setSourceKafkaParameters(sourceKafkaParameters);

		SourceMQTTParameters sourceMQTTParameters = new SourceMQTTParameters();
		sourceMQTTParameters.setRegionId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceMQTTParameters.RegionId"));
		sourceMQTTParameters.setInstanceId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceMQTTParameters.InstanceId"));
		sourceMQTTParameters.setTopic(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceMQTTParameters.Topic"));
		source.setSourceMQTTParameters(sourceMQTTParameters);

		SourceDTSParameters sourceDTSParameters = new SourceDTSParameters();
		sourceDTSParameters.setTaskId(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.TaskId"));
		sourceDTSParameters.setBrokerUrl(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.BrokerUrl"));
		sourceDTSParameters.setTopic(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.Topic"));
		sourceDTSParameters.setSid(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.Sid"));
		sourceDTSParameters.setUsername(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.Username"));
		sourceDTSParameters.setPassword(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.Password"));
		sourceDTSParameters.setInitCheckPoint(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceDTSParameters.InitCheckPoint"));
		source.setSourceDTSParameters(sourceDTSParameters);

		SourceSLSParameters sourceSLSParameters = new SourceSLSParameters();
		sourceSLSParameters.setProject(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceSLSParameters.Project"));
		sourceSLSParameters.setLogStore(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceSLSParameters.LogStore"));
		sourceSLSParameters.setConsumerGroup(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceSLSParameters.ConsumerGroup"));
		sourceSLSParameters.setConsumePosition(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceSLSParameters.ConsumePosition"));
		sourceSLSParameters.setRoleName(_ctx.stringValue("GetEventStreamingResponse.Data.Source.SourceSLSParameters.RoleName"));
		source.setSourceSLSParameters(sourceSLSParameters);
		data.setSource(source);

		Sink sink = new Sink();

		SinkMNSParameters sinkMNSParameters = new SinkMNSParameters();

		QueueName queueName = new QueueName();
		queueName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.QueueName.Value"));
		queueName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.QueueName.Form"));
		queueName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.QueueName.Template"));
		sinkMNSParameters.setQueueName(queueName);

		Body body = new Body();
		body.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.Body.Value"));
		body.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.Body.Form"));
		body.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.Body.Template"));
		sinkMNSParameters.setBody(body);

		IsBase64Encode isBase64Encode = new IsBase64Encode();
		isBase64Encode.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.IsBase64Encode.Value"));
		isBase64Encode.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.IsBase64Encode.Form"));
		isBase64Encode.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkMNSParameters.IsBase64Encode.Template"));
		sinkMNSParameters.setIsBase64Encode(isBase64Encode);
		sink.setSinkMNSParameters(sinkMNSParameters);

		SinkRabbitMQParameters sinkRabbitMQParameters = new SinkRabbitMQParameters();

		InstanceId instanceId = new InstanceId();
		instanceId.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.InstanceId.Value"));
		instanceId.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.InstanceId.Form"));
		instanceId.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.InstanceId.Template"));
		sinkRabbitMQParameters.setInstanceId(instanceId);

		VirtualHostName virtualHostName = new VirtualHostName();
		virtualHostName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.VirtualHostName.Value"));
		virtualHostName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.VirtualHostName.Form"));
		virtualHostName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.VirtualHostName.Template"));
		sinkRabbitMQParameters.setVirtualHostName(virtualHostName);

		TargetType targetType = new TargetType();
		targetType.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.TargetType.Value"));
		targetType.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.TargetType.Form"));
		targetType.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.TargetType.Template"));
		sinkRabbitMQParameters.setTargetType(targetType);

		Exchange exchange = new Exchange();
		exchange.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Exchange.Value"));
		exchange.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Exchange.Form"));
		exchange.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Exchange.Template"));
		sinkRabbitMQParameters.setExchange(exchange);

		RoutingKey routingKey = new RoutingKey();
		routingKey.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.RoutingKey.Value"));
		routingKey.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.RoutingKey.Form"));
		routingKey.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.RoutingKey.Template"));
		sinkRabbitMQParameters.setRoutingKey(routingKey);

		QueueName1 queueName1 = new QueueName1();
		queueName1.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.QueueName.Value"));
		queueName1.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.QueueName.Form"));
		queueName1.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.QueueName.Template"));
		sinkRabbitMQParameters.setQueueName1(queueName1);

		Body2 body2 = new Body2();
		body2.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Body.Value"));
		body2.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Body.Form"));
		body2.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Body.Template"));
		sinkRabbitMQParameters.setBody2(body2);

		MessageId messageId = new MessageId();
		messageId.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.MessageId.Value"));
		messageId.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.MessageId.Form"));
		messageId.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.MessageId.Template"));
		sinkRabbitMQParameters.setMessageId(messageId);

		Properties properties = new Properties();
		properties.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Properties.Value"));
		properties.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Properties.Form"));
		properties.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRabbitMQParameters.Properties.Template"));
		sinkRabbitMQParameters.setProperties(properties);
		sink.setSinkRabbitMQParameters(sinkRabbitMQParameters);

		SinkFcParameters sinkFcParameters = new SinkFcParameters();

		ServiceName serviceName = new ServiceName();
		serviceName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.ServiceName.Value"));
		serviceName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.ServiceName.Form"));
		serviceName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.ServiceName.Template"));
		sinkFcParameters.setServiceName(serviceName);

		FunctionName functionName = new FunctionName();
		functionName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.FunctionName.Value"));
		functionName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.FunctionName.Form"));
		functionName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.FunctionName.Template"));
		sinkFcParameters.setFunctionName(functionName);

		Concurrency concurrency = new Concurrency();
		concurrency.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Concurrency.Value"));
		concurrency.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Concurrency.Form"));
		concurrency.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Concurrency.Template"));
		sinkFcParameters.setConcurrency(concurrency);

		Qualifier qualifier = new Qualifier();
		qualifier.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Qualifier.Value"));
		qualifier.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Qualifier.Form"));
		qualifier.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Qualifier.Template"));
		sinkFcParameters.setQualifier(qualifier);

		InvocationType invocationType = new InvocationType();
		invocationType.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.InvocationType.Value"));
		invocationType.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.InvocationType.Form"));
		invocationType.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.InvocationType.Template"));
		sinkFcParameters.setInvocationType(invocationType);

		Body3 body3 = new Body3();
		body3.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Body.Value"));
		body3.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Body.Form"));
		body3.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFcParameters.Body.Template"));
		sinkFcParameters.setBody3(body3);
		sink.setSinkFcParameters(sinkFcParameters);

		SinkKafkaParameters sinkKafkaParameters = new SinkKafkaParameters();

		InstanceId4 instanceId4 = new InstanceId4();
		instanceId4.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.InstanceId.Value"));
		instanceId4.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.InstanceId.Form"));
		instanceId4.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.InstanceId.Template"));
		sinkKafkaParameters.setInstanceId4(instanceId4);

		Topic topic = new Topic();
		topic.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Topic.Value"));
		topic.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Topic.Form"));
		topic.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Topic.Template"));
		sinkKafkaParameters.setTopic(topic);

		Acks acks = new Acks();
		acks.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Acks.Value"));
		acks.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Acks.Form"));
		acks.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Acks.Template"));
		sinkKafkaParameters.setAcks(acks);

		Key key = new Key();
		key.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Key.Value"));
		key.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Key.Form"));
		key.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Key.Template"));
		sinkKafkaParameters.setKey(key);

		Value value = new Value();
		value.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Value.Value"));
		value.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Value.Form"));
		value.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.Value.Template"));
		sinkKafkaParameters.setValue(value);

		SaslUser saslUser = new SaslUser();
		saslUser.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.SaslUser.Value"));
		saslUser.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.SaslUser.Form"));
		saslUser.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkKafkaParameters.SaslUser.Template"));
		sinkKafkaParameters.setSaslUser(saslUser);
		sink.setSinkKafkaParameters(sinkKafkaParameters);

		SinkRocketMQParameters sinkRocketMQParameters = new SinkRocketMQParameters();

		InstanceId5 instanceId5 = new InstanceId5();
		instanceId5.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.InstanceId.Value"));
		instanceId5.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.InstanceId.Form"));
		instanceId5.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.InstanceId.Template"));
		sinkRocketMQParameters.setInstanceId5(instanceId5);

		Topic6 topic6 = new Topic6();
		topic6.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Topic.Value"));
		topic6.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Topic.Form"));
		topic6.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Topic.Template"));
		sinkRocketMQParameters.setTopic6(topic6);

		Body7 body7 = new Body7();
		body7.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Body.Value"));
		body7.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Body.Form"));
		body7.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Body.Template"));
		sinkRocketMQParameters.setBody7(body7);

		Properties8 properties8 = new Properties8();
		properties8.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Properties.Value"));
		properties8.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Properties.Form"));
		properties8.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Properties.Template"));
		sinkRocketMQParameters.setProperties8(properties8);

		Keys keys = new Keys();
		keys.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Keys.Value"));
		keys.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Keys.Form"));
		keys.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Keys.Template"));
		sinkRocketMQParameters.setKeys(keys);

		Tags tags = new Tags();
		tags.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Tags.Value"));
		tags.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Tags.Form"));
		tags.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkRocketMQParameters.Tags.Template"));
		sinkRocketMQParameters.setTags(tags);
		sink.setSinkRocketMQParameters(sinkRocketMQParameters);

		SinkSLSParameters sinkSLSParameters = new SinkSLSParameters();

		Project project = new Project();
		project.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Project.Value"));
		project.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Project.Form"));
		project.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Project.Template"));
		sinkSLSParameters.setProject(project);

		LogStore logStore = new LogStore();
		logStore.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.LogStore.Value"));
		logStore.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.LogStore.Form"));
		logStore.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.LogStore.Template"));
		sinkSLSParameters.setLogStore(logStore);

		Topic9 topic9 = new Topic9();
		topic9.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Topic.Value"));
		topic9.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Topic.Form"));
		topic9.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Topic.Template"));
		sinkSLSParameters.setTopic9(topic9);

		Body10 body10 = new Body10();
		body10.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Body.Value"));
		body10.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Body.Form"));
		body10.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.Body.Template"));
		sinkSLSParameters.setBody10(body10);

		RoleName roleName = new RoleName();
		roleName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.RoleName.Value"));
		roleName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.RoleName.Form"));
		roleName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkSLSParameters.RoleName.Template"));
		sinkSLSParameters.setRoleName(roleName);
		sink.setSinkSLSParameters(sinkSLSParameters);

		SinkFnfParameters sinkFnfParameters = new SinkFnfParameters();

		FlowName flowName = new FlowName();
		flowName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.FlowName.Value"));
		flowName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.FlowName.Form"));
		flowName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.FlowName.Template"));
		sinkFnfParameters.setFlowName(flowName);

		ExecutionName executionName = new ExecutionName();
		executionName.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.ExecutionName.Value"));
		executionName.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.ExecutionName.Form"));
		executionName.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.ExecutionName.Template"));
		sinkFnfParameters.setExecutionName(executionName);

		Input input = new Input();
		input.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.Input.Value"));
		input.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.Input.Form"));
		input.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.Input.Template"));
		sinkFnfParameters.setInput(input);

		RoleName11 roleName11 = new RoleName11();
		roleName11.setValue(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.RoleName.Value"));
		roleName11.setForm(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.RoleName.Form"));
		roleName11.setTemplate(_ctx.stringValue("GetEventStreamingResponse.Data.Sink.SinkFnfParameters.RoleName.Template"));
		sinkFnfParameters.setRoleName11(roleName11);
		sink.setSinkFnfParameters(sinkFnfParameters);
		data.setSink(sink);

		RunOptions runOptions = new RunOptions();
		runOptions.setMaximumTasks(_ctx.integerValue("GetEventStreamingResponse.Data.RunOptions.MaximumTasks"));
		runOptions.setErrorsTolerance(_ctx.stringValue("GetEventStreamingResponse.Data.RunOptions.ErrorsTolerance"));

		RetryStrategy retryStrategy = new RetryStrategy();
		retryStrategy.setPushRetryStrategy(_ctx.stringValue("GetEventStreamingResponse.Data.RunOptions.RetryStrategy.PushRetryStrategy"));
		retryStrategy.setMaximumEventAgeInSeconds(_ctx.floatValue("GetEventStreamingResponse.Data.RunOptions.RetryStrategy.MaximumEventAgeInSeconds"));
		retryStrategy.setMaximumRetryAttempts(_ctx.floatValue("GetEventStreamingResponse.Data.RunOptions.RetryStrategy.MaximumRetryAttempts"));
		runOptions.setRetryStrategy(retryStrategy);

		DeadLetterQueue deadLetterQueue = new DeadLetterQueue();
		deadLetterQueue.setArn(_ctx.stringValue("GetEventStreamingResponse.Data.RunOptions.DeadLetterQueue.Arn"));
		runOptions.setDeadLetterQueue(deadLetterQueue);

		BatchWindow batchWindow = new BatchWindow();
		batchWindow.setCountBasedWindow(_ctx.integerValue("GetEventStreamingResponse.Data.RunOptions.BatchWindow.CountBasedWindow"));
		batchWindow.setTimeBasedWindow(_ctx.integerValue("GetEventStreamingResponse.Data.RunOptions.BatchWindow.TimeBasedWindow"));
		runOptions.setBatchWindow(batchWindow);
		data.setRunOptions(runOptions);
		getEventStreamingResponse.setData(data);
	 
	 	return getEventStreamingResponse;
	}
}