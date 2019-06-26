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

import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstanceForDmsResponse;
import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstanceForDmsResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceForDmsResponseUnmarshaller {

	public static DescribeDBInstanceForDmsResponse unmarshall(DescribeDBInstanceForDmsResponse describeDBInstanceForDmsResponse, UnmarshallerContext context) {
		
		describeDBInstanceForDmsResponse.setRequestId(context.stringValue("DescribeDBInstanceForDmsResponse.RequestId"));
		describeDBInstanceForDmsResponse.setCount(context.longValue("DescribeDBInstanceForDmsResponse.Count"));
		describeDBInstanceForDmsResponse.setSuccess(context.booleanValue("DescribeDBInstanceForDmsResponse.Success"));
		describeDBInstanceForDmsResponse.setHttpStatusCode(context.integerValue("DescribeDBInstanceForDmsResponse.HttpStatusCode"));
		describeDBInstanceForDmsResponse.setCode(context.stringValue("DescribeDBInstanceForDmsResponse.Code"));
		describeDBInstanceForDmsResponse.setMessage(context.stringValue("DescribeDBInstanceForDmsResponse.Message"));

		Instance instance = new Instance();
		instance.setDbType(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.DbType"));
		instance.setVersion(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.Version"));
		instance.setDbInstanceName(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.DbInstanceName"));
		instance.setConnectionString(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.ConnectionString"));
		instance.setPort(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.Port"));
		instance.setAliUid(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.AliUid"));
		instance.setBid(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.Bid"));
		instance.setInstanceNetworkType(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.InstanceNetworkType"));
		instance.setVpcCloudInstanceId(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcCloudInstanceId"));
		instance.setVpcIp(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcIp"));
		instance.setVpcId(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcId"));
		instance.setVSwitchId(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.VSwitchId"));
		instance.setRegion(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.Region"));
		instance.setDescription(context.stringValue("DescribeDBInstanceForDmsResponse.Instance.Description"));
		describeDBInstanceForDmsResponse.setInstance(instance);
	 
	 	return describeDBInstanceForDmsResponse;
	}
}