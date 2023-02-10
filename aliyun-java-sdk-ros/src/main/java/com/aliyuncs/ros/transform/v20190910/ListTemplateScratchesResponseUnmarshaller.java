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

import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch.PreferenceParameter;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch.SourceResource;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch.SourceResourceGroup;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch.SourceTag;
import com.aliyuncs.ros.model.v20190910.ListTemplateScratchesResponse.TemplateScratch.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateScratchesResponseUnmarshaller {

	public static ListTemplateScratchesResponse unmarshall(ListTemplateScratchesResponse listTemplateScratchesResponse, UnmarshallerContext _ctx) {
		
		listTemplateScratchesResponse.setRequestId(_ctx.stringValue("ListTemplateScratchesResponse.RequestId"));
		listTemplateScratchesResponse.setTotalCount(_ctx.integerValue("ListTemplateScratchesResponse.TotalCount"));
		listTemplateScratchesResponse.setPageNumber(_ctx.integerValue("ListTemplateScratchesResponse.PageNumber"));
		listTemplateScratchesResponse.setPageSize(_ctx.integerValue("ListTemplateScratchesResponse.PageSize"));

		List<TemplateScratch> templateScratches = new ArrayList<TemplateScratch>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches.Length"); i++) {
			TemplateScratch templateScratch = new TemplateScratch();
			templateScratch.setTemplateScratchId(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].TemplateScratchId"));
			templateScratch.setTemplateScratchType(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].TemplateScratchType"));
			templateScratch.setStatus(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].Status"));
			templateScratch.setStatusReason(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].StatusReason"));
			templateScratch.setFailedCode(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].FailedCode"));
			templateScratch.setDescription(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].Description"));
			templateScratch.setLogicalIdStrategy(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].LogicalIdStrategy"));
			templateScratch.setCreateTime(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].CreateTime"));
			templateScratch.setUpdateTime(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].UpdateTime"));

			SourceTag sourceTag = new SourceTag();
			sourceTag.setResourceTags(_ctx.mapValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceTag.ResourceTags"));

			List<String> resourceTypeFilter = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceTag.ResourceTypeFilter.Length"); j++) {
				resourceTypeFilter.add(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceTag.ResourceTypeFilter["+ j +"]"));
			}
			sourceTag.setResourceTypeFilter(resourceTypeFilter);
			templateScratch.setSourceTag(sourceTag);

			SourceResourceGroup sourceResourceGroup = new SourceResourceGroup();
			sourceResourceGroup.setResourceGroupId(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResourceGroup.ResourceGroupId"));

			List<String> resourceTypeFilter1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResourceGroup.ResourceTypeFilter.Length"); j++) {
				resourceTypeFilter1.add(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResourceGroup.ResourceTypeFilter["+ j +"]"));
			}
			sourceResourceGroup.setResourceTypeFilter1(resourceTypeFilter1);
			templateScratch.setSourceResourceGroup(sourceResourceGroup);

			List<PreferenceParameter> preferenceParameters = new ArrayList<PreferenceParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].PreferenceParameters.Length"); j++) {
				PreferenceParameter preferenceParameter = new PreferenceParameter();
				preferenceParameter.setParameterKey(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].PreferenceParameters["+ j +"].ParameterKey"));
				preferenceParameter.setParameterValue(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].PreferenceParameters["+ j +"].ParameterValue"));

				preferenceParameters.add(preferenceParameter);
			}
			templateScratch.setPreferenceParameters(preferenceParameters);

			List<SourceResource> sourceResources = new ArrayList<SourceResource>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResources.Length"); j++) {
				SourceResource sourceResource = new SourceResource();
				sourceResource.setResourceId(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResources["+ j +"].ResourceId"));
				sourceResource.setResourceType(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].SourceResources["+ j +"].ResourceType"));

				sourceResources.add(sourceResource);
			}
			templateScratch.setSourceResources(sourceResources);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListTemplateScratchesResponse.TemplateScratches["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			templateScratch.setTags(tags);

			templateScratches.add(templateScratch);
		}
		listTemplateScratchesResponse.setTemplateScratches(templateScratches);
	 
	 	return listTemplateScratchesResponse;
	}
}