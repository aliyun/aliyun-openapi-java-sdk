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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeTenantlabelsupdateResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse unmarshall(UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse updateLinkeantcodeAntcodeTenantlabelsupdateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.RequestId"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.ResultCode"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.ResultMessage"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setColor(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.Color"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.CreatedAt"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.Description"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setGroupId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.GroupId"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.Id"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.Name"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.ProjectId"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.SourceType"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setTemplate(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.Template"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setTenantId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.TenantId"));
		updateLinkeantcodeAntcodeTenantlabelsupdateResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantlabelsupdateResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeTenantlabelsupdateResponse;
	}
}