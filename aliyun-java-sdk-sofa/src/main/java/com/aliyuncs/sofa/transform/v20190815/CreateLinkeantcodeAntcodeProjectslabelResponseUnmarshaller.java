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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectslabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeProjectslabelResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeProjectslabelResponse unmarshall(CreateLinkeantcodeAntcodeProjectslabelResponse createLinkeantcodeAntcodeProjectslabelResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeProjectslabelResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.RequestId"));
		createLinkeantcodeAntcodeProjectslabelResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.ResultCode"));
		createLinkeantcodeAntcodeProjectslabelResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.ResultMessage"));
		createLinkeantcodeAntcodeProjectslabelResponse.setColor(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.Color"));
		createLinkeantcodeAntcodeProjectslabelResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.CreatedAt"));
		createLinkeantcodeAntcodeProjectslabelResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.Description"));
		createLinkeantcodeAntcodeProjectslabelResponse.setGroupId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectslabelResponse.GroupId"));
		createLinkeantcodeAntcodeProjectslabelResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectslabelResponse.Id"));
		createLinkeantcodeAntcodeProjectslabelResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.Name"));
		createLinkeantcodeAntcodeProjectslabelResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectslabelResponse.ProjectId"));
		createLinkeantcodeAntcodeProjectslabelResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeProjectslabelResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeProjectslabelResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.SourceType"));
		createLinkeantcodeAntcodeProjectslabelResponse.setTemplate(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectslabelResponse.Template"));
		createLinkeantcodeAntcodeProjectslabelResponse.setTenantId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectslabelResponse.TenantId"));
		createLinkeantcodeAntcodeProjectslabelResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectslabelResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeProjectslabelResponse;
	}
}