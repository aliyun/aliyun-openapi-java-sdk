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

	public static ListNodesNoPagingResponse unmarshall(ListNodesNoPagingResponse listNodesNoPagingResponse, UnmarshallerContext context) {
		
		listNodesNoPagingResponse.setRequestId(context.stringValue("ListNodesNoPagingResponse.RequestId"));
		listNodesNoPagingResponse.setTotalCount(context.integerValue("ListNodesNoPagingResponse.TotalCount"));
		listNodesNoPagingResponse.setPageNumber(context.integerValue("ListNodesNoPagingResponse.PageNumber"));
		listNodesNoPagingResponse.setPageSize(context.integerValue("ListNodesNoPagingResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < context.lengthValue("ListNodesNoPagingResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Id"));
			nodeInfo.setRegionId(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setStatus(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Status"));
			nodeInfo.setCreatedByEhpc(context.booleanValue("ListNodesNoPagingResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(context.booleanValue("ListNodesNoPagingResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].ImageId"));

			List<String> roles = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListNodesNoPagingResponse.Nodes["+ i +"].Roles.Length"); j++) {
				roles.add(context.stringValue("ListNodesNoPagingResponse.Nodes["+ i +"].Roles["+ j +"]"));
			}
			nodeInfo.setRoles(roles);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(context.integerValue("ListNodesNoPagingResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesNoPagingResponse.setNodes(nodes);
	 
	 	return listNodesNoPagingResponse;
	}
}