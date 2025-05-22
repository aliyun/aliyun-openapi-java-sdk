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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.AttachRCInstancesResponse;
import com.aliyuncs.rds.model.v20140815.AttachRCInstancesResponse.Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachRCInstancesResponseUnmarshaller {

	public static AttachRCInstancesResponse unmarshall(AttachRCInstancesResponse attachRCInstancesResponse, UnmarshallerContext _ctx) {
		
		attachRCInstancesResponse.setRequestId(_ctx.stringValue("AttachRCInstancesResponse.RequestId"));
		attachRCInstancesResponse.setTaskId(_ctx.stringValue("AttachRCInstancesResponse.TaskId"));

		List<Response> responses = new ArrayList<Response>();
		for (int i = 0; i < _ctx.lengthValue("AttachRCInstancesResponse.Responses.Length"); i++) {
			Response response = new Response();
			response.setCode(_ctx.stringValue("AttachRCInstancesResponse.Responses["+ i +"].Code"));
			response.setInstanceId(_ctx.stringValue("AttachRCInstancesResponse.Responses["+ i +"].InstanceId"));
			response.setMessage(_ctx.stringValue("AttachRCInstancesResponse.Responses["+ i +"].Message"));

			responses.add(response);
		}
		attachRCInstancesResponse.setResponses(responses);
	 
	 	return attachRCInstancesResponse;
	}
}