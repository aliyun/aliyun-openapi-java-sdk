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

import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.CapacityAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.DeploymentAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.DeploymentAttribute.DeploymentStep;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.LifecycleAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.LocationAttribute;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.ManagedHostSet;
import com.aliyuncs.smarthosting.model.v20200801.ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManagedPrivateSpacesResponseUnmarshaller {

	public static ListManagedPrivateSpacesResponse unmarshall(ListManagedPrivateSpacesResponse listManagedPrivateSpacesResponse, UnmarshallerContext _ctx) {
		
		listManagedPrivateSpacesResponse.setRequestId(_ctx.stringValue("ListManagedPrivateSpacesResponse.RequestId"));
		listManagedPrivateSpacesResponse.setNextToken(_ctx.stringValue("ListManagedPrivateSpacesResponse.NextToken"));
		listManagedPrivateSpacesResponse.setTotalCount(_ctx.integerValue("ListManagedPrivateSpacesResponse.TotalCount"));

		List<ManagedPrivateSpaceSet> managedPrivateSpaceSets = new ArrayList<ManagedPrivateSpaceSet>();
		for (int i = 0; i < _ctx.lengthValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets.Length"); i++) {
			ManagedPrivateSpaceSet managedPrivateSpaceSet = new ManagedPrivateSpaceSet();
			managedPrivateSpaceSet.setCreationTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CreationTime"));
			managedPrivateSpaceSet.setDescription(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Description"));
			managedPrivateSpaceSet.setManagedPrivateSpaceId(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedPrivateSpaceId"));
			managedPrivateSpaceSet.setManagedPrivateSpaceName(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedPrivateSpaceName"));
			managedPrivateSpaceSet.setResourceGroupId(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ResourceGroupId"));
			managedPrivateSpaceSet.setSaleMode(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].SaleMode"));
			managedPrivateSpaceSet.setZoneId(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ZoneId"));

			CapacityAttribute capacityAttribute = new CapacityAttribute();
			capacityAttribute.setAvailableHostCount(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableHostCount"));
			capacityAttribute.setAvailableMemories(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableMemories"));
			capacityAttribute.setAvailableVcpus(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableVcpus"));
			capacityAttribute.setReservedHostCount(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedHostCount"));
			capacityAttribute.setReservedMemories(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedMemories"));
			capacityAttribute.setReservedVcpus(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedVcpus"));
			capacityAttribute.setTotalHostCount(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalHostCount"));
			capacityAttribute.setTotalMemories(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalMemories"));
			capacityAttribute.setTotalVcpus(_ctx.integerValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalVcpus"));
			managedPrivateSpaceSet.setCapacityAttribute(capacityAttribute);

			LifecycleAttribute lifecycleAttribute = new LifecycleAttribute();
			lifecycleAttribute.setDeliveryTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.DeliveryTime"));
			lifecycleAttribute.setExpirationTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.ExpirationTime"));
			lifecycleAttribute.setReceptionTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.ReceptionTime"));
			managedPrivateSpaceSet.setLifecycleAttribute(lifecycleAttribute);

			LocationAttribute locationAttribute = new LocationAttribute();
			locationAttribute.setAddress(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LocationAttribute.Address"));
			managedPrivateSpaceSet.setLocationAttribute(locationAttribute);

			List<DeploymentAttribute> deploymentAttributes = new ArrayList<DeploymentAttribute>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes.Length"); j++) {
				DeploymentAttribute deploymentAttribute = new DeploymentAttribute();
				deploymentAttribute.setContractId(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].ContractId"));
				deploymentAttribute.setCreateTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].CreateTime"));
				deploymentAttribute.setDescription(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].Description"));

				List<DeploymentStep> deploymentSteps = new ArrayList<DeploymentStep>();
				for (int k = 0; k < _ctx.lengthValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps.Length"); k++) {
					DeploymentStep deploymentStep = new DeploymentStep();
					deploymentStep.setActualTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].ActualTime"));
					deploymentStep.setCurrentStep(_ctx.booleanValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].CurrentStep"));
					deploymentStep.setExpectTime(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].ExpectTime"));
					deploymentStep.setStatus(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].Status"));

					deploymentSteps.add(deploymentStep);
				}
				deploymentAttribute.setDeploymentSteps(deploymentSteps);

				deploymentAttributes.add(deploymentAttribute);
			}
			managedPrivateSpaceSet.setDeploymentAttributes(deploymentAttributes);

			List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets.Length"); j++) {
				ManagedHostSet managedHostSet = new ManagedHostSet();
				managedHostSet.setManagedHostId(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostId"));
				managedHostSet.setManagedHostStatus(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostStatus"));

				managedHostSets.add(managedHostSet);
			}
			managedPrivateSpaceSet.setManagedHostSets(managedHostSets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			managedPrivateSpaceSet.setTags(tags);

			managedPrivateSpaceSets.add(managedPrivateSpaceSet);
		}
		listManagedPrivateSpacesResponse.setManagedPrivateSpaceSets(managedPrivateSpaceSets);
	 
	 	return listManagedPrivateSpacesResponse;
	}
}