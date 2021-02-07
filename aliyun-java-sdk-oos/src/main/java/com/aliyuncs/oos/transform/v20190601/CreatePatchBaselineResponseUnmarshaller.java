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

import com.aliyuncs.oos.model.v20190601.CreatePatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.CreatePatchBaselineResponse.PatchBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePatchBaselineResponseUnmarshaller {

	public static CreatePatchBaselineResponse unmarshall(CreatePatchBaselineResponse createPatchBaselineResponse, UnmarshallerContext _ctx) {
		
		createPatchBaselineResponse.setRequestId(_ctx.stringValue("CreatePatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setId(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setName(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setCreatedDate(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setCreatedBy(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setDescription(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setShareType(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setOperationSystem(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setApprovalRules(_ctx.stringValue("CreatePatchBaselineResponse.PatchBaseline.ApprovalRules"));
		createPatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return createPatchBaselineResponse;
	}
}