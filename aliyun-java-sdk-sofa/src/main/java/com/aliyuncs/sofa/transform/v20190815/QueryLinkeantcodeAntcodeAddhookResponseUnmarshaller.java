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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeAddhookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeAddhookResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeAddhookResponse unmarshall(QueryLinkeantcodeAntcodeAddhookResponse queryLinkeantcodeAntcodeAddhookResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeAddhookResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.RequestId"));
		queryLinkeantcodeAntcodeAddhookResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.ResultCode"));
		queryLinkeantcodeAntcodeAddhookResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.ResultMessage"));
		queryLinkeantcodeAntcodeAddhookResponse.setBuildEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.BuildEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.CreatedAt"));
		queryLinkeantcodeAntcodeAddhookResponse.setEnableSslVerification(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.EnableSslVerification"));
		queryLinkeantcodeAntcodeAddhookResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeAddhookResponse.Id"));
		queryLinkeantcodeAntcodeAddhookResponse.setIssuesEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.IssuesEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setMergeRequestsEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.MergeRequestsEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setNoteEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.NoteEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeAddhookResponse.ProjectId"));
		queryLinkeantcodeAntcodeAddhookResponse.setPushEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.PushEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeAddhookResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeAddhookResponse.setServiceId(_ctx.longValue("QueryLinkeantcodeAntcodeAddhookResponse.ServiceId"));
		queryLinkeantcodeAntcodeAddhookResponse.setTagPushEvents(_ctx.booleanValue("QueryLinkeantcodeAntcodeAddhookResponse.TagPushEvents"));
		queryLinkeantcodeAntcodeAddhookResponse.setType(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.Type"));
		queryLinkeantcodeAntcodeAddhookResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.UpdatedAt"));
		queryLinkeantcodeAntcodeAddhookResponse.setUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeAddhookResponse.Url"));
	 
	 	return queryLinkeantcodeAntcodeAddhookResponse;
	}
}