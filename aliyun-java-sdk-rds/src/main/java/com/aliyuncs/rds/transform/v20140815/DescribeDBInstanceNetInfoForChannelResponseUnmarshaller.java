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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo.DBInstanceWeight;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo.SecurityIPGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoForChannelResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoForChannelResponse unmarshall(DescribeDBInstanceNetInfoForChannelResponse describeDBInstanceNetInfoForChannelResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceNetInfoForChannelResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.RequestId"));
		describeDBInstanceNetInfoForChannelResponse.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.InstanceNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setUpgradeable(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Upgradeable"));
			dBInstanceNetInfo.setExpiredTime(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].expiredTime"));
			dBInstanceNetInfo.setIPType(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setAvailability(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Availability"));
			dBInstanceNetInfo.setVSwitchId(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setConnectionStringType(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].ConnectionStringType"));
			dBInstanceNetInfo.setConnectionString(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setMaxDelayTime(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].MaxDelayTime"));
			dBInstanceNetInfo.setIPAddress(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setDistributionType(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DistributionType"));

			List<SecurityIPGroup> securityIPGroups = new ArrayList<SecurityIPGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups.Length"); j++) {
				SecurityIPGroup securityIPGroup = new SecurityIPGroup();
				securityIPGroup.setSecurityIPs(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPs"));
				securityIPGroup.setSecurityIPGroupName(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPGroupName"));

				securityIPGroups.add(securityIPGroup);
			}
			dBInstanceNetInfo.setSecurityIPGroups(securityIPGroups);

			List<DBInstanceWeight> dBInstanceWeights = new ArrayList<DBInstanceWeight>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights.Length"); j++) {
				DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
				dBInstanceWeight.setAvailability(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Availability"));
				dBInstanceWeight.setWeight(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Weight"));
				dBInstanceWeight.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceId"));
				dBInstanceWeight.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceType"));

				dBInstanceWeights.add(dBInstanceWeight);
			}
			dBInstanceNetInfo.setDBInstanceWeights(dBInstanceWeights);

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoForChannelResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoForChannelResponse;
	}
}