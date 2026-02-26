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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListRepositoryWebhookResponse;
import com.aliyuncs.devops.model.v20210625.ListRepositoryWebhookResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryWebhookResponseUnmarshaller {

	public static ListRepositoryWebhookResponse unmarshall(ListRepositoryWebhookResponse listRepositoryWebhookResponse, UnmarshallerContext _ctx) {
		
		listRepositoryWebhookResponse.setErrorMessage(_ctx.stringValue("ListRepositoryWebhookResponse.errorMessage"));
		listRepositoryWebhookResponse.setRequestId(_ctx.stringValue("ListRepositoryWebhookResponse.requestId"));
		listRepositoryWebhookResponse.setTotal(_ctx.longValue("ListRepositoryWebhookResponse.total"));
		listRepositoryWebhookResponse.setSuccess(_ctx.booleanValue("ListRepositoryWebhookResponse.success"));
		listRepositoryWebhookResponse.setErrorCode(_ctx.stringValue("ListRepositoryWebhookResponse.errorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryWebhookResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPushEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.result["+ i +"].pushEvents"));
			resultItem.setProjectId(_ctx.longValue("ListRepositoryWebhookResponse.result["+ i +"].projectId"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoryWebhookResponse.result["+ i +"].createdAt"));
			resultItem.setUrl(_ctx.stringValue("ListRepositoryWebhookResponse.result["+ i +"].url"));
			resultItem.setTagPushEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.result["+ i +"].tagPushEvents"));
			resultItem.setLastTestResult(_ctx.stringValue("ListRepositoryWebhookResponse.result["+ i +"].lastTestResult"));
			resultItem.setMergeRequestsEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.result["+ i +"].mergeRequestsEvents"));
			resultItem.setDescription(_ctx.stringValue("ListRepositoryWebhookResponse.result["+ i +"].description"));
			resultItem.setNoteEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.result["+ i +"].noteEvents"));
			resultItem.setSecretToken(_ctx.stringValue("ListRepositoryWebhookResponse.result["+ i +"].secretToken"));
			resultItem.setId(_ctx.longValue("ListRepositoryWebhookResponse.result["+ i +"].id"));
			resultItem.setEnableSslVerification(_ctx.booleanValue("ListRepositoryWebhookResponse.result["+ i +"].enableSslVerification"));

			result.add(resultItem);
		}
		listRepositoryWebhookResponse.setResult(result);
	 
	 	return listRepositoryWebhookResponse;
	}
}