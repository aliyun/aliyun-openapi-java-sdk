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
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.BusinessOption;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.DeadLetterQueue;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.LogDelivery;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.LogDelivery.KafkaLogParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.LogDelivery.SLSLogParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.Network40;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.ResourceSpec;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.ResourceSpec.ResourcesItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.RetryStrategy;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.ScaledObject;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.ScaledObject.TriggersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.RunOptions.ScaledObject.TriggersItem.Metadata;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.Key6;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.NetworkType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.SecurityGroupId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.VSwitchIds;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.Value7;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheKafkaParameters.VpcId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheRocketMQCheckpointParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheRocketMQCheckpointParameters.ConsumeTimestamp24;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheRocketMQCheckpointParameters.Group23;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApacheRocketMQCheckpointParameters.Topic22;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApiDestinationParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApiDestinationParameters.BodyParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApiDestinationParameters.HeaderParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkApiDestinationParameters.QueryStringParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters.After;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters.Before;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters.Offset;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters.Op;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkBaiLianParameters.Partition38;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkCustomizedKafkaConnectorParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkCustomizedKafkaConnectorParameters.ConnectorParameters32;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkCustomizedKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.DashVectorSchemaParametersItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.DashVectorSchemaParametersItem.Name;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.DashVectorSchemaParametersItem.Type;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.DashVectorSchemaParametersItem.Value33;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.Partition;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.PrimaryKeyId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDashVectorParameters.Vector;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.Body30;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.Project28;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.RoleName31;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.Topic29;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.TopicSchema;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDataHubParameters.TopicType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.BeHttpEndpoint;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.Body16;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.Database;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.FeHttpEndpoint;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.NetworkType17;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.Password;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.QueryEndpoint;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.SecurityGroupId20;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.Table;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.UserName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.VSwitchIds19;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkDorisParameters.VpcId18;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.Body2;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.Concurrency;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.DataFormat;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.FunctionName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.InvocationType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.Qualifier;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFcParameters.ServiceName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFnfParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFnfParameters.ExecutionName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFnfParameters.FlowName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFnfParameters.Input;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkFnfParameters.RoleName27;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkHttpsParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkHttpsParameters.Body39;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkHttpsParameters.URL;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Acks;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.InstanceId5;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Key;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.SaslUser;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Topic;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkKafkaParameters.Value;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.Body;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.IsBase64Encode;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkMNSParameters.QueueName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkOpenSourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkOpenSourceRabbitMQParameters.Body35;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkOpenSourceRabbitMQParameters.MessageId36;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkOpenSourceRabbitMQParameters.Properties37;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkOpenSourceRabbitMQParameters.RoutingKey34;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Body4;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Exchange;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.InstanceId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.MessageId;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.Properties;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.QueueName3;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.RoutingKey;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.TargetType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRabbitMQParameters.VirtualHostName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQCheckpointParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQCheckpointParameters.ConsumeTimestamp;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQCheckpointParameters.Group;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQCheckpointParameters.Topic21;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Body10;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.DeliveryOrderType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstanceEndpoint;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstanceId8;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstancePassword;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstanceType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.InstanceUsername;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Keys;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Network;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Properties11;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.SecurityGroupId15;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.ShardingKey;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Tags12;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.Topic9;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.VSwitchIds14;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkRocketMQParameters.VpcId13;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Body26;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.ContentSchema;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.ContentType;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.LogStore;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Project;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.RoleName;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Sink.SinkSLSParameters.Topic25;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceApacheKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceApacheRocketMQCheckpointParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceCustomizedKafkaConnectorParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceCustomizedKafkaConnectorParameters.ConnectorParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceCustomizedKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceDTSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceEventBusParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceMQTTParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceMySQLParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceOSSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceOpenSourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourcePrometheusParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceRocketMQCheckpointParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.Source.SourceSLSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TagsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TransformsItem;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TransformsItem.BaiLianAgentTransformParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TransformsItem.BaiLianAgentTransformParameters.Prompt;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TransformsItem.DashScopeTransformParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListEventStreamingsResponse.Data.EventStreamingsItem.TransformsItem.DashScopeTransformParameters.MessagesItem;
import java.util.Map;
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
			eventStreamingsItem.setStatus(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Status"));
			eventStreamingsItem.setTag(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Tag"));

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
			sourceRocketMQParameters.setInstanceType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceType"));
			sourceRocketMQParameters.setInstanceEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceEndpoint"));
			sourceRocketMQParameters.setAuthType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.AuthType"));
			sourceRocketMQParameters.setInstanceUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceUsername"));
			sourceRocketMQParameters.setInstancePassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstancePassword"));
			sourceRocketMQParameters.setInstanceVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceVpcId"));
			sourceRocketMQParameters.setInstanceVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceVSwitchIds"));
			sourceRocketMQParameters.setInstanceSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceSecurityGroupId"));
			sourceRocketMQParameters.setInstanceNetwork(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.InstanceNetwork"));
			sourceRocketMQParameters.setBodyDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.BodyDataType"));
			sourceRocketMQParameters.setNetwork(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.Network"));
			sourceRocketMQParameters.setFilterType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.FilterType"));
			sourceRocketMQParameters.setFilterSql(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.FilterSql"));
			sourceRocketMQParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.VpcId"));
			sourceRocketMQParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.VSwitchIds"));
			sourceRocketMQParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQParameters.SecurityGroupId"));
			source.setSourceRocketMQParameters(sourceRocketMQParameters);

			SourceRocketMQCheckpointParameters sourceRocketMQCheckpointParameters = new SourceRocketMQCheckpointParameters();
			sourceRocketMQCheckpointParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQCheckpointParameters.RegionId"));
			sourceRocketMQCheckpointParameters.setInstanceType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQCheckpointParameters.InstanceType"));
			sourceRocketMQCheckpointParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQCheckpointParameters.InstanceId"));

			List<String> topics = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQCheckpointParameters.Topics.Length"); j++) {
				topics.add(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceRocketMQCheckpointParameters.Topics["+ j +"]"));
			}
			sourceRocketMQCheckpointParameters.setTopics(topics);
			source.setSourceRocketMQCheckpointParameters(sourceRocketMQCheckpointParameters);

			SourceApacheRocketMQCheckpointParameters sourceApacheRocketMQCheckpointParameters = new SourceApacheRocketMQCheckpointParameters();
			sourceApacheRocketMQCheckpointParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.RegionId"));
			sourceApacheRocketMQCheckpointParameters.setInstanceEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.InstanceEndpoint"));
			sourceApacheRocketMQCheckpointParameters.setInstanceUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.InstanceUsername"));
			sourceApacheRocketMQCheckpointParameters.setInstancePassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.InstancePassword"));
			sourceApacheRocketMQCheckpointParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.NetworkType"));
			sourceApacheRocketMQCheckpointParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.VpcId"));
			sourceApacheRocketMQCheckpointParameters.setVSwitchId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.VSwitchId"));
			sourceApacheRocketMQCheckpointParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.SecurityGroupId"));

			List<String> topics1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.Topics.Length"); j++) {
				topics1.add(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheRocketMQCheckpointParameters.Topics["+ j +"]"));
			}
			sourceApacheRocketMQCheckpointParameters.setTopics1(topics1);
			source.setSourceApacheRocketMQCheckpointParameters(sourceApacheRocketMQCheckpointParameters);

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
			sourceKafkaParameters.setValueDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceKafkaParameters.ValueDataType"));
			source.setSourceKafkaParameters(sourceKafkaParameters);

			SourceMQTTParameters sourceMQTTParameters = new SourceMQTTParameters();
			sourceMQTTParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.RegionId"));
			sourceMQTTParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.InstanceId"));
			sourceMQTTParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.Topic"));
			sourceMQTTParameters.setBodyDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMQTTParameters.BodyDataType"));
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

			SourcePrometheusParameters sourcePrometheusParameters = new SourcePrometheusParameters();
			sourcePrometheusParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.RegionId"));
			sourcePrometheusParameters.setClusterId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.ClusterId"));
			sourcePrometheusParameters.setDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.DataType"));
			sourcePrometheusParameters.setLabels(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.Labels"));
			sourcePrometheusParameters.setRoleName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.RoleName"));
			sourcePrometheusParameters.setExternalLabels(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourcePrometheusParameters.ExternalLabels"));
			source.setSourcePrometheusParameters(sourcePrometheusParameters);

			SourceCustomizedKafkaParameters sourceCustomizedKafkaParameters = new SourceCustomizedKafkaParameters();
			sourceCustomizedKafkaParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceCustomizedKafkaParameters.InstanceId"));
			source.setSourceCustomizedKafkaParameters(sourceCustomizedKafkaParameters);

			SourceCustomizedKafkaConnectorParameters sourceCustomizedKafkaConnectorParameters = new SourceCustomizedKafkaConnectorParameters();
			sourceCustomizedKafkaConnectorParameters.setConnectorPackageUrl(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceCustomizedKafkaConnectorParameters.ConnectorPackageUrl"));
			sourceCustomizedKafkaConnectorParameters.setWorkerParameters(_ctx.mapValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceCustomizedKafkaConnectorParameters.WorkerParameters"));

			ConnectorParameters connectorParameters = new ConnectorParameters();
			connectorParameters.setName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceCustomizedKafkaConnectorParameters.ConnectorParameters.Name"));
			connectorParameters.setConfig(_ctx.mapValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceCustomizedKafkaConnectorParameters.ConnectorParameters.Config"));
			sourceCustomizedKafkaConnectorParameters.setConnectorParameters(connectorParameters);
			source.setSourceCustomizedKafkaConnectorParameters(sourceCustomizedKafkaConnectorParameters);

			SourceApacheKafkaParameters sourceApacheKafkaParameters = new SourceApacheKafkaParameters();
			sourceApacheKafkaParameters.setBootstraps(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.Bootstraps"));
			sourceApacheKafkaParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.Topic"));
			sourceApacheKafkaParameters.setConsumerGroup(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.ConsumerGroup"));
			sourceApacheKafkaParameters.setOffsetReset(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.OffsetReset"));
			sourceApacheKafkaParameters.setValueDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.ValueDataType"));
			sourceApacheKafkaParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.VpcId"));
			sourceApacheKafkaParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.VSwitchIds"));
			sourceApacheKafkaParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.SecurityGroupId"));
			sourceApacheKafkaParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.NetworkType"));
			sourceApacheKafkaParameters.setSecurityProtocol(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.SecurityProtocol"));
			sourceApacheKafkaParameters.setSaslMechanism(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.SaslMechanism"));
			sourceApacheKafkaParameters.setSaslUser(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.SaslUser"));
			sourceApacheKafkaParameters.setSaslPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceApacheKafkaParameters.SaslPassword"));
			source.setSourceApacheKafkaParameters(sourceApacheKafkaParameters);

			SourceOSSParameters sourceOSSParameters = new SourceOSSParameters();
			sourceOSSParameters.setRoleName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.RoleName"));
			sourceOSSParameters.setBucketName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.BucketName"));
			sourceOSSParameters.setPrefix(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.Prefix"));
			sourceOSSParameters.setLoadMode(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.LoadMode"));
			sourceOSSParameters.setLoadFormat(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.LoadFormat"));
			sourceOSSParameters.setDelimiter(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOSSParameters.Delimiter"));
			source.setSourceOSSParameters(sourceOSSParameters);

			SourceOpenSourceRabbitMQParameters sourceOpenSourceRabbitMQParameters = new SourceOpenSourceRabbitMQParameters();
			sourceOpenSourceRabbitMQParameters.setEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.Endpoint"));
			sourceOpenSourceRabbitMQParameters.setVirtualHostName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.VirtualHostName"));
			sourceOpenSourceRabbitMQParameters.setQueueName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.QueueName"));
			sourceOpenSourceRabbitMQParameters.setBodyDataType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.BodyDataType"));
			sourceOpenSourceRabbitMQParameters.setUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.Username"));
			sourceOpenSourceRabbitMQParameters.setPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.Password"));
			sourceOpenSourceRabbitMQParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.VpcId"));
			sourceOpenSourceRabbitMQParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.VSwitchIds"));
			sourceOpenSourceRabbitMQParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.SecurityGroupId"));
			sourceOpenSourceRabbitMQParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.NetworkType"));
			sourceOpenSourceRabbitMQParameters.setAuthType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceOpenSourceRabbitMQParameters.AuthType"));
			source.setSourceOpenSourceRabbitMQParameters(sourceOpenSourceRabbitMQParameters);

			SourceEventBusParameters sourceEventBusParameters = new SourceEventBusParameters();
			sourceEventBusParameters.setEventBusName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceEventBusParameters.EventBusName"));
			sourceEventBusParameters.setEventRuleName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceEventBusParameters.EventRuleName"));
			source.setSourceEventBusParameters(sourceEventBusParameters);

			SourceMySQLParameters sourceMySQLParameters = new SourceMySQLParameters();
			sourceMySQLParameters.setIncludeSchemaChanges(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.IncludeSchemaChanges"));
			sourceMySQLParameters.setUser(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.User"));
			sourceMySQLParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.VSwitchIds"));
			sourceMySQLParameters.setSnapshotMode(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.SnapshotMode"));
			sourceMySQLParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.SecurityGroupId"));
			sourceMySQLParameters.setPort(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.Port"));
			sourceMySQLParameters.setDatabaseName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.DatabaseName"));
			sourceMySQLParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.VpcId"));
			sourceMySQLParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.NetworkType"));
			sourceMySQLParameters.setTableNames(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.TableNames"));
			sourceMySQLParameters.setRegionId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.RegionId"));
			sourceMySQLParameters.setHostName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.HostName"));
			sourceMySQLParameters.setPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Source.SourceMySQLParameters.Password"));
			source.setSourceMySQLParameters(sourceMySQLParameters);
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

			Concurrency concurrency = new Concurrency();
			concurrency.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Concurrency.Value"));
			concurrency.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Concurrency.Form"));
			concurrency.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Concurrency.Template"));
			sinkFcParameters.setConcurrency(concurrency);

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

			Body2 body2 = new Body2();
			body2.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Value"));
			body2.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Form"));
			body2.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.Body.Template"));
			sinkFcParameters.setBody2(body2);

			DataFormat dataFormat = new DataFormat();
			dataFormat.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.DataFormat.Value"));
			dataFormat.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.DataFormat.Form"));
			dataFormat.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFcParameters.DataFormat.Template"));
			sinkFcParameters.setDataFormat(dataFormat);
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

			QueueName3 queueName3 = new QueueName3();
			queueName3.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Value"));
			queueName3.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Form"));
			queueName3.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.QueueName.Template"));
			sinkRabbitMQParameters.setQueueName3(queueName3);

			Body4 body4 = new Body4();
			body4.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Value"));
			body4.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Form"));
			body4.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRabbitMQParameters.Body.Template"));
			sinkRabbitMQParameters.setBody4(body4);

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

			InstanceId5 instanceId5 = new InstanceId5();
			instanceId5.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Value"));
			instanceId5.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Form"));
			instanceId5.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkKafkaParameters.InstanceId.Template"));
			sinkKafkaParameters.setInstanceId5(instanceId5);

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

			SinkApacheKafkaParameters sinkApacheKafkaParameters = new SinkApacheKafkaParameters();
			sinkApacheKafkaParameters.setBootstraps(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Bootstraps"));
			sinkApacheKafkaParameters.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Topic"));
			sinkApacheKafkaParameters.setAcks(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Acks"));
			sinkApacheKafkaParameters.setSecurityProtocol(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SecurityProtocol"));
			sinkApacheKafkaParameters.setSaslMechanism(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SaslMechanism"));
			sinkApacheKafkaParameters.setSaslUser(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SaslUser"));
			sinkApacheKafkaParameters.setSaslPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SaslPassword"));

			Key6 key6 = new Key6();
			key6.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Key.Value"));
			key6.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Key.Form"));
			key6.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Key.Template"));
			sinkApacheKafkaParameters.setKey6(key6);

			Value7 value7 = new Value7();
			value7.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Value.Value"));
			value7.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Value.Form"));
			value7.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.Value.Template"));
			sinkApacheKafkaParameters.setValue7(value7);

			VpcId vpcId = new VpcId();
			vpcId.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VpcId.Value"));
			vpcId.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VpcId.Form"));
			vpcId.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VpcId.Template"));
			sinkApacheKafkaParameters.setVpcId(vpcId);

			VSwitchIds vSwitchIds = new VSwitchIds();
			vSwitchIds.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VSwitchIds.Value"));
			vSwitchIds.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VSwitchIds.Form"));
			vSwitchIds.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.VSwitchIds.Template"));
			sinkApacheKafkaParameters.setVSwitchIds(vSwitchIds);

			SecurityGroupId securityGroupId = new SecurityGroupId();
			securityGroupId.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SecurityGroupId.Value"));
			securityGroupId.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SecurityGroupId.Form"));
			securityGroupId.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.SecurityGroupId.Template"));
			sinkApacheKafkaParameters.setSecurityGroupId(securityGroupId);

			NetworkType networkType = new NetworkType();
			networkType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.NetworkType.Value"));
			networkType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.NetworkType.Form"));
			networkType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheKafkaParameters.NetworkType.Template"));
			sinkApacheKafkaParameters.setNetworkType(networkType);
			sink.setSinkApacheKafkaParameters(sinkApacheKafkaParameters);

			SinkRocketMQParameters sinkRocketMQParameters = new SinkRocketMQParameters();

			InstanceId8 instanceId8 = new InstanceId8();
			instanceId8.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Value"));
			instanceId8.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Form"));
			instanceId8.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceId.Template"));
			sinkRocketMQParameters.setInstanceId8(instanceId8);

			Topic9 topic9 = new Topic9();
			topic9.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Value"));
			topic9.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Form"));
			topic9.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Topic.Template"));
			sinkRocketMQParameters.setTopic9(topic9);

			Body10 body10 = new Body10();
			body10.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Value"));
			body10.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Form"));
			body10.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Body.Template"));
			sinkRocketMQParameters.setBody10(body10);

			Properties11 properties11 = new Properties11();
			properties11.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Value"));
			properties11.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Form"));
			properties11.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Properties.Template"));
			sinkRocketMQParameters.setProperties11(properties11);

			Keys keys = new Keys();
			keys.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Value"));
			keys.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Form"));
			keys.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Keys.Template"));
			sinkRocketMQParameters.setKeys(keys);

			Tags12 tags12 = new Tags12();
			tags12.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Value"));
			tags12.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Form"));
			tags12.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Tags.Template"));
			sinkRocketMQParameters.setTags12(tags12);

			InstanceType instanceType = new InstanceType();
			instanceType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceType.Value"));
			instanceType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceType.Form"));
			instanceType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceType.Template"));
			sinkRocketMQParameters.setInstanceType(instanceType);

			InstanceEndpoint instanceEndpoint = new InstanceEndpoint();
			instanceEndpoint.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceEndpoint.Value"));
			instanceEndpoint.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceEndpoint.Form"));
			instanceEndpoint.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceEndpoint.Template"));
			sinkRocketMQParameters.setInstanceEndpoint(instanceEndpoint);

			InstanceUsername instanceUsername = new InstanceUsername();
			instanceUsername.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceUsername.Value"));
			instanceUsername.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceUsername.Form"));
			instanceUsername.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstanceUsername.Template"));
			sinkRocketMQParameters.setInstanceUsername(instanceUsername);

			InstancePassword instancePassword = new InstancePassword();
			instancePassword.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstancePassword.Value"));
			instancePassword.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstancePassword.Form"));
			instancePassword.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.InstancePassword.Template"));
			sinkRocketMQParameters.setInstancePassword(instancePassword);

			VpcId13 vpcId13 = new VpcId13();
			vpcId13.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VpcId.Value"));
			vpcId13.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VpcId.Form"));
			vpcId13.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VpcId.Template"));
			sinkRocketMQParameters.setVpcId13(vpcId13);

			VSwitchIds14 vSwitchIds14 = new VSwitchIds14();
			vSwitchIds14.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VSwitchIds.Value"));
			vSwitchIds14.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VSwitchIds.Form"));
			vSwitchIds14.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.VSwitchIds.Template"));
			sinkRocketMQParameters.setVSwitchIds14(vSwitchIds14);

			SecurityGroupId15 securityGroupId15 = new SecurityGroupId15();
			securityGroupId15.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.SecurityGroupId.Value"));
			securityGroupId15.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.SecurityGroupId.Form"));
			securityGroupId15.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.SecurityGroupId.Template"));
			sinkRocketMQParameters.setSecurityGroupId15(securityGroupId15);

			Network network = new Network();
			network.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Network.Value"));
			network.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Network.Form"));
			network.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.Network.Template"));
			sinkRocketMQParameters.setNetwork(network);

			DeliveryOrderType deliveryOrderType = new DeliveryOrderType();
			deliveryOrderType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.DeliveryOrderType.Value"));
			deliveryOrderType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.DeliveryOrderType.Form"));
			deliveryOrderType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.DeliveryOrderType.Template"));
			sinkRocketMQParameters.setDeliveryOrderType(deliveryOrderType);

			ShardingKey shardingKey = new ShardingKey();
			shardingKey.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.ShardingKey.Value"));
			shardingKey.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.ShardingKey.Form"));
			shardingKey.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQParameters.ShardingKey.Template"));
			sinkRocketMQParameters.setShardingKey(shardingKey);
			sink.setSinkRocketMQParameters(sinkRocketMQParameters);

			SinkDorisParameters sinkDorisParameters = new SinkDorisParameters();

			QueryEndpoint queryEndpoint = new QueryEndpoint();
			queryEndpoint.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.QueryEndpoint.Value"));
			queryEndpoint.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.QueryEndpoint.Form"));
			queryEndpoint.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.QueryEndpoint.Template"));
			sinkDorisParameters.setQueryEndpoint(queryEndpoint);

			FeHttpEndpoint feHttpEndpoint = new FeHttpEndpoint();
			feHttpEndpoint.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.FeHttpEndpoint.Value"));
			feHttpEndpoint.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.FeHttpEndpoint.Form"));
			feHttpEndpoint.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.FeHttpEndpoint.Template"));
			sinkDorisParameters.setFeHttpEndpoint(feHttpEndpoint);

			BeHttpEndpoint beHttpEndpoint = new BeHttpEndpoint();
			beHttpEndpoint.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.BeHttpEndpoint.Value"));
			beHttpEndpoint.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.BeHttpEndpoint.Form"));
			beHttpEndpoint.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.BeHttpEndpoint.Template"));
			sinkDorisParameters.setBeHttpEndpoint(beHttpEndpoint);

			UserName userName = new UserName();
			userName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.UserName.Value"));
			userName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.UserName.Form"));
			userName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.UserName.Template"));
			sinkDorisParameters.setUserName(userName);

			Password password = new Password();
			password.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Password.Value"));
			password.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Password.Form"));
			password.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Password.Template"));
			sinkDorisParameters.setPassword(password);

			Database database = new Database();
			database.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Database.Value"));
			database.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Database.Form"));
			database.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Database.Template"));
			sinkDorisParameters.setDatabase(database);

			Table table = new Table();
			table.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Table.Value"));
			table.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Table.Form"));
			table.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Table.Template"));
			sinkDorisParameters.setTable(table);

			Body16 body16 = new Body16();
			body16.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Body.Value"));
			body16.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Body.Form"));
			body16.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.Body.Template"));
			sinkDorisParameters.setBody16(body16);

			NetworkType17 networkType17 = new NetworkType17();
			networkType17.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.NetworkType.Value"));
			networkType17.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.NetworkType.Form"));
			networkType17.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.NetworkType.Template"));
			sinkDorisParameters.setNetworkType17(networkType17);

			VpcId18 vpcId18 = new VpcId18();
			vpcId18.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VpcId.Value"));
			vpcId18.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VpcId.Form"));
			vpcId18.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VpcId.Template"));
			sinkDorisParameters.setVpcId18(vpcId18);

			VSwitchIds19 vSwitchIds19 = new VSwitchIds19();
			vSwitchIds19.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VSwitchIds.Value"));
			vSwitchIds19.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VSwitchIds.Form"));
			vSwitchIds19.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.VSwitchIds.Template"));
			sinkDorisParameters.setVSwitchIds19(vSwitchIds19);

			SecurityGroupId20 securityGroupId20 = new SecurityGroupId20();
			securityGroupId20.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.SecurityGroupId.Value"));
			securityGroupId20.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.SecurityGroupId.Form"));
			securityGroupId20.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDorisParameters.SecurityGroupId.Template"));
			sinkDorisParameters.setSecurityGroupId20(securityGroupId20);
			sink.setSinkDorisParameters(sinkDorisParameters);

			SinkRocketMQCheckpointParameters sinkRocketMQCheckpointParameters = new SinkRocketMQCheckpointParameters();
			sinkRocketMQCheckpointParameters.setInstanceType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.InstanceType"));
			sinkRocketMQCheckpointParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.InstanceId"));

			Topic21 topic21 = new Topic21();
			topic21.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Topic.Value"));
			topic21.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Topic.Form"));
			topic21.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Topic.Template"));
			sinkRocketMQCheckpointParameters.setTopic21(topic21);

			Group group = new Group();
			group.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Group.Value"));
			group.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Group.Form"));
			group.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.Group.Template"));
			sinkRocketMQCheckpointParameters.setGroup(group);

			ConsumeTimestamp consumeTimestamp = new ConsumeTimestamp();
			consumeTimestamp.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.ConsumeTimestamp.Value"));
			consumeTimestamp.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.ConsumeTimestamp.Form"));
			consumeTimestamp.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkRocketMQCheckpointParameters.ConsumeTimestamp.Template"));
			sinkRocketMQCheckpointParameters.setConsumeTimestamp(consumeTimestamp);
			sink.setSinkRocketMQCheckpointParameters(sinkRocketMQCheckpointParameters);

			SinkApacheRocketMQCheckpointParameters sinkApacheRocketMQCheckpointParameters = new SinkApacheRocketMQCheckpointParameters();
			sinkApacheRocketMQCheckpointParameters.setInstanceEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.InstanceEndpoint"));
			sinkApacheRocketMQCheckpointParameters.setInstanceUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.InstanceUsername"));
			sinkApacheRocketMQCheckpointParameters.setInstancePassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.InstancePassword"));
			sinkApacheRocketMQCheckpointParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.NetworkType"));
			sinkApacheRocketMQCheckpointParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.VpcId"));
			sinkApacheRocketMQCheckpointParameters.setVSwitchId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.VSwitchId"));
			sinkApacheRocketMQCheckpointParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.SecurityGroupId"));

			Topic22 topic22 = new Topic22();
			topic22.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Topic.Value"));
			topic22.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Topic.Form"));
			topic22.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Topic.Template"));
			sinkApacheRocketMQCheckpointParameters.setTopic22(topic22);

			Group23 group23 = new Group23();
			group23.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Group.Value"));
			group23.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Group.Form"));
			group23.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.Group.Template"));
			sinkApacheRocketMQCheckpointParameters.setGroup23(group23);

			ConsumeTimestamp24 consumeTimestamp24 = new ConsumeTimestamp24();
			consumeTimestamp24.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.ConsumeTimestamp.Value"));
			consumeTimestamp24.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.ConsumeTimestamp.Form"));
			consumeTimestamp24.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApacheRocketMQCheckpointParameters.ConsumeTimestamp.Template"));
			sinkApacheRocketMQCheckpointParameters.setConsumeTimestamp24(consumeTimestamp24);
			sink.setSinkApacheRocketMQCheckpointParameters(sinkApacheRocketMQCheckpointParameters);

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

			Topic25 topic25 = new Topic25();
			topic25.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Value"));
			topic25.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Form"));
			topic25.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Topic.Template"));
			sinkSLSParameters.setTopic25(topic25);

			Body26 body26 = new Body26();
			body26.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Value"));
			body26.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Form"));
			body26.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.Body.Template"));
			sinkSLSParameters.setBody26(body26);

			RoleName roleName = new RoleName();
			roleName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Value"));
			roleName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Form"));
			roleName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.RoleName.Template"));
			sinkSLSParameters.setRoleName(roleName);

			ContentType contentType = new ContentType();
			contentType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentType.Value"));
			contentType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentType.Form"));
			contentType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentType.Template"));
			sinkSLSParameters.setContentType(contentType);

			ContentSchema contentSchema = new ContentSchema();
			contentSchema.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentSchema.Value"));
			contentSchema.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentSchema.Form"));
			contentSchema.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkSLSParameters.ContentSchema.Template"));
			sinkSLSParameters.setContentSchema(contentSchema);
			sink.setSinkSLSParameters(sinkSLSParameters);

			SinkFnfParameters sinkFnfParameters = new SinkFnfParameters();

			FlowName flowName = new FlowName();
			flowName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.FlowName.Value"));
			flowName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.FlowName.Form"));
			flowName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.FlowName.Template"));
			sinkFnfParameters.setFlowName(flowName);

			ExecutionName executionName = new ExecutionName();
			executionName.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.ExecutionName.Value"));
			executionName.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.ExecutionName.Form"));
			executionName.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.ExecutionName.Template"));
			sinkFnfParameters.setExecutionName(executionName);

			Input input = new Input();
			input.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.Input.Value"));
			input.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.Input.Form"));
			input.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.Input.Template"));
			sinkFnfParameters.setInput(input);

			RoleName27 roleName27 = new RoleName27();
			roleName27.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.RoleName.Value"));
			roleName27.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.RoleName.Form"));
			roleName27.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkFnfParameters.RoleName.Template"));
			sinkFnfParameters.setRoleName27(roleName27);
			sink.setSinkFnfParameters(sinkFnfParameters);

			SinkDataHubParameters sinkDataHubParameters = new SinkDataHubParameters();

			Project28 project28 = new Project28();
			project28.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Project.Value"));
			project28.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Project.Form"));
			project28.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Project.Template"));
			sinkDataHubParameters.setProject28(project28);

			Topic29 topic29 = new Topic29();
			topic29.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Topic.Value"));
			topic29.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Topic.Form"));
			topic29.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Topic.Template"));
			sinkDataHubParameters.setTopic29(topic29);

			TopicType topicType = new TopicType();
			topicType.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicType.Value"));
			topicType.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicType.Form"));
			topicType.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicType.Template"));
			sinkDataHubParameters.setTopicType(topicType);

			TopicSchema topicSchema = new TopicSchema();
			topicSchema.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicSchema.Value"));
			topicSchema.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicSchema.Form"));
			topicSchema.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.TopicSchema.Template"));
			sinkDataHubParameters.setTopicSchema(topicSchema);

			Body30 body30 = new Body30();
			body30.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Body.Value"));
			body30.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Body.Form"));
			body30.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.Body.Template"));
			sinkDataHubParameters.setBody30(body30);

			RoleName31 roleName31 = new RoleName31();
			roleName31.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.RoleName.Value"));
			roleName31.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.RoleName.Form"));
			roleName31.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDataHubParameters.RoleName.Template"));
			sinkDataHubParameters.setRoleName31(roleName31);
			sink.setSinkDataHubParameters(sinkDataHubParameters);

			SinkCustomizedKafkaParameters sinkCustomizedKafkaParameters = new SinkCustomizedKafkaParameters();
			sinkCustomizedKafkaParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkCustomizedKafkaParameters.InstanceId"));
			sink.setSinkCustomizedKafkaParameters(sinkCustomizedKafkaParameters);

			SinkCustomizedKafkaConnectorParameters sinkCustomizedKafkaConnectorParameters = new SinkCustomizedKafkaConnectorParameters();
			sinkCustomizedKafkaConnectorParameters.setConnectorPackageUrl(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkCustomizedKafkaConnectorParameters.ConnectorPackageUrl"));
			sinkCustomizedKafkaConnectorParameters.setWorkerParameters(_ctx.mapValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkCustomizedKafkaConnectorParameters.WorkerParameters"));

			ConnectorParameters32 connectorParameters32 = new ConnectorParameters32();
			connectorParameters32.setName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkCustomizedKafkaConnectorParameters.ConnectorParameters.Name"));
			connectorParameters32.setConfig(_ctx.mapValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkCustomizedKafkaConnectorParameters.ConnectorParameters.Config"));
			sinkCustomizedKafkaConnectorParameters.setConnectorParameters32(connectorParameters32);
			sink.setSinkCustomizedKafkaConnectorParameters(sinkCustomizedKafkaConnectorParameters);

			SinkDashVectorParameters sinkDashVectorParameters = new SinkDashVectorParameters();
			sinkDashVectorParameters.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.InstanceId"));
			sinkDashVectorParameters.setCollection(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Collection"));
			sinkDashVectorParameters.setApiKey(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.ApiKey"));
			sinkDashVectorParameters.setOperation(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Operation"));
			sinkDashVectorParameters.setNetwork(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Network"));

			PrimaryKeyId primaryKeyId = new PrimaryKeyId();
			primaryKeyId.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.PrimaryKeyId.Form"));
			primaryKeyId.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.PrimaryKeyId.Value"));
			primaryKeyId.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.PrimaryKeyId.Template"));
			sinkDashVectorParameters.setPrimaryKeyId(primaryKeyId);

			Partition partition = new Partition();
			partition.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Partition.Form"));
			partition.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Partition.Value"));
			partition.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Partition.Template"));
			sinkDashVectorParameters.setPartition(partition);

			Vector vector = new Vector();
			vector.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Vector.Form"));
			vector.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Vector.Value"));
			vector.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.Vector.Template"));
			sinkDashVectorParameters.setVector(vector);

			List<DashVectorSchemaParametersItem> dashVectorSchemaParameters = new ArrayList<DashVectorSchemaParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters.Length"); j++) {
				DashVectorSchemaParametersItem dashVectorSchemaParametersItem = new DashVectorSchemaParametersItem();

				Name name = new Name();
				name.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Name.Form"));
				name.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Name.Value"));
				name.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Name.Template"));
				dashVectorSchemaParametersItem.setName(name);

				Type type = new Type();
				type.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Type.Form"));
				type.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Type.Value"));
				type.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Type.Template"));
				dashVectorSchemaParametersItem.setType(type);

				Value33 value33 = new Value33();
				value33.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Value.Form"));
				value33.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Value.Value"));
				value33.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkDashVectorParameters.DashVectorSchemaParameters["+ j +"].Value.Template"));
				dashVectorSchemaParametersItem.setValue33(value33);

				dashVectorSchemaParameters.add(dashVectorSchemaParametersItem);
			}
			sinkDashVectorParameters.setDashVectorSchemaParameters(dashVectorSchemaParameters);
			sink.setSinkDashVectorParameters(sinkDashVectorParameters);

			SinkOpenSourceRabbitMQParameters sinkOpenSourceRabbitMQParameters = new SinkOpenSourceRabbitMQParameters();
			sinkOpenSourceRabbitMQParameters.setEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Endpoint"));
			sinkOpenSourceRabbitMQParameters.setVirtualHostName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.VirtualHostName"));
			sinkOpenSourceRabbitMQParameters.setTargetType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.TargetType"));
			sinkOpenSourceRabbitMQParameters.setExchange(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Exchange"));
			sinkOpenSourceRabbitMQParameters.setQueueName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.QueueName"));
			sinkOpenSourceRabbitMQParameters.setUsername(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Username"));
			sinkOpenSourceRabbitMQParameters.setPassword(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Password"));
			sinkOpenSourceRabbitMQParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.VpcId"));
			sinkOpenSourceRabbitMQParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.VSwitchIds"));
			sinkOpenSourceRabbitMQParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.SecurityGroupId"));
			sinkOpenSourceRabbitMQParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.NetworkType"));
			sinkOpenSourceRabbitMQParameters.setAuthType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.AuthType"));

			RoutingKey34 routingKey34 = new RoutingKey34();
			routingKey34.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.RoutingKey.Form"));
			routingKey34.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.RoutingKey.Value"));
			routingKey34.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.RoutingKey.Template"));
			sinkOpenSourceRabbitMQParameters.setRoutingKey34(routingKey34);

			Body35 body35 = new Body35();
			body35.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Body.Form"));
			body35.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Body.Value"));
			body35.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Body.Template"));
			sinkOpenSourceRabbitMQParameters.setBody35(body35);

			MessageId36 messageId36 = new MessageId36();
			messageId36.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.MessageId.Form"));
			messageId36.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.MessageId.Value"));
			messageId36.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.MessageId.Template"));
			sinkOpenSourceRabbitMQParameters.setMessageId36(messageId36);

			Properties37 properties37 = new Properties37();
			properties37.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Properties.Form"));
			properties37.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Properties.Value"));
			properties37.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkOpenSourceRabbitMQParameters.Properties.Template"));
			sinkOpenSourceRabbitMQParameters.setProperties37(properties37);
			sink.setSinkOpenSourceRabbitMQParameters(sinkOpenSourceRabbitMQParameters);

			SinkBaiLianParameters sinkBaiLianParameters = new SinkBaiLianParameters();
			sinkBaiLianParameters.setApplicationType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.ApplicationType"));
			sinkBaiLianParameters.setWorkspaceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.WorkspaceId"));

			Before before = new Before();
			before.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Before.Form"));
			before.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Before.Value"));
			before.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Before.Template"));
			sinkBaiLianParameters.setBefore(before);

			Op op = new Op();
			op.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Op.Form"));
			op.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Op.Value"));
			op.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Op.Template"));
			sinkBaiLianParameters.setOp(op);

			Partition38 partition38 = new Partition38();
			partition38.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Partition.Form"));
			partition38.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Partition.Value"));
			partition38.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Partition.Template"));
			sinkBaiLianParameters.setPartition38(partition38);

			After after = new After();
			after.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.After.Form"));
			after.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.After.Value"));
			after.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.After.Template"));
			sinkBaiLianParameters.setAfter(after);

			Offset offset = new Offset();
			offset.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Offset.Form"));
			offset.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Offset.Value"));
			offset.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkBaiLianParameters.Offset.Template"));
			sinkBaiLianParameters.setOffset(offset);
			sink.setSinkBaiLianParameters(sinkBaiLianParameters);

			SinkHttpsParameters sinkHttpsParameters = new SinkHttpsParameters();
			sinkHttpsParameters.setBizMethod(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.Method"));
			sinkHttpsParameters.setToken(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.Token"));
			sinkHttpsParameters.setNetworkType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.NetworkType"));
			sinkHttpsParameters.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.VpcId"));
			sinkHttpsParameters.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.VSwitchIds"));
			sinkHttpsParameters.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.SecurityGroupId"));

			URL uRL = new URL();
			uRL.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.URL.Form"));
			uRL.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.URL.Value"));
			uRL.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.URL.Template"));
			sinkHttpsParameters.setURL(uRL);

			Body39 body39 = new Body39();
			body39.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.Body.Form"));
			body39.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.Body.Value"));
			body39.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkHttpsParameters.Body.Template"));
			sinkHttpsParameters.setBody39(body39);
			sink.setSinkHttpsParameters(sinkHttpsParameters);

			SinkApiDestinationParameters sinkApiDestinationParameters = new SinkApiDestinationParameters();
			sinkApiDestinationParameters.setName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.Name"));

			HeaderParameters headerParameters = new HeaderParameters();
			headerParameters.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.HeaderParameters.Form"));
			headerParameters.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.HeaderParameters.Value"));
			headerParameters.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.HeaderParameters.Template"));
			sinkApiDestinationParameters.setHeaderParameters(headerParameters);

			BodyParameters bodyParameters = new BodyParameters();
			bodyParameters.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.BodyParameters.Form"));
			bodyParameters.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.BodyParameters.Value"));
			bodyParameters.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.BodyParameters.Template"));
			sinkApiDestinationParameters.setBodyParameters(bodyParameters);

			QueryStringParameters queryStringParameters = new QueryStringParameters();
			queryStringParameters.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.QueryStringParameters.Form"));
			queryStringParameters.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.QueryStringParameters.Value"));
			queryStringParameters.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Sink.SinkApiDestinationParameters.QueryStringParameters.Template"));
			sinkApiDestinationParameters.setQueryStringParameters(queryStringParameters);
			sink.setSinkApiDestinationParameters(sinkApiDestinationParameters);
			eventStreamingsItem.setSink(sink);

			RunOptions runOptions = new RunOptions();
			runOptions.setMaximumTasks(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.MaximumTasks"));
			runOptions.setErrorsTolerance(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ErrorsTolerance"));
			runOptions.setRoleName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RoleName"));
			runOptions.setThrottling(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.Throttling"));

			RetryStrategy retryStrategy = new RetryStrategy();
			retryStrategy.setPushRetryStrategy(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.PushRetryStrategy"));
			retryStrategy.setMaximumEventAgeInSeconds(_ctx.floatValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.MaximumEventAgeInSeconds"));
			retryStrategy.setMaximumRetryAttempts(_ctx.floatValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.RetryStrategy.MaximumRetryAttempts"));
			runOptions.setRetryStrategy(retryStrategy);

			DeadLetterQueue deadLetterQueue = new DeadLetterQueue();
			deadLetterQueue.setArn(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.Arn"));
			deadLetterQueue.setNetwork(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.Network"));
			deadLetterQueue.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.VpcId"));
			deadLetterQueue.setVSwitchIds(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.VSwitchIds"));
			deadLetterQueue.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.DeadLetterQueue.SecurityGroupId"));
			runOptions.setDeadLetterQueue(deadLetterQueue);

			BatchWindow batchWindow = new BatchWindow();
			batchWindow.setCountBasedWindow(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BatchWindow.CountBasedWindow"));
			batchWindow.setTimeBasedWindow(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BatchWindow.TimeBasedWindow"));
			runOptions.setBatchWindow(batchWindow);

			BusinessOption businessOption = new BusinessOption();
			businessOption.setBusinessMode(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BusinessOption.BusinessMode"));
			businessOption.setMinCapacityUnitCount(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BusinessOption.MinCapacityUnitCount"));
			businessOption.setMaxCapacityUnitCount(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.BusinessOption.MaxCapacityUnitCount"));
			runOptions.setBusinessOption(businessOption);

			LogDelivery logDelivery = new LogDelivery();

			List<SLSLogParametersItem> sLSLogParameters = new ArrayList<SLSLogParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.SLSLogParameters.Length"); j++) {
				SLSLogParametersItem sLSLogParametersItem = new SLSLogParametersItem();
				sLSLogParametersItem.setProjectName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.SLSLogParameters["+ j +"].ProjectName"));
				sLSLogParametersItem.setLogstoreName(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.SLSLogParameters["+ j +"].LogstoreName"));

				sLSLogParameters.add(sLSLogParametersItem);
			}
			logDelivery.setSLSLogParameters(sLSLogParameters);

			List<KafkaLogParametersItem> kafkaLogParameters = new ArrayList<KafkaLogParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.KafkaLogParameters.Length"); j++) {
				KafkaLogParametersItem kafkaLogParametersItem = new KafkaLogParametersItem();
				kafkaLogParametersItem.setEndpoint(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.KafkaLogParameters["+ j +"].Endpoint"));
				kafkaLogParametersItem.setInstanceId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.KafkaLogParameters["+ j +"].InstanceId"));
				kafkaLogParametersItem.setTopic(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.LogDelivery.KafkaLogParameters["+ j +"].Topic"));

				kafkaLogParameters.add(kafkaLogParametersItem);
			}
			logDelivery.setKafkaLogParameters(kafkaLogParameters);
			runOptions.setLogDelivery(logDelivery);

			ScaledObject scaledObject = new ScaledObject();
			scaledObject.setMinReplicaCount(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.MinReplicaCount"));
			scaledObject.setMaxReplicaCount(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.MaxReplicaCount"));

			List<TriggersItem> triggers = new ArrayList<TriggersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.Triggers.Length"); j++) {
				TriggersItem triggersItem = new TriggersItem();
				triggersItem.setType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.Triggers["+ j +"].Type"));

				Metadata metadata = new Metadata();
				metadata.setType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.Triggers["+ j +"].Metadata.Type"));
				metadata.setValue(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ScaledObject.Triggers["+ j +"].Metadata.Value"));
				triggersItem.setMetadata(metadata);

				triggers.add(triggersItem);
			}
			scaledObject.setTriggers(triggers);
			runOptions.setScaledObject(scaledObject);

			Network40 network40 = new Network40();
			network40.setVpcId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.Network.VpcId"));
			network40.setSecurityGroupId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.Network.SecurityGroupId"));

			List<String> vSwitchIds41 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.Network.VSwitchIds.Length"); j++) {
				vSwitchIds41.add(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.Network.VSwitchIds["+ j +"]"));
			}
			network40.setVSwitchIds41(vSwitchIds41);
			runOptions.setNetwork40(network40);

			ResourceSpec resourceSpec = new ResourceSpec();

			List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ResourceSpec.Resources.Length"); j++) {
				ResourcesItem resourcesItem = new ResourcesItem();
				resourcesItem.setType(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ResourceSpec.Resources["+ j +"].Type"));
				resourcesItem.setValue(_ctx.integerValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].RunOptions.ResourceSpec.Resources["+ j +"].Value"));

				resources.add(resourcesItem);
			}
			resourceSpec.setResources(resources);
			runOptions.setResourceSpec(resourceSpec);
			eventStreamingsItem.setRunOptions(runOptions);

			List<TransformsItem> transforms = new ArrayList<TransformsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms.Length"); j++) {
				TransformsItem transformsItem = new TransformsItem();
				transformsItem.setArn(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].Arn"));

				DashScopeTransformParameters dashScopeTransformParameters = new DashScopeTransformParameters();
				dashScopeTransformParameters.setModel(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Model"));
				dashScopeTransformParameters.setApiKey(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.ApiKey"));
				dashScopeTransformParameters.setStructuredOutputJsonSchema(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.StructuredOutputJsonSchema"));
				dashScopeTransformParameters.setRequestPerMinute(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.RequestPerMinute"));
				dashScopeTransformParameters.setTokenPerMinute(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.TokenPerMinute"));

				List<MessagesItem> messages = new ArrayList<MessagesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Messages.Length"); k++) {
					MessagesItem messagesItem = new MessagesItem();
					messagesItem.setRole(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Messages["+ k +"].Role"));
					messagesItem.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Messages["+ k +"].Form"));
					messagesItem.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Messages["+ k +"].Value"));
					messagesItem.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].DashScopeTransformParameters.Messages["+ k +"].Template"));

					messages.add(messagesItem);
				}
				dashScopeTransformParameters.setMessages(messages);
				transformsItem.setDashScopeTransformParameters(dashScopeTransformParameters);

				BaiLianAgentTransformParameters baiLianAgentTransformParameters = new BaiLianAgentTransformParameters();
				baiLianAgentTransformParameters.setApplicationId(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.ApplicationId"));
				baiLianAgentTransformParameters.setApiKey(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.ApiKey"));
				baiLianAgentTransformParameters.setRequestPerMinute(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.RequestPerMinute"));
				baiLianAgentTransformParameters.setTokenPerMinute(_ctx.longValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.TokenPerMinute"));

				Prompt prompt = new Prompt();
				prompt.setForm(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.Prompt.Form"));
				prompt.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.Prompt.Value"));
				prompt.setTemplate(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Transforms["+ j +"].BaiLianAgentTransformParameters.Prompt.Template"));
				baiLianAgentTransformParameters.setPrompt(prompt);
				transformsItem.setBaiLianAgentTransformParameters(baiLianAgentTransformParameters);

				transforms.add(transformsItem);
			}
			eventStreamingsItem.setTransforms(transforms);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListEventStreamingsResponse.Data.EventStreamings["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			eventStreamingsItem.setTags(tags);

			eventStreamings.add(eventStreamingsItem);
		}
		data.setEventStreamings(eventStreamings);
		listEventStreamingsResponse.setData(data);
	 
	 	return listEventStreamingsResponse;
	}
}