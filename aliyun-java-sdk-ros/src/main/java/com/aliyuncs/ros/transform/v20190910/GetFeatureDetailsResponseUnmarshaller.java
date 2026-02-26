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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.DriftDetection;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.ResourceCleaner;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceType4;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.ResourceImport;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.ResourceImport.SupportedResourceType9;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.TemplateParameterConstraints;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.TemplateParameterConstraints.SupportedResourceType6;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.TemplateScratch;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.TemplateScratch.SupportedResourceType;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.Terraform;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.Terraform.SupportedResourceTypes;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.StackOperationRisk;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.Terraform.SupportedVersion;
import com.aliyuncs.ros.model.v20190910.GetFeatureDetailsResponse.Terraform.SupportedVersion.ProviderVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFeatureDetailsResponseUnmarshaller {

	public static GetFeatureDetailsResponse unmarshall(GetFeatureDetailsResponse getFeatureDetailsResponse, UnmarshallerContext _ctx) {
		
		getFeatureDetailsResponse.setRequestId(_ctx.stringValue("GetFeatureDetailsResponse.RequestId"));

		Terraform terraform = new Terraform();

		SupportedResourceTypes supportedResourceTypes = new SupportedResourceTypes();

		List<String> systemTag = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.SystemTag.Length"); i++) {
			systemTag.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.SystemTag["+ i +"]"));
		}
		supportedResourceTypes.setSystemTag(systemTag);

		List<String> customTag = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.CustomTag.Length"); i++) {
			customTag.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.CustomTag["+ i +"]"));
		}
		supportedResourceTypes.setCustomTag(customTag);

		List<String> estimateCost = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.EstimateCost.Length"); i++) {
			estimateCost.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.EstimateCost["+ i +"]"));
		}
		supportedResourceTypes.setEstimateCost(estimateCost);

		List<String> resourceGroup = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.ResourceGroup.Length"); i++) {
			resourceGroup.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.ResourceGroup["+ i +"]"));
		}
		supportedResourceTypes.setResourceGroup(resourceGroup);

		StackOperationRisk stackOperationRisk = new StackOperationRisk();

		List<String> deleteStack = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.StackOperationRisk.DeleteStack.Length"); i++) {
			deleteStack.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedResourceTypes.StackOperationRisk.DeleteStack["+ i +"]"));
		}
		stackOperationRisk.setDeleteStack(deleteStack);
		supportedResourceTypes.setStackOperationRisk(stackOperationRisk);
		terraform.setSupportedResourceTypes(supportedResourceTypes);

		List<SupportedVersion> supportedVersions = new ArrayList<SupportedVersion>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedVersions.Length"); i++) {
			SupportedVersion supportedVersion = new SupportedVersion();
			supportedVersion.setTerraformVersion(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].TerraformVersion"));
			supportedVersion.setTransform(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].Transform"));

			List<String> updateAllowedTransforms = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].UpdateAllowedTransforms.Length"); j++) {
				updateAllowedTransforms.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].UpdateAllowedTransforms["+ j +"]"));
			}
			supportedVersion.setUpdateAllowedTransforms(updateAllowedTransforms);

			List<ProviderVersion> providerVersions = new ArrayList<ProviderVersion>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].ProviderVersions.Length"); j++) {
				ProviderVersion providerVersion = new ProviderVersion();
				providerVersion.setProviderName(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].ProviderVersions["+ j +"].ProviderName"));

				List<String> supportedVersions1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].ProviderVersions["+ j +"].SupportedVersions.Length"); k++) {
					supportedVersions1.add(_ctx.stringValue("GetFeatureDetailsResponse.Terraform.SupportedVersions["+ i +"].ProviderVersions["+ j +"].SupportedVersions["+ k +"]"));
				}
				providerVersion.setSupportedVersions1(supportedVersions1);

				providerVersions.add(providerVersion);
			}
			supportedVersion.setProviderVersions(providerVersions);

			supportedVersions.add(supportedVersion);
		}
		terraform.setSupportedVersions(supportedVersions);
		getFeatureDetailsResponse.setTerraform(terraform);

		TemplateScratch templateScratch = new TemplateScratch();

		List<SupportedResourceType> supportedResourceTypes2 = new ArrayList<SupportedResourceType>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes.Length"); i++) {
			SupportedResourceType supportedResourceType = new SupportedResourceType();
			supportedResourceType.setResourceType(_ctx.stringValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].ResourceType"));
			supportedResourceType.setSourceResourcesSupported(_ctx.booleanValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SourceResourcesSupported"));
			supportedResourceType.setSourceTagSupported(_ctx.booleanValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SourceTagSupported"));
			supportedResourceType.setSourceResourceGroupSupported(_ctx.booleanValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SourceResourceGroupSupported"));
			supportedResourceType.setSourceSupported(_ctx.booleanValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SourceSupported"));

			List<String> supportedTemplateScratchTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SupportedTemplateScratchTypes.Length"); j++) {
				supportedTemplateScratchTypes.add(_ctx.stringValue("GetFeatureDetailsResponse.TemplateScratch.SupportedResourceTypes["+ i +"].SupportedTemplateScratchTypes["+ j +"]"));
			}
			supportedResourceType.setSupportedTemplateScratchTypes(supportedTemplateScratchTypes);

			supportedResourceTypes2.add(supportedResourceType);
		}
		templateScratch.setSupportedResourceTypes2(supportedResourceTypes2);
		getFeatureDetailsResponse.setTemplateScratch(templateScratch);

		ResourceCleaner resourceCleaner = new ResourceCleaner();

		List<SupportedResourceType4> supportedResourceTypes3 = new ArrayList<SupportedResourceType4>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes.Length"); i++) {
			SupportedResourceType4 supportedResourceType4 = new SupportedResourceType4();
			supportedResourceType4.setResourceType(_ctx.stringValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes["+ i +"].ResourceType"));

			List<String> supportedFilters = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes["+ i +"].SupportedFilters.Length"); j++) {
				supportedFilters.add(_ctx.stringValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes["+ i +"].SupportedFilters["+ j +"]"));
			}
			supportedResourceType4.setSupportedFilters(supportedFilters);

			List<String> sideEffects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes["+ i +"].SideEffects.Length"); j++) {
				sideEffects.add(_ctx.stringValue("GetFeatureDetailsResponse.ResourceCleaner.SupportedResourceTypes["+ i +"].SideEffects["+ j +"]"));
			}
			supportedResourceType4.setSideEffects(sideEffects);

			supportedResourceTypes3.add(supportedResourceType4);
		}
		resourceCleaner.setSupportedResourceTypes3(supportedResourceTypes3);
		getFeatureDetailsResponse.setResourceCleaner(resourceCleaner);

		TemplateParameterConstraints templateParameterConstraints = new TemplateParameterConstraints();

		List<SupportedResourceType6> supportedResourceTypes5 = new ArrayList<SupportedResourceType6>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.TemplateParameterConstraints.SupportedResourceTypes.Length"); i++) {
			SupportedResourceType6 supportedResourceType6 = new SupportedResourceType6();
			supportedResourceType6.setResourceType(_ctx.stringValue("GetFeatureDetailsResponse.TemplateParameterConstraints.SupportedResourceTypes["+ i +"].ResourceType"));

			List<String> properties = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.TemplateParameterConstraints.SupportedResourceTypes["+ i +"].Properties.Length"); j++) {
				properties.add(_ctx.stringValue("GetFeatureDetailsResponse.TemplateParameterConstraints.SupportedResourceTypes["+ i +"].Properties["+ j +"]"));
			}
			supportedResourceType6.setProperties(properties);

			supportedResourceTypes5.add(supportedResourceType6);
		}
		templateParameterConstraints.setSupportedResourceTypes5(supportedResourceTypes5);
		getFeatureDetailsResponse.setTemplateParameterConstraints(templateParameterConstraints);

		DriftDetection driftDetection = new DriftDetection();

		List<String> supportedResourceTypes7 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.DriftDetection.SupportedResourceTypes.Length"); i++) {
			supportedResourceTypes7.add(_ctx.stringValue("GetFeatureDetailsResponse.DriftDetection.SupportedResourceTypes["+ i +"]"));
		}
		driftDetection.setSupportedResourceTypes7(supportedResourceTypes7);
		getFeatureDetailsResponse.setDriftDetection(driftDetection);

		ResourceImport resourceImport = new ResourceImport();

		List<SupportedResourceType9> supportedResourceTypes8 = new ArrayList<SupportedResourceType9>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureDetailsResponse.ResourceImport.SupportedResourceTypes.Length"); i++) {
			SupportedResourceType9 supportedResourceType9 = new SupportedResourceType9();
			supportedResourceType9.setResourceType(_ctx.stringValue("GetFeatureDetailsResponse.ResourceImport.SupportedResourceTypes["+ i +"].ResourceType"));

			List<String> resourceIdentifiers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFeatureDetailsResponse.ResourceImport.SupportedResourceTypes["+ i +"].ResourceIdentifiers.Length"); j++) {
				resourceIdentifiers.add(_ctx.stringValue("GetFeatureDetailsResponse.ResourceImport.SupportedResourceTypes["+ i +"].ResourceIdentifiers["+ j +"]"));
			}
			supportedResourceType9.setResourceIdentifiers(resourceIdentifiers);

			supportedResourceTypes8.add(supportedResourceType9);
		}
		resourceImport.setSupportedResourceTypes8(supportedResourceTypes8);
		getFeatureDetailsResponse.setResourceImport(resourceImport);
	 
	 	return getFeatureDetailsResponse;
	}
}