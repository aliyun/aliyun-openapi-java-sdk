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

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext context) {
		
		describeDBInstanceNetInfoResponse.setRequestId(context.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(context.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setConnectionString(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}