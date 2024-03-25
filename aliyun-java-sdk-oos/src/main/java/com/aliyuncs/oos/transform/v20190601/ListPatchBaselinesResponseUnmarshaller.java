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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListPatchBaselinesResponse;
import com.aliyuncs.oos.model.v20190601.ListPatchBaselinesResponse.PatchBaseline;
import com.aliyuncs.oos.model.v20190601.ListPatchBaselinesResponse.PatchBaseline.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPatchBaselinesResponseUnmarshaller {

	public static ListPatchBaselinesResponse unmarshall(ListPatchBaselinesResponse listPatchBaselinesResponse, UnmarshallerContext _ctx) {
		
		listPatchBaselinesResponse.setRequestId(_ctx.stringValue("ListPatchBaselinesResponse.RequestId"));
		listPatchBaselinesResponse.setNextToken(_ctx.stringValue("ListPatchBaselinesResponse.NextToken"));
		listPatchBaselinesResponse.setMaxResults(_ctx.integerValue("ListPatchBaselinesResponse.MaxResults"));

		List<PatchBaseline> patchBaselines = new ArrayList<PatchBaseline>();
		for (int i = 0; i < _ctx.lengthValue("ListPatchBaselinesResponse.PatchBaselines.Length"); i++) {
			PatchBaseline patchBaseline = new PatchBaseline();
			patchBaseline.setOperationSystem(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].OperationSystem"));
			patchBaseline.setIsDefault(_ctx.booleanValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].IsDefault"));
			patchBaseline.setDescription(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Description"));
			patchBaseline.setUpdatedDate(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].UpdatedDate"));
			patchBaseline.setUpdatedBy(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].UpdatedBy"));
			patchBaseline.setCreatedBy(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].CreatedBy"));
			patchBaseline.setCreatedDate(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].CreatedDate"));
			patchBaseline.setName(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Name"));
			patchBaseline.setId(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Id"));
			patchBaseline.setShareType(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ShareType"));
			patchBaseline.setApprovedPatchesEnableNonSecurity(_ctx.booleanValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ApprovedPatchesEnableNonSecurity"));
			patchBaseline.setResourceGroupId(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ResourceGroupId"));

			List<String> approvedPatches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ApprovedPatches.Length"); j++) {
				approvedPatches.add(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].ApprovedPatches["+ j +"]"));
			}
			patchBaseline.setApprovedPatches(approvedPatches);

			List<String> sources = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Sources.Length"); j++) {
				sources.add(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Sources["+ j +"]"));
			}
			patchBaseline.setSources(sources);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("ListPatchBaselinesResponse.PatchBaselines["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			patchBaseline.setTags(tags);

			patchBaselines.add(patchBaseline);
		}
		listPatchBaselinesResponse.setPatchBaselines(patchBaselines);
	 
	 	return listPatchBaselinesResponse;
	}
}