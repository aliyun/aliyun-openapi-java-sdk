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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskInstanceRelationResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskInstanceRelationResponse.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskInstanceRelationResponseUnmarshaller {

	public static GetTaskInstanceRelationResponse unmarshall(GetTaskInstanceRelationResponse getTaskInstanceRelationResponse, UnmarshallerContext _ctx) {
		
		getTaskInstanceRelationResponse.setRequestId(_ctx.stringValue("GetTaskInstanceRelationResponse.RequestId"));
		getTaskInstanceRelationResponse.setErrorCode(_ctx.stringValue("GetTaskInstanceRelationResponse.ErrorCode"));
		getTaskInstanceRelationResponse.setErrorMessage(_ctx.stringValue("GetTaskInstanceRelationResponse.ErrorMessage"));
		getTaskInstanceRelationResponse.setSuccess(_ctx.booleanValue("GetTaskInstanceRelationResponse.Success"));

		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskInstanceRelationResponse.NodeList.Length"); i++) {
			Node node = new Node();
			node.setId(_ctx.longValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].Id"));
			node.setNodeId(_ctx.longValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].NodeId"));
			node.setNodeName(_ctx.stringValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].NodeName"));
			node.setNodeType(_ctx.integerValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].NodeType"));
			node.setBusinessTime(_ctx.stringValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].BusinessTime"));
			node.setStatus(_ctx.integerValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].Status"));
			node.setMessage(_ctx.stringValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].Message"));
			node.setExecuteTime(_ctx.longValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].ExecuteTime"));
			node.setEndTime(_ctx.stringValue("GetTaskInstanceRelationResponse.NodeList["+ i +"].EndTime"));

			nodeList.add(node);
		}
		getTaskInstanceRelationResponse.setNodeList(nodeList);
	 
	 	return getTaskInstanceRelationResponse;
	}
}