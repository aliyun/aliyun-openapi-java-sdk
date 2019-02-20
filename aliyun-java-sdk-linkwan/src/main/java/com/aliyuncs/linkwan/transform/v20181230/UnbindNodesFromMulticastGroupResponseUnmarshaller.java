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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.UnbindNodesFromMulticastGroupResponse;
import com.aliyuncs.linkwan.model.v20181230.UnbindNodesFromMulticastGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindNodesFromMulticastGroupResponseUnmarshaller {

	public static UnbindNodesFromMulticastGroupResponse unmarshall(UnbindNodesFromMulticastGroupResponse unbindNodesFromMulticastGroupResponse, UnmarshallerContext context) {
		
		unbindNodesFromMulticastGroupResponse.setRequestId(context.stringValue("UnbindNodesFromMulticastGroupResponse.RequestId"));
		unbindNodesFromMulticastGroupResponse.setSuccess(context.booleanValue("UnbindNodesFromMulticastGroupResponse.Success"));

		Data data = new Data();

		List<String> failedNodes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UnbindNodesFromMulticastGroupResponse.Data.FailedNodes.Length"); i++) {
			failedNodes.add(context.stringValue("UnbindNodesFromMulticastGroupResponse.Data.FailedNodes["+ i +"]"));
		}
		data.setFailedNodes(failedNodes);
		unbindNodesFromMulticastGroupResponse.setData(data);
	 
	 	return unbindNodesFromMulticastGroupResponse;
	}
}