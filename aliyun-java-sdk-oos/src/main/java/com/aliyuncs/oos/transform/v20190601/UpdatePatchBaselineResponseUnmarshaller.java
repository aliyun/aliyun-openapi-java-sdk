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

import com.aliyuncs.oos.model.v20190601.UpdatePatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.UpdatePatchBaselineResponse.PatchBaseline;
import com.aliyuncs.oos.model.v20190601.UpdatePatchBaselineResponse.PatchBaseline.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePatchBaselineResponseUnmarshaller {

	public static UpdatePatchBaselineResponse unmarshall(UpdatePatchBaselineResponse updatePatchBaselineResponse, UnmarshallerContext _ctx) {
		
		updatePatchBaselineResponse.setRequestId(_ctx.stringValue("UpdatePatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setOperationSystem(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setDescription(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setCreatedBy(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setCreatedDate(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setName(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setApprovalRules(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ApprovalRules"));
		patchBaseline.setId(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setShareType(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setRejectedPatchesAction(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.RejectedPatchesAction"));
		patchBaseline.setApprovedPatchesEnableNonSecurity(_ctx.booleanValue("UpdatePatchBaselineResponse.PatchBaseline.ApprovedPatchesEnableNonSecurity"));
		patchBaseline.setResourceGroupId(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ResourceGroupId"));

		List<String> rejectedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePatchBaselineResponse.PatchBaseline.RejectedPatches.Length"); i++) {
			rejectedPatches.add(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.RejectedPatches["+ i +"]"));
		}
		patchBaseline.setRejectedPatches(rejectedPatches);

		List<String> approvedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePatchBaselineResponse.PatchBaseline.ApprovedPatches.Length"); i++) {
			approvedPatches.add(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ApprovedPatches["+ i +"]"));
		}
		patchBaseline.setApprovedPatches(approvedPatches);

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePatchBaselineResponse.PatchBaseline.Sources.Length"); i++) {
			sources.add(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Sources["+ i +"]"));
		}
		patchBaseline.setSources(sources);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePatchBaselineResponse.PatchBaseline.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		patchBaseline.setTags(tags);
		updatePatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return updatePatchBaselineResponse;
	}
}