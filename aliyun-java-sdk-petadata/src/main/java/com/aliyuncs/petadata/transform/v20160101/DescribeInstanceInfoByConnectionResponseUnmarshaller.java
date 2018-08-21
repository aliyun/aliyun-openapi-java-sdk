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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoByConnectionResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoByConnectionResponse.Database;
import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoByConnectionResponse.NetworkInfoItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceInfoByConnectionResponseUnmarshaller {

	public static DescribeInstanceInfoByConnectionResponse unmarshall(DescribeInstanceInfoByConnectionResponse describeInstanceInfoByConnectionResponse, UnmarshallerContext context) {
		
		describeInstanceInfoByConnectionResponse.setRequestId(context.stringValue("DescribeInstanceInfoByConnectionResponse.RequestId"));
		describeInstanceInfoByConnectionResponse.setInstanceId(context.stringValue("DescribeInstanceInfoByConnectionResponse.InstanceId"));
		describeInstanceInfoByConnectionResponse.setInstanceName(context.stringValue("DescribeInstanceInfoByConnectionResponse.InstanceName"));
		describeInstanceInfoByConnectionResponse.setRegionId(context.stringValue("DescribeInstanceInfoByConnectionResponse.RegionId"));
		describeInstanceInfoByConnectionResponse.setZoneId(context.stringValue("DescribeInstanceInfoByConnectionResponse.ZoneId"));
		describeInstanceInfoByConnectionResponse.setInstanceStatus(context.stringValue("DescribeInstanceInfoByConnectionResponse.InstanceStatus"));

		List<NetworkInfoItem> networkInfoItems = new ArrayList<NetworkInfoItem>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems.Length"); i++) {
			NetworkInfoItem networkInfoItem = new NetworkInfoItem();
			networkInfoItem.setNetworkType(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].NetworkType"));
			networkInfoItem.setConnectionString(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].ConnectionString"));
			networkInfoItem.setPort(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].Port"));
			networkInfoItem.setVpcId(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].VpcId"));
			networkInfoItem.setVSwitchId(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].VSwitchId"));
			networkInfoItem.setPrivateIpAddress(context.stringValue("DescribeInstanceInfoByConnectionResponse.NetworkInfoItems["+ i +"].PrivateIpAddress"));

			networkInfoItems.add(networkInfoItem);
		}
		describeInstanceInfoByConnectionResponse.setNetworkInfoItems(networkInfoItems);

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceInfoByConnectionResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBName(context.stringValue("DescribeInstanceInfoByConnectionResponse.Databases["+ i +"].DBName"));
			database.setChargeType(context.stringValue("DescribeInstanceInfoByConnectionResponse.Databases["+ i +"].ChargeType"));

			databases.add(database);
		}
		describeInstanceInfoByConnectionResponse.setDatabases(databases);
	 
	 	return describeInstanceInfoByConnectionResponse;
	}
}