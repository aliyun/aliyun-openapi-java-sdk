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

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsMqttQueryClientByClientIdResponse;
import com.aliyuncs.ons.model.v20180516.OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo;
import com.aliyuncs.ons.model.v20180516.OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SubscriptionDo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryClientByClientIdResponseUnmarshaller {

	public static OnsMqttQueryClientByClientIdResponse unmarshall(OnsMqttQueryClientByClientIdResponse onsMqttQueryClientByClientIdResponse, UnmarshallerContext context) {
		
		onsMqttQueryClientByClientIdResponse.setRequestId(context.stringValue("OnsMqttQueryClientByClientIdResponse.RequestId"));
		onsMqttQueryClientByClientIdResponse.setHelpUrl(context.stringValue("OnsMqttQueryClientByClientIdResponse.HelpUrl"));

		MqttClientInfoDo mqttClientInfoDo = new MqttClientInfoDo();
		mqttClientInfoDo.setOnline(context.booleanValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.Online"));
		mqttClientInfoDo.setClientId(context.stringValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.ClientId"));
		mqttClientInfoDo.setSocketChannel(context.stringValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SocketChannel"));
		mqttClientInfoDo.setLastTouch(context.longValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.LastTouch"));

		List<SubscriptionDo> subScriptonData = new ArrayList<SubscriptionDo>();
		for (int i = 0; i < context.lengthValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SubScriptonData.Length"); i++) {
			SubscriptionDo subscriptionDo = new SubscriptionDo();
			subscriptionDo.setParentTopic(context.stringValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SubScriptonData["+ i +"].ParentTopic"));
			subscriptionDo.setSubTopic(context.stringValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SubScriptonData["+ i +"].SubTopic"));
			subscriptionDo.setQos(context.integerValue("OnsMqttQueryClientByClientIdResponse.MqttClientInfoDo.SubScriptonData["+ i +"].Qos"));

			subScriptonData.add(subscriptionDo);
		}
		mqttClientInfoDo.setSubScriptonData(subScriptonData);
		onsMqttQueryClientByClientIdResponse.setMqttClientInfoDo(mqttClientInfoDo);
	 
	 	return onsMqttQueryClientByClientIdResponse;
	}
}