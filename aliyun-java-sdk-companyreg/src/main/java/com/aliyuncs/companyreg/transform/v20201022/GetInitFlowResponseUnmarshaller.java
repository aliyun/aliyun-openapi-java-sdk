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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.GetInitFlowResponse;
import com.aliyuncs.companyreg.model.v20201022.GetInitFlowResponse.NodeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInitFlowResponseUnmarshaller {

	public static GetInitFlowResponse unmarshall(GetInitFlowResponse getInitFlowResponse, UnmarshallerContext _ctx) {
		
		getInitFlowResponse.setRequestId(_ctx.stringValue("GetInitFlowResponse.RequestId"));
		getInitFlowResponse.setFlowStatus(_ctx.stringValue("GetInitFlowResponse.FlowStatus"));

		List<NodeListItem> nodeList = new ArrayList<NodeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInitFlowResponse.NodeList.Length"); i++) {
			NodeListItem nodeListItem = new NodeListItem();
			nodeListItem.setIndex(_ctx.integerValue("GetInitFlowResponse.NodeList["+ i +"].Index"));
			nodeListItem.setStatus(_ctx.stringValue("GetInitFlowResponse.NodeList["+ i +"].Status"));
			nodeListItem.setDescription(_ctx.stringValue("GetInitFlowResponse.NodeList["+ i +"].Description"));
			nodeListItem.setCode(_ctx.stringValue("GetInitFlowResponse.NodeList["+ i +"].Code"));
			nodeListItem.setName(_ctx.stringValue("GetInitFlowResponse.NodeList["+ i +"].Name"));
			nodeListItem.setFailReason(_ctx.stringValue("GetInitFlowResponse.NodeList["+ i +"].FailReason"));
			nodeListItem.setId(_ctx.integerValue("GetInitFlowResponse.NodeList["+ i +"].Id"));

			nodeList.add(nodeListItem);
		}
		getInitFlowResponse.setNodeList(nodeList);
	 
	 	return getInitFlowResponse;
	}
}