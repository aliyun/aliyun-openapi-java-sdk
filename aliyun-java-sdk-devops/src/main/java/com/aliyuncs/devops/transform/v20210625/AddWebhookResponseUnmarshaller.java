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

import com.aliyuncs.devops.model.v20210625.AddWebhookResponse;
import com.aliyuncs.devops.model.v20210625.AddWebhookResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWebhookResponseUnmarshaller {

	public static AddWebhookResponse unmarshall(AddWebhookResponse addWebhookResponse, UnmarshallerContext _ctx) {
		
		addWebhookResponse.setErrorMessage(_ctx.stringValue("AddWebhookResponse.errorMessage"));
		addWebhookResponse.setRequestId(_ctx.stringValue("AddWebhookResponse.requestId"));
		addWebhookResponse.setErrorCode(_ctx.stringValue("AddWebhookResponse.errorCode"));
		addWebhookResponse.setSuccess(_ctx.booleanValue("AddWebhookResponse.success"));

		Result result = new Result();
		result.setPushEvents(_ctx.booleanValue("AddWebhookResponse.result.pushEvents"));
		result.setRepositoryId(_ctx.longValue("AddWebhookResponse.result.repositoryId"));
		result.setCreatedAt(_ctx.stringValue("AddWebhookResponse.result.createdAt"));
		result.setUrl(_ctx.stringValue("AddWebhookResponse.result.url"));
		result.setTagPushEvents(_ctx.booleanValue("AddWebhookResponse.result.tagPushEvents"));
		result.setLastTestResult(_ctx.stringValue("AddWebhookResponse.result.lastTestResult"));
		result.setDescription(_ctx.stringValue("AddWebhookResponse.result.description"));
		result.setMergeRequestsEvents(_ctx.booleanValue("AddWebhookResponse.result.mergeRequestsEvents"));
		result.setSecretToken(_ctx.stringValue("AddWebhookResponse.result.secretToken"));
		result.setNoteEvents(_ctx.booleanValue("AddWebhookResponse.result.noteEvents"));
		result.setId(_ctx.longValue("AddWebhookResponse.result.id"));
		result.setEnableSslVerification(_ctx.booleanValue("AddWebhookResponse.result.enableSslVerification"));
		addWebhookResponse.setResult(result);
	 
	 	return addWebhookResponse;
	}
}