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

import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data.NodeGroup;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig.IotProduct;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig.OnsTopics;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsResponse.Data.NodeGroup.Lock;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupsResponseUnmarshaller {

	public static ListNodeGroupsResponse unmarshall(ListNodeGroupsResponse listNodeGroupsResponse, UnmarshallerContext _ctx) {
		
		listNodeGroupsResponse.setRequestId(_ctx.stringValue("ListNodeGroupsResponse.RequestId"));
		listNodeGroupsResponse.setSuccess(_ctx.booleanValue("ListNodeGroupsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodeGroupsResponse.Data.TotalCount"));

		List<NodeGroup> list = new ArrayList<NodeGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeGroupsResponse.Data.List.Length"); i++) {
			NodeGroup nodeGroup = new NodeGroup();
			nodeGroup.setNodeGroupId(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].NodeGroupId"));
			nodeGroup.setNodeGroupName(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].NodeGroupName"));
			nodeGroup.setNodesCnt(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].NodesCnt"));
			nodeGroup.setDataDispatchEnabled(_ctx.booleanValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchEnabled"));
			nodeGroup.setJoinPermissionId(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionId"));
			nodeGroup.setJoinPermissionOwnerAliyunId(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionOwnerAliyunId"));
			nodeGroup.setJoinEui(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinEui"));
			nodeGroup.setFreqBandPlanGroupId(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			nodeGroup.setClassMode(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].ClassMode"));
			nodeGroup.setJoinPermissionType(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionType"));
			nodeGroup.setJoinPermissionEnabled(_ctx.booleanValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionEnabled"));
			nodeGroup.setRxDailySum(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].RxDailySum"));
			nodeGroup.setRxMonthSum(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].RxMonthSum"));
			nodeGroup.setTxDailySum(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].TxDailySum"));
			nodeGroup.setTxMonthSum(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].TxMonthSum"));
			nodeGroup.setCreateMillis(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].CreateMillis"));

			DataDispatchConfig dataDispatchConfig = new DataDispatchConfig();
			dataDispatchConfig.setDestination(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.Destination"));

			IotProduct iotProduct = new IotProduct();
			iotProduct.setProductName(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductName"));
			iotProduct.setProductKey(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductKey"));
			iotProduct.setProductType(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductType"));
			dataDispatchConfig.setIotProduct(iotProduct);

			OnsTopics onsTopics = new OnsTopics();
			onsTopics.setDownlinkRegionName(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.DownlinkRegionName"));
			onsTopics.setDownlinkTopic(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.DownlinkTopic"));
			onsTopics.setUplinkRegionName(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.UplinkRegionName"));
			onsTopics.setUplinkTopic(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.UplinkTopic"));
			dataDispatchConfig.setOnsTopics(onsTopics);
			nodeGroup.setDataDispatchConfig(dataDispatchConfig);

			List<Lock> locks = new ArrayList<Lock>();
			for (int j = 0; j < _ctx.lengthValue("ListNodeGroupsResponse.Data.List["+ i +"].Locks.Length"); j++) {
				Lock lock = new Lock();
				lock.setLockId(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].Locks["+ j +"].LockId"));
				lock.setLockType(_ctx.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].Locks["+ j +"].LockType"));
				lock.setEnabled(_ctx.booleanValue("ListNodeGroupsResponse.Data.List["+ i +"].Locks["+ j +"].Enabled"));
				lock.setCreateMillis(_ctx.longValue("ListNodeGroupsResponse.Data.List["+ i +"].Locks["+ j +"].CreateMillis"));

				locks.add(lock);
			}
			nodeGroup.setLocks(locks);

			list.add(nodeGroup);
		}
		data.setList(list);
		listNodeGroupsResponse.setData(data);
	 
	 	return listNodeGroupsResponse;
	}
}