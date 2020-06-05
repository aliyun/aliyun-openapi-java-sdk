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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DescribeMqttConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMqttConfigResponseUnmarshaller {

	public static DescribeMqttConfigResponse unmarshall(DescribeMqttConfigResponse describeMqttConfigResponse, UnmarshallerContext _ctx) {
		
		describeMqttConfigResponse.setRequestId(_ctx.stringValue("DescribeMqttConfigResponse.RequestId"));
		describeMqttConfigResponse.setSuccess(_ctx.booleanValue("DescribeMqttConfigResponse.Success"));
		describeMqttConfigResponse.setCode(_ctx.stringValue("DescribeMqttConfigResponse.Code"));
		describeMqttConfigResponse.setMessage(_ctx.stringValue("DescribeMqttConfigResponse.Message"));
		describeMqttConfigResponse.setIsEnabled(_ctx.booleanValue("DescribeMqttConfigResponse.IsEnabled"));
		describeMqttConfigResponse.setBrokerUrl(_ctx.stringValue("DescribeMqttConfigResponse.BrokerUrl"));
		describeMqttConfigResponse.setInternalBrokerUrl(_ctx.stringValue("DescribeMqttConfigResponse.InternalBrokerUrl"));
		describeMqttConfigResponse.setPublishTopic(_ctx.stringValue("DescribeMqttConfigResponse.PublishTopic"));
		describeMqttConfigResponse.setSubscribeTopic(_ctx.stringValue("DescribeMqttConfigResponse.SubscribeTopic"));
		describeMqttConfigResponse.setGroupId(_ctx.stringValue("DescribeMqttConfigResponse.GroupId"));
		describeMqttConfigResponse.setMqttInstanceId(_ctx.stringValue("DescribeMqttConfigResponse.MqttInstanceId"));
		describeMqttConfigResponse.setAuthType(_ctx.stringValue("DescribeMqttConfigResponse.AuthType"));
		describeMqttConfigResponse.setUsername(_ctx.stringValue("DescribeMqttConfigResponse.Username"));
		describeMqttConfigResponse.setPassword(_ctx.stringValue("DescribeMqttConfigResponse.Password"));
	 
	 	return describeMqttConfigResponse;
	}
}