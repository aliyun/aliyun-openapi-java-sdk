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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterNetInfoResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterNetInfoResponse.DBClusterNetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterNetInfoResponseUnmarshaller {

	public static DescribeDBClusterNetInfoResponse unmarshall(DescribeDBClusterNetInfoResponse describeDBClusterNetInfoResponse, UnmarshallerContext context) {
		
		describeDBClusterNetInfoResponse.setRequestId(context.stringValue("DescribeDBClusterNetInfoResponse.RequestId"));
		describeDBClusterNetInfoResponse.setClusterNetworkType(context.stringValue("DescribeDBClusterNetInfoResponse.ClusterNetworkType"));

		List<DBClusterNetInfo> dBClusterNetInfos = new ArrayList<DBClusterNetInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos.Length"); i++) {
			DBClusterNetInfo dBClusterNetInfo = new DBClusterNetInfo();
			dBClusterNetInfo.setConnectionString(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].ConnectionString"));
			dBClusterNetInfo.setIPAddress(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].IPAddress"));
			dBClusterNetInfo.setIPType(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].IPType"));
			dBClusterNetInfo.setPort(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].Port"));
			dBClusterNetInfo.setVPCId(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].VPCId"));
			dBClusterNetInfo.setVSwitchId(context.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].VSwitchId"));

			dBClusterNetInfos.add(dBClusterNetInfo);
		}
		describeDBClusterNetInfoResponse.setDBClusterNetInfos(dBClusterNetInfos);
	 
	 	return describeDBClusterNetInfoResponse;
	}
}