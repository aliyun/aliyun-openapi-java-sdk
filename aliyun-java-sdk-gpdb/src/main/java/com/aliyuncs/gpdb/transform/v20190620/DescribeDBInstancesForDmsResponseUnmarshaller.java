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

package com.aliyuncs.gpdb.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstancesForDmsResponse;
import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstancesForDmsResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesForDmsResponseUnmarshaller {

	public static DescribeDBInstancesForDmsResponse unmarshall(DescribeDBInstancesForDmsResponse describeDBInstancesForDmsResponse, UnmarshallerContext context) {
		
		describeDBInstancesForDmsResponse.setRequestId(context.stringValue("DescribeDBInstancesForDmsResponse.RequestId"));
		describeDBInstancesForDmsResponse.setCount(context.longValue("DescribeDBInstancesForDmsResponse.Count"));
		describeDBInstancesForDmsResponse.setSuccess(context.booleanValue("DescribeDBInstancesForDmsResponse.Success"));
		describeDBInstancesForDmsResponse.setHttpStatusCode(context.integerValue("DescribeDBInstancesForDmsResponse.HttpStatusCode"));
		describeDBInstancesForDmsResponse.setCode(context.stringValue("DescribeDBInstancesForDmsResponse.Code"));
		describeDBInstancesForDmsResponse.setMessage(context.stringValue("DescribeDBInstancesForDmsResponse.Message"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesForDmsResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setDbType(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].DbType"));
			instancesItem.setVersion(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].Version"));
			instancesItem.setDbInstanceName(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].DbInstanceName"));
			instancesItem.setConnectionString(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].ConnectionString"));
			instancesItem.setPort(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].Port"));
			instancesItem.setAliUid(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].AliUid"));
			instancesItem.setBid(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].Bid"));
			instancesItem.setInstanceNetworkType(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].InstanceNetworkType"));
			instancesItem.setVpcCloudInstanceId(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].VpcCloudInstanceId"));
			instancesItem.setVpcIp(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].VpcIp"));
			instancesItem.setVpcId(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].VpcId"));
			instancesItem.setVSwitchId(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].VSwitchId"));
			instancesItem.setRegion(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].Region"));
			instancesItem.setDescription(context.stringValue("DescribeDBInstancesForDmsResponse.Instances["+ i +"].Description"));

			instances.add(instancesItem);
		}
		describeDBInstancesForDmsResponse.setInstances(instances);
	 
	 	return describeDBInstancesForDmsResponse;
	}
}