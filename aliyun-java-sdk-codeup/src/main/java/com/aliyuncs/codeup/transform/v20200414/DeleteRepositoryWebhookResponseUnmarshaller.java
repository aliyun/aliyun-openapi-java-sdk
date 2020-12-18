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

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryWebhookResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryWebhookResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryWebhookResponseUnmarshaller {

	public static DeleteRepositoryWebhookResponse unmarshall(DeleteRepositoryWebhookResponse deleteRepositoryWebhookResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryWebhookResponse.setRequestId(_ctx.stringValue("DeleteRepositoryWebhookResponse.RequestId"));
		deleteRepositoryWebhookResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryWebhookResponse.ErrorCode"));
		deleteRepositoryWebhookResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Success"));
		deleteRepositoryWebhookResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryWebhookResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("DeleteRepositoryWebhookResponse.Result.Id"));
		result.setUrl(_ctx.stringValue("DeleteRepositoryWebhookResponse.Result.Url"));
		result.setCreatedAt(_ctx.stringValue("DeleteRepositoryWebhookResponse.Result.CreatedAt"));
		result.setProjectId(_ctx.longValue("DeleteRepositoryWebhookResponse.Result.ProjectId"));
		result.setPushEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Result.PushEvents"));
		result.setMergeRequestsEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Result.MergeRequestsEvents"));
		result.setTagPushEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Result.TagPushEvents"));
		result.setNoteEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Result.NoteEvents"));
		result.setEnableSslVerification(_ctx.booleanValue("DeleteRepositoryWebhookResponse.Result.EnableSslVerification"));
		result.setLastTestResult(_ctx.stringValue("DeleteRepositoryWebhookResponse.Result.LastTestResult"));
		result.setDescription(_ctx.stringValue("DeleteRepositoryWebhookResponse.Result.Description"));
		result.setSecretToken(_ctx.stringValue("DeleteRepositoryWebhookResponse.Result.SecretToken"));
		deleteRepositoryWebhookResponse.setResult(result);
	 
	 	return deleteRepositoryWebhookResponse;
	}
}