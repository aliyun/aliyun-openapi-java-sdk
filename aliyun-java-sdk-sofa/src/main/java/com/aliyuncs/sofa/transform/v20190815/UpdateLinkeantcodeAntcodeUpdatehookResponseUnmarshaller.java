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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatehookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdatehookResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdatehookResponse unmarshall(UpdateLinkeantcodeAntcodeUpdatehookResponse updateLinkeantcodeAntcodeUpdatehookResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdatehookResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setBuildEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.BuildEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setEnableSslVerification(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.EnableSslVerification"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.Id"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setIssuesEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.IssuesEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setMergeRequestsEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.MergeRequestsEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setNoteEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.NoteEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.ProjectId"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setPushEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.PushEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setServiceId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.ServiceId"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setTagPushEvents(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.TagPushEvents"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.Type"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeUpdatehookResponse.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatehookResponse.Url"));
	 
	 	return updateLinkeantcodeAntcodeUpdatehookResponse;
	}
}