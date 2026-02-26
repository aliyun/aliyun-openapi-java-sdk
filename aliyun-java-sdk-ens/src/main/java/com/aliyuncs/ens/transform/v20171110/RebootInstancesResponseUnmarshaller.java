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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.RebootInstancesResponse;
import com.aliyuncs.ens.model.v20171110.RebootInstancesResponse.Responses;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebootInstancesResponseUnmarshaller {

	public static RebootInstancesResponse unmarshall(RebootInstancesResponse rebootInstancesResponse, UnmarshallerContext _ctx) {
		
		rebootInstancesResponse.setRequestId(_ctx.stringValue("RebootInstancesResponse.RequestId"));

		List<Responses> instanceResponses = new ArrayList<Responses>();
		for (int i = 0; i < _ctx.lengthValue("RebootInstancesResponse.InstanceResponses.Length"); i++) {
			Responses responses = new Responses();
			responses.setCode(_ctx.longValue("RebootInstancesResponse.InstanceResponses["+ i +"].Code"));
			responses.setMessage(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].Message"));
			responses.setInstanceId(_ctx.stringValue("RebootInstancesResponse.InstanceResponses["+ i +"].InstanceId"));

			instanceResponses.add(responses);
		}
		rebootInstancesResponse.setInstanceResponses(instanceResponses);
	 
	 	return rebootInstancesResponse;
	}
}