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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskTrafficResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo;
import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo.TargetTrafficsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrafficControlTaskTrafficResponseUnmarshaller {

	public static GetTrafficControlTaskTrafficResponse unmarshall(GetTrafficControlTaskTrafficResponse getTrafficControlTaskTrafficResponse, UnmarshallerContext _ctx) {
		
		getTrafficControlTaskTrafficResponse.setRequestId(_ctx.stringValue("GetTrafficControlTaskTrafficResponse.RequestId"));

		TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo = new TrafficControlTaskTrafficInfo();
		trafficControlTaskTrafficInfo.setTaskTraffics(_ctx.mapValue("GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo.TaskTraffics"));

		List<TargetTrafficsItem> targetTraffics = new ArrayList<TargetTrafficsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo.TargetTraffics.Length"); i++) {
			TargetTrafficsItem targetTrafficsItem = new TargetTrafficsItem();
			targetTrafficsItem.setTrafficContorlTargetId(_ctx.stringValue("GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo.TargetTraffics["+ i +"].TrafficContorlTargetId"));

			List<Map<Object, Object>> data = _ctx.listMapValue("GetTrafficControlTaskTrafficResponse.TrafficControlTaskTrafficInfo.TargetTraffics["+ i +"].Data");
			targetTrafficsItem.setData(data);

			targetTraffics.add(targetTrafficsItem);
		}
		trafficControlTaskTrafficInfo.setTargetTraffics(targetTraffics);
		getTrafficControlTaskTrafficResponse.setTrafficControlTaskTrafficInfo(trafficControlTaskTrafficInfo);
	 
	 	return getTrafficControlTaskTrafficResponse;
	}
}