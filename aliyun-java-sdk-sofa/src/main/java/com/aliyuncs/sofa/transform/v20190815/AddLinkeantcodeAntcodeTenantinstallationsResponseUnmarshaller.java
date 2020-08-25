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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeTenantinstallationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeTenantinstallationsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeTenantinstallationsResponse unmarshall(AddLinkeantcodeAntcodeTenantinstallationsResponse addLinkeantcodeAntcodeTenantinstallationsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeTenantinstallationsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.RequestId"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.ResultCode"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.ResultMessage"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setAccessLevel(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.AccessLevel"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setAccessUserId(_ctx.longValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.AccessUserId"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setAutoCheckSuite(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.AutoCheckSuite"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.AvatarUrl"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setBuildEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.BuildEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setCallUrl(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.CallUrl"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setChecks(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Checks"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setChecksDependOn(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.ChecksDependOn"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setCheckResultUrl(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.CheckResultUrl"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setCheckSite(_ctx.longValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.CheckSite"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.CreatedAt"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setDescription(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Description"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setHomepage(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Homepage"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Id"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setIssueEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.IssueEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setMergeRequestEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.MergeRequestEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Name"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setNoteEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.NoteEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setProperties(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.Properties"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.PushEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setSourceId(_ctx.longValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.SourceId"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setSourceType(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.SourceType"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setTagPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.TagPushEvent"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.UpdatedAt"));
		addLinkeantcodeAntcodeTenantinstallationsResponse.setVisibilityLevel(_ctx.stringValue("AddLinkeantcodeAntcodeTenantinstallationsResponse.VisibilityLevel"));
	 
	 	return addLinkeantcodeAntcodeTenantinstallationsResponse;
	}
}