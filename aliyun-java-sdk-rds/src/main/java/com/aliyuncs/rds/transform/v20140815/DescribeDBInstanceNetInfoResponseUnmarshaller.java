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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.DBInstanceWeight;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoResponse.DBInstanceNetInfo.SecurityIPGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoResponse unmarshall(DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoResponse, UnmarshallerContext context) {
		
		describeDBInstanceNetInfoResponse.setRequestId(context.stringValue("DescribeDBInstanceNetInfoResponse.RequestId"));
		describeDBInstanceNetInfoResponse.setInstanceNetworkType(context.stringValue("DescribeDBInstanceNetInfoResponse.InstanceNetworkType"));
		describeDBInstanceNetInfoResponse.setSecurityIPMode(context.stringValue("DescribeDBInstanceNetInfoResponse.SecurityIPMode"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setUpgradeable(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Upgradeable"));
			dBInstanceNetInfo.setExpiredTime(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ExpiredTime"));
			dBInstanceNetInfo.setConnectionString(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setConnectionStringType(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionStringType"));
			dBInstanceNetInfo.setMaxDelayTime(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].MaxDelayTime"));
			dBInstanceNetInfo.setDistributionType(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DistributionType"));

			List<SecurityIPGroup> securityIPGroups = new ArrayList<SecurityIPGroup>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups.Length"); j++) {
				SecurityIPGroup securityIPGroup = new SecurityIPGroup();
				securityIPGroup.setSecurityIPGroupName(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPGroupName"));
				securityIPGroup.setSecurityIPs(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPs"));

				securityIPGroups.add(securityIPGroup);
			}
			dBInstanceNetInfo.setSecurityIPGroups(securityIPGroups);

			List<DBInstanceWeight> dBInstanceWeights = new ArrayList<DBInstanceWeight>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights.Length"); j++) {
				DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
				dBInstanceWeight.setDBInstanceId(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceId"));
				dBInstanceWeight.setDBInstanceType(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceType"));
				dBInstanceWeight.setAvailability(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Availability"));
				dBInstanceWeight.setWeight(context.stringValue("DescribeDBInstanceNetInfoResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Weight"));

				dBInstanceWeights.add(dBInstanceWeight);
			}
			dBInstanceNetInfo.setDBInstanceWeights(dBInstanceWeights);

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoResponse;
	}
}