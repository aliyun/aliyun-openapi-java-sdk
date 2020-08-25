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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeTenantlabelsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeTenantlabelsResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeTenantlabelsResponse unmarshall(DeleteLinkeantcodeAntcodeTenantlabelsResponse deleteLinkeantcodeAntcodeTenantlabelsResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.RequestId"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.ResultCode"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.Color"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.Description"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.GroupId"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.Id"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.Name"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.ProjectId"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.SourceType"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.Template"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.TenantId"));
		deleteLinkeantcodeAntcodeTenantlabelsResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantlabelsResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeTenantlabelsResponse;
	}
}