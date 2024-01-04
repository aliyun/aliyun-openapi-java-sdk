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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.DeleteRepositoryWebhookResponse;
import com.aliyuncs.devops.model.v20210625.DeleteRepositoryWebhookResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryWebhookResponseUnmarshaller {

	public static DeleteRepositoryWebhookResponse unmarshall(DeleteRepositoryWebhookResponse deleteRepositoryWebhookResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryWebhookResponse.setRequestId(_ctx.stringValue("DeleteRepositoryWebhookResponse.requestId"));
		deleteRepositoryWebhookResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryWebhookResponse.errorMessage"));
		deleteRepositoryWebhookResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryWebhookResponse.errorCode"));
		deleteRepositoryWebhookResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryWebhookResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("DeleteRepositoryWebhookResponse.result.id"));
		result.setUrl(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.url"));
		result.setCreatedAt(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.createdAt"));
		result.setProjectId(_ctx.longValue("DeleteRepositoryWebhookResponse.result.projectId"));
		result.setPushEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.pushEvents"));
		result.setIssuesEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.issuesEvents"));
		result.setMergeRequestsEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.mergeRequestsEvents"));
		result.setTagPushEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.tagPushEvents"));
		result.setBuildEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.buildEvents"));
		result.setNoteEvents(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.noteEvents"));
		result.setEnableSslVerification(_ctx.booleanValue("DeleteRepositoryWebhookResponse.result.enableSslVerification"));
		result.setLastTestResult(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.lastTestResult"));
		result.setDescription(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.description"));
		result.setSecretToken(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.secretToken"));
		result.setType(_ctx.stringValue("DeleteRepositoryWebhookResponse.result.type"));
		deleteRepositoryWebhookResponse.setResult(result);
	 
	 	return deleteRepositoryWebhookResponse;
	}
}