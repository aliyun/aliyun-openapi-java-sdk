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

	public static DescribeAutoProvisioningGroupInstancesResponse unmarshall(DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesResponse, UnmarshallerContext _ctx) {
		
		describeAutoProvisioningGroupInstancesResponse.setRequestId(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.RequestId"));
		describeAutoProvisioningGroupInstancesResponse.setTotalCount(_ctx.integerValue("DescribeAutoProvisioningGroupInstancesResponse.TotalCount"));
		describeAutoProvisioningGroupInstancesResponse.setPageSize(_ctx.integerValue("DescribeAutoProvisioningGroupInstancesResponse.PageSize"));
		describeAutoProvisioningGroupInstancesResponse.setPageNumber(_ctx.integerValue("DescribeAutoProvisioningGroupInstancesResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].Status"));
			instance.setIsSpot(_ctx.booleanValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].IsSpot"));
			instance.setIoOptimized(_ctx.booleanValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setZoneId(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setInstanceId(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setOsType(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].OsType"));
			instance.setNetworkType(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].NetworkType"));
			instance.setMemory(_ctx.integerValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].Memory"));
			instance.setCreationTime(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setCPU(_ctx.integerValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].CPU"));
			instance.setRegionId(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setInstanceType(_ctx.stringValue("DescribeAutoProvisioningGroupInstancesResponse.Instances["+ i +"].InstanceType"));

			instances.add(instance);
		}
		describeAutoProvisioningGroupInstancesResponse.setInstances(instances);
	 
	 	return describeAutoProvisioningGroupInstancesResponse;
	}
}