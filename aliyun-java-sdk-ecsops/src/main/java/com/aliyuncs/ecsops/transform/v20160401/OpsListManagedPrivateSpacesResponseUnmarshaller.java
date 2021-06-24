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

import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.CapacityAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.CapacityAttribute.AvailableInstanceType;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.DeploymentAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.DeploymentAttribute.DeploymentStep;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.LifecycleAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.LocationAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.ManagedHostSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListManagedPrivateSpacesResponseUnmarshaller {

	public static OpsListManagedPrivateSpacesResponse unmarshall(OpsListManagedPrivateSpacesResponse opsListManagedPrivateSpacesResponse, UnmarshallerContext _ctx) {
		
		opsListManagedPrivateSpacesResponse.setRequestId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.RequestId"));
		opsListManagedPrivateSpacesResponse.setTotalCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.TotalCount"));
		opsListManagedPrivateSpacesResponse.setNextToken(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.NextToken"));

		List<ManagedPrivateSpaceSet> managedPrivateSpaceSets = new ArrayList<ManagedPrivateSpaceSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets.Length"); i++) {
			ManagedPrivateSpaceSet managedPrivateSpaceSet = new ManagedPrivateSpaceSet();
			managedPrivateSpaceSet.setCreationTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CreationTime"));
			managedPrivateSpaceSet.setDescription(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Description"));
			managedPrivateSpaceSet.setManagedPrivateSpaceId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedPrivateSpaceId"));
			managedPrivateSpaceSet.setResourceGroupId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ResourceGroupId"));
			managedPrivateSpaceSet.setZoneId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ZoneId"));
			managedPrivateSpaceSet.setSaleMode(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].SaleMode"));
			managedPrivateSpaceSet.setManagedPrivateSpaceName(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedPrivateSpaceName"));

			CapacityAttribute capacityAttribute = new CapacityAttribute();
			capacityAttribute.setTotalVcpus(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalVcpus"));
			capacityAttribute.setReservedVcpus(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedVcpus"));
			capacityAttribute.setReservedHostCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedHostCount"));
			capacityAttribute.setAvailableVcpus(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableVcpus"));
			capacityAttribute.setAvailableHostCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableHostCount"));
			capacityAttribute.setTotalHostCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalHostCount"));
			capacityAttribute.setReservedMemories(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.ReservedMemories"));
			capacityAttribute.setAvailableMemories(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableMemories"));
			capacityAttribute.setTotalMemories(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.TotalMemories"));

			List<AvailableInstanceType> availableInstanceTypes = new ArrayList<AvailableInstanceType>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableInstanceTypes.Length"); j++) {
				AvailableInstanceType availableInstanceType = new AvailableInstanceType();
				availableInstanceType.setInstanceType(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableInstanceTypes["+ j +"].InstanceType"));
				availableInstanceType.setAvailableCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableInstanceTypes["+ j +"].AvailableCount"));
				availableInstanceType.setTotalCount(_ctx.integerValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].CapacityAttribute.AvailableInstanceTypes["+ j +"].TotalCount"));

				availableInstanceTypes.add(availableInstanceType);
			}
			capacityAttribute.setAvailableInstanceTypes(availableInstanceTypes);
			managedPrivateSpaceSet.setCapacityAttribute(capacityAttribute);

			LifecycleAttribute lifecycleAttribute = new LifecycleAttribute();
			lifecycleAttribute.setReceptionTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.ReceptionTime"));
			lifecycleAttribute.setDeliveryTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.DeliveryTime"));
			lifecycleAttribute.setExpirationTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LifecycleAttribute.ExpirationTime"));
			managedPrivateSpaceSet.setLifecycleAttribute(lifecycleAttribute);

			LocationAttribute locationAttribute = new LocationAttribute();
			locationAttribute.setAddress(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].LocationAttribute.Address"));
			managedPrivateSpaceSet.setLocationAttribute(locationAttribute);

			List<ManagedHostSet> managedHostSets = new ArrayList<ManagedHostSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets.Length"); j++) {
				ManagedHostSet managedHostSet = new ManagedHostSet();
				managedHostSet.setManagedHostStatus(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostStatus"));
				managedHostSet.setManagedHostId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].ManagedHostSets["+ j +"].ManagedHostId"));

				managedHostSets.add(managedHostSet);
			}
			managedPrivateSpaceSet.setManagedHostSets(managedHostSets);

			List<DeploymentAttribute> deploymentAttributes = new ArrayList<DeploymentAttribute>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes.Length"); j++) {
				DeploymentAttribute deploymentAttribute = new DeploymentAttribute();
				deploymentAttribute.setDescription(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].Description"));
				deploymentAttribute.setCreateTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].CreateTime"));
				deploymentAttribute.setContractId(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].ContractId"));

				List<DeploymentStep> deploymentSteps = new ArrayList<DeploymentStep>();
				for (int k = 0; k < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps.Length"); k++) {
					DeploymentStep deploymentStep = new DeploymentStep();
					deploymentStep.setStatus(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].Status"));
					deploymentStep.setCurrentStep(_ctx.booleanValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].CurrentStep"));
					deploymentStep.setActualTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].ActualTime"));
					deploymentStep.setExpectTime(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].DeploymentAttributes["+ j +"].DeploymentSteps["+ k +"].ExpectTime"));

					deploymentSteps.add(deploymentStep);
				}
				deploymentAttribute.setDeploymentSteps(deploymentSteps);

				deploymentAttributes.add(deploymentAttribute);
			}
			managedPrivateSpaceSet.setDeploymentAttributes(deploymentAttributes);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsListManagedPrivateSpacesResponse.ManagedPrivateSpaceSets["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			managedPrivateSpaceSet.setTags(tags);

			managedPrivateSpaceSets.add(managedPrivateSpaceSet);
		}
		opsListManagedPrivateSpacesResponse.setManagedPrivateSpaceSets(managedPrivateSpaceSets);
	 
	 	return opsListManagedPrivateSpacesResponse;
	}
}