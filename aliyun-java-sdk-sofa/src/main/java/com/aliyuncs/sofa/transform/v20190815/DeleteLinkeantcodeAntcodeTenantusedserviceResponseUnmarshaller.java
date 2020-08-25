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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeTenantusedserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeTenantusedserviceResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeTenantusedserviceResponse unmarshall(DeleteLinkeantcodeAntcodeTenantusedserviceResponse deleteLinkeantcodeAntcodeTenantusedserviceResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.RequestId"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.ResultCode"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setAccessLevel(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.AccessLevel"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setAccessUserId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.AccessUserId"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setAutoCheckSuite(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.AutoCheckSuite"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setAvatarUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.AvatarUrl"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setBuildEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.BuildEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setCallUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.CallUrl"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setChecks(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Checks"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setChecksDependOn(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.ChecksDependOn"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setCheckResultUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.CheckResultUrl"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setCheckSite(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.CheckSite"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Description"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setHomepage(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Homepage"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Id"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setIssueEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.IssueEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setMergeRequestEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.MergeRequestEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Name"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setNoteEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.NoteEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setProperties(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.Properties"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setPushEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.PushEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.SourceId"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.SourceType"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setTagPushEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.TagPushEvent"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.UpdatedAt"));
		deleteLinkeantcodeAntcodeTenantusedserviceResponse.setVisibilityLevel(_ctx.stringValue("DeleteLinkeantcodeAntcodeTenantusedserviceResponse.VisibilityLevel"));
	 
	 	return deleteLinkeantcodeAntcodeTenantusedserviceResponse;
	}
}