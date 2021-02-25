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

import com.aliyuncs.oos.model.v20190601.RegisterDefaultPatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.RegisterDefaultPatchBaselineResponse.PatchBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterDefaultPatchBaselineResponseUnmarshaller {

	public static RegisterDefaultPatchBaselineResponse unmarshall(RegisterDefaultPatchBaselineResponse registerDefaultPatchBaselineResponse, UnmarshallerContext _ctx) {
		
		registerDefaultPatchBaselineResponse.setRequestId(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setId(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setName(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setCreatedDate(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setCreatedBy(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setDescription(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setShareType(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setOperationSystem(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setApprovalRules(_ctx.stringValue("RegisterDefaultPatchBaselineResponse.PatchBaseline.ApprovalRules"));
		registerDefaultPatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return registerDefaultPatchBaselineResponse;
	}
}