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
package com.aliyuncs.hpc.transform.v20161213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hpc.model.v20161213.DescribeInstancesInSecurityGroupResponse;
import com.aliyuncs.hpc.model.v20161213.DescribeInstancesInSecurityGroupResponse.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesInSecurityGroupResponseUnmarshaller {

	public static DescribeInstancesInSecurityGroupResponse unmarshall(DescribeInstancesInSecurityGroupResponse describeInstancesInSecurityGroupResponse, UnmarshallerContext context) {
		
		describeInstancesInSecurityGroupResponse.setRequestId(context.stringValue("DescribeInstancesInSecurityGroupResponse.RequestId"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesInSecurityGroupResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setRegionId(context.stringValue("DescribeInstancesInSecurityGroupResponse.Records["+ i +"].RegionId"));
			record.setInstanceId(context.stringValue("DescribeInstancesInSecurityGroupResponse.Records["+ i +"].InstanceId"));
			record.setInnerIpAddress(context.stringValue("DescribeInstancesInSecurityGroupResponse.Records["+ i +"].InnerIpAddress"));

			records.add(record);
		}
		describeInstancesInSecurityGroupResponse.setRecords(records);
	 
	 	return describeInstancesInSecurityGroupResponse;
	}
}