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

import com.aliyuncs.oos.model.v20190601.CreatePatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.CreatePatchBaselineResponse.PatchBaseline;
import com.aliyuncs.oos.model.v20190601.CreatePatchBaselineResponse.PatchBaseline.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePatchBaselineResponseUnmarshaller {

	public static CreatePatchBaselineResponse unmarshall(CreatePatchBaselineResponse createPatchBaselineResponse, UnmarshallerContext _ctx) {
		
		createPatchBaselineResponse.setRequestId(_ctx.stringValue("CreatePatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setOperationSystem(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setDescription(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setCreatedBy(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setCreatedDate(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setName(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setApprovalRules(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ApprovalRules"));
		patchBaseline.setId(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setShareType(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setRejectedPatchesAction(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.RejectedPatchesAction"));
		patchBaseline.setApprovedPatchesEnableNonSecurity(_ctx.booleanValue("CreatePatchBaselineResponse.PatchBaseline.ApprovedPatchesEnableNonSecurity"));
		patchBaseline.setResourceGroupId(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ResourceGroupId"));

		List<String> rejectedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePatchBaselineResponse.PatchBaseline.RejectedPatches.Length"); i++) {
			rejectedPatches.add(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.RejectedPatches["+ i +"]"));
		}
		patchBaseline.setRejectedPatches(rejectedPatches);

		List<String> approvedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePatchBaselineResponse.PatchBaseline.ApprovedPatches.Length"); i++) {
			approvedPatches.add(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ApprovedPatches["+ i +"]"));
		}
		patchBaseline.setApprovedPatches(approvedPatches);

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePatchBaselineResponse.PatchBaseline.Sources.Length"); i++) {
			sources.add(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Sources["+ i +"]"));
		}
		patchBaseline.setSources(sources);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreatePatchBaselineResponse.PatchBaseline.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		patchBaseline.setTags(tags);
		createPatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return createPatchBaselineResponse;
	}
}