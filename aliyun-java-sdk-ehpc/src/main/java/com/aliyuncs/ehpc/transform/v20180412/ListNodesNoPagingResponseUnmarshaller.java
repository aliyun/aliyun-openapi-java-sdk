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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListNodesNoPagingResponse;
import com.aliyuncs.ehpc.model.v20180412.ListNodesNoPagingResponse.NodeInfo;
import com.aliyuncs.ehpc.model.v20180412.ListNodesNoPagingResponse.NodeInfo.TotalResources;
import com.aliyuncs.ehpc.model.v20180412.ListNodesNoPagingResponse.NodeInfo.UsedResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesNoPagingResponseUnmarshaller {

	public static ListNodesNoPagingResponse unmarshall(ListNodesNoPagingResponse listNodesNoPagingResponse, UnmarshallerContext _ctx) {
		
		listNodesNoPagingResponse.setRequestId(_ctx.stringValue("ListNodesNoPagingResponse.RequestId"));
		listNodesNoPagingResponse.setTotalCount(_ctx.integerValue("ListNodesNoPagingResponse.TotalCount"));
		listNodesNoPagingResponse.setPageNumber(_ctx.integerValue("ListNodesNoPagingResponse.PageNumber"));
		listNodesNoPagingResponse.setPageSize(_ctx.integerValue("ListNodesNoPagingResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesNoPagingResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Id"));
			nodeInfo.setHostName(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setRegionId(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setStatus(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Status"));
			nodeInfo.setVersion(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Version"));
			nodeInfo.setCreatedByEhpc(_ctx.booleanValue("ListNodesNoPagingResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(_ctx.booleanValue("ListNodesNoPagingResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setHtEnabled(_ctx.booleanValue("ListNodesNoPagingResponse.Nodes["+ i +"].HtEnabled"));

			List<String> roles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesNoPagingResponse.Nodes["+ i +"].Roles.Length"); j++) {
				roles.add(_ctx.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Roles["+ j +"]"));
			}
			nodeInfo.setRoles(roles);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(_ctx.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesNoPagingResponse.setNodes(nodes);
	 
	 	return listNodesNoPagingResponse;
	}
}