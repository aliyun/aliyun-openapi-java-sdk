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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDiagnosisSummaryResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDiagnosisSummaryResponse.ItemsItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceDiagnosisSummaryResponseUnmarshaller {

	public static DescribeDBInstanceDiagnosisSummaryResponse unmarshall(DescribeDBInstanceDiagnosisSummaryResponse describeDBInstanceDiagnosisSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceDiagnosisSummaryResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.RequestId"));
		describeDBInstanceDiagnosisSummaryResponse.setTotalCount(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.TotalCount"));
		describeDBInstanceDiagnosisSummaryResponse.setPageNumber(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.PageNumber"));

		SegmentStatusInfo segmentStatusInfo = new SegmentStatusInfo();
		segmentStatusInfo.setNormalNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.NormalNodeNum"));
		segmentStatusInfo.setExceptionNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.ExceptionNodeNum"));
		segmentStatusInfo.setPreferredNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.PreferredNodeNum"));
		segmentStatusInfo.setSyncedNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.SyncedNodeNum"));
		segmentStatusInfo.setNotSyncingNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.NotSyncingNodeNum"));
		segmentStatusInfo.setNotPreferredNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.SegmentStatusInfo.NotPreferredNodeNum"));
		describeDBInstanceDiagnosisSummaryResponse.setSegmentStatusInfo(segmentStatusInfo);

		MasterStatusInfo masterStatusInfo = new MasterStatusInfo();
		masterStatusInfo.setNormalNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.NormalNodeNum"));
		masterStatusInfo.setExceptionNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.ExceptionNodeNum"));
		masterStatusInfo.setPreferredNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.PreferredNodeNum"));
		masterStatusInfo.setSyncedNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.SyncedNodeNum"));
		masterStatusInfo.setNotSyncingNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.NotSyncingNodeNum"));
		masterStatusInfo.setNotPreferredNodeNum(_ctx.integerValue("DescribeDBInstanceDiagnosisSummaryResponse.MasterStatusInfo.NotPreferredNodeNum"));
		describeDBInstanceDiagnosisSummaryResponse.setMasterStatusInfo(masterStatusInfo);

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceDiagnosisSummaryResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setNodeRole(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeRole"));
			itemsItem.setNodeName(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeName"));
			itemsItem.setNodeType(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeType"));
			itemsItem.setHostname(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].Hostname"));
			itemsItem.setNodeID(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeID"));
			itemsItem.setNodeReplicationMode(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeReplicationMode"));
			itemsItem.setNodeAddress(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeAddress"));
			itemsItem.setNodePort(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodePort"));
			itemsItem.setNodePreferredRole(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodePreferredRole"));
			itemsItem.setNodeCID(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeCID"));
			itemsItem.setNodeStatus(_ctx.stringValue("DescribeDBInstanceDiagnosisSummaryResponse.Items["+ i +"].NodeStatus"));

			items.add(itemsItem);
		}
		describeDBInstanceDiagnosisSummaryResponse.setItems(items);
	 
	 	return describeDBInstanceDiagnosisSummaryResponse;
	}
}