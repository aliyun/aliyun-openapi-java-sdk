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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeTenantserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeTenantserviceResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeTenantserviceResponse unmarshall(CreateLinkeantcodeAntcodeTenantserviceResponse createLinkeantcodeAntcodeTenantserviceResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeTenantserviceResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.RequestId"));
		createLinkeantcodeAntcodeTenantserviceResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.ResultCode"));
		createLinkeantcodeAntcodeTenantserviceResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.ResultMessage"));
		createLinkeantcodeAntcodeTenantserviceResponse.setAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.AccessLevel"));
		createLinkeantcodeAntcodeTenantserviceResponse.setAccessUserId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantserviceResponse.AccessUserId"));
		createLinkeantcodeAntcodeTenantserviceResponse.setAutoCheckSuite(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.AutoCheckSuite"));
		createLinkeantcodeAntcodeTenantserviceResponse.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.AvatarUrl"));
		createLinkeantcodeAntcodeTenantserviceResponse.setBuildEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.BuildEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setCallUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.CallUrl"));
		createLinkeantcodeAntcodeTenantserviceResponse.setChecks(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Checks"));
		createLinkeantcodeAntcodeTenantserviceResponse.setChecksDependOn(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.ChecksDependOn"));
		createLinkeantcodeAntcodeTenantserviceResponse.setCheckResultUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.CheckResultUrl"));
		createLinkeantcodeAntcodeTenantserviceResponse.setCheckSite(_ctx.longValue("CreateLinkeantcodeAntcodeTenantserviceResponse.CheckSite"));
		createLinkeantcodeAntcodeTenantserviceResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.CreatedAt"));
		createLinkeantcodeAntcodeTenantserviceResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Description"));
		createLinkeantcodeAntcodeTenantserviceResponse.setHomepage(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Homepage"));
		createLinkeantcodeAntcodeTenantserviceResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Id"));
		createLinkeantcodeAntcodeTenantserviceResponse.setIssueEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.IssueEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setMergeRequestEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.MergeRequestEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Name"));
		createLinkeantcodeAntcodeTenantserviceResponse.setNoteEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.NoteEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setProperties(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.Properties"));
		createLinkeantcodeAntcodeTenantserviceResponse.setPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.PushEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeTenantserviceResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeTenantserviceResponse.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeTenantserviceResponse.SourceId"));
		createLinkeantcodeAntcodeTenantserviceResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.SourceType"));
		createLinkeantcodeAntcodeTenantserviceResponse.setTagPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantserviceResponse.TagPushEvent"));
		createLinkeantcodeAntcodeTenantserviceResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.UpdatedAt"));
		createLinkeantcodeAntcodeTenantserviceResponse.setVisibilityLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantserviceResponse.VisibilityLevel"));
	 
	 	return createLinkeantcodeAntcodeTenantserviceResponse;
	}
}