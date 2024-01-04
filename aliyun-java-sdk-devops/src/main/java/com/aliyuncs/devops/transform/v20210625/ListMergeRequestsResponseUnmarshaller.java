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

import com.aliyuncs.devops.model.v20210625.ListMergeRequestsResponse;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestsResponse.ResultItem.Assignees;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestsResponse.ResultItem.Author;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestsResponse.ResultItem.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestsResponseUnmarshaller {

	public static ListMergeRequestsResponse unmarshall(ListMergeRequestsResponse listMergeRequestsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestsResponse.setRequestId(_ctx.stringValue("ListMergeRequestsResponse.requestId"));
		listMergeRequestsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestsResponse.errorCode"));
		listMergeRequestsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestsResponse.errorMessage"));
		listMergeRequestsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestsResponse.success"));
		listMergeRequestsResponse.setTotal(_ctx.longValue("ListMergeRequestsResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setNewMergeRequestIdentifier(_ctx.booleanValue("ListMergeRequestsResponse.result["+ i +"].newMergeRequestIdentifier"));
			resultItem.setProjectId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].projectId"));
			resultItem.setId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].id"));
			resultItem.setIid(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].iid"));
			resultItem.setMrBizId(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].mrBizId"));
			resultItem.setLocalId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].localId"));
			resultItem.setTitle(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].title"));
			resultItem.setDescription(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].description"));
			resultItem.setState(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].state"));
			resultItem.setNewVersionState(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].newVersionState"));
			resultItem.setCreatedAt(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].createdAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].updatedAt"));
			resultItem.setSourceBranch(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].sourceBranch"));
			resultItem.setTargetBranch(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].targetBranch"));
			resultItem.setSourceProjectId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].sourceProjectId"));
			resultItem.setTargetProjectId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].targetProjectId"));
			resultItem.setWorkInProgress(_ctx.booleanValue("ListMergeRequestsResponse.result["+ i +"].workInProgress"));
			resultItem.setDetailUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].detailUrl"));
			resultItem.setWebUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].webUrl"));
			resultItem.setSshUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].sshUrl"));
			resultItem.setCreationMethod(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].creationMethod"));
			resultItem.setSourceType(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].sourceType"));
			resultItem.setTargetType(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].targetType"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].nameWithNamespace"));
			resultItem.setSupportMergeFFOnly(_ctx.booleanValue("ListMergeRequestsResponse.result["+ i +"].supportMergeFFOnly"));

			Author author = new Author();
			author.setId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].author.id"));
			author.setName(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].author.name"));
			author.setUsername(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].author.username"));
			author.setState(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].author.state"));
			author.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].author.avatarUrl"));
			author.setEmail(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].author.email"));
			resultItem.setAuthor(author);

			List<Assignees> reviewers = new ArrayList<Assignees>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestsResponse.result["+ i +"].reviewers.Length"); j++) {
				Assignees assignees = new Assignees();
				assignees.setId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].id"));
				assignees.setName(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].name"));
				assignees.setUsername(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].username"));
				assignees.setState(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].state"));
				assignees.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].avatarUrl"));
				assignees.setEmail(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].email"));
				assignees.setStatus(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].reviewers["+ j +"].status"));

				reviewers.add(assignees);
			}
			resultItem.setReviewers(reviewers);

			List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestsResponse.result["+ i +"].subscribers.Length"); j++) {
				SubscribersItem subscribersItem = new SubscribersItem();
				subscribersItem.setId(_ctx.longValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].id"));
				subscribersItem.setName(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].name"));
				subscribersItem.setUsername(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].username"));
				subscribersItem.setState(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].state"));
				subscribersItem.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].avatarUrl"));
				subscribersItem.setEmail(_ctx.stringValue("ListMergeRequestsResponse.result["+ i +"].subscribers["+ j +"].email"));

				subscribers.add(subscribersItem);
			}
			resultItem.setSubscribers(subscribers);

			result.add(resultItem);
		}
		listMergeRequestsResponse.setResult(result);
	 
	 	return listMergeRequestsResponse;
	}
}