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

import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse.Data.DataDispatchConfig;
import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct;
import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics;
import com.aliyuncs.linkwan.model.v20190301.GetNodeGroupResponse.Data.LocksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeGroupResponseUnmarshaller {

	public static GetNodeGroupResponse unmarshall(GetNodeGroupResponse getNodeGroupResponse, UnmarshallerContext _ctx) {
		
		getNodeGroupResponse.setRequestId(_ctx.stringValue("GetNodeGroupResponse.RequestId"));
		getNodeGroupResponse.setSuccess(_ctx.booleanValue("GetNodeGroupResponse.Success"));

		Data data = new Data();
		data.setNodeGroupId(_ctx.stringValue("GetNodeGroupResponse.Data.NodeGroupId"));
		data.setNodeGroupName(_ctx.stringValue("GetNodeGroupResponse.Data.NodeGroupName"));
		data.setNodesCnt(_ctx.longValue("GetNodeGroupResponse.Data.NodesCnt"));
		data.setDataDispatchEnabled(_ctx.booleanValue("GetNodeGroupResponse.Data.DataDispatchEnabled"));
		data.setJoinPermissionId(_ctx.stringValue("GetNodeGroupResponse.Data.JoinPermissionId"));
		data.setJoinPermissionOwnerAliyunId(_ctx.stringValue("GetNodeGroupResponse.Data.JoinPermissionOwnerAliyunId"));
		data.setJoinEui(_ctx.stringValue("GetNodeGroupResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetNodeGroupResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(_ctx.stringValue("GetNodeGroupResponse.Data.ClassMode"));
		data.setJoinPermissionType(_ctx.stringValue("GetNodeGroupResponse.Data.JoinPermissionType"));
		data.setJoinPermissionEnabled(_ctx.booleanValue("GetNodeGroupResponse.Data.JoinPermissionEnabled"));
		data.setRxDailySum(_ctx.stringValue("GetNodeGroupResponse.Data.RxDailySum"));
		data.setRxMonthSum(_ctx.longValue("GetNodeGroupResponse.Data.RxMonthSum"));
		data.setTxDailySum(_ctx.longValue("GetNodeGroupResponse.Data.TxDailySum"));
		data.setTxMonthSum(_ctx.longValue("GetNodeGroupResponse.Data.TxMonthSum"));
		data.setCreateMillis(_ctx.longValue("GetNodeGroupResponse.Data.CreateMillis"));
		data.setJoinPermissionName(_ctx.stringValue("GetNodeGroupResponse.Data.JoinPermissionName"));
		data.setMulticastGroupId(_ctx.stringValue("GetNodeGroupResponse.Data.MulticastGroupId"));
		data.setMulticastEnabled(_ctx.booleanValue("GetNodeGroupResponse.Data.MulticastEnabled"));
		data.setMulticastNodeCapacity(_ctx.integerValue("GetNodeGroupResponse.Data.MulticastNodeCapacity"));
		data.setMulticastNodeCount(_ctx.integerValue("GetNodeGroupResponse.Data.MulticastNodeCount"));

		DataDispatchConfig dataDispatchConfig = new DataDispatchConfig();
		dataDispatchConfig.setDestination(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.Destination"));

		IotProduct iotProduct = new IotProduct();
		iotProduct.setProductName(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductName"));
		iotProduct.setProductKey(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductKey"));
		iotProduct.setProductType(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductType"));
		dataDispatchConfig.setIotProduct(iotProduct);

		OnsTopics onsTopics = new OnsTopics();
		onsTopics.setDownlinkRegionName(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.DownlinkRegionName"));
		onsTopics.setDownlinkTopic(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.DownlinkTopic"));
		onsTopics.setUplinkRegionName(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.UplinkRegionName"));
		onsTopics.setUplinkTopic(_ctx.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.UplinkTopic"));
		dataDispatchConfig.setOnsTopics(onsTopics);
		data.setDataDispatchConfig(dataDispatchConfig);

		List<LocksItem> locks = new ArrayList<LocksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeGroupResponse.Data.Locks.Length"); i++) {
			LocksItem locksItem = new LocksItem();
			locksItem.setLockId(_ctx.stringValue("GetNodeGroupResponse.Data.Locks["+ i +"].LockId"));
			locksItem.setLockType(_ctx.stringValue("GetNodeGroupResponse.Data.Locks["+ i +"].LockType"));
			locksItem.setEnabled(_ctx.booleanValue("GetNodeGroupResponse.Data.Locks["+ i +"].Enabled"));
			locksItem.setCreateMillis(_ctx.longValue("GetNodeGroupResponse.Data.Locks["+ i +"].CreateMillis"));

			locks.add(locksItem);
		}
		data.setLocks(locks);
		getNodeGroupResponse.setData(data);
	 
	 	return getNodeGroupResponse;
	}
}