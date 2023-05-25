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

import com.aliyuncs.ecs.model.v20140526.StartInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.StartInstancesResponse.InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartInstancesResponseUnmarshaller {

	public static StartInstancesResponse unmarshall(StartInstancesResponse startInstancesResponse, UnmarshallerContext _ctx) {
		
		startInstancesResponse.setRequestId(_ctx.stringValue("StartInstancesResponse.RequestId"));

		List<InstanceResponse> instanceResponses = new ArrayList<InstanceResponse>();
		for (int i = 0; i < _ctx.lengthValue("StartInstancesResponse.InstanceResponses.Length"); i++) {
			InstanceResponse instanceResponse = new InstanceResponse();
			instanceResponse.setCode(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].Code"));
			instanceResponse.setMessage(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].Message"));
			instanceResponse.setInstanceId(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].InstanceId"));
			instanceResponse.setCurrentStatus(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].CurrentStatus"));
			instanceResponse.setPreviousStatus(_ctx.stringValue("StartInstancesResponse.InstanceResponses["+ i +"].PreviousStatus"));

			instanceResponses.add(instanceResponse);
		}
		startInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return startInstancesResponse;
	}
}