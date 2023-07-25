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

import com.aliyuncs.oos.model.v20190601.GetPatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.GetPatchBaselineResponse.PatchBaseline;
import com.aliyuncs.oos.model.v20190601.GetPatchBaselineResponse.PatchBaseline.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatchBaselineResponseUnmarshaller {

	public static GetPatchBaselineResponse unmarshall(GetPatchBaselineResponse getPatchBaselineResponse, UnmarshallerContext _ctx) {
		
		getPatchBaselineResponse.setRequestId(_ctx.stringValue("GetPatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setOperationSystem(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setIsDefault(_ctx.booleanValue("GetPatchBaselineResponse.PatchBaseline.IsDefault"));
		patchBaseline.setDescription(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setCreatedBy(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setCreatedDate(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setName(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setApprovalRules(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.ApprovalRules"));
		patchBaseline.setId(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setShareType(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setRejectedPatchesAction(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.RejectedPatchesAction"));
		patchBaseline.setApprovedPatchesEnableNonSecurity(_ctx.booleanValue("GetPatchBaselineResponse.PatchBaseline.ApprovedPatchesEnableNonSecurity"));

		List<String> rejectedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPatchBaselineResponse.PatchBaseline.RejectedPatches.Length"); i++) {
			rejectedPatches.add(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.RejectedPatches["+ i +"]"));
		}
		patchBaseline.setRejectedPatches(rejectedPatches);

		List<String> approvedPatches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPatchBaselineResponse.PatchBaseline.ApprovedPatches.Length"); i++) {
			approvedPatches.add(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.ApprovedPatches["+ i +"]"));
		}
		patchBaseline.setApprovedPatches(approvedPatches);

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPatchBaselineResponse.PatchBaseline.Sources.Length"); i++) {
			sources.add(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Sources["+ i +"]"));
		}
		patchBaseline.setSources(sources);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatchBaselineResponse.PatchBaseline.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		patchBaseline.setTags(tags);
		getPatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return getPatchBaselineResponse;
	}
}