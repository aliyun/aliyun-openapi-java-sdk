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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeHookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeHookResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeHookResponse unmarshall(AddLinkeantcodeAntcodeHookResponse addLinkeantcodeAntcodeHookResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeHookResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.RequestId"));
		addLinkeantcodeAntcodeHookResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.ResultCode"));
		addLinkeantcodeAntcodeHookResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.ResultMessage"));
		addLinkeantcodeAntcodeHookResponse.setBuildEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.BuildEvents"));
		addLinkeantcodeAntcodeHookResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.CreatedAt"));
		addLinkeantcodeAntcodeHookResponse.setEnableSslVerification(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.EnableSslVerification"));
		addLinkeantcodeAntcodeHookResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeHookResponse.Id"));
		addLinkeantcodeAntcodeHookResponse.setIssuesEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.IssuesEvents"));
		addLinkeantcodeAntcodeHookResponse.setMergeRequestsEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.MergeRequestsEvents"));
		addLinkeantcodeAntcodeHookResponse.setNoteEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.NoteEvents"));
		addLinkeantcodeAntcodeHookResponse.setProjectId(_ctx.longValue("AddLinkeantcodeAntcodeHookResponse.ProjectId"));
		addLinkeantcodeAntcodeHookResponse.setPushEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.PushEvents"));
		addLinkeantcodeAntcodeHookResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeHookResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeHookResponse.setServiceId(_ctx.longValue("AddLinkeantcodeAntcodeHookResponse.ServiceId"));
		addLinkeantcodeAntcodeHookResponse.setTagPushEvents(_ctx.booleanValue("AddLinkeantcodeAntcodeHookResponse.TagPushEvents"));
		addLinkeantcodeAntcodeHookResponse.setType(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.Type"));
		addLinkeantcodeAntcodeHookResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.UpdatedAt"));
		addLinkeantcodeAntcodeHookResponse.setUrl(_ctx.stringValue("AddLinkeantcodeAntcodeHookResponse.Url"));
	 
	 	return addLinkeantcodeAntcodeHookResponse;
	}
}