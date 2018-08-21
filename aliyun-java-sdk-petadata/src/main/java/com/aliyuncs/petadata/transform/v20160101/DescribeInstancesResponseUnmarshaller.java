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

import com.aliyuncs.petadata.model.v20160101.DescribeInstancesResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeInstancesResponse.Instance;
import com.aliyuncs.petadata.model.v20160101.DescribeInstancesResponse.Instance.Database;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(context.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setConnectionString(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ConnectionString"));
			instance.setPort(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].Port"));
			instance.setCreateTime(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));
			instance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setInstanceStatus(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceStatus"));
			instance.setNetworkType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setVpcId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setVSwitchId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VSwitchId"));

			List<Database> databases = new ArrayList<Database>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].Databases.Length"); j++) {
				Database database = new Database();
				database.setDBName(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Databases["+ j +"].DBName"));
				database.setChargeType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Databases["+ j +"].ChargeType"));

				databases.add(database);
			}
			instance.setDatabases(databases);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}