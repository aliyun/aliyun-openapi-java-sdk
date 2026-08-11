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
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Capacity.AvailableInstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Capacity.SocketCapacity;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.HostDetailInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.NetworkAttributes;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.OperationLock;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse.DedicatedHost.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostsResponseUnmarshaller {

	public static DescribeDedicatedHostsResponse unmarshall(DescribeDedicatedHostsResponse describeDedicatedHostsResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostsResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostsResponse.RequestId"));
		describeDedicatedHostsResponse.setTotalCount(_ctx.integerValue("DescribeDedicatedHostsResponse.TotalCount"));
		describeDedicatedHostsResponse.setPageSize(_ctx.integerValue("DescribeDedicatedHostsResponse.PageSize"));
		describeDedicatedHostsResponse.setNextToken(_ctx.stringValue("DescribeDedicatedHostsResponse.NextToken"));
		describeDedicatedHostsResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedHostsResponse.PageNumber"));

		List<DedicatedHost> dedicatedHosts = new ArrayList<DedicatedHost>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts.Length"); i++) {
			DedicatedHost dedicatedHost = new DedicatedHost();
			dedicatedHost.setPhysicalGpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].PhysicalGpus"));
			dedicatedHost.setMachineId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].MachineId"));
			dedicatedHost.setSchedulerOptionsManagedPrivateSpaceId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SchedulerOptions.ManagedPrivateSpaceId"));
			dedicatedHost.setDedicatedHostId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostId"));
			dedicatedHost.setDescription(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Description"));
			dedicatedHost.setResourceGroupId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ResourceGroupId"));
			dedicatedHost.setGPUSpec(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].GPUSpec"));
			dedicatedHost.setDedicatedHostName(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostName"));
			dedicatedHost.setCpuOverCommitRatio(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CpuOverCommitRatio"));
			dedicatedHost.setExpiredTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ExpiredTime"));
			dedicatedHost.setSaleCycle(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SaleCycle"));
			dedicatedHost.setDedicatedHostOwnerId(_ctx.longValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostOwnerId"));
			dedicatedHost.setStatus(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Status"));
			dedicatedHost.setZoneId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ZoneId"));
			dedicatedHost.setAutoPlacement(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoPlacement"));
			dedicatedHost.setDedicatedHostType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostType"));
			dedicatedHost.setCores(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Cores"));
			dedicatedHost.setSockets(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Sockets"));
			dedicatedHost.setChargeType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ChargeType"));
			dedicatedHost.setCreationTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CreationTime"));
			dedicatedHost.setActionOnMaintenance(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ActionOnMaintenance"));
			dedicatedHost.setRegionId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RegionId"));
			dedicatedHost.setDedicatedHostClusterId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostClusterId"));
			dedicatedHost.setAutoReleaseTime(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoReleaseTime"));

			List<String> supportedCustomInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedCustomInstanceTypeFamilies.Length"); j++) {
				supportedCustomInstanceTypeFamilies.add(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedCustomInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHost.setSupportedCustomInstanceTypeFamilies(supportedCustomInstanceTypeFamilies);

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

			NetworkAttributes networkAttributes = new NetworkAttributes();
			networkAttributes.setUdpTimeout(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.UdpTimeout"));
			networkAttributes.setSlbUdpTimeout(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.SlbUdpTimeout"));
			dedicatedHost.setNetworkAttributes(networkAttributes);

			Capacity capacity = new Capacity();
			capacity.setLocalStorageCategory(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.LocalStorageCategory"));
			capacity.setAvailableVgpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVgpus"));
			capacity.setTotalVgpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVgpus"));
			capacity.setAvailableMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableMemory"));
			capacity.setTotalMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalMemory"));
			capacity.setAvailableVcpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVcpus"));
			capacity.setTotalVcpus(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVcpus"));
			capacity.setAvailableLocalStorage(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableLocalStorage"));
			capacity.setTotalLocalStorage(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalLocalStorage"));

			List<AvailableInstanceType> availableInstanceTypes = new ArrayList<AvailableInstanceType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableInstanceTypes.Length"); j++) {
				AvailableInstanceType availableInstanceType = new AvailableInstanceType();
				availableInstanceType.setAvailableInstanceCapacity(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableInstanceTypes["+ j +"].AvailableInstanceCapacity"));
				availableInstanceType.setInstanceType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableInstanceTypes["+ j +"].InstanceType"));

				availableInstanceTypes.add(availableInstanceType);
			}
			capacity.setAvailableInstanceTypes(availableInstanceTypes);

			List<SocketCapacity> socketCapacities = new ArrayList<SocketCapacity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities.Length"); j++) {
				SocketCapacity socketCapacity = new SocketCapacity();
				socketCapacity.setSocketId(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities["+ j +"].SocketId"));
				socketCapacity.setAvailableMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities["+ j +"].AvailableMemory"));
				socketCapacity.setTotalMemory(_ctx.floatValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities["+ j +"].TotalMemory"));
				socketCapacity.setTotalVcpu(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities["+ j +"].TotalVcpu"));
				socketCapacity.setAvailableVcpu(_ctx.integerValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.SocketCapacities["+ j +"].AvailableVcpu"));

				socketCapacities.add(socketCapacity);
			}
			capacity.setSocketCapacities(socketCapacities);
			dedicatedHost.setCapacity(capacity);

			HostDetailInfo hostDetailInfo = new HostDetailInfo();
			hostDetailInfo.setSerialNumber(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].HostDetailInfo.SerialNumber"));
			dedicatedHost.setHostDetailInfo(hostDetailInfo);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dedicatedHost.setTags(tags);

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			dedicatedHost.setOperationLocks(operationLocks);

			List<Instance> instances = new ArrayList<Instance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances.Length"); j++) {
				Instance instance = new Instance();
				instance.setInstanceId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceId"));
				instance.setSocketId(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].SocketId"));
				instance.setInstanceType(_ctx.stringValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceType"));
				instance.setInstanceOwnerId(_ctx.longValue("DescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceOwnerId"));

				instances.add(instance);
			}
			dedicatedHost.setInstances(instances);

			dedicatedHosts.add(dedicatedHost);
		}
		describeDedicatedHostsResponse.setDedicatedHosts(dedicatedHosts);
	 
	 	return describeDedicatedHostsResponse;
	}
}