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

package com.aliyuncs.smarthosting.transform.v20200801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.CapacityAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.HostAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.InstanceSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.NetworkAssociation;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.NetworkAssociation.SwitchSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedHostsResponse.ManagedHostSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManagedHostsResponseUnmarshaller {

	public static ListManagedHostsResponse unmarshall(ListManagedHostsResponse listManagedHostsResponse, UnmarshallerContext _ctx) {
		
		listManagedHostsResponse.setRequestId(_ctx.stringValue("ListManagedHostsResponse.RequestId"));
		listManagedHostsResponse.setNextToken(_ctx.stringValue("ListManagedHostsResponse.NextToken"));
		listManagedHostsResponse.setPageSize(_ctx.integerValue("ListManagedHostsResponse.PageSize"));
		listManagedHostsResponse.setTotalCount(_ctx.integerValue("ListManagedHostsResponse.TotalCount"));

		List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
		for (int i = 0; i < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets.Length"); i++) {
			ManagedHostSet managedHostSet = new ManagedHostSet();
			managedHostSet.setManagedHostId(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedHostId"));
			managedHostSet.setManagedHostName(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].ManagedHostName"));
			managedHostSet.setMode(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].Mode"));
			managedHostSet.setResourceGroupId(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].ResourceGroupId"));
			managedHostSet.setStatus(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].Status"));

			List<String> supportedCustomInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedCustomInstanceTypeFamilies.Length"); j++) {
				supportedCustomInstanceTypeFamilies.add(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedCustomInstanceTypeFamilies["+ j +"]"));
			}
			managedHostSet.setSupportedCustomInstanceTypeFamilies(supportedCustomInstanceTypeFamilies);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			managedHostSet.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			managedHostSet.setSupportedInstanceTypes(supportedInstanceTypes);

			CapacityAttribute capacityAttribute = new CapacityAttribute();
			capacityAttribute.setAvailableMemories(_ctx.integerValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.AvailableMemories"));
			capacityAttribute.setAvailableVcpus(_ctx.integerValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.AvailableVcpus"));
			capacityAttribute.setTotalMemories(_ctx.integerValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.TotalMemories"));
			capacityAttribute.setTotalVcpus(_ctx.integerValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].CapacityAttribute.TotalVcpus"));
			managedHostSet.setCapacityAttribute(capacityAttribute);

			HostAttribute hostAttribute = new HostAttribute();
			hostAttribute.setCpuModelName(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].HostAttribute.CpuModelName"));
			hostAttribute.setHostType(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].HostAttribute.HostType"));
			managedHostSet.setHostAttribute(hostAttribute);

			NetworkAssociation networkAssociation = new NetworkAssociation();

			List<SwitchSet> switchSets = new ArrayList<SwitchSet>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].NetworkAssociation.SwitchSets.Length"); j++) {
				SwitchSet switchSet = new SwitchSet();
				switchSet.setSwitchId(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].NetworkAssociation.SwitchSets["+ j +"].SwitchId"));

				switchSets.add(switchSet);
			}
			networkAssociation.setSwitchSets(switchSets);
			managedHostSet.setNetworkAssociation(networkAssociation);

			List<InstanceSet> instanceSets = new ArrayList<InstanceSet>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].InstanceSets.Length"); j++) {
				InstanceSet instanceSet = new InstanceSet();
				instanceSet.setInstanceId(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].InstanceSets["+ j +"].InstanceId"));

				instanceSets.add(instanceSet);
			}
			managedHostSet.setInstanceSets(instanceSets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListManagedHostsResponse.ManagedHostSets["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			managedHostSet.setTags(tags);

			managedHostSets.add(managedHostSet);
		}
		listManagedHostsResponse.setManagedHostSets(managedHostSets);
	 
	 	return listManagedHostsResponse;
	}
}