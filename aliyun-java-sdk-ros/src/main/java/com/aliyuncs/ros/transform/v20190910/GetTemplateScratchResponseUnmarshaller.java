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

import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.PreferenceParameter;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.SourceResource;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.SourceResourceGroup;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.SourceTag;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.Stack;
import com.aliyuncs.ros.model.v20190910.GetTemplateScratchResponse.TemplateScratch.StackProvision;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateScratchResponseUnmarshaller {

	public static GetTemplateScratchResponse unmarshall(GetTemplateScratchResponse getTemplateScratchResponse, UnmarshallerContext _ctx) {
		
		getTemplateScratchResponse.setRequestId(_ctx.stringValue("GetTemplateScratchResponse.RequestId"));

		TemplateScratch templateScratch = new TemplateScratch();
		templateScratch.setTemplateScratchId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.TemplateScratchId"));
		templateScratch.setTemplateScratchType(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.TemplateScratchType"));
		templateScratch.setStatus(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.Status"));
		templateScratch.setStatusReason(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.StatusReason"));
		templateScratch.setFailedCode(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.FailedCode"));
		templateScratch.setTemplateScratchData(_ctx.mapValue("GetTemplateScratchResponse.TemplateScratch.TemplateScratchData"));
		templateScratch.setDescription(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.Description"));
		templateScratch.setLogicalIdStrategy(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.LogicalIdStrategy"));
		templateScratch.setCreateTime(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.CreateTime"));
		templateScratch.setUpdateTime(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.UpdateTime"));
		templateScratch.setResourceGroupId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.ResourceGroupId"));

		SourceTag sourceTag = new SourceTag();
		sourceTag.setResourceTags(_ctx.mapValue("GetTemplateScratchResponse.TemplateScratch.SourceTag.ResourceTags"));

		List<String> resourceTypeFilter = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.SourceTag.ResourceTypeFilter.Length"); i++) {
			resourceTypeFilter.add(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceTag.ResourceTypeFilter["+ i +"]"));
		}
		sourceTag.setResourceTypeFilter(resourceTypeFilter);
		templateScratch.setSourceTag(sourceTag);

		SourceResourceGroup sourceResourceGroup = new SourceResourceGroup();
		sourceResourceGroup.setResourceGroupId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceResourceGroup.ResourceGroupId"));

		List<String> resourceTypeFilter1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.SourceResourceGroup.ResourceTypeFilter.Length"); i++) {
			resourceTypeFilter1.add(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceResourceGroup.ResourceTypeFilter["+ i +"]"));
		}
		sourceResourceGroup.setResourceTypeFilter1(resourceTypeFilter1);
		templateScratch.setSourceResourceGroup(sourceResourceGroup);

		StackProvision stackProvision = new StackProvision();
		stackProvision.setCreatable(_ctx.booleanValue("GetTemplateScratchResponse.TemplateScratch.StackProvision.Creatable"));
		stackProvision.setImportable(_ctx.booleanValue("GetTemplateScratchResponse.TemplateScratch.StackProvision.Importable"));
		templateScratch.setStackProvision(stackProvision);

		List<PreferenceParameter> preferenceParameters = new ArrayList<PreferenceParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.PreferenceParameters.Length"); i++) {
			PreferenceParameter preferenceParameter = new PreferenceParameter();
			preferenceParameter.setParameterKey(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.PreferenceParameters["+ i +"].ParameterKey"));
			preferenceParameter.setParameterValue(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.PreferenceParameters["+ i +"].ParameterValue"));

			preferenceParameters.add(preferenceParameter);
		}
		templateScratch.setPreferenceParameters(preferenceParameters);

		List<SourceResource> sourceResources = new ArrayList<SourceResource>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.SourceResources.Length"); i++) {
			SourceResource sourceResource = new SourceResource();
			sourceResource.setResourceId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceResources["+ i +"].ResourceId"));
			sourceResource.setResourceType(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceResources["+ i +"].ResourceType"));

			List<String> relatedResourceTypeFilter = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.SourceResources["+ i +"].RelatedResourceTypeFilter.Length"); j++) {
				relatedResourceTypeFilter.add(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.SourceResources["+ i +"].RelatedResourceTypeFilter["+ j +"]"));
			}
			sourceResource.setRelatedResourceTypeFilter(relatedResourceTypeFilter);

			sourceResources.add(sourceResource);
		}
		templateScratch.setSourceResources(sourceResources);

		List<Stack> stacks = new ArrayList<Stack>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateScratchResponse.TemplateScratch.Stacks.Length"); i++) {
			Stack stack = new Stack();
			stack.setStackId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.Stacks["+ i +"].StackId"));
			stack.setRegionId(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.Stacks["+ i +"].RegionId"));
			stack.setUsageType(_ctx.stringValue("GetTemplateScratchResponse.TemplateScratch.Stacks["+ i +"].UsageType"));

			stacks.add(stack);
		}
		templateScratch.setStacks(stacks);
		getTemplateScratchResponse.setTemplateScratch(templateScratch);
	 
	 	return getTemplateScratchResponse;
	}
}