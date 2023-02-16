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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.BatchWindow;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.DeadLetterQueue;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.RetryStrategy;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.Body1;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.FunctionName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.InvocationType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.Qualifier;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.ServiceName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Acks;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.InstanceId4;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Key;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.SaslUser;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Topic;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Value;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.Body;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.IsBase64Encode;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.QueueName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Body3;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Exchange;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.InstanceId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.MessageId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Properties;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.QueueName2;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.RoutingKey;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.TargetType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.VirtualHostName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Body7;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstanceId5;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Keys;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Properties8;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Tags;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Topic6;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Body10;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.LogStore;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Project;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.RoleName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Topic9;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceDTSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceMQTTParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceSLSParameters;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventStreamingsResponseUnmarshaller {

	public static ListEventStreamingsResponse unmarshall(ListEventStreamingsResponse listEventStreamingsResponse, UnmarshallerContext _ctx) {
		
		listEventStreamingsResponse.setRequestId(_ctx.stringValue("ListEventStreamingsResponse.RequestId"));
		listEventStreamingsResponse.setMessage(_ctx.stringValue("ListEventStreamingsResponse.Message"));
		listEventStreamingsResponse.setCode(_ctx.stringValue("ListEventStreamingsResponse.Code"));
		listEventStreamingsResponse.setSuccess(_ctx.booleanValue("ListEventStreamingsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListEventStreamingsResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("ListEventStreamingsResponse.Data.Total"));

		List<EventStreamingsItem> eventStreamings = new ArrayList<EventStreamingsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings.Length"); i++) {
			EventStreamingsItem eventStreamingsItem = new EventStreamingsItem();
			eventStreamingsItem.setEventStreamingName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].EventStreamingName"));
			eventStreamingsItem.setDescription(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Description"));
			eventStreamingsItem.setFilterPattern(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].FilterPattern"));
			eventStreamingsItem.setTag(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Tag"));
			eventStreamingsItem.setStatus(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Status"));

			Source source = new Source();

			SourceMNSParameters sourceMNSParameters = new SourceMNSParameters();
			sourceMNSParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMNSParameters.RegionId"));
			sourceMNSParameters.setQueueName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMNSParameters.QueueName"));
			sourceMNSParameters.setIsBase64Decode(_ctx.booleanValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMNSParameters.IsBase64Decode"));
			source.setSourceMNSParameters(sourceMNSParameters);

			SourceRabbitMQParameters sourceRabbitMQParameters = new SourceRabbitMQParameters();
			sourceRabbitMQParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRabbitMQParameters.RegionId"));
			sourceRabbitMQParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRabbitMQParameters.InstanceId"));
			sourceRabbitMQParameters.setVirtualHostName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRabbitMQParameters.VirtualHostName"));
			sourceRabbitMQParameters.setQueueName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRabbitMQParameters.QueueName"));
			source.setSourceRabbitMQParameters(sourceRabbitMQParameters);

			SourceRocketMQParameters sourceRocketMQParameters = new SourceRocketMQParameters();
			sourceRocketMQParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.RegionId"));
			sourceRocketMQParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceId"));
			sourceRocketMQParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.Topic"));
			sourceRocketMQParameters.setTag(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.Tag"));
			sourceRocketMQParameters.setOffset(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.Offset"));
			sourceRocketMQParameters.setGroupID(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.GroupID"));
			sourceRocketMQParameters.setTimestamp(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.Timestamp"));
			source.setSourceRocketMQParameters(sourceRocketMQParameters);

			SourceKafkaParameters sourceKafkaParameters = new SourceKafkaParameters();
			sourceKafkaParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.RegionId"));
			sourceKafkaParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.InstanceId"));
			sourceKafkaParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.Topic"));
			sourceKafkaParameters.setConsumerGroup(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.ConsumerGroup"));
			sourceKafkaParameters.setOffsetReset(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.OffsetReset"));
			sourceKafkaParameters.setNetwork(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.Network"));
			sourceKafkaParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.VpcId"));
			sourceKafkaParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.VSwitchIds"));
			sourceKafkaParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.SecurityGroupId"));
			source.setSourceKafkaParameters(sourceKafkaParameters);

			SourceMQTTParameters sourceMQTTParameters = new SourceMQTTParameters();
			sourceMQTTParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.RegionId"));
			sourceMQTTParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.InstanceId"));
			sourceMQTTParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.Topic"));
			source.setSourceMQTTParameters(sourceMQTTParameters);

			SourceDTSParameters sourceDTSParameters = new SourceDTSParameters();
			sourceDTSParameters.setTaskId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.TaskId"));
			sourceDTSParameters.setBrokerUrl(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.BrokerUrl"));
			sourceDTSParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.Topic"));
			sourceDTSParameters.setSid(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.Sid"));
			sourceDTSParameters.setUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.Username"));
			sourceDTSParameters.setPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.Password"));
			sourceDTSParameters.setInitCheckPoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceDTSParameters.InitCheckPoint"));
			source.setSourceDTSParameters(sourceDTSParameters);

			SourceSLSParameters sourceSLSParameters = new SourceSLSParameters();
			sourceSLSParameters.setProject(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceSLSParameters.Project"));
			sourceSLSParameters.setLogStore(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceSLSParameters.LogStore"));
			sourceSLSParameters.setConsumerGroup(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceSLSParameters.ConsumerGroup"));
			sourceSLSParameters.setConsumePosition(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceSLSParameters.ConsumePosition"));
			sourceSLSParameters.setRoleName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceSLSParameters.RoleName"));
			source.setSourceSLSParameters(sourceSLSParameters);
			eventStreamingsItem.setSource(source);

			Sink sink = new Sink();

			SinkMNSParameters sinkMNSParameters = new SinkMNSParameters();

			QueueName queueName = new QueueName();
			queueName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.QueueName.Value"));
			queueName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.QueueName.Form"));
			queueName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.QueueName.Template"));
			sinkMNSParameters.setQueueName(queueName);

			Body body = new Body();
			body.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.Body.Value"));
			body.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.Body.Form"));
			body.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.Body.Template"));
			sinkMNSParameters.setBody(body);

			IsBase64Encode isBase64Encode = new IsBase64Encode();
			isBase64Encode.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.IsBase64Encode.Value"));
			isBase64Encode.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.IsBase64Encode.Form"));
			isBase64Encode.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkMNSParameters.IsBase64Encode.Template"));
			sinkMNSParameters.setIsBase64Encode(isBase64Encode);
			sink.setSinkMNSParameters(sinkMNSParameters);

			SinkFcParameters sinkFcParameters = new SinkFcParameters();

			ServiceName serviceName = new ServiceName();
			serviceName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.ServiceName.Value"));
			serviceName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.ServiceName.Form"));
			serviceName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.ServiceName.Template"));
			sinkFcParameters.setServiceName(serviceName);

			FunctionName functionName = new FunctionName();
			functionName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.FunctionName.Value"));
			functionName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.FunctionName.Form"));
			functionName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.FunctionName.Template"));
			sinkFcParameters.setFunctionName(functionName);

			Qualifier qualifier = new Qualifier();
			qualifier.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Qualifier.Value"));
			qualifier.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Qualifier.Form"));
			qualifier.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Qualifier.Template"));
			sinkFcParameters.setQualifier(qualifier);

			InvocationType invocationType = new InvocationType();
			invocationType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.InvocationType.Value"));
			invocationType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.InvocationType.Form"));
			invocationType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.InvocationType.Template"));
			sinkFcParameters.setInvocationType(invocationType);

			Body1 body1 = new Body1();
			body1.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Value"));
			body1.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Form"));
			body1.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Template"));
			sinkFcParameters.setBody1(body1);
			sink.setSinkFcParameters(sinkFcParameters);

			SinkRabbitMQParameters sinkRabbitMQParameters = new SinkRabbitMQParameters();

			InstanceId instanceId = new InstanceId();
			instanceId.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.InstanceId.Value"));
			instanceId.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.InstanceId.Form"));
			instanceId.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.InstanceId.Template"));
			sinkRabbitMQParameters.setInstanceId(instanceId);

			VirtualHostName virtualHostName = new VirtualHostName();
			virtualHostName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.VirtualHostName.Value"));
			virtualHostName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.VirtualHostName.Form"));
			virtualHostName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.VirtualHostName.Template"));
			sinkRabbitMQParameters.setVirtualHostName(virtualHostName);

			TargetType targetType = new TargetType();
			targetType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.TargetType.Value"));
			targetType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.TargetType.Form"));
			targetType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.TargetType.Template"));
			sinkRabbitMQParameters.setTargetType(targetType);

			Exchange exchange = new Exchange();
			exchange.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Exchange.Value"));
			exchange.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Exchange.Form"));
			exchange.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Exchange.Template"));
			sinkRabbitMQParameters.setExchange(exchange);

			RoutingKey routingKey = new RoutingKey();
			routingKey.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.RoutingKey.Value"));
			routingKey.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.RoutingKey.Form"));
			routingKey.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.RoutingKey.Template"));
			sinkRabbitMQParameters.setRoutingKey(routingKey);

			QueueName2 queueName2 = new QueueName2();
			queueName2.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Value"));
			queueName2.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Form"));
			queueName2.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Template"));
			sinkRabbitMQParameters.setQueueName2(queueName2);

			Body3 body3 = new Body3();
			body3.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Value"));
			body3.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Form"));
			body3.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Template"));
			sinkRabbitMQParameters.setBody3(body3);

			MessageId messageId = new MessageId();
			messageId.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.MessageId.Value"));
			messageId.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.MessageId.Form"));
			messageId.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.MessageId.Template"));
			sinkRabbitMQParameters.setMessageId(messageId);

			Properties properties = new Properties();
			properties.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Properties.Value"));
			properties.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Properties.Form"));
			properties.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Properties.Template"));
			sinkRabbitMQParameters.setProperties(properties);
			sink.setSinkRabbitMQParameters(sinkRabbitMQParameters);

			SinkKafkaParameters sinkKafkaParameters = new SinkKafkaParameters();

			InstanceId4 instanceId4 = new InstanceId4();
			instanceId4.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Value"));
			instanceId4.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Form"));
			instanceId4.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Template"));
			sinkKafkaParameters.setInstanceId4(instanceId4);

			Topic topic = new Topic();
			topic.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Topic.Value"));
			topic.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Topic.Form"));
			topic.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Topic.Template"));
			sinkKafkaParameters.setTopic(topic);

			Acks acks = new Acks();
			acks.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Acks.Value"));
			acks.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Acks.Form"));
			acks.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Acks.Template"));
			sinkKafkaParameters.setAcks(acks);

			Key key = new Key();
			key.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Key.Value"));
			key.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Key.Form"));
			key.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Key.Template"));
			sinkKafkaParameters.setKey(key);

			Value value = new Value();
			value.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Value.Value"));
			value.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Value.Form"));
			value.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.Value.Template"));
			sinkKafkaParameters.setValue(value);

			SaslUser saslUser = new SaslUser();
			saslUser.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.SaslUser.Value"));
			saslUser.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.SaslUser.Form"));
			saslUser.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.SaslUser.Template"));
			sinkKafkaParameters.setSaslUser(saslUser);
			sink.setSinkKafkaParameters(sinkKafkaParameters);

			SinkRocketMQParameters sinkRocketMQParameters = new SinkRocketMQParameters();

			InstanceId5 instanceId5 = new InstanceId5();
			instanceId5.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Value"));
			instanceId5.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Form"));
			instanceId5.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Template"));
			sinkRocketMQParameters.setInstanceId5(instanceId5);

			Topic6 topic6 = new Topic6();
			topic6.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Value"));
			topic6.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Form"));
			topic6.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Template"));
			sinkRocketMQParameters.setTopic6(topic6);

			Body7 body7 = new Body7();
			body7.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Value"));
			body7.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Form"));
			body7.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Template"));
			sinkRocketMQParameters.setBody7(body7);

			Properties8 properties8 = new Properties8();
			properties8.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Value"));
			properties8.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Form"));
			properties8.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Template"));
			sinkRocketMQParameters.setProperties8(properties8);

			Keys keys = new Keys();
			keys.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Value"));
			keys.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Form"));
			keys.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Template"));
			sinkRocketMQParameters.setKeys(keys);

			Tags tags = new Tags();
			tags.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Value"));
			tags.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Form"));
			tags.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Template"));
			sinkRocketMQParameters.setTags(tags);
			sink.setSinkRocketMQParameters(sinkRocketMQParameters);

			SinkSLSParameters sinkSLSParameters = new SinkSLSParameters();

			Project project = new Project();
			project.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Project.Value"));
			project.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Project.Form"));
			project.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Project.Template"));
			sinkSLSParameters.setProject(project);

			LogStore logStore = new LogStore();
			logStore.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.LogStore.Value"));
			logStore.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.LogStore.Form"));
			logStore.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.LogStore.Template"));
			sinkSLSParameters.setLogStore(logStore);

			Topic9 topic9 = new Topic9();
			topic9.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Value"));
			topic9.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Form"));
			topic9.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Template"));
			sinkSLSParameters.setTopic9(topic9);

			Body10 body10 = new Body10();
			body10.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Value"));
			body10.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Form"));
			body10.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Template"));
			sinkSLSParameters.setBody10(body10);

			RoleName roleName = new RoleName();
			roleName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Value"));
			roleName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Form"));
			roleName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Template"));
			sinkSLSParameters.setRoleName(roleName);
			sink.setSinkSLSParameters(sinkSLSParameters);
			eventStreamingsItem.setSink(sink);

			RunOptions runOptions = new RunOptions();
			runOptions.setMaximumTasks(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.MaximumTasks"));
			runOptions.setErrorsTolerance(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ErrorsTolerance"));

			RetryStrategy retryStrategy = new RetryStrategy();
			retryStrategy.setPushRetryStrategy(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.PushRetryStrategy"));
			retryStrategy.setMaximumEventAgeInSeconds(_ctx.floatValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.MaximumEventAgeInSeconds"));
			retryStrategy.setMaximumRetryAttempts(_ctx.floatValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.MaximumRetryAttempts"));
			runOptions.setRetryStrategy(retryStrategy);

			DeadLetterQueue deadLetterQueue = new DeadLetterQueue();
			deadLetterQueue.setArn(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.Arn"));
			runOptions.setDeadLetterQueue(deadLetterQueue);

			BatchWindow batchWindow = new BatchWindow();
			batchWindow.setCountBasedWindow(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BatchWindow.CountBasedWindow"));
			batchWindow.setTimeBasedWindow(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BatchWindow.TimeBasedWindow"));
			runOptions.setBatchWindow(batchWindow);
			eventStreamingsItem.setRunOptions(runOptions);

			eventStreamings.add(eventStreamingsItem);
		}
		data.setEventStreamings(eventStreamings);
		listEventStreamingsResponse.setData(data);
	 
	 	return listEventStreamingsResponse;
	}
}