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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceHAConfigResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceHAConfigResponse.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceHAConfigResponseUnmarshaller {

	public static DescribeDBInstanceHAConfigResponse unmarshall(DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfigResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceHAConfigResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.RequestId"));
		describeDBInstanceHAConfigResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.DBInstanceId"));
		describeDBInstanceHAConfigResponse.setHAMode(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HAMode"));
		describeDBInstanceHAConfigResponse.setSyncMode(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.SyncMode"));

		List<NodeInfo> hostInstanceInfos = new ArrayList<NodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos.Length"); i++) {
			NodeInfo nodeInfo = new NodeInfo();
			nodeInfo.setDataSyncTime(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].DataSyncTime"));
			nodeInfo.setLogSyncTime(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].LogSyncTime"));
			nodeInfo.setNodeId(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].NodeId"));
			nodeInfo.setNodeType(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].NodeType"));
			nodeInfo.setRegionId(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].RegionId"));
			nodeInfo.setSyncStatus(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].SyncStatus"));
			nodeInfo.setZoneId(_ctx.stringValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos["+ i +"].ZoneId"));

			hostInstanceInfos.add(nodeInfo);
		}
		describeDBInstanceHAConfigResponse.setHostInstanceInfos(hostInstanceInfos);
	 
	 	return describeDBInstanceHAConfigResponse;
	}
}