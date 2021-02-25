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

import com.aliyuncs.oos.model.v20190601.GetPatchBaselineResponse;
import com.aliyuncs.oos.model.v20190601.GetPatchBaselineResponse.PatchBaseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatchBaselineResponseUnmarshaller {

	public static GetPatchBaselineResponse unmarshall(GetPatchBaselineResponse getPatchBaselineResponse, UnmarshallerContext _ctx) {
		
		getPatchBaselineResponse.setRequestId(_ctx.stringValue("GetPatchBaselineResponse.RequestId"));

		PatchBaseline patchBaseline = new PatchBaseline();
		patchBaseline.setId(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Id"));
		patchBaseline.setName(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Name"));
		patchBaseline.setCreatedDate(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.CreatedDate"));
		patchBaseline.setCreatedBy(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.CreatedBy"));
		patchBaseline.setUpdatedDate(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.UpdatedDate"));
		patchBaseline.setUpdatedBy(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.UpdatedBy"));
		patchBaseline.setDescription(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.Description"));
		patchBaseline.setShareType(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.ShareType"));
		patchBaseline.setOperationSystem(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.OperationSystem"));
		patchBaseline.setApprovalRules(_ctx.stringValue("GetPatchBaselineResponse.PatchBaseline.ApprovalRules"));
		getPatchBaselineResponse.setPatchBaseline(patchBaseline);
	 
	 	return getPatchBaselineResponse;
	}
}