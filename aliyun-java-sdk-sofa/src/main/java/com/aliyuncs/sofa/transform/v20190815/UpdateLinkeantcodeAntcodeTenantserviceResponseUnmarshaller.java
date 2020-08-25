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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeTenantserviceResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeTenantserviceResponse unmarshall(UpdateLinkeantcodeAntcodeTenantserviceResponse updateLinkeantcodeAntcodeTenantserviceResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeTenantserviceResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.RequestId"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.ResultCode"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.ResultMessage"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setAccessLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.AccessLevel"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setAccessUserId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.AccessUserId"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setAutoCheckSuite(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.AutoCheckSuite"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setBuildEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.BuildEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setCallUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.CallUrl"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setChecks(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Checks"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setChecksDependOn(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.ChecksDependOn"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setCheckResultUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.CheckResultUrl"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setCheckSite(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.CheckSite"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.CreatedAt"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Description"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setHomepage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Homepage"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Id"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setIssueEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.IssueEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setMergeRequestEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.MergeRequestEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Name"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setNoteEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.NoteEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setProperties(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.Properties"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.PushEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setSourceId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.SourceId"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.SourceType"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setTagPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.TagPushEvent"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeTenantserviceResponse.setVisibilityLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantserviceResponse.VisibilityLevel"));
	 
	 	return updateLinkeantcodeAntcodeTenantserviceResponse;
	}
}