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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeRdsListResponse;
import com.aliyuncs.drds.model.v20171016.DescribeRdsListResponse.RdsInstance;
import com.aliyuncs.drds.model.v20171016.DescribeRdsListResponse.RdsInstance.Child;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsListResponseUnmarshaller {

	public static DescribeRdsListResponse unmarshall(DescribeRdsListResponse describeRdsListResponse, UnmarshallerContext context) {
		
		describeRdsListResponse.setRequestId(context.stringValue("DescribeRdsListResponse.RequestId"));
		describeRdsListResponse.setSuccess(context.booleanValue("DescribeRdsListResponse.Success"));

		List<RdsInstance> data = new ArrayList<RdsInstance>();
		for (int i = 0; i < context.lengthValue("DescribeRdsListResponse.Data.Length"); i++) {
			RdsInstance rdsInstance = new RdsInstance();
			rdsInstance.setInstanceId(context.integerValue("DescribeRdsListResponse.Data["+ i +"].InstanceId"));
			rdsInstance.setInstanceName(context.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceName"));
			rdsInstance.setConnectUrl(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ConnectUrl"));
			rdsInstance.setPort(context.integerValue("DescribeRdsListResponse.Data["+ i +"].Port"));
			rdsInstance.setInstanceStatus(context.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceStatus"));
			rdsInstance.setDbType(context.stringValue("DescribeRdsListResponse.Data["+ i +"].DbType"));
			rdsInstance.setReadWeight(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadWeight"));

			List<Child> readOnlyChildren = new ArrayList<Child>();
			for (int j = 0; j < context.lengthValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren.Length"); j++) {
				Child child = new Child();
				child.setInstanceId(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceId"));
				child.setInstanceName(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceName"));
				child.setConnectUrl(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].ConnectUrl"));
				child.setPort(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].port"));
				child.setInstanceStatus(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceStatus"));
				child.setDbType(context.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].DbType"));
				child.setReadWeight(context.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].ReadWeight"));

				readOnlyChildren.add(child);
			}
			rdsInstance.setReadOnlyChildren(readOnlyChildren);

			data.add(rdsInstance);
		}
		describeRdsListResponse.setData(data);
	 
	 	return describeRdsListResponse;
	}
}