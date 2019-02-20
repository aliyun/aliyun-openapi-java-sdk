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

import com.aliyuncs.linkwan.model.v20181230.ListBoundLabNodesResponse;
import com.aliyuncs.linkwan.model.v20181230.ListBoundLabNodesResponse.LabNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBoundLabNodesResponseUnmarshaller {

	public static ListBoundLabNodesResponse unmarshall(ListBoundLabNodesResponse listBoundLabNodesResponse, UnmarshallerContext context) {
		
		listBoundLabNodesResponse.setRequestId(context.stringValue("ListBoundLabNodesResponse.RequestId"));
		listBoundLabNodesResponse.setSuccess(context.booleanValue("ListBoundLabNodesResponse.Success"));

		List<LabNode> data = new ArrayList<LabNode>();
		for (int i = 0; i < context.lengthValue("ListBoundLabNodesResponse.Data.Length"); i++) {
			LabNode labNode = new LabNode();
			labNode.setDevEui(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].DevEui"));
			labNode.setJoinEui(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].JoinEui"));
			labNode.setName(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].Name"));
			labNode.setLoraVersion(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].LoraVersion"));
			labNode.setClassMode(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].ClassMode"));
			labNode.setAppKey(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].AppKey"));
			labNode.setFreqBandPlanGroupId(context.longValue("ListBoundLabNodesResponse.Data["+ i +"].FreqBandPlanGroupId"));
			labNode.setBoundGatewaysCount(context.longValue("ListBoundLabNodesResponse.Data["+ i +"].BoundGatewaysCount"));
			labNode.setActivationState(context.stringValue("ListBoundLabNodesResponse.Data["+ i +"].ActivationState"));
			labNode.setCreateMillis(context.longValue("ListBoundLabNodesResponse.Data["+ i +"].CreateMillis"));

			data.add(labNode);
		}
		listBoundLabNodesResponse.setData(data);
	 
	 	return listBoundLabNodesResponse;
	}
}