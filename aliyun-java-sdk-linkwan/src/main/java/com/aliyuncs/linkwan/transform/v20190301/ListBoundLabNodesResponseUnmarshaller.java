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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListBoundLabNodesResponse;
import com.aliyuncs.linkwan.model.v20190301.ListBoundLabNodesResponse.LabNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBoundLabNodesResponseUnmarshaller {

	public static ListBoundLabNodesResponse unmarshall(ListBoundLabNodesResponse listBoundLabNodesResponse, UnmarshallerContext _ctx) {
		
		listBoundLabNodesResponse.setRequestId(_ctx.stringValue("ListBoundLabNodesResponse.RequestId"));
		listBoundLabNodesResponse.setSuccess(_ctx.booleanValue("ListBoundLabNodesResponse.Success"));

		List<LabNode> data = new ArrayList<LabNode>();
		for (int i = 0; i < _ctx.lengthValue("ListBoundLabNodesResponse.Data.Length"); i++) {
			LabNode labNode = new LabNode();
			labNode.setDevEui(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].DevEui"));
			labNode.setJoinEui(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].JoinEui"));
			labNode.setName(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].Name"));
			labNode.setLoraVersion(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].LoraVersion"));
			labNode.setClassMode(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].ClassMode"));
			labNode.setAppKey(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].AppKey"));
			labNode.setFreqBandPlanGroupId(_ctx.longValue("ListBoundLabNodesResponse.Data["+ i +"].FreqBandPlanGroupId"));
			labNode.setBoundGatewaysCount(_ctx.longValue("ListBoundLabNodesResponse.Data["+ i +"].BoundGatewaysCount"));
			labNode.setActivationState(_ctx.stringValue("ListBoundLabNodesResponse.Data["+ i +"].ActivationState"));
			labNode.setCreateMillis(_ctx.longValue("ListBoundLabNodesResponse.Data["+ i +"].CreateMillis"));

			data.add(labNode);
		}
		listBoundLabNodesResponse.setData(data);
	 
	 	return listBoundLabNodesResponse;
	}
}