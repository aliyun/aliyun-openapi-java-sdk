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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.UpdateEndpointGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEndpointGroupsResponseUnmarshaller {

	public static UpdateEndpointGroupsResponse unmarshall(UpdateEndpointGroupsResponse updateEndpointGroupsResponse, UnmarshallerContext _ctx) {
		
		updateEndpointGroupsResponse.setRequestId(_ctx.stringValue("UpdateEndpointGroupsResponse.RequestId"));

		List<String> endpointGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateEndpointGroupsResponse.EndpointGroupIds.Length"); i++) {
			endpointGroupIds.add(_ctx.stringValue("UpdateEndpointGroupsResponse.EndpointGroupIds["+ i +"]"));
		}
		updateEndpointGroupsResponse.setEndpointGroupIds(endpointGroupIds);
	 
	 	return updateEndpointGroupsResponse;
	}
}