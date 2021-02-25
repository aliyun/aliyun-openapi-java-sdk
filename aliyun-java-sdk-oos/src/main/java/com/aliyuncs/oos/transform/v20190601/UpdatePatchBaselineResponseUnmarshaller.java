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

import com.aliyuncs.oos.model.v20190601.UpdatePatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.UpdatePatchBaselineResponse.PatchBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePatchBaselineResponseUnmarshaller {

	public static UpdatePatchBaselineResponse unmarshall(UpdatePatchBaselineResponse updatePatchBaselineResponse, UnmarshallerContext _ctx) {
		
		updatePatchBaselineResponse.setRequestId(_ctx.stringValue("UpdatePatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setId(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setName(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setCreatedDate(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setCreatedBy(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setDescription(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setShareType(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setOperationSystem(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setApprovalRules(_ctx.stringValue("UpdatePatchBaselineResponse.PatchBaseline.ApprovalRules"));
		updatePatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return updatePatchBaselineResponse;
	}
}