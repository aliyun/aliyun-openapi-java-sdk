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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.StopInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.StopInstancesResponse.InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopInstancesResponseUnmarshaller {

	public static StopInstancesResponse unmarshall(StopInstancesResponse stopInstancesResponse, UnmarshallerContext _ctx) {
		
		stopInstancesResponse.setRequestId(_ctx.stringValue("StopInstancesResponse.RequestId"));

		List<InstanceResponse> instanceResponses = new ArrayList<InstanceResponse>();
		for (int i = 0; i < _ctx.lengthValue("StopInstancesResponse.InstanceResponses.Length"); i++) {
			InstanceResponse instanceResponse = new InstanceResponse();
			instanceResponse.setInstanceId(_ctx.stringValue("StopInstancesResponse.InstanceResponses["+ i +"].InstanceId"));
			instanceResponse.setPreviousStatus(_ctx.stringValue("StopInstancesResponse.InstanceResponses["+ i +"].PreviousStatus"));
			instanceResponse.setCurrentStatus(_ctx.stringValue("StopInstancesResponse.InstanceResponses["+ i +"].CurrentStatus"));
			instanceResponse.setCode(_ctx.stringValue("StopInstancesResponse.InstanceResponses["+ i +"].Code"));
			instanceResponse.setMessage(_ctx.stringValue("StopInstancesResponse.InstanceResponses["+ i +"].Message"));

			instanceResponses.add(instanceResponse);
		}
		stopInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return stopInstancesResponse;
	}
}