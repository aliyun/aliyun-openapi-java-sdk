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

import com.aliyuncs.devops.model.v20210625.CreateMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.CreateMergeRequestResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateMergeRequestResponse.Result.Author;
import com.aliyuncs.devops.model.v20210625.CreateMergeRequestResponse.Result.ReviewersItem;
import com.aliyuncs.devops.model.v20210625.CreateMergeRequestResponse.Result.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMergeRequestResponseUnmarshaller {

	public static CreateMergeRequestResponse unmarshall(CreateMergeRequestResponse createMergeRequestResponse, UnmarshallerContext _ctx) {
		
		createMergeRequestResponse.setRequestId(_ctx.stringValue("CreateMergeRequestResponse.requestId"));
		createMergeRequestResponse.setErrorMessage(_ctx.stringValue("CreateMergeRequestResponse.errorMessage"));
		createMergeRequestResponse.setErrorCode(_ctx.stringValue("CreateMergeRequestResponse.errorCode"));
		createMergeRequestResponse.setSuccess(_ctx.booleanValue("CreateMergeRequestResponse.success"));

		Result result = new Result();
		result.setMrBizId(_ctx.stringValue("CreateMergeRequestResponse.result.mrBizId"));
		result.setProjectId(_ctx.longValue("CreateMergeRequestResponse.result.projectId"));
		result.setLocalId(_ctx.longValue("CreateMergeRequestResponse.result.localId"));
		result.setCreateTime(_ctx.stringValue("CreateMergeRequestResponse.result.createTime"));
		result.setUpdateTime(_ctx.stringValue("CreateMergeRequestResponse.result.updateTime"));
		result.setMrType(_ctx.stringValue("CreateMergeRequestResponse.result.mrType"));
		result.setSourceProjectId(_ctx.longValue("CreateMergeRequestResponse.result.sourceProjectId"));
		result.setSourceBranch(_ctx.stringValue("CreateMergeRequestResponse.result.sourceBranch"));
		result.setTargetProjectId(_ctx.longValue("CreateMergeRequestResponse.result.targetProjectId"));
		result.setTargetBranch(_ctx.stringValue("CreateMergeRequestResponse.result.targetBranch"));
		result.setTitle(_ctx.stringValue("CreateMergeRequestResponse.result.title"));
		result.setDescription(_ctx.stringValue("CreateMergeRequestResponse.result.description"));
		result.setStatus(_ctx.stringValue("CreateMergeRequestResponse.result.status"));
		result.setCreateFrom(_ctx.stringValue("CreateMergeRequestResponse.result.createFrom"));
		result.setAhead(_ctx.integerValue("CreateMergeRequestResponse.result.ahead"));
		result.setBehind(_ctx.integerValue("CreateMergeRequestResponse.result.behind"));
		result.setDetailUrl(_ctx.stringValue("CreateMergeRequestResponse.result.detailUrl"));
		result.setWebUrl(_ctx.stringValue("CreateMergeRequestResponse.result.webUrl"));
		result.setAllRequirementsPass(_ctx.booleanValue("CreateMergeRequestResponse.result.allRequirementsPass"));
		result.setSupportMergeFastForwardOnly(_ctx.booleanValue("CreateMergeRequestResponse.result.supportMergeFastForwardOnly"));

		Author author = new Author();
		author.setId(_ctx.longValue("CreateMergeRequestResponse.result.author.id"));
		author.setName(_ctx.stringValue("CreateMergeRequestResponse.result.author.name"));
		author.setUsername(_ctx.stringValue("CreateMergeRequestResponse.result.author.username"));
		author.setState(_ctx.stringValue("CreateMergeRequestResponse.result.author.state"));
		author.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.result.author.avatarUrl"));
		author.setEmail(_ctx.stringValue("CreateMergeRequestResponse.result.author.email"));
		result.setAuthor(author);

		List<ReviewersItem> reviewers = new ArrayList<ReviewersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMergeRequestResponse.result.reviewers.Length"); i++) {
			ReviewersItem reviewersItem = new ReviewersItem();
			reviewersItem.setId(_ctx.longValue("CreateMergeRequestResponse.result.reviewers["+ i +"].id"));
			reviewersItem.setName(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].name"));
			reviewersItem.setUsername(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].username"));
			reviewersItem.setState(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].state"));
			reviewersItem.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].avatarUrl"));
			reviewersItem.setEmail(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].email"));
			reviewersItem.setHasReviewed(_ctx.booleanValue("CreateMergeRequestResponse.result.reviewers["+ i +"].hasReviewed"));
			reviewersItem.setReviewOpinionStatus(_ctx.stringValue("CreateMergeRequestResponse.result.reviewers["+ i +"].reviewOpinionStatus"));

			reviewers.add(reviewersItem);
		}
		result.setReviewers(reviewers);

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMergeRequestResponse.result.subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setId(_ctx.longValue("CreateMergeRequestResponse.result.subscribers["+ i +"].id"));
			subscribersItem.setName(_ctx.stringValue("CreateMergeRequestResponse.result.subscribers["+ i +"].name"));
			subscribersItem.setUsername(_ctx.stringValue("CreateMergeRequestResponse.result.subscribers["+ i +"].username"));
			subscribersItem.setState(_ctx.stringValue("CreateMergeRequestResponse.result.subscribers["+ i +"].state"));
			subscribersItem.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.result.subscribers["+ i +"].avatarUrl"));
			subscribersItem.setEmail(_ctx.stringValue("CreateMergeRequestResponse.result.subscribers["+ i +"].email"));

			subscribers.add(subscribersItem);
		}
		result.setSubscribers(subscribers);
		createMergeRequestResponse.setResult(result);
	 
	 	return createMergeRequestResponse;
	}
}