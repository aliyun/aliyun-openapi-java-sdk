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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.Capacity;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.Capacity.InstanceTypeInventory;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.Instance;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.NetworkAttributes;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.OperationLock;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.RenewAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDedicatedHostsResponse.DedicatedHost.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDedicatedHostsResponseUnmarshaller {

	public static OpsDescribeDedicatedHostsResponse unmarshall(OpsDescribeDedicatedHostsResponse opsDescribeDedicatedHostsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDedicatedHostsResponse.setRequestId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.RequestId"));
		opsDescribeDedicatedHostsResponse.setTotalCount(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.TotalCount"));
		opsDescribeDedicatedHostsResponse.setPageSize(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.PageSize"));
		opsDescribeDedicatedHostsResponse.setPageNumber(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.PageNumber"));

		List<DedicatedHost> dedicatedHosts = new ArrayList<DedicatedHost>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts.Length"); i++) {
			DedicatedHost dedicatedHost = new DedicatedHost();
			dedicatedHost.setCreationTime(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].CreationTime"));
			dedicatedHost.setStatus(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Status"));
			dedicatedHost.setAutoPlacement(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoPlacement"));
			dedicatedHost.setChargeType(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ChargeType"));
			dedicatedHost.setActionOnMaintenance(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ActionOnMaintenance"));
			dedicatedHost.setPhysicalGpus(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].PhysicalGpus"));
			dedicatedHost.setSaleCycle(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SaleCycle"));
			dedicatedHost.setDescription(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Description"));
			dedicatedHost.setDedicatedHostType(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostType"));
			dedicatedHost.setDedicatedHostId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostId"));
			dedicatedHost.setSockets(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Sockets"));
			dedicatedHost.setCores(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Cores"));
			dedicatedHost.setGPUSpec(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].GPUSpec"));
			dedicatedHost.setAutoReleaseTime(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].AutoReleaseTime"));
			dedicatedHost.setRegionId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RegionId"));
			dedicatedHost.setDedicatedHostName(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostName"));
			dedicatedHost.setExpiredTime(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ExpiredTime"));
			dedicatedHost.setDedicatedHostClusterId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].DedicatedHostClusterId"));
			dedicatedHost.setResourceGroupId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ResourceGroupId"));
			dedicatedHost.setZoneId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].ZoneId"));
			dedicatedHost.setMachineId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].MachineId"));

			List<String> supportedInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList.Length"); j++) {
				supportedInstanceTypesList.add(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypesList["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypesList(supportedInstanceTypesList);

			List<String> supportedCustomInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedCustomInstanceTypeFamilies.Length"); j++) {
				supportedCustomInstanceTypeFamilies.add(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedCustomInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHost.setSupportedCustomInstanceTypeFamilies(supportedCustomInstanceTypeFamilies);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHost.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			Capacity capacity = new Capacity();
			capacity.setAvailableMemory(_ctx.floatValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableMemory"));
			capacity.setLocalStorageCategory(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.LocalStorageCategory"));
			capacity.setTotalMemory(_ctx.floatValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalMemory"));
			capacity.setTotalLocalStorage(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalLocalStorage"));
			capacity.setTotalVcpus(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVcpus"));
			capacity.setTotalVgpus(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.TotalVgpus"));
			capacity.setAvailableLocalStorage(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableLocalStorage"));
			capacity.setAvailableVcpus(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVcpus"));
			capacity.setAvailableVgpus(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.AvailableVgpus"));

			List<InstanceTypeInventory> instanceTypesInventory = new ArrayList<InstanceTypeInventory>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.InstanceTypesInventory.Length"); j++) {
				InstanceTypeInventory instanceTypeInventory = new InstanceTypeInventory();
				instanceTypeInventory.setAvailableCount(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.InstanceTypesInventory["+ j +"].AvailableCount"));
				instanceTypeInventory.setInstanceType(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Capacity.InstanceTypesInventory["+ j +"].InstanceType"));

				instanceTypesInventory.add(instanceTypeInventory);
			}
			capacity.setInstanceTypesInventory(instanceTypesInventory);
			dedicatedHost.setCapacity(capacity);

			NetworkAttributes networkAttributes = new NetworkAttributes();
			networkAttributes.setUdpTimeout(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.UdpTimeout"));
			networkAttributes.setSlbUdpTimeout(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].NetworkAttributes.SlbUdpTimeout"));
			dedicatedHost.setNetworkAttributes(networkAttributes);

			RenewAttribute renewAttribute = new RenewAttribute();
			renewAttribute.setPeriodUnit(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RenewAttribute.PeriodUnit"));
			renewAttribute.setDuration(_ctx.integerValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RenewAttribute.Duration"));
			renewAttribute.setRenewalStatus(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RenewAttribute.RenewalStatus"));
			renewAttribute.setAutoRenewEnabled(_ctx.booleanValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].RenewAttribute.AutoRenewEnabled"));
			dedicatedHost.setRenewAttribute(renewAttribute);

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockReason(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			dedicatedHost.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			dedicatedHost.setTags(tags);

			List<Instance> instances = new ArrayList<Instance>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances.Length"); j++) {
				Instance instance = new Instance();
				instance.setInstanceId(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceId"));
				instance.setInstanceType(_ctx.stringValue("OpsDescribeDedicatedHostsResponse.DedicatedHosts["+ i +"].Instances["+ j +"].InstanceType"));

				instances.add(instance);
			}
			dedicatedHost.setInstances(instances);

			dedicatedHosts.add(dedicatedHost);
		}
		opsDescribeDedicatedHostsResponse.setDedicatedHosts(dedicatedHosts);
	 
	 	return opsDescribeDedicatedHostsResponse;
	}
}