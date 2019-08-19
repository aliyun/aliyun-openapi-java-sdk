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

	public static DescribeDBInstanceForDmsResponse unmarshall(DescribeDBInstanceForDmsResponse describeDBInstanceForDmsResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceForDmsResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceForDmsResponse.RequestId"));
		describeDBInstanceForDmsResponse.setCount(_ctx.longValue("DescribeDBInstanceForDmsResponse.Count"));
		describeDBInstanceForDmsResponse.setSuccess(_ctx.booleanValue("DescribeDBInstanceForDmsResponse.Success"));
		describeDBInstanceForDmsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDBInstanceForDmsResponse.HttpStatusCode"));
		describeDBInstanceForDmsResponse.setCode(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Code"));
		describeDBInstanceForDmsResponse.setMessage(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Message"));

		Instance instance = new Instance();
		instance.setDbType(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.DbType"));
		instance.setVersion(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.Version"));
		instance.setDbInstanceName(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.DbInstanceName"));
		instance.setConnectionString(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.ConnectionString"));
		instance.setPort(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.Port"));
		instance.setAliUid(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.AliUid"));
		instance.setBid(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.Bid"));
		instance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.InstanceNetworkType"));
		instance.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcCloudInstanceId"));
		instance.setVpcIp(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcIp"));
		instance.setVpcId(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.VpcId"));
		instance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.VSwitchId"));
		instance.setRegion(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.Region"));
		instance.setDescription(_ctx.stringValue("DescribeDBInstanceForDmsResponse.Instance.Description"));
		describeDBInstanceForDmsResponse.setInstance(instance);
	 
	 	return describeDBInstanceForDmsResponse;
	}
}