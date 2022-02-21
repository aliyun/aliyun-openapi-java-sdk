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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.MoveResourcesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.MoveResourcesResponse.Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveResourcesResponseUnmarshaller {

	public static MoveResourcesResponse unmarshall(MoveResourcesResponse moveResourcesResponse, UnmarshallerContext _ctx) {
		
		moveResourcesResponse.setRequestId(_ctx.stringValue("MoveResourcesResponse.RequestId"));

		List<Response> responses = new ArrayList<Response>();
		for (int i = 0; i < _ctx.lengthValue("MoveResourcesResponse.Responses.Length"); i++) {
			Response response = new Response();
			response.setService(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].Service"));
			response.setResourceId(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].ResourceId"));
			response.setResourceType(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].ResourceType"));
			response.setRequestId(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].RequestId"));
			response.setStatus(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].Status"));
			response.setErrorCode(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].ErrorCode"));
			response.setErrorMsg(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].ErrorMsg"));
			response.setRegionId(_ctx.stringValue("MoveResourcesResponse.Responses["+ i +"].RegionId"));

			responses.add(response);
		}
		moveResourcesResponse.setResponses(responses);
	 
	 	return moveResourcesResponse;
	}
}