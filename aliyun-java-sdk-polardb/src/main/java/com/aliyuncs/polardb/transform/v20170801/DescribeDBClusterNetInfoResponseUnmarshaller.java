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
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterNetInfoResponse.DBNodeNetInfo;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterNetInfoResponse.DBNodeNetInfo.NetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterNetInfoResponseUnmarshaller {

	public static DescribeDBClusterNetInfoResponse unmarshall(DescribeDBClusterNetInfoResponse describeDBClusterNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.RequestId"));
		describeDBClusterNetInfoResponse.setClusterNetworkType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.ClusterNetworkType"));

		List<DBClusterNetInfo> dBClusterNetInfos = new ArrayList<DBClusterNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos.Length"); i++) {
			DBClusterNetInfo dBClusterNetInfo = new DBClusterNetInfo();
			dBClusterNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].VSwitchId"));
			dBClusterNetInfo.setConnectionStringType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].ConnectionStringType"));
			dBClusterNetInfo.setConnectionString(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].ConnectionString"));
			dBClusterNetInfo.setIPType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].IPType"));
			dBClusterNetInfo.setPort(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].Port"));
			dBClusterNetInfo.setVPCId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].VPCId"));
			dBClusterNetInfo.setIPAddress(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBClusterNetInfos["+ i +"].IPAddress"));

			dBClusterNetInfos.add(dBClusterNetInfo);
		}
		describeDBClusterNetInfoResponse.setDBClusterNetInfos(dBClusterNetInfos);

		List<DBNodeNetInfo> dBNodeNetInfos = new ArrayList<DBNodeNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos.Length"); i++) {
			DBNodeNetInfo dBNodeNetInfo = new DBNodeNetInfo();
			dBNodeNetInfo.setDBNodeRole(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].DBNodeRole"));
			dBNodeNetInfo.setDBInstanceId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].DBInstanceId"));

			List<NetInfo> netInfos = new ArrayList<NetInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos.Length"); j++) {
				NetInfo netInfo = new NetInfo();
				netInfo.setVSwitchId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].VSwitchId"));
				netInfo.setConnectionString(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].ConnectionString"));
				netInfo.setIPType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].IPType"));
				netInfo.setPort(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].Port"));
				netInfo.setVPCId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].VPCId"));
				netInfo.setIPAddress(_ctx.stringValue("DescribeDBClusterNetInfoResponse.DBNodeNetInfos["+ i +"].NetInfos["+ j +"].IPAddress"));

				netInfos.add(netInfo);
			}
			dBNodeNetInfo.setNetInfos(netInfos);

			dBNodeNetInfos.add(dBNodeNetInfo);
		}
		describeDBClusterNetInfoResponse.setDBNodeNetInfos(dBNodeNetInfos);
	 
	 	return describeDBClusterNetInfoResponse;
	}
}