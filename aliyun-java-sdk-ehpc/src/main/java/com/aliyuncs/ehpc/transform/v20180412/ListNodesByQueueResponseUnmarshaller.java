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

import com.aliyuncs.ehpc.model.v20180412.ListNodesByQueueResponse;
import com.aliyuncs.ehpc.model.v20180412.ListNodesByQueueResponse.NodeInfo;
import com.aliyuncs.ehpc.model.v20180412.ListNodesByQueueResponse.NodeInfo.TotalResources;
import com.aliyuncs.ehpc.model.v20180412.ListNodesByQueueResponse.NodeInfo.UsedResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByQueueResponseUnmarshaller {

	public static ListNodesByQueueResponse unmarshall(ListNodesByQueueResponse listNodesByQueueResponse, UnmarshallerContext _ctx) {
		
		listNodesByQueueResponse.setRequestId(_ctx.stringValue("ListNodesByQueueResponse.RequestId"));
		listNodesByQueueResponse.setTotalCount(_ctx.integerValue("ListNodesByQueueResponse.TotalCount"));
		listNodesByQueueResponse.setPageNumber(_ctx.integerValue("ListNodesByQueueResponse.PageNumber"));
		listNodesByQueueResponse.setPageSize(_ctx.integerValue("ListNodesByQueueResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesByQueueResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Id"));
			nodeInfo.setRegionId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setHostName(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setStatus(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Status"));
			nodeInfo.setVersion(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Version"));
			nodeInfo.setCreatedByEhpc(_ctx.booleanValue("ListNodesByQueueResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(_ctx.booleanValue("ListNodesByQueueResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setLocation(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Location"));
			nodeInfo.setCreateMode(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].CreateMode"));
			nodeInfo.setVpcId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].VpcId"));
			nodeInfo.setZoneId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ZoneId"));
			nodeInfo.setVSwitchId(_ctx.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].VSwitchId"));
			nodeInfo.setHtEnabled(_ctx.booleanValue("ListNodesByQueueResponse.Nodes["+ i +"].HtEnabled"));

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(_ctx.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesByQueueResponse.setNodes(nodes);
	 
	 	return listNodesByQueueResponse;
	}
}