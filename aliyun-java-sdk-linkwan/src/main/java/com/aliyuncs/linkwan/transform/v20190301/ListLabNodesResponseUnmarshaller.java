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

import com.aliyuncs.linkwan.model.v20190301.ListLabNodesResponse;
import com.aliyuncs.linkwan.model.v20190301.ListLabNodesResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListLabNodesResponse.Data.LabNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabNodesResponseUnmarshaller {

	public static ListLabNodesResponse unmarshall(ListLabNodesResponse listLabNodesResponse, UnmarshallerContext _ctx) {
		
		listLabNodesResponse.setRequestId(_ctx.stringValue("ListLabNodesResponse.RequestId"));
		listLabNodesResponse.setSuccess(_ctx.booleanValue("ListLabNodesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListLabNodesResponse.Data.TotalCount"));

		List<LabNode> list = new ArrayList<LabNode>();
		for (int i = 0; i < _ctx.lengthValue("ListLabNodesResponse.Data.List.Length"); i++) {
			LabNode labNode = new LabNode();
			labNode.setDevEui(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].DevEui"));
			labNode.setJoinEui(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].JoinEui"));
			labNode.setName(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].Name"));
			labNode.setLoraVersion(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].LoraVersion"));
			labNode.setClassMode(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].ClassMode"));
			labNode.setAppKey(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].AppKey"));
			labNode.setFreqBandPlanGroupId(_ctx.longValue("ListLabNodesResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			labNode.setCreateMillis(_ctx.longValue("ListLabNodesResponse.Data.List["+ i +"].CreateMillis"));
			labNode.setActivationState(_ctx.stringValue("ListLabNodesResponse.Data.List["+ i +"].ActivationState"));
			labNode.setBoundGatewaysCount(_ctx.longValue("ListLabNodesResponse.Data.List["+ i +"].BoundGatewaysCount"));

			list.add(labNode);
		}
		data.setList(list);
		listLabNodesResponse.setData(data);
	 
	 	return listLabNodesResponse;
	}
}