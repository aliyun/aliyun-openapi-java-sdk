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

package com.aliyuncs.hpc.transform.v20160603;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hpc.model.v20160603.DescribeInstancesResponse;
import com.aliyuncs.hpc.model.v20160603.DescribeInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setPackageId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].PackageId"));
			instance.setStatus(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instance.setInnerIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setJumpserverStatus(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpserverStatus"));
			instance.setJumpserverInnerIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpserverInnerIpAddress"));
			instance.setJumpServerPublicIpAddress(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].JumpServerPublicIpAddress"));

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}