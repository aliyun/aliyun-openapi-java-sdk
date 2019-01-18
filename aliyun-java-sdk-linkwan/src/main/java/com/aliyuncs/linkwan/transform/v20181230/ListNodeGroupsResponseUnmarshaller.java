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

import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse.Data.NodeGroup;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig.IotProduct;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupsResponse.Data.NodeGroup.DataDispatchConfig.OnsTopics;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupsResponseUnmarshaller {

	public static ListNodeGroupsResponse unmarshall(ListNodeGroupsResponse listNodeGroupsResponse, UnmarshallerContext context) {
		
		listNodeGroupsResponse.setRequestId(context.stringValue("ListNodeGroupsResponse.RequestId"));
		listNodeGroupsResponse.setSuccess(context.booleanValue("ListNodeGroupsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodeGroupsResponse.Data.TotalCount"));

		List<NodeGroup> list = new ArrayList<NodeGroup>();
		for (int i = 0; i < context.lengthValue("ListNodeGroupsResponse.Data.List.Length"); i++) {
			NodeGroup nodeGroup = new NodeGroup();
			nodeGroup.setNodeGroupId(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].NodeGroupId"));
			nodeGroup.setNodeGroupName(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].NodeGroupName"));
			nodeGroup.setNodesCnt(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].NodesCnt"));
			nodeGroup.setDataDispatchEnabled(context.booleanValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchEnabled"));
			nodeGroup.setJoinPermissionId(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionId"));
			nodeGroup.setJoinPermissionOwnerAliyunId(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionOwnerAliyunId"));
			nodeGroup.setJoinEui(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinEui"));
			nodeGroup.setFreqBandPlanGroupId(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			nodeGroup.setClassMode(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].ClassMode"));
			nodeGroup.setJoinPermissionType(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionType"));
			nodeGroup.setJoinPermissionEnabled(context.booleanValue("ListNodeGroupsResponse.Data.List["+ i +"].JoinPermissionEnabled"));
			nodeGroup.setRxDailySum(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].RxDailySum"));
			nodeGroup.setRxMonthSum(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].RxMonthSum"));
			nodeGroup.setTxDailySum(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].TxDailySum"));
			nodeGroup.setTxMonthSum(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].TxMonthSum"));
			nodeGroup.setCreateMillis(context.longValue("ListNodeGroupsResponse.Data.List["+ i +"].CreateMillis"));

			DataDispatchConfig dataDispatchConfig = new DataDispatchConfig();
			dataDispatchConfig.setDestination(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.Destination"));

			IotProduct iotProduct = new IotProduct();
			iotProduct.setProductName(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductName"));
			iotProduct.setProductKey(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductKey"));
			iotProduct.setProductType(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.IotProduct.ProductType"));
			dataDispatchConfig.setIotProduct(iotProduct);

			OnsTopics onsTopics = new OnsTopics();
			onsTopics.setDownlinkRegionName(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.DownlinkRegionName"));
			onsTopics.setDownlinkTopic(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.DownlinkTopic"));
			onsTopics.setUplinkRegionName(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.UplinkRegionName"));
			onsTopics.setUplinkTopic(context.stringValue("ListNodeGroupsResponse.Data.List["+ i +"].DataDispatchConfig.OnsTopics.UplinkTopic"));
			dataDispatchConfig.setOnsTopics(onsTopics);
			nodeGroup.setDataDispatchConfig(dataDispatchConfig);

			list.add(nodeGroup);
		}
		data.setList(list);
		listNodeGroupsResponse.setData(data);
	 
	 	return listNodeGroupsResponse;
	}
}