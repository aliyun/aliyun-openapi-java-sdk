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

import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.CapacityAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.HostAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.InstanceSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.NetworkAssociation;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.NetworkAssociation.SwitchSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedHostsResponse.ManagedHostSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListManagedHostsResponseUnmarshaller {

	public static OpsListManagedHostsResponse unmarshall(OpsListManagedHostsResponse opsListManagedHostsResponse, UnmarshallerContext _ctx) {
		
		opsListManagedHostsResponse.setRequestId(_ctx.stringValue("OpsListManagedHostsResponse.RequestId"));
		opsListManagedHostsResponse.setTotalCount(_ctx.integerValue("OpsListManagedHostsResponse.TotalCount"));
		opsListManagedHostsResponse.setNextToken(_ctx.stringValue("OpsListManagedHostsResponse.NextToken"));

		List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets.Length"); i++) {
			ManagedHostSet managedHostSet = new ManagedHostSet();
			managedHostSet.setStatus(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].Status"));
			managedHostSet.setManagedRackId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedRackId"));
			managedHostSet.setManagedHostType(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedHostType"));
			managedHostSet.setMode(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].Mode"));
			managedHostSet.setManagedRealRackId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedRealRackId"));
			managedHostSet.setManagedHostId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedHostId"));
			managedHostSet.setResourceGroupId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].ResourceGroupId"));

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			managedHostSet.setSupportedInstanceTypes(supportedInstanceTypes);

			List<String> supportedCustomInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedCustomInstanceTypeFamilies.Length"); j++) {
				supportedCustomInstanceTypeFamilies.add(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedCustomInstanceTypeFamilies["+ j +"]"));
			}
			managedHostSet.setSupportedCustomInstanceTypeFamilies(supportedCustomInstanceTypeFamilies);

			List<String> supportInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportInstanceTypeFamilies.Length"); j++) {
				supportInstanceTypeFamilies.add(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SupportInstanceTypeFamilies["+ j +"]"));
			}
			managedHostSet.setSupportInstanceTypeFamilies(supportInstanceTypeFamilies);

			List<String> sharedProductCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SharedProductCodes.Length"); j++) {
				sharedProductCodes.add(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].SharedProductCodes["+ j +"]"));
			}
			managedHostSet.setSharedProductCodes(sharedProductCodes);

			CapacityAttribute capacityAttribute = new CapacityAttribute();
			capacityAttribute.setTotalVcpus(_ctx.integerValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.TotalVcpus"));
			capacityAttribute.setAvailableVcpus(_ctx.integerValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.AvailableVcpus"));
			capacityAttribute.setAvailableMemories(_ctx.integerValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.AvailableMemories"));
			capacityAttribute.setTotalMemories(_ctx.integerValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.TotalMemories"));
			managedHostSet.setCapacityAttribute(capacityAttribute);

			NetworkAssociation networkAssociation = new NetworkAssociation();

			List<SwitchSet> switchSets = new ArrayList<SwitchSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].NetworkAssociation.SwitchSets.Length"); j++) {
				SwitchSet switchSet = new SwitchSet();
				switchSet.setSwitchId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].NetworkAssociation.SwitchSets["+ j +"].SwitchId"));

				switchSets.add(switchSet);
			}
			networkAssociation.setSwitchSets(switchSets);
			managedHostSet.setNetworkAssociation(networkAssociation);

			HostAttribute hostAttribute = new HostAttribute();
			hostAttribute.setSerialNumber(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].HostAttribute.SerialNumber"));
			hostAttribute.setHostType(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].HostAttribute.HostType"));
			hostAttribute.setCpuModelName(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].HostAttribute.CpuModelName"));
			managedHostSet.setHostAttribute(hostAttribute);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			managedHostSet.setTags(tags);

			List<InstanceSet> instanceSets = new ArrayList<InstanceSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].InstanceSets.Length"); j++) {
				InstanceSet instanceSet = new InstanceSet();
				instanceSet.setInstanceId(_ctx.stringValue("OpsListManagedHostsResponse.ManagedHostSets["+ i +"].InstanceSets["+ j +"].InstanceId"));

				instanceSets.add(instanceSet);
			}
			managedHostSet.setInstanceSets(instanceSets);

			managedHostSets.add(managedHostSet);
		}
		opsListManagedHostsResponse.setManagedHostSets(managedHostSets);
	 
	 	return opsListManagedHostsResponse;
	}
}