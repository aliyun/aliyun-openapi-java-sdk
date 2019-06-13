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

import com.aliyuncs.rds.model.v20140815.DescribeInstanceVpcMigrateInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceVpcMigrateInfoResponseUnmarshaller {

	public static DescribeInstanceVpcMigrateInfoResponse unmarshall(DescribeInstanceVpcMigrateInfoResponse describeInstanceVpcMigrateInfoResponse, UnmarshallerContext context) {
		
		describeInstanceVpcMigrateInfoResponse.setRequestId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.RequestId"));

		List<DBInstanceMigrateInfo> dBInstanceMigrateInfos = new ArrayList<DBInstanceMigrateInfo>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos.Length"); i++) {
			DBInstanceMigrateInfo dBInstanceMigrateInfo = new DBInstanceMigrateInfo();
			dBInstanceMigrateInfo.setDBInstanceId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].DBInstanceId"));
			dBInstanceMigrateInfo.setTargetRegionId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetRegionId"));
			dBInstanceMigrateInfo.setTargetZoneId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetZoneId"));
			dBInstanceMigrateInfo.setTargetVPCId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetVPCId"));
			dBInstanceMigrateInfo.setTargetVSwitchId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetVSwitchId"));
			dBInstanceMigrateInfo.setTargetIPAddress(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetIPAddress"));
			dBInstanceMigrateInfo.setTargetVpcInstanceId(context.stringValue("DescribeInstanceVpcMigrateInfoResponse.DBInstanceMigrateInfos["+ i +"].TargetVpcInstanceId"));

			dBInstanceMigrateInfos.add(dBInstanceMigrateInfo);
		}
		describeInstanceVpcMigrateInfoResponse.setDBInstanceMigrateInfos(dBInstanceMigrateInfos);
	 
	 	return describeInstanceVpcMigrateInfoResponse;
	}
}