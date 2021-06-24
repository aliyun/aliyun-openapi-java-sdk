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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryForIzResourceModifyResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryForIzResourceModifyResponse.ResourcesInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryForIzResourceModifyResponseUnmarshaller {

	public static OpsQueryForIzResourceModifyResponse unmarshall(OpsQueryForIzResourceModifyResponse opsQueryForIzResourceModifyResponse, UnmarshallerContext _ctx) {
		
		opsQueryForIzResourceModifyResponse.setRequestId(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.RequestId"));
		opsQueryForIzResourceModifyResponse.setZoneId(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.ZoneId"));
		opsQueryForIzResourceModifyResponse.setDeployedInstanceTypeToStatus(_ctx.mapValue("OpsQueryForIzResourceModifyResponse.DeployedInstanceTypeToStatus"));
		opsQueryForIzResourceModifyResponse.setLocalName(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.LocalName"));

		List<String> dedicatedHostGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.DedicatedHostGenerations.Length"); i++) {
			dedicatedHostGenerations.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.DedicatedHostGenerations["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setDedicatedHostGenerations(dedicatedHostGenerations);

		List<String> availableInstanceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableInstanceTypes.Length"); i++) {
			availableInstanceTypes.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableInstanceTypes["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setAvailableInstanceTypes(availableInstanceTypes);

		List<String> availableDedicatedHostTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableDedicatedHostTypes.Length"); i++) {
			availableDedicatedHostTypes.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableDedicatedHostTypes["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setAvailableDedicatedHostTypes(availableDedicatedHostTypes);

		List<String> availableDiskCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableDiskCategories.Length"); i++) {
			availableDiskCategories.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableDiskCategories["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setAvailableDiskCategories(availableDiskCategories);

		List<String> availableResourceCreation = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResourceCreation.Length"); i++) {
			availableResourceCreation.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResourceCreation["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setAvailableResourceCreation(availableResourceCreation);

		List<String> availableVolumeCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableVolumeCategories.Length"); i++) {
			availableVolumeCategories.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableVolumeCategories["+ i +"]"));
		}
		opsQueryForIzResourceModifyResponse.setAvailableVolumeCategories(availableVolumeCategories);

		List<ResourcesInfo> availableResources = new ArrayList<ResourcesInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources.Length"); i++) {
			ResourcesInfo resourcesInfo = new ResourcesInfo();
			resourcesInfo.setIoOptimized(_ctx.booleanValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].IoOptimized"));
			resourcesInfo.setDeployedInstanceTypeToStatus(_ctx.mapValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].DeployedInstanceTypeToStatus"));

			List<String> systemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].SystemDiskCategories.Length"); j++) {
				systemDiskCategories.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].SystemDiskCategories["+ j +"]"));
			}
			resourcesInfo.setSystemDiskCategories(systemDiskCategories);

			List<String> instanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceGenerations.Length"); j++) {
				instanceGenerations.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceGenerations["+ j +"]"));
			}
			resourcesInfo.setInstanceGenerations(instanceGenerations);

			List<String> dataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].DataDiskCategories.Length"); j++) {
				dataDiskCategories.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].DataDiskCategories["+ j +"]"));
			}
			resourcesInfo.setDataDiskCategories(dataDiskCategories);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceTypes["+ j +"]"));
			}
			resourcesInfo.setInstanceTypes(instanceTypes);

			List<String> instanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceTypeFamilies.Length"); j++) {
				instanceTypeFamilies.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].InstanceTypeFamilies["+ j +"]"));
			}
			resourcesInfo.setInstanceTypeFamilies(instanceTypeFamilies);

			List<String> networkTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].NetworkTypes.Length"); j++) {
				networkTypes.add(_ctx.stringValue("OpsQueryForIzResourceModifyResponse.AvailableResources["+ i +"].NetworkTypes["+ j +"]"));
			}
			resourcesInfo.setNetworkTypes(networkTypes);

			availableResources.add(resourcesInfo);
		}
		opsQueryForIzResourceModifyResponse.setAvailableResources(availableResources);
	 
	 	return opsQueryForIzResourceModifyResponse;
	}
}