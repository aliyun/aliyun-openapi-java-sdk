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

import com.aliyuncs.linkwan.model.v20181230.ListLabNodesResponse;
import com.aliyuncs.linkwan.model.v20181230.ListLabNodesResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListLabNodesResponse.Data.LabNode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabNodesResponseUnmarshaller {

	public static ListLabNodesResponse unmarshall(ListLabNodesResponse listLabNodesResponse, UnmarshallerContext context) {
		
		listLabNodesResponse.setRequestId(context.stringValue("ListLabNodesResponse.RequestId"));
		listLabNodesResponse.setSuccess(context.booleanValue("ListLabNodesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListLabNodesResponse.Data.TotalCount"));

		List<LabNode> list = new ArrayList<LabNode>();
		for (int i = 0; i < context.lengthValue("ListLabNodesResponse.Data.List.Length"); i++) {
			LabNode labNode = new LabNode();
			labNode.setDevEui(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].DevEui"));
			labNode.setJoinEui(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].JoinEui"));
			labNode.setName(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].Name"));
			labNode.setLoraVersion(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].LoraVersion"));
			labNode.setClassMode(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].ClassMode"));
			labNode.setAppKey(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].AppKey"));
			labNode.setFreqBandPlanGroupId(context.longValue("ListLabNodesResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			labNode.setCreateMillis(context.longValue("ListLabNodesResponse.Data.List["+ i +"].CreateMillis"));
			labNode.setActivationState(context.stringValue("ListLabNodesResponse.Data.List["+ i +"].ActivationState"));
			labNode.setBoundGatewaysCount(context.longValue("ListLabNodesResponse.Data.List["+ i +"].BoundGatewaysCount"));

			list.add(labNode);
		}
		data.setList(list);
		listLabNodesResponse.setData(data);
	 
	 	return listLabNodesResponse;
	}
}