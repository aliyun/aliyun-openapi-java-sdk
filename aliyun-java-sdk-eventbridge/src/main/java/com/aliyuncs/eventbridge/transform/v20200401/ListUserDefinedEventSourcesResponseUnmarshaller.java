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

import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceHttpEventParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceKafkaParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceMNSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceOSSEventParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceRabbitMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceRocketMQParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceSLSParameters;
import com.aliyuncs.eventbridge.model.v20200401.ListUserDefinedEventSourcesResponse.Data.EventSourceListItem.SourceScheduledEventParameters;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserDefinedEventSourcesResponseUnmarshaller {

	public static ListUserDefinedEventSourcesResponse unmarshall(ListUserDefinedEventSourcesResponse listUserDefinedEventSourcesResponse, UnmarshallerContext _ctx) {
		
		listUserDefinedEventSourcesResponse.setRequestId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.RequestId"));
		listUserDefinedEventSourcesResponse.setMessage(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Message"));
		listUserDefinedEventSourcesResponse.setCode(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Code"));
		listUserDefinedEventSourcesResponse.setSuccess(_ctx.booleanValue("ListUserDefinedEventSourcesResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("ListUserDefinedEventSourcesResponse.Data.Total"));

		List<EventSourceListItem> eventSourceList = new ArrayList<EventSourceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList.Length"); i++) {
			EventSourceListItem eventSourceListItem = new EventSourceListItem();
			eventSourceListItem.setName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Name"));
			eventSourceListItem.setArn(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Arn"));
			eventSourceListItem.setStatus(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Status"));
			eventSourceListItem.setType(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Type"));
			eventSourceListItem.setCtime(_ctx.floatValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Ctime"));
			eventSourceListItem.setDescription(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].Description"));
			eventSourceListItem.setExternalSourceType(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].ExternalSourceType"));
			eventSourceListItem.setExternalSourceConfig(_ctx.mapValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].ExternalSourceConfig"));
			eventSourceListItem.setEventBusName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].EventBusName"));

			SourceMNSParameters sourceMNSParameters = new SourceMNSParameters();
			sourceMNSParameters.setRegionId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceMNSParameters.RegionId"));
			sourceMNSParameters.setQueueName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceMNSParameters.QueueName"));
			sourceMNSParameters.setIsBase64Decode(_ctx.booleanValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceMNSParameters.IsBase64Decode"));
			eventSourceListItem.setSourceMNSParameters(sourceMNSParameters);

			SourceRocketMQParameters sourceRocketMQParameters = new SourceRocketMQParameters();
			sourceRocketMQParameters.setRegionId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.RegionId"));
			sourceRocketMQParameters.setInstanceId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceId"));
			sourceRocketMQParameters.setTopic(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.Topic"));
			sourceRocketMQParameters.setTag(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.Tag"));
			sourceRocketMQParameters.setOffset(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.Offset"));
			sourceRocketMQParameters.setTimestamp(_ctx.floatValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.Timestamp"));
			sourceRocketMQParameters.setGroupId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.GroupId"));
			sourceRocketMQParameters.setInstanceType(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceType"));
			sourceRocketMQParameters.setInstanceNetwork(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceNetwork"));
			sourceRocketMQParameters.setInstanceVpcId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceVpcId"));
			sourceRocketMQParameters.setInstanceVSwitchIds(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceVSwitchIds"));
			sourceRocketMQParameters.setInstanceSecurityGroupId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceSecurityGroupId"));
			sourceRocketMQParameters.setAuthType(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.AuthType"));
			sourceRocketMQParameters.setInstanceEndpoint(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceEndpoint"));
			sourceRocketMQParameters.setInstanceUsername(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstanceUsername"));
			sourceRocketMQParameters.setInstancePassword(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRocketMQParameters.InstancePassword"));
			eventSourceListItem.setSourceRocketMQParameters(sourceRocketMQParameters);

			SourceRabbitMQParameters sourceRabbitMQParameters = new SourceRabbitMQParameters();
			sourceRabbitMQParameters.setRegionId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRabbitMQParameters.RegionId"));
			sourceRabbitMQParameters.setInstanceId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRabbitMQParameters.InstanceId"));
			sourceRabbitMQParameters.setVirtualHostName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRabbitMQParameters.VirtualHostName"));
			sourceRabbitMQParameters.setQueueName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceRabbitMQParameters.QueueName"));
			eventSourceListItem.setSourceRabbitMQParameters(sourceRabbitMQParameters);

			SourceSLSParameters sourceSLSParameters = new SourceSLSParameters();
			sourceSLSParameters.setProject(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceSLSParameters.Project"));
			sourceSLSParameters.setLogStore(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceSLSParameters.LogStore"));
			sourceSLSParameters.setConsumePosition(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceSLSParameters.ConsumePosition"));
			sourceSLSParameters.setRoleName(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceSLSParameters.RoleName"));
			eventSourceListItem.setSourceSLSParameters(sourceSLSParameters);

			SourceHttpEventParameters sourceHttpEventParameters = new SourceHttpEventParameters();
			sourceHttpEventParameters.setType(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Type"));
			sourceHttpEventParameters.setSecurityConfig(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.SecurityConfig"));

			List<String> method = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Method.Length"); j++) {
				method.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Method["+ j +"]"));
			}
			sourceHttpEventParameters.setBizMethod(method);

			List<String> ip = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Ip.Length"); j++) {
				ip.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Ip["+ j +"]"));
			}
			sourceHttpEventParameters.setIp(ip);

			List<String> referer = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Referer.Length"); j++) {
				referer.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.Referer["+ j +"]"));
			}
			sourceHttpEventParameters.setReferer(referer);

			List<String> publicWebHookUrl = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.PublicWebHookUrl.Length"); j++) {
				publicWebHookUrl.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.PublicWebHookUrl["+ j +"]"));
			}
			sourceHttpEventParameters.setPublicWebHookUrl(publicWebHookUrl);

			List<String> vpcWebHookUrl = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.VpcWebHookUrl.Length"); j++) {
				vpcWebHookUrl.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceHttpEventParameters.VpcWebHookUrl["+ j +"]"));
			}
			sourceHttpEventParameters.setVpcWebHookUrl(vpcWebHookUrl);
			eventSourceListItem.setSourceHttpEventParameters(sourceHttpEventParameters);

			SourceKafkaParameters sourceKafkaParameters = new SourceKafkaParameters();
			sourceKafkaParameters.setInstanceId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.InstanceId"));
			sourceKafkaParameters.setConsumerGroup(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.ConsumerGroup"));
			sourceKafkaParameters.setTopic(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.Topic"));
			sourceKafkaParameters.setOffsetReset(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.OffsetReset"));
			sourceKafkaParameters.setRegionId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.RegionId"));
			sourceKafkaParameters.setMaximumTasks(_ctx.integerValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.MaximumTasks"));
			sourceKafkaParameters.setNetwork(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.Network"));
			sourceKafkaParameters.setSecurityGroupId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.SecurityGroupId"));
			sourceKafkaParameters.setVpcId(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.VpcId"));
			sourceKafkaParameters.setVSwitchIds(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceKafkaParameters.VSwitchIds"));
			eventSourceListItem.setSourceKafkaParameters(sourceKafkaParameters);

			SourceScheduledEventParameters sourceScheduledEventParameters = new SourceScheduledEventParameters();
			sourceScheduledEventParameters.setSchedule(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceScheduledEventParameters.Schedule"));
			sourceScheduledEventParameters.setTimeZone(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceScheduledEventParameters.TimeZone"));
			sourceScheduledEventParameters.setUserData(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceScheduledEventParameters.UserData"));
			eventSourceListItem.setSourceScheduledEventParameters(sourceScheduledEventParameters);

			SourceOSSEventParameters sourceOSSEventParameters = new SourceOSSEventParameters();
			sourceOSSEventParameters.setStsRoleArn(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceOSSEventParameters.StsRoleArn"));

			List<String> eventTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceOSSEventParameters.EventTypes.Length"); j++) {
				eventTypes.add(_ctx.stringValue("ListUserDefinedEventSourcesResponse.Data.EventSourceList["+ i +"].SourceOSSEventParameters.EventTypes["+ j +"]"));
			}
			sourceOSSEventParameters.setEventTypes(eventTypes);
			eventSourceListItem.setSourceOSSEventParameters(sourceOSSEventParameters);

			eventSourceList.add(eventSourceListItem);
		}
		data.setEventSourceList(eventSourceList);
		listUserDefinedEventSourcesResponse.setData(data);
	 
	 	return listUserDefinedEventSourcesResponse;
	}
}