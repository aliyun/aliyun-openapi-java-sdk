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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setVpcInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VpcInstanceId"));

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}