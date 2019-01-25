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

import com.aliyuncs.ons.model.v20180516.OnsMqttGroupIdListResponse;
import com.aliyuncs.ons.model.v20180516.OnsMqttGroupIdListResponse.MqttGroupIdDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttGroupIdListResponseUnmarshaller {

	public static OnsMqttGroupIdListResponse unmarshall(OnsMqttGroupIdListResponse onsMqttGroupIdListResponse, UnmarshallerContext context) {
		
		onsMqttGroupIdListResponse.setRequestId(context.stringValue("OnsMqttGroupIdListResponse.RequestId"));
		onsMqttGroupIdListResponse.setHelpUrl(context.stringValue("OnsMqttGroupIdListResponse.HelpUrl"));

		List<MqttGroupIdDo> data = new ArrayList<MqttGroupIdDo>();
		for (int i = 0; i < context.lengthValue("OnsMqttGroupIdListResponse.Data.Length"); i++) {
			MqttGroupIdDo mqttGroupIdDo = new MqttGroupIdDo();
			mqttGroupIdDo.setId(context.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].Id"));
			mqttGroupIdDo.setChannelId(context.integerValue("OnsMqttGroupIdListResponse.Data["+ i +"].ChannelId"));
			mqttGroupIdDo.setOwner(context.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].Owner"));
			mqttGroupIdDo.setGroupId(context.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].GroupId"));
			mqttGroupIdDo.setTopic(context.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].Topic"));
			mqttGroupIdDo.setStatus(context.integerValue("OnsMqttGroupIdListResponse.Data["+ i +"].Status"));
			mqttGroupIdDo.setCreateTime(context.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].CreateTime"));
			mqttGroupIdDo.setUpdateTime(context.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].UpdateTime"));

			data.add(mqttGroupIdDo);
		}
		onsMqttGroupIdListResponse.setData(data);
	 
	 	return onsMqttGroupIdListResponse;
	}
}