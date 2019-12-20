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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsMqttGroupIdListResponse;
import com.aliyuncs.ons.model.v20190214.OnsMqttGroupIdListResponse.MqttGroupIdDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttGroupIdListResponseUnmarshaller {

	public static OnsMqttGroupIdListResponse unmarshall(OnsMqttGroupIdListResponse onsMqttGroupIdListResponse, UnmarshallerContext _ctx) {
		
		onsMqttGroupIdListResponse.setRequestId(_ctx.stringValue("OnsMqttGroupIdListResponse.RequestId"));
		onsMqttGroupIdListResponse.setHelpUrl(_ctx.stringValue("OnsMqttGroupIdListResponse.HelpUrl"));

		List<MqttGroupIdDo> data = new ArrayList<MqttGroupIdDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsMqttGroupIdListResponse.Data.Length"); i++) {
			MqttGroupIdDo mqttGroupIdDo = new MqttGroupIdDo();
			mqttGroupIdDo.setId(_ctx.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].Id"));
			mqttGroupIdDo.setChannelId(_ctx.integerValue("OnsMqttGroupIdListResponse.Data["+ i +"].ChannelId"));
			mqttGroupIdDo.setOwner(_ctx.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].Owner"));
			mqttGroupIdDo.setGroupId(_ctx.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].GroupId"));
			mqttGroupIdDo.setTopic(_ctx.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].Topic"));
			mqttGroupIdDo.setStatus(_ctx.integerValue("OnsMqttGroupIdListResponse.Data["+ i +"].Status"));
			mqttGroupIdDo.setCreateTime(_ctx.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].CreateTime"));
			mqttGroupIdDo.setUpdateTime(_ctx.longValue("OnsMqttGroupIdListResponse.Data["+ i +"].UpdateTime"));
			mqttGroupIdDo.setInstanceId(_ctx.stringValue("OnsMqttGroupIdListResponse.Data["+ i +"].InstanceId"));
			mqttGroupIdDo.setIndependentNaming(_ctx.booleanValue("OnsMqttGroupIdListResponse.Data["+ i +"].IndependentNaming"));

			data.add(mqttGroupIdDo);
		}
		onsMqttGroupIdListResponse.setData(data);
	 
	 	return onsMqttGroupIdListResponse;
	}
}