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

	public static ListNodesByQueueResponse unmarshall(ListNodesByQueueResponse listNodesByQueueResponse, UnmarshallerContext context) {
		
		listNodesByQueueResponse.setRequestId(context.stringValue("ListNodesByQueueResponse.RequestId"));
		listNodesByQueueResponse.setTotalCount(context.integerValue("ListNodesByQueueResponse.TotalCount"));
		listNodesByQueueResponse.setPageNumber(context.integerValue("ListNodesByQueueResponse.PageNumber"));
		listNodesByQueueResponse.setPageSize(context.integerValue("ListNodesByQueueResponse.PageSize"));

		List<NodeInfo> nodes = new ArrayList<NodeInfo>();
		for (int i = 0; i < context.lengthValue("ListNodesByQueueResponse.Nodes.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Id"));
			nodeInfo.setRegionId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].RegionId"));
			nodeInfo.setHostName(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].HostName"));
			nodeInfo.setStatus(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Status"));
			nodeInfo.setVersion(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Version"));
			nodeInfo.setCreatedByEhpc(context.booleanValue("ListNodesByQueueResponse.Nodes["+ i +"].CreatedByEhpc"));
			nodeInfo.setAddTime(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].AddTime"));
			nodeInfo.setExpired(context.booleanValue("ListNodesByQueueResponse.Nodes["+ i +"].Expired"));
			nodeInfo.setExpiredTime(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ExpiredTime"));
			nodeInfo.setSpotStrategy(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].SpotStrategy"));
			nodeInfo.setLockReason(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].LockReason"));
			nodeInfo.setImageOwnerAlias(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ImageOwnerAlias"));
			nodeInfo.setImageId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ImageId"));
			nodeInfo.setLocation(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].Location"));
			nodeInfo.setCreateMode(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].CreateMode"));
			nodeInfo.setVpcId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].VpcId"));
			nodeInfo.setZoneId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].ZoneId"));
			nodeInfo.setVSwitchId(context.stringValue("ListNodesByQueueResponse.Nodes["+ i +"].VSwitchId"));

			TotalResources totalResources = new TotalResources();
			totalResources.setCpu(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Cpu"));
			totalResources.setMemory(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Memory"));
			totalResources.setGpu(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].TotalResources.Gpu"));
			nodeInfo.setTotalResources(totalResources);

			UsedResources usedResources = new UsedResources();
			usedResources.setCpu(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Cpu"));
			usedResources.setMemory(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Memory"));
			usedResources.setGpu(context.integerValue("ListNodesByQueueResponse.Nodes["+ i +"].UsedResources.Gpu"));
			nodeInfo.setUsedResources(usedResources);

			nodes.add(nodeInfo);
		}
		listNodesByQueueResponse.setNodes(nodes);
	 
	 	return listNodesByQueueResponse;
	}
}