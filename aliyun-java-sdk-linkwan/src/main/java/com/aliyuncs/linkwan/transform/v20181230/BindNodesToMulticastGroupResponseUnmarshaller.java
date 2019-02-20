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

import com.aliyuncs.linkwan.model.v20181230.BindNodesToMulticastGroupResponse;
import com.aliyuncs.linkwan.model.v20181230.BindNodesToMulticastGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindNodesToMulticastGroupResponseUnmarshaller {

	public static BindNodesToMulticastGroupResponse unmarshall(BindNodesToMulticastGroupResponse bindNodesToMulticastGroupResponse, UnmarshallerContext context) {
		
		bindNodesToMulticastGroupResponse.setRequestId(context.stringValue("BindNodesToMulticastGroupResponse.RequestId"));
		bindNodesToMulticastGroupResponse.setSuccess(context.booleanValue("BindNodesToMulticastGroupResponse.Success"));

		Data data = new Data();

		List<String> failedNodes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("BindNodesToMulticastGroupResponse.Data.FailedNodes.Length"); i++) {
			failedNodes.add(context.stringValue("BindNodesToMulticastGroupResponse.Data.FailedNodes["+ i +"]"));
		}
		data.setFailedNodes(failedNodes);
		bindNodesToMulticastGroupResponse.setData(data);
	 
	 	return bindNodesToMulticastGroupResponse;
	}
}