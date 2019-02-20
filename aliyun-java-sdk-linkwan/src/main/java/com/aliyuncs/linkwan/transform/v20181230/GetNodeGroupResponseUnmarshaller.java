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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse;
import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse.Data.DataDispatchConfig;
import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct;
import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics;
import com.aliyuncs.linkwan.model.v20181230.GetNodeGroupResponse.Data.LocksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeGroupResponseUnmarshaller {

	public static GetNodeGroupResponse unmarshall(GetNodeGroupResponse getNodeGroupResponse, UnmarshallerContext context) {
		
		getNodeGroupResponse.setRequestId(context.stringValue("GetNodeGroupResponse.RequestId"));
		getNodeGroupResponse.setSuccess(context.booleanValue("GetNodeGroupResponse.Success"));

		Data data = new Data();
		data.setNodeGroupId(context.stringValue("GetNodeGroupResponse.Data.NodeGroupId"));
		data.setNodeGroupName(context.stringValue("GetNodeGroupResponse.Data.NodeGroupName"));
		data.setNodesCnt(context.longValue("GetNodeGroupResponse.Data.NodesCnt"));
		data.setDataDispatchEnabled(context.booleanValue("GetNodeGroupResponse.Data.DataDispatchEnabled"));
		data.setJoinPermissionId(context.stringValue("GetNodeGroupResponse.Data.JoinPermissionId"));
		data.setJoinPermissionOwnerAliyunId(context.stringValue("GetNodeGroupResponse.Data.JoinPermissionOwnerAliyunId"));
		data.setJoinEui(context.stringValue("GetNodeGroupResponse.Data.JoinEui"));
		data.setFreqBandPlanGroupId(context.longValue("GetNodeGroupResponse.Data.FreqBandPlanGroupId"));
		data.setClassMode(context.stringValue("GetNodeGroupResponse.Data.ClassMode"));
		data.setJoinPermissionType(context.stringValue("GetNodeGroupResponse.Data.JoinPermissionType"));
		data.setJoinPermissionEnabled(context.booleanValue("GetNodeGroupResponse.Data.JoinPermissionEnabled"));
		data.setRxDailySum(context.stringValue("GetNodeGroupResponse.Data.RxDailySum"));
		data.setRxMonthSum(context.longValue("GetNodeGroupResponse.Data.RxMonthSum"));
		data.setTxDailySum(context.longValue("GetNodeGroupResponse.Data.TxDailySum"));
		data.setTxMonthSum(context.longValue("GetNodeGroupResponse.Data.TxMonthSum"));
		data.setCreateMillis(context.longValue("GetNodeGroupResponse.Data.CreateMillis"));

		DataDispatchConfig dataDispatchConfig = new DataDispatchConfig();
		dataDispatchConfig.setDestination(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.Destination"));

		IotProduct iotProduct = new IotProduct();
		iotProduct.setProductName(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductName"));
		iotProduct.setProductKey(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductKey"));
		iotProduct.setProductType(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.IotProduct.ProductType"));
		dataDispatchConfig.setIotProduct(iotProduct);

		OnsTopics onsTopics = new OnsTopics();
		onsTopics.setDownlinkRegionName(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.DownlinkRegionName"));
		onsTopics.setDownlinkTopic(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.DownlinkTopic"));
		onsTopics.setUplinkRegionName(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.UplinkRegionName"));
		onsTopics.setUplinkTopic(context.stringValue("GetNodeGroupResponse.Data.DataDispatchConfig.OnsTopics.UplinkTopic"));
		dataDispatchConfig.setOnsTopics(onsTopics);
		data.setDataDispatchConfig(dataDispatchConfig);

		List<LocksItem> locks = new ArrayList<LocksItem>();
		for (int i = 0; i < context.lengthValue("GetNodeGroupResponse.Data.Locks.Length"); i++) {
			LocksItem locksItem = new LocksItem();
			locksItem.setLockId(context.stringValue("GetNodeGroupResponse.Data.Locks["+ i +"].LockId"));
			locksItem.setLockType(context.stringValue("GetNodeGroupResponse.Data.Locks["+ i +"].LockType"));
			locksItem.setEnabled(context.booleanValue("GetNodeGroupResponse.Data.Locks["+ i +"].Enabled"));
			locksItem.setCreateMillis(context.longValue("GetNodeGroupResponse.Data.Locks["+ i +"].CreateMillis"));

			locks.add(locksItem);
		}
		data.setLocks(locks);
		getNodeGroupResponse.setData(data);
	 
	 	return getNodeGroupResponse;
	}
}