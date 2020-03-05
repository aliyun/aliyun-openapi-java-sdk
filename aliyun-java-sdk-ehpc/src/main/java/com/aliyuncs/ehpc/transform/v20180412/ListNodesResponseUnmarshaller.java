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

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext _ctx) {
		
		listNodesResponse.setRequestId(_ctx.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setTotalCount(_ctx.integerValue("ListNodesResponse.TotalCount"));
		listNodesResponse.setPageNumber(_ctx.integerValue("ListNodesResponse.PageNumber"));
		listNodesResponse.setPageSize(_ctx.integerValue("ListNodesResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Id"));
			nodeInfo.setRegionId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setHostName(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setIpAddress(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].IpAddress"));
			nodeInfo.setStatus(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Status"));
			nodeInfo.setVersion(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Version"));
			nodeInfo.setCreatedByEhpc(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setLocation(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Location"));
			nodeInfo.setCreateMode(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].CreateMode"));
			nodeInfo.setVpcId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].VpcId"));
			nodeInfo.setZoneId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ZoneId"));
			nodeInfo.setVSwitchId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].VSwitchId"));
			nodeInfo.setHtEnabled(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].HtEnabled"));

			List<String> roles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.Nodes["+ i +"].Roles.Length"); j++) {
				roles.add(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Roles["+ j +"]"));
			}
			nodeInfo.setRoles(roles);

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(_ctx.integerValue("ListNodesResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesResponse.setNodes(nodes);
	 
	 	return listNodesResponse;
	}
}