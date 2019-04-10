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

import com.aliyuncs.ehpc.model.v20180412.ListNodesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListNodesResponse.NodeInfo;
import com.aliyuncs.ehpc.model.v20180412.ListNodesResponse.NodeInfo.TotalResources;
import com.aliyuncs.ehpc.model.v20180412.ListNodesResponse.NodeInfo.UsedResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext context) {
		
		listNodesResponse.setRequestId(context.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setTotalCount(context.integerValue("ListNodesResponse.TotalCount"));
		listNodesResponse.setPageNumber(context.integerValue("ListNodesResponse.PageNumber"));
		listNodesResponse.setPageSize(context.integerValue("ListNodesResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < context.lengthValue("ListNodesResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(context.stringValue("ListNodesResponse.Nodes["+ i +"].Id"));
			nodeInfo.setRegionId(context.stringValue("ListNodesResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setHostName(context.stringValue("ListNodesResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setStatus(context.stringValue("ListNodesResponse.Nodes["+ i +"].Status"));
			nodeInfo.setVersion(context.stringValue("ListNodesResponse.Nodes["+ i +"].Version"));
			nodeInfo.setCreatedByEhpc(context.booleanValue("ListNodesResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(context.stringValue("ListNodesResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(context.booleanValue("ListNodesResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(context.stringValue("ListNodesResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(context.stringValue("ListNodesResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(context.stringValue("ListNodesResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(context.stringValue("ListNodesResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(context.stringValue("ListNodesResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setLocation(context.stringValue("ListNodesResponse.Nodes["+ i +"].Location"));
			nodeInfo.setCreateMode(context.stringValue("ListNodesResponse.Nodes["+ i +"].CreateMode"));

			List<String> roles = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListNodesResponse.Nodes["+ i +"].Roles.Length"); j++) {
				roles.add(context.stringValue("ListNodesResponse.Nodes["+ i +"].Roles["+ j +"]"));
			}
			nodeInfo.setRoles(roles);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(context.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(context.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(context.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(context.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(context.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(context.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesResponse.setNodes(nodes);
	 
	 	return listNodesResponse;
	}
}