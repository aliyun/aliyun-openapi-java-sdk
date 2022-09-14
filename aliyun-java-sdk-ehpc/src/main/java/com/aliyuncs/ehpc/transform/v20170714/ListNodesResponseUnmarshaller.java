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

package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListNodesResponse;
import com.aliyuncs.ehpc.model.v20170714.ListNodesResponse.NodeInfo;
import com.aliyuncs.ehpc.model.v20170714.ListNodesResponse.NodeInfo.TotalResources;
import com.aliyuncs.ehpc.model.v20170714.ListNodesResponse.NodeInfo.UsedResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext _ctx) {
		
		listNodesResponse.setRequestId(_ctx.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setPageSize(_ctx.integerValue("ListNodesResponse.PageSize"));
		listNodesResponse.setPageNumber(_ctx.integerValue("ListNodesResponse.PageNumber"));
		listNodesResponse.setTotalCount(_ctx.integerValue("ListNodesResponse.TotalCount"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setStatus(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Status"));
			nodeInfo.setExpired(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setImageOwnerAlias(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setLockReason(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setSpotStrategy(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setRegionId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setCreatedByEhpc(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setExpiredTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setRole(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Role"));
			nodeInfo.setAddTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setImageId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Id"));

			TotalResources totalResources = new TotalResources();
			totalResources.setGpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Gpu"));
			totalResources.setCpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Memory"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setGpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Gpu"));
			usedResources.setCpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Memory"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesResponse.setNodes(nodes);
	 
	 	return listNodesResponse;
	}
}