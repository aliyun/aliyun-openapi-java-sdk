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

package com.aliyuncs.fnf.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.fnf.model.v20190315.ListFlowsResponse;
import com.aliyuncs.fnf.model.v20190315.ListFlowsResponse.FlowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowsResponseUnmarshaller {

	public static ListFlowsResponse unmarshall(ListFlowsResponse listFlowsResponse, UnmarshallerContext _ctx) {
		
		listFlowsResponse.setRequestId(_ctx.stringValue("ListFlowsResponse.RequestId"));
		listFlowsResponse.setNextToken(_ctx.stringValue("ListFlowsResponse.NextToken"));

		List<FlowsItem> flows = new ArrayList<FlowsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowsResponse.Flows.Length"); i++) {
			FlowsItem flowsItem = new FlowsItem();
			flowsItem.setName(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].Name"));
			flowsItem.setDescription(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].Description"));
			flowsItem.setDefinition(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].Definition"));
			flowsItem.setId(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].Id"));
			flowsItem.setType(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].Type"));
			flowsItem.setRoleArn(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].RoleArn"));
			flowsItem.setCreatedTime(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].CreatedTime"));
			flowsItem.setLastModifiedTime(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].LastModifiedTime"));
			flowsItem.setExternalStorageLocation(_ctx.stringValue("ListFlowsResponse.Flows["+ i +"].ExternalStorageLocation"));

			flows.add(flowsItem);
		}
		listFlowsResponse.setFlows(flows);
	 
	 	return listFlowsResponse;
	}
}