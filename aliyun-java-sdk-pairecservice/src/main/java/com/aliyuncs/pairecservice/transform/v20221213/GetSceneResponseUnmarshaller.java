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

import com.aliyuncs.pairecservice.model.v20221213.GetSceneResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetSceneResponse.FlowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSceneResponseUnmarshaller {

	public static GetSceneResponse unmarshall(GetSceneResponse getSceneResponse, UnmarshallerContext _ctx) {
		
		getSceneResponse.setRequestId(_ctx.stringValue("GetSceneResponse.RequestId"));
		getSceneResponse.setName(_ctx.stringValue("GetSceneResponse.Name"));
		getSceneResponse.setDescription(_ctx.stringValue("GetSceneResponse.Description"));

		List<FlowsItem> flows = new ArrayList<FlowsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSceneResponse.Flows.Length"); i++) {
			FlowsItem flowsItem = new FlowsItem();
			flowsItem.setFlowName(_ctx.stringValue("GetSceneResponse.Flows["+ i +"].FlowName"));
			flowsItem.setFlowCode(_ctx.stringValue("GetSceneResponse.Flows["+ i +"].FlowCode"));

			flows.add(flowsItem);
		}
		getSceneResponse.setFlows(flows);
	 
	 	return getSceneResponse;
	}
}