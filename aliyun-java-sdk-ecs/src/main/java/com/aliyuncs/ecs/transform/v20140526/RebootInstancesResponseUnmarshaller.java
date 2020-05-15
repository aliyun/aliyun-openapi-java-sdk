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

import com.aliyuncs.ecs.model.v20140526.RebootInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.RebootInstancesResponse.InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebootInstancesResponseUnmarshaller {

	public static RebootInstancesResponse unmarshall(RebootInstancesResponse rebootInstancesResponse, UnmarshallerContext _ctx) {
		
		rebootInstancesResponse.setRequestId(_ctx.stringValue("RebootInstancesResponse.RequestId"));

		List<InstanceResponse> instanceResponses = new ArrayList<InstanceResponse>();
		for (int i = 0; i < _ctx.lengthValue("RebootInstancesResponse.InstanceResponses.Length"); i++) {
			InstanceResponse instanceResponse = new InstanceResponse();
			instanceResponse.setInstanceId(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].InstanceId"));
			instanceResponse.setPreviousStatus(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].PreviousStatus"));
			instanceResponse.setCurrentStatus(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].CurrentStatus"));
			instanceResponse.setCode(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].Code"));
			instanceResponse.setMessage(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].Message"));

			instanceResponses.add(instanceResponse);
		}
		rebootInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return rebootInstancesResponse;
	}
}