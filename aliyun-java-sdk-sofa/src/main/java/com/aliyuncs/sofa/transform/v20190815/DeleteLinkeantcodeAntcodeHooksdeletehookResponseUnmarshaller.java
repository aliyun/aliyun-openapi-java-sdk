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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeHooksdeletehookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeHooksdeletehookResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeHooksdeletehookResponse unmarshall(DeleteLinkeantcodeAntcodeHooksdeletehookResponse deleteLinkeantcodeAntcodeHooksdeletehookResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.RequestId"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.ResultCode"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setBuildEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.BuildEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setEnableSslVerification(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.EnableSslVerification"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.Id"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setIssuesEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.IssuesEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setMergeRequestsEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.MergeRequestsEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setNoteEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.NoteEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.ProjectId"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setPushEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.PushEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setServiceId(_ctx.longValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.ServiceId"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setTagPushEvents(_ctx.booleanValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.TagPushEvents"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setType(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.Type"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.UpdatedAt"));
		deleteLinkeantcodeAntcodeHooksdeletehookResponse.setUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeHooksdeletehookResponse.Url"));
	 
	 	return deleteLinkeantcodeAntcodeHooksdeletehookResponse;
	}
}