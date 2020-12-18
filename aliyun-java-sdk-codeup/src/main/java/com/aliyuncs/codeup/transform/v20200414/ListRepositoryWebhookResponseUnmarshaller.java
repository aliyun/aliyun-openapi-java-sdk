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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.ListRepositoryWebhookResponse;
import com.aliyuncs.codeup.model.v20200414.ListRepositoryWebhookResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepositoryWebhookResponseUnmarshaller {

	public static ListRepositoryWebhookResponse unmarshall(ListRepositoryWebhookResponse listRepositoryWebhookResponse, UnmarshallerContext _ctx) {
		
		listRepositoryWebhookResponse.setRequestId(_ctx.stringValue("ListRepositoryWebhookResponse.RequestId"));
		listRepositoryWebhookResponse.setErrorCode(_ctx.stringValue("ListRepositoryWebhookResponse.ErrorCode"));
		listRepositoryWebhookResponse.setSuccess(_ctx.booleanValue("ListRepositoryWebhookResponse.Success"));
		listRepositoryWebhookResponse.setErrorMessage(_ctx.stringValue("ListRepositoryWebhookResponse.ErrorMessage"));
		listRepositoryWebhookResponse.setTotal(_ctx.longValue("ListRepositoryWebhookResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepositoryWebhookResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListRepositoryWebhookResponse.Result["+ i +"].Id"));
			resultItem.setUrl(_ctx.stringValue("ListRepositoryWebhookResponse.Result["+ i +"].Url"));
			resultItem.setCreatedAt(_ctx.stringValue("ListRepositoryWebhookResponse.Result["+ i +"].CreatedAt"));
			resultItem.setProjectId(_ctx.longValue("ListRepositoryWebhookResponse.Result["+ i +"].ProjectId"));
			resultItem.setPushEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.Result["+ i +"].PushEvents"));
			resultItem.setMergeRequestsEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.Result["+ i +"].MergeRequestsEvents"));
			resultItem.setTagPushEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.Result["+ i +"].TagPushEvents"));
			resultItem.setNoteEvents(_ctx.booleanValue("ListRepositoryWebhookResponse.Result["+ i +"].NoteEvents"));
			resultItem.setEnableSslVerification(_ctx.booleanValue("ListRepositoryWebhookResponse.Result["+ i +"].EnableSslVerification"));
			resultItem.setLastTestResult(_ctx.stringValue("ListRepositoryWebhookResponse.Result["+ i +"].LastTestResult"));
			resultItem.setDescription(_ctx.stringValue("ListRepositoryWebhookResponse.Result["+ i +"].Description"));
			resultItem.setSecretToken(_ctx.stringValue("ListRepositoryWebhookResponse.Result["+ i +"].SecretToken"));

			result.add(resultItem);
		}
		listRepositoryWebhookResponse.setResult(result);
	 
	 	return listRepositoryWebhookResponse;
	}
}