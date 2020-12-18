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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.AddWebhookResponse;
import com.aliyuncs.codeup.model.v20200414.AddWebhookResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWebhookResponseUnmarshaller {

	public static AddWebhookResponse unmarshall(AddWebhookResponse addWebhookResponse, UnmarshallerContext _ctx) {
		
		addWebhookResponse.setRequestId(_ctx.stringValue("AddWebhookResponse.RequestId"));
		addWebhookResponse.setErrorCode(_ctx.stringValue("AddWebhookResponse.ErrorCode"));
		addWebhookResponse.setSuccess(_ctx.booleanValue("AddWebhookResponse.Success"));
		addWebhookResponse.setErrorMessage(_ctx.stringValue("AddWebhookResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("AddWebhookResponse.Result.Id"));
		result.setUrl(_ctx.stringValue("AddWebhookResponse.Result.Url"));
		result.setCreatedAt(_ctx.stringValue("AddWebhookResponse.Result.CreatedAt"));
		result.setProjectId(_ctx.longValue("AddWebhookResponse.Result.ProjectId"));
		result.setPushEvents(_ctx.booleanValue("AddWebhookResponse.Result.PushEvents"));
		result.setIssuesEvents(_ctx.booleanValue("AddWebhookResponse.Result.IssuesEvents"));
		result.setMergeRequestsEvents(_ctx.booleanValue("AddWebhookResponse.Result.MergeRequestsEvents"));
		result.setTagPushEvents(_ctx.booleanValue("AddWebhookResponse.Result.TagPushEvents"));
		result.setBuildEvents(_ctx.booleanValue("AddWebhookResponse.Result.BuildEvents"));
		result.setNoteEvents(_ctx.booleanValue("AddWebhookResponse.Result.NoteEvents"));
		result.setEnableSslVerification(_ctx.booleanValue("AddWebhookResponse.Result.EnableSslVerification"));
		result.setLastTestResult(_ctx.stringValue("AddWebhookResponse.Result.LastTestResult"));
		result.setDescription(_ctx.stringValue("AddWebhookResponse.Result.Description"));
		result.setSecretToken(_ctx.stringValue("AddWebhookResponse.Result.SecretToken"));
		addWebhookResponse.setResult(result);
	 
	 	return addWebhookResponse;
	}
}