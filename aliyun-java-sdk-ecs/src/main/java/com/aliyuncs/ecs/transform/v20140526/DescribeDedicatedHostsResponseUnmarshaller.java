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

import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Capacity;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.NetworkAttributes;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.OperationLock;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostsResponseUnmarshaller {

	public static DescribeDedicatedHostsResponse unmarshall(DescribeDedicatedHostsResponse describeDedicatedHostsResponse, UnmarshallerContext context) {
		
		describeDedicatedHostsResponse.setRequestId(context.stringValue("DescribeDedicatedHostsResponse.RequestId"));
		describeDedicatedHostsResponse.setTotalCount(context.integerValue("DescribeDedicatedHostsResponse.TotalCount"));
		describeDedicatedHostsResponse.setPageNumber(context.integerValue("DescribeDedicatedHostsResponse.PageNumber"));
		describeDedicatedHostsResponse.setPageSize(context.integerValue("DescribeDedicatedHostsResponse.PageSize"));

		List<DedicatedHost> dedicatedHosts = new ArrayList<DedicatedHost>();
		for (int i = 0; i < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts.Length"); i++) {
			DedicatedHost dedicatedHost = new DedicatedHost();
			dedicatedHost.setDedicatedHostId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostId"));
			dedicatedHost.setRegionId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RegionId"));
			dedicatedHost.setZoneId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ZoneId"));
			dedicatedHost.setDedicatedHostName(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostName"));
			dedicatedHost.setMachineId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].MachineId"));
			dedicatedHost.setDescription(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Description"));
			dedicatedHost.setDedicatedHostType(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostType"));
			dedicatedHost.setSockets(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Sockets"));
			dedicatedHost.setCores(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Cores"));
			dedicatedHost.setPhysicalGpus(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].PhysicalGpus"));
			dedicatedHost.setGPUSpec(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].GPUSpec"));
			dedicatedHost.setActionOnMaintenance(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ActionOnMaintenance"));
			dedicatedHost.setStatus(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Status"));
			dedicatedHost.setCreationTime(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CreationTime"));
			dedicatedHost.setChargeType(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ChargeType"));
			dedicatedHost.setSaleCycle(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SaleCycle"));
			dedicatedHost.setExpiredTime(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ExpiredTime"));
			dedicatedHost.setAutoReleaseTime(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoReleaseTime"));
			dedicatedHost.setResourceGroupId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ResourceGroupId"));

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList.Length"); j++) {
				supportedInstanceTypesList.add(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypesList(supportedInstanceTypesList);

			Capacity capacity = new Capacity();
			capacity.setTotalVcpus(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVcpus"));
			capacity.setAvailableVcpus(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVcpus"));
			capacity.setTotalVgpus(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVgpus"));
			capacity.setAvailableVgpus(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVgpus"));
			capacity.setTotalMemory(context.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalMemory"));
			capacity.setAvailableMemory(context.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableMemory"));
			capacity.setTotalLocalStorage(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalLocalStorage"));
			capacity.setAvailableLocalStorage(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableLocalStorage"));
			capacity.setLocalStorageCategory(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.LocalStorageCategory"));
			dedicatedHost.setCapacity(capacity);

			NetworkAttributes networkAttributes = new NetworkAttributes();
			networkAttributes.setSlbUdpTimeout(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.SlbUdpTimeout"));
			networkAttributes.setUdpTimeout(context.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.UdpTimeout"));
			dedicatedHost.setNetworkAttributes(networkAttributes);

			List<Instance> instances = new ArrayList<Instance>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances.Length"); j++) {
				Instance instance = new Instance();
				instance.setInstanceId(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceId"));
				instance.setInstanceType(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceType"));

				instances.add(instance);
			}
			dedicatedHost.setInstances(instances);

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			dedicatedHost.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dedicatedHost.setTags(tags);

			dedicatedHosts.add(dedicatedHost);
		}
		describeDedicatedHostsResponse.setDedicatedHosts(dedicatedHosts);
	 
	 	return describeDedicatedHostsResponse;
	}
}