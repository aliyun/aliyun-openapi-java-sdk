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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.ListGroupIdResponse;
import com.aliyuncs.onsmqtt.model.v20200420.ListGroupIdResponse.MqttGroupIdDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupIdResponseUnmarshaller {

	public static ListGroupIdResponse unmarshall(ListGroupIdResponse listGroupIdResponse, UnmarshallerContext _ctx) {
		
		listGroupIdResponse.setRequestId(_ctx.stringValue("ListGroupIdResponse.RequestId"));

		List<MqttGroupIdDo> data = new ArrayList<MqttGroupIdDo>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupIdResponse.Data.Length"); i++) {
			MqttGroupIdDo mqttGroupIdDo = new MqttGroupIdDo();
			mqttGroupIdDo.setCreateTime(_ctx.longValue("ListGroupIdResponse.Data["+ i +"].CreateTime"));
			mqttGroupIdDo.setGroupId(_ctx.stringValue("ListGroupIdResponse.Data["+ i +"].GroupId"));
			mqttGroupIdDo.setIndependentNaming(_ctx.booleanValue("ListGroupIdResponse.Data["+ i +"].IndependentNaming"));
			mqttGroupIdDo.setInstanceId(_ctx.stringValue("ListGroupIdResponse.Data["+ i +"].InstanceId"));
			mqttGroupIdDo.setUpdateTime(_ctx.longValue("ListGroupIdResponse.Data["+ i +"].UpdateTime"));

			data.add(mqttGroupIdDo);
		}
		listGroupIdResponse.setData(data);
	 
	 	return listGroupIdResponse;
	}
}