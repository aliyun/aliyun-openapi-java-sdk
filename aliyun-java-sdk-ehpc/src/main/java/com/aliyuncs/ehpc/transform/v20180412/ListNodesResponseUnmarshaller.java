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
		listNodesResponse.setPageSize(_ctx.integerValue("ListNodesResponse.PageSize"));
		listNodesResponse.setPageNumber(_ctx.integerValue("ListNodesResponse.PageNumber"));
		listNodesResponse.setTotalCount(_ctx.integerValue("ListNodesResponse.TotalCount"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setVpcId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].VpcId"));
			nodeInfo.setStatus(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Status"));
			nodeInfo.setHtEnabled(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].HtEnabled"));
			nodeInfo.setExpired(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setImageOwnerAlias(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setLockReason(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setHostName(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setInstanceType(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].InstanceType"));
			nodeInfo.setPublicIpAddress(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].PublicIpAddress"));
			nodeInfo.setSpotStrategy(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setCreatedByEhpc(_ctx.booleanValue("ListNodesResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setRegionId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setVSwitchId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].VSwitchId"));
			nodeInfo.setIpAddress(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].IpAddress"));
			nodeInfo.setExpiredTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setVersion(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Version"));
			nodeInfo.setZoneId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ZoneId"));
			nodeInfo.setAddTime(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setImageId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setLocation(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Location"));
			nodeInfo.setId(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Id"));
			nodeInfo.setCreateMode(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].CreateMode"));
			nodeInfo.setStateInSched(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].StateInSched"));

			List<String> roles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.Nodes["+ i +"].Roles.Length"); j++) {
				roles.add(_ctx.stringValue("ListNodesResponse.Nodes["+ i +"].Roles["+ j +"]"));
			}
			nodeInfo.setRoles(roles);

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