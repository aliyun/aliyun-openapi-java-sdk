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

	public static DescribeDedicatedHostsResponse unmarshall(DescribeDedicatedHostsResponse describeDedicatedHostsResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostsResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostsResponse.RequestId"));
		describeDedicatedHostsResponse.setTotalCount(_ctx.integerValue("DescribeDedicatedHostsResponse.TotalCount"));
		describeDedicatedHostsResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedHostsResponse.PageNumber"));
		describeDedicatedHostsResponse.setPageSize(_ctx.integerValue("DescribeDedicatedHostsResponse.PageSize"));

		List<DedicatedHost> dedicatedHosts = new ArrayList<DedicatedHost>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts.Length"); i++) {
			DedicatedHost dedicatedHost = new DedicatedHost();
			dedicatedHost.setDedicatedHostId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostId"));
			dedicatedHost.setAutoPlacement(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoPlacement"));
			dedicatedHost.setRegionId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RegionId"));
			dedicatedHost.setZoneId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ZoneId"));
			dedicatedHost.setDedicatedHostName(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostName"));
			dedicatedHost.setMachineId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].MachineId"));
			dedicatedHost.setDescription(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Description"));
			dedicatedHost.setDedicatedHostType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostType"));
			dedicatedHost.setSockets(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Sockets"));
			dedicatedHost.setCores(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Cores"));
			dedicatedHost.setPhysicalGpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].PhysicalGpus"));
			dedicatedHost.setGPUSpec(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].GPUSpec"));
			dedicatedHost.setActionOnMaintenance(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ActionOnMaintenance"));
			dedicatedHost.setStatus(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Status"));
			dedicatedHost.setCreationTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CreationTime"));
			dedicatedHost.setChargeType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ChargeType"));
			dedicatedHost.setSaleCycle(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SaleCycle"));
			dedicatedHost.setExpiredTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ExpiredTime"));
			dedicatedHost.setAutoReleaseTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoReleaseTime"));
			dedicatedHost.setResourceGroupId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ResourceGroupId"));

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList.Length"); j++) {
				supportedInstanceTypesList.add(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypesList(supportedInstanceTypesList);

			Capacity capacity = new Capacity();
			capacity.setTotalVcpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVcpus"));
			capacity.setAvailableVcpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVcpus"));
			capacity.setTotalVgpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVgpus"));
			capacity.setAvailableVgpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVgpus"));
			capacity.setTotalMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalMemory"));
			capacity.setAvailableMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableMemory"));
			capacity.setTotalLocalStorage(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalLocalStorage"));
			capacity.setAvailableLocalStorage(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableLocalStorage"));
			capacity.setLocalStorageCategory(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.LocalStorageCategory"));
			dedicatedHost.setCapacity(capacity);

			NetworkAttributes networkAttributes = new NetworkAttributes();
			networkAttributes.setSlbUdpTimeout(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.SlbUdpTimeout"));
			networkAttributes.setUdpTimeout(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.UdpTimeout"));
			dedicatedHost.setNetworkAttributes(networkAttributes);

			List<Instance> instances = new ArrayList<Instance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances.Length"); j++) {
				Instance instance = new Instance();
				instance.setInstanceId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceId"));
				instance.setInstanceType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceType"));

				instances.add(instance);
			}
			dedicatedHost.setInstances(instances);

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			dedicatedHost.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dedicatedHost.setTags(tags);

			dedicatedHosts.add(dedicatedHost);
		}
		describeDedicatedHostsResponse.setDedicatedHosts(dedicatedHosts);
	 
	 	return describeDedicatedHostsResponse;
	}
}