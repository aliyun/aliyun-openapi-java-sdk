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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableRegionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableRegionResponse.IzModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableRegionResponse.IzModel.IZResourceModel;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableRegionResponse.Region;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAvailableRegionResponseUnmarshaller {

	public static OpsQueryAvailableRegionResponse unmarshall(OpsQueryAvailableRegionResponse opsQueryAvailableRegionResponse, UnmarshallerContext _ctx) {
		
		opsQueryAvailableRegionResponse.setRequestId(_ctx.stringValue("OpsQueryAvailableRegionResponse.RequestId"));

		Region region = new Region();
		region.setVmQuota(_ctx.longValue("OpsQueryAvailableRegionResponse.Region.vmQuota"));
		region.setRegionMemo(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.RegionMemo"));
		region.setRegionEnName(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.RegionEnName"));
		region.setIsActive(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.IsActive"));
		region.setRegionName(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.RegionName"));
		region.setEcsQuota(_ctx.longValue("OpsQueryAvailableRegionResponse.Region.ecsQuota"));
		region.setRegionNo(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.RegionNo"));
		region.setRegionNoAlias(_ctx.stringValue("OpsQueryAvailableRegionResponse.Region.RegionNoAlias"));
		opsQueryAvailableRegionResponse.setRegion(region);

		List<IzModel> izModels = new ArrayList<IzModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels.Length"); i++) {
			IzModel izModel = new IzModel();
			izModel.setRegionNo(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].RegionNo"));
			izModel.setEnName(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].EnName"));
			izModel.setStatus(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].status"));
			izModel.setStatusCatalogue(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].statusCatalogue"));
			izModel.setNo(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].No"));
			izModel.setCnName(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].CnName"));
			izModel.setDeployedInstanceTypeToStatus(_ctx.mapValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].DeployedInstanceTypeToStatus"));

			List<String> supportedDedicatedHostGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedDedicatedHostGenerations.Length"); j++) {
				supportedDedicatedHostGenerations.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedDedicatedHostGenerations["+ j +"]"));
			}
			izModel.setSupportedDedicatedHostGenerations(supportedDedicatedHostGenerations);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceTypeNames["+ j +"]"));
			}
			izModel.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].AllowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].AllowedResourceCreation["+ j +"]"));
			}
			izModel.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDedicatedHostTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedDedicatedHostTypeNames.Length"); j++) {
				supportedDedicatedHostTypeNames.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedDedicatedHostTypeNames["+ j +"]"));
			}
			izModel.setSupportedDedicatedHostTypeNames(supportedDedicatedHostTypeNames);

			List<String> supportedVolumeCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedVolumeCategories.Length"); j++) {
				supportedVolumeCategories.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedVolumeCategories["+ j +"]"));
			}
			izModel.setSupportedVolumeCategories(supportedVolumeCategories);

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceGenerations["+ j +"]"));
			}
			izModel.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			izModel.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<IZResourceModel> iZResourceModels = new ArrayList<IZResourceModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels.Length"); j++) {
				IZResourceModel iZResourceModel = new IZResourceModel();
				iZResourceModel.setSupportIoOptimized(_ctx.booleanValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportIoOptimized"));
				iZResourceModel.setInventoryResourceType(_ctx.integerValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].inventoryResourceType"));
				iZResourceModel.setDeployedInstanceTypeToStatus(_ctx.mapValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].DeployedInstanceTypeToStatus"));

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDataDiskCategories["+ k +"]"));
				}
				iZResourceModel.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedDedicatedHostGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDedicatedHostGenerations.Length"); k++) {
					supportedDedicatedHostGenerations1.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDedicatedHostGenerations["+ k +"]"));
				}
				iZResourceModel.setSupportedDedicatedHostGenerations1(supportedDedicatedHostGenerations1);

				List<String> supportedDedicatedHostTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDedicatedHostTypes.Length"); k++) {
					supportedDedicatedHostTypes.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedDedicatedHostTypes["+ k +"]"));
				}
				iZResourceModel.setSupportedDedicatedHostTypes(supportedDedicatedHostTypes);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceTypes["+ k +"]"));
				}
				iZResourceModel.setSupportedInstanceTypes(supportedInstanceTypes);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceTypeFamilies["+ k +"]"));
				}
				iZResourceModel.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceGenerations3 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations3.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedInstanceGenerations["+ k +"]"));
				}
				iZResourceModel.setSupportedInstanceGenerations3(supportedInstanceGenerations3);

				List<String> networkTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].NetworkTypes.Length"); k++) {
					networkTypes.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].NetworkTypes["+ k +"]"));
				}
				iZResourceModel.setNetworkTypes(networkTypes);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("OpsQueryAvailableRegionResponse.IzModels["+ i +"].IZResourceModels["+ j +"].SupportedSystemDiskCategories["+ k +"]"));
				}
				iZResourceModel.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				iZResourceModels.add(iZResourceModel);
			}
			izModel.setIZResourceModels(iZResourceModels);

			izModels.add(izModel);
		}
		opsQueryAvailableRegionResponse.setIzModels(izModels);
	 
	 	return opsQueryAvailableRegionResponse;
	}
}