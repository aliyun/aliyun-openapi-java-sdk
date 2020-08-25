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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeGrouplabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeGrouplabelResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeGrouplabelResponse unmarshall(DeleteLinkeantcodeAntcodeGrouplabelResponse deleteLinkeantcodeAntcodeGrouplabelResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeGrouplabelResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.RequestId"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.ResultCode"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.Color"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.Description"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.GroupId"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.Id"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.Name"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.ProjectId"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.SourceType"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.Template"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.TenantId"));
		deleteLinkeantcodeAntcodeGrouplabelResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeGrouplabelResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeGrouplabelResponse;
	}
}