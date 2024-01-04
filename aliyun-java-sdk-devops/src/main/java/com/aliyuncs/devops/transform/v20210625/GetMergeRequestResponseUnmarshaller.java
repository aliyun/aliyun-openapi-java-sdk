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

import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result.Author;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result.ReviewersItem;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result.SubscribersItem;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result.TodoList;
import com.aliyuncs.devops.model.v20210625.GetMergeRequestResponse.Result.TodoList.Requirement_rule_items;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMergeRequestResponseUnmarshaller {

	public static GetMergeRequestResponse unmarshall(GetMergeRequestResponse getMergeRequestResponse, UnmarshallerContext _ctx) {
		
		getMergeRequestResponse.setRequestId(_ctx.stringValue("GetMergeRequestResponse.requestId"));
		getMergeRequestResponse.setErrorMessage(_ctx.stringValue("GetMergeRequestResponse.errorMessage"));
		getMergeRequestResponse.setErrorCode(_ctx.stringValue("GetMergeRequestResponse.errorCode"));
		getMergeRequestResponse.setSuccess(_ctx.booleanValue("GetMergeRequestResponse.success"));

		Result result = new Result();
		result.setMrBizId(_ctx.stringValue("GetMergeRequestResponse.result.mrBizId"));
		result.setProjectId(_ctx.longValue("GetMergeRequestResponse.result.projectId"));
		result.setLocalId(_ctx.longValue("GetMergeRequestResponse.result.localId"));
		result.setCreateTime(_ctx.stringValue("GetMergeRequestResponse.result.createTime"));
		result.setUpdateTime(_ctx.stringValue("GetMergeRequestResponse.result.updateTime"));
		result.setMrType(_ctx.stringValue("GetMergeRequestResponse.result.mrType"));
		result.setSourceProjectId(_ctx.longValue("GetMergeRequestResponse.result.sourceProjectId"));
		result.setSourceBranch(_ctx.stringValue("GetMergeRequestResponse.result.sourceBranch"));
		result.setTargetProjectId(_ctx.longValue("GetMergeRequestResponse.result.targetProjectId"));
		result.setTargetBranch(_ctx.stringValue("GetMergeRequestResponse.result.targetBranch"));
		result.setTitle(_ctx.stringValue("GetMergeRequestResponse.result.title"));
		result.setDescription(_ctx.stringValue("GetMergeRequestResponse.result.description"));
		result.setStatus(_ctx.stringValue("GetMergeRequestResponse.result.status"));
		result.setCreateFrom(_ctx.stringValue("GetMergeRequestResponse.result.createFrom"));
		result.setAhead(_ctx.integerValue("GetMergeRequestResponse.result.ahead"));
		result.setBehind(_ctx.integerValue("GetMergeRequestResponse.result.behind"));
		result.setAllRequirementsPass(_ctx.booleanValue("GetMergeRequestResponse.result.allRequirementsPass"));
		result.setSupportMergeFastForwardOnly(_ctx.booleanValue("GetMergeRequestResponse.result.supportMergeFastForwardOnly"));
		result.setDetailUrl(_ctx.stringValue("GetMergeRequestResponse.result.detailUrl"));
		result.setWebUrl(_ctx.stringValue("GetMergeRequestResponse.result.webUrl"));
		result.setTargetProjectNameWithNamespace(_ctx.stringValue("GetMergeRequestResponse.result.targetProjectNameWithNamespace"));
		result.setTargetProjectPathWithNamespace(_ctx.stringValue("GetMergeRequestResponse.result.targetProjectPathWithNamespace"));

		Author author = new Author();
		author.setId(_ctx.longValue("GetMergeRequestResponse.result.author.id"));
		author.setName(_ctx.stringValue("GetMergeRequestResponse.result.author.name"));
		author.setUsername(_ctx.stringValue("GetMergeRequestResponse.result.author.username"));
		author.setState(_ctx.stringValue("GetMergeRequestResponse.result.author.state"));
		author.setAvatarUrl(_ctx.stringValue("GetMergeRequestResponse.result.author.avatarUrl"));
		author.setEmail(_ctx.stringValue("GetMergeRequestResponse.result.author.email"));
		result.setAuthor(author);

		TodoList todoList = new TodoList();

		List<Requirement_rule_items> requirementCheckItems = new ArrayList<Requirement_rule_items>();
		for (int i = 0; i < _ctx.lengthValue("GetMergeRequestResponse.result.todoList.requirementCheckItems.Length"); i++) {
			Requirement_rule_items requirement_rule_items = new Requirement_rule_items();
			requirement_rule_items.setItemType(_ctx.stringValue("GetMergeRequestResponse.result.todoList.requirementCheckItems["+ i +"].itemType"));
			requirement_rule_items.setPass(_ctx.booleanValue("GetMergeRequestResponse.result.todoList.requirementCheckItems["+ i +"].pass"));

			requirementCheckItems.add(requirement_rule_items);
		}
		todoList.setRequirementCheckItems(requirementCheckItems);
		result.setTodoList(todoList);

		List<ReviewersItem> reviewers = new ArrayList<ReviewersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMergeRequestResponse.result.reviewers.Length"); i++) {
			ReviewersItem reviewersItem = new ReviewersItem();
			reviewersItem.setId(_ctx.longValue("GetMergeRequestResponse.result.reviewers["+ i +"].id"));
			reviewersItem.setName(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].name"));
			reviewersItem.setUsername(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].username"));
			reviewersItem.setState(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].state"));
			reviewersItem.setAvatarUrl(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].avatarUrl"));
			reviewersItem.setEmail(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].email"));
			reviewersItem.setHasReviewed(_ctx.booleanValue("GetMergeRequestResponse.result.reviewers["+ i +"].hasReviewed"));
			reviewersItem.setReviewOpinionStatus(_ctx.stringValue("GetMergeRequestResponse.result.reviewers["+ i +"].reviewOpinionStatus"));

			reviewers.add(reviewersItem);
		}
		result.setReviewers(reviewers);

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMergeRequestResponse.result.subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setId(_ctx.longValue("GetMergeRequestResponse.result.subscribers["+ i +"].id"));
			subscribersItem.setName(_ctx.stringValue("GetMergeRequestResponse.result.subscribers["+ i +"].name"));
			subscribersItem.setUsername(_ctx.stringValue("GetMergeRequestResponse.result.subscribers["+ i +"].username"));
			subscribersItem.setState(_ctx.stringValue("GetMergeRequestResponse.result.subscribers["+ i +"].state"));
			subscribersItem.setAvatarUrl(_ctx.stringValue("GetMergeRequestResponse.result.subscribers["+ i +"].avatarUrl"));
			subscribersItem.setEmail(_ctx.stringValue("GetMergeRequestResponse.result.subscribers["+ i +"].email"));

			subscribers.add(subscribersItem);
		}
		result.setSubscribers(subscribers);
		getMergeRequestResponse.setResult(result);
	 
	 	return getMergeRequestResponse;
	}
}