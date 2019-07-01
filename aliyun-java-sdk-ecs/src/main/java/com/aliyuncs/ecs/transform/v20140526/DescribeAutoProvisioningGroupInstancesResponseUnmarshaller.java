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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoProvisioningGroupInstancesResponseUnmarshaller {

	public static DescribeAutoProvisioningGroupInstancesResponse unmarshall(DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesResponse, UnmarshallerContext context) {
		
		describeAutoProvisioningGroupInstancesResponse.setRequestId(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.RequestId"));
		describeAutoProvisioningGroupInstancesResponse.setTotalCount(context.integerValue("DescribeAutoProvisioningGroupInstancesResponse.TotalCount"));
		describeAutoProvisioningGroupInstancesResponse.setPageNumber(context.integerValue("DescribeAutoProvisioningGroupInstancesResponse.PageNumber"));
		describeAutoProvisioningGroupInstancesResponse.setPageSize(context.integerValue("DescribeAutoProvisioningGroupInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeAutoProvisioningGroupInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].Status"));
			instance.setRegionId(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setCPU(context.integerValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].CPU"));
			instance.setMemory(context.integerValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].Memory"));
			instance.setInstanceType(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setIsSpot(context.booleanValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].IsSpot"));
			instance.setIoOptimized(context.booleanValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setNetworkType(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setOsType(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].OsType"));
			instance.setCreationTime(context.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].CreationTime"));

			instances.add(instance);
		}
		describeAutoProvisioningGroupInstancesResponse.setInstances(instances);
	 
	 	return describeAutoProvisioningGroupInstancesResponse;
	}
}