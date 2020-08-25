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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeGrouplabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeGrouplabelResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeGrouplabelResponse unmarshall(CreateLinkeantcodeAntcodeGrouplabelResponse createLinkeantcodeAntcodeGrouplabelResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeGrouplabelResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.RequestId"));
		createLinkeantcodeAntcodeGrouplabelResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.ResultCode"));
		createLinkeantcodeAntcodeGrouplabelResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.ResultMessage"));
		createLinkeantcodeAntcodeGrouplabelResponse.setColor(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.Color"));
		createLinkeantcodeAntcodeGrouplabelResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.CreatedAt"));
		createLinkeantcodeAntcodeGrouplabelResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.Description"));
		createLinkeantcodeAntcodeGrouplabelResponse.setGroupId(_ctx.longValue("CreateLinkeantcodeAntcodeGrouplabelResponse.GroupId"));
		createLinkeantcodeAntcodeGrouplabelResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeGrouplabelResponse.Id"));
		createLinkeantcodeAntcodeGrouplabelResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.Name"));
		createLinkeantcodeAntcodeGrouplabelResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeGrouplabelResponse.ProjectId"));
		createLinkeantcodeAntcodeGrouplabelResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeGrouplabelResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeGrouplabelResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.SourceType"));
		createLinkeantcodeAntcodeGrouplabelResponse.setTemplate(_ctx.booleanValue("CreateLinkeantcodeAntcodeGrouplabelResponse.Template"));
		createLinkeantcodeAntcodeGrouplabelResponse.setTenantId(_ctx.longValue("CreateLinkeantcodeAntcodeGrouplabelResponse.TenantId"));
		createLinkeantcodeAntcodeGrouplabelResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeGrouplabelResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeGrouplabelResponse;
	}
}