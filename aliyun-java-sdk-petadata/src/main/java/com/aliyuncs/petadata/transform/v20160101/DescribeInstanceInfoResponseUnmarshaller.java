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

import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoResponse.Database;
import com.aliyuncs.petadata.model.v20160101.DescribeInstanceInfoResponse.NetworkInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceInfoResponseUnmarshaller {

	public static DescribeInstanceInfoResponse unmarshall(DescribeInstanceInfoResponse describeInstanceInfoResponse, UnmarshallerContext context) {
		
		describeInstanceInfoResponse.setRequestId(context.stringValue("DescribeInstanceInfoResponse.RequestId"));
		describeInstanceInfoResponse.setInstanceId(context.stringValue("DescribeInstanceInfoResponse.InstanceId"));
		describeInstanceInfoResponse.setInstanceName(context.stringValue("DescribeInstanceInfoResponse.InstanceName"));
		describeInstanceInfoResponse.setRegionId(context.stringValue("DescribeInstanceInfoResponse.RegionId"));
		describeInstanceInfoResponse.setZoneId(context.stringValue("DescribeInstanceInfoResponse.ZoneId"));
		describeInstanceInfoResponse.setInstanceStatus(context.stringValue("DescribeInstanceInfoResponse.InstanceStatus"));

		List<NetworkInfoItem> networkInfoItems = new ArrayList<NetworkInfoItem>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceInfoResponse.NetworkInfoItems.Length"); i++) {
			NetworkInfoItem networkInfoItem = new NetworkInfoItem();
			networkInfoItem.setNetworkType(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].NetworkType"));
			networkInfoItem.setConnectionString(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].ConnectionString"));
			networkInfoItem.setPort(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].Port"));
			networkInfoItem.setVpcId(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].VpcId"));
			networkInfoItem.setVSwitchId(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].VSwitchId"));
			networkInfoItem.setPrivateIpAddress(context.stringValue("DescribeInstanceInfoResponse.NetworkInfoItems["+ i +"].PrivateIpAddress"));

			networkInfoItems.add(networkInfoItem);
		}
		describeInstanceInfoResponse.setNetworkInfoItems(networkInfoItems);

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceInfoResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBName(context.stringValue("DescribeInstanceInfoResponse.Databases["+ i +"].DBName"));
			database.setChargeType(context.stringValue("DescribeInstanceInfoResponse.Databases["+ i +"].ChargeType"));

			databases.add(database);
		}
		describeInstanceInfoResponse.setDatabases(databases);
	 
	 	return describeInstanceInfoResponse;
	}
}