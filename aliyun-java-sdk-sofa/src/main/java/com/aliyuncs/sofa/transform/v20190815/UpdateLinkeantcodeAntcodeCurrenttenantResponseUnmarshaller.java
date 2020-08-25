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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeCurrenttenantResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeCurrenttenantResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeCurrenttenantResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeCurrenttenantResponse unmarshall(UpdateLinkeantcodeAntcodeCurrenttenantResponse updateLinkeantcodeAntcodeCurrenttenantResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeCurrenttenantResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.RequestId"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.ResultCode"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.ResultMessage"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.CreatedAt"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Id"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Name"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Path"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setWhileListIp(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.WhileListIp"));

		Permission permission = new Permission();
		permission.setGroupAccess(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Permission.GroupAccess"));
		permission.setProjectAccess(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Permission.ProjectAccess"));
		permission.setReviewAccess(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Permission.ReviewAccess"));
		permission.setTenantAccess(_ctx.stringValue("UpdateLinkeantcodeAntcodeCurrenttenantResponse.Permission.TenantAccess"));
		updateLinkeantcodeAntcodeCurrenttenantResponse.setPermission(permission);
	 
	 	return updateLinkeantcodeAntcodeCurrenttenantResponse;
	}
}