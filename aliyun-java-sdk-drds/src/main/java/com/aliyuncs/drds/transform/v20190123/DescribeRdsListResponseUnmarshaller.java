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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRdsListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRdsListResponse.RdsInstance;
import com.aliyuncs.drds.model.v20190123.DescribeRdsListResponse.RdsInstance.ReadOnlyInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsListResponseUnmarshaller {

	public static DescribeRdsListResponse unmarshall(DescribeRdsListResponse describeRdsListResponse, UnmarshallerContext context) {
		
		describeRdsListResponse.setRequestId(context.stringValue("DescribeRdsListResponse.RequestId"));
		describeRdsListResponse.setSuccess(context.booleanValue("DescribeRdsListResponse.Success"));

		List<RdsInstance> data = new ArrayList<RdsInstance>();
		for (int i = 0; i < context.lengthValue("DescribeRdsListResponse.Data.Length"); i++) {
			RdsInstance rdsInstance = new RdsInstance();
			rdsInstance.setInstanceName(context.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceName"));
			rdsInstance.setConnectUrl(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ConnectUrl"));
			rdsInstance.setPort(context.integerValue("DescribeRdsListResponse.Data["+ i +"].Port"));
			rdsInstance.setInstanceStatus(context.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceStatus"));
			rdsInstance.setDbInstType(context.stringValue("DescribeRdsListResponse.Data["+ i +"].DbInstType"));
			rdsInstance.setReadWeight(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadWeight"));

			List<ReadOnlyInstance> readOnlyInstances = new ArrayList<ReadOnlyInstance>();
			for (int j = 0; j < context.lengthValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances.Length"); j++) {
				ReadOnlyInstance readOnlyInstance = new ReadOnlyInstance();
				readOnlyInstance.setInstanceName(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].InstanceName"));
				readOnlyInstance.setConnectUrl(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].ConnectUrl"));
				readOnlyInstance.setPort(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].Port"));
				readOnlyInstance.setInstanceStatus(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].InstanceStatus"));
				readOnlyInstance.setDbInstType(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].DbInstType"));
				readOnlyInstance.setReadWeight(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyInstances["+ j +"].ReadWeight"));

				readOnlyInstances.add(readOnlyInstance);
			}
			rdsInstance.setReadOnlyInstances(readOnlyInstances);

			data.add(rdsInstance);
		}
		describeRdsListResponse.setData(data);
	 
	 	return describeRdsListResponse;
	}
}