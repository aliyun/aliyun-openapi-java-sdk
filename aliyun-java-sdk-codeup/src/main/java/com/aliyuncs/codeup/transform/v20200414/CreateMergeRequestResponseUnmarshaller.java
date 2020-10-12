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

import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.ApproveCheckResult;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem.ExtraUsersItem;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem.ExtraUsersItem4;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.AssigneeListItem;
import com.aliyuncs.codeup.model.v20200414.CreateMergeRequestResponse.Result.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMergeRequestResponseUnmarshaller {

	public static CreateMergeRequestResponse unmarshall(CreateMergeRequestResponse createMergeRequestResponse, UnmarshallerContext _ctx) {
		
		createMergeRequestResponse.setRequestId(_ctx.stringValue("CreateMergeRequestResponse.RequestId"));
		createMergeRequestResponse.setErrorCode(_ctx.stringValue("CreateMergeRequestResponse.ErrorCode"));
		createMergeRequestResponse.setSuccess(_ctx.booleanValue("CreateMergeRequestResponse.Success"));
		createMergeRequestResponse.setErrorMessage(_ctx.stringValue("CreateMergeRequestResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateMergeRequestResponse.Result.Id"));
		result.setProjectId(_ctx.longValue("CreateMergeRequestResponse.Result.ProjectId"));
		result.setTitle(_ctx.stringValue("CreateMergeRequestResponse.Result.Title"));
		result.setDescription(_ctx.stringValue("CreateMergeRequestResponse.Result.Description"));
		result.setState(_ctx.stringValue("CreateMergeRequestResponse.Result.State"));
		result.setMergeStatus(_ctx.stringValue("CreateMergeRequestResponse.Result.MergeStatus"));
		result.setCreatedAt(_ctx.stringValue("CreateMergeRequestResponse.Result.CreatedAt"));
		result.setUpdatedAt(_ctx.stringValue("CreateMergeRequestResponse.Result.UpdatedAt"));
		result.setTargetBranch(_ctx.stringValue("CreateMergeRequestResponse.Result.TargetBranch"));
		result.setSourceBranch(_ctx.stringValue("CreateMergeRequestResponse.Result.SourceBranch"));
		result.setWebUrl(_ctx.stringValue("CreateMergeRequestResponse.Result.WebUrl"));
		result.setAcceptedRevision(_ctx.stringValue("CreateMergeRequestResponse.Result.AcceptedRevision"));
		result.setMergeError(_ctx.stringValue("CreateMergeRequestResponse.Result.MergeError"));
		result.setMergedRevision(_ctx.stringValue("CreateMergeRequestResponse.Result.MergedRevision"));
		result.setNameWithNamespace(_ctx.stringValue("CreateMergeRequestResponse.Result.NameWithNamespace"));
		result.setMergeType(_ctx.stringValue("CreateMergeRequestResponse.Result.MergeType"));
		result.setAheadCommitCount(_ctx.integerValue("CreateMergeRequestResponse.Result.AheadCommitCount"));
		result.setBehindCommitCount(_ctx.integerValue("CreateMergeRequestResponse.Result.BehindCommitCount"));

		Author author = new Author();
		author.setId(_ctx.longValue("CreateMergeRequestResponse.Result.Author.Id"));
		author.setExternUserId(_ctx.stringValue("CreateMergeRequestResponse.Result.Author.ExternUserId"));
		author.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.Result.Author.AvatarUrl"));
		author.setName(_ctx.stringValue("CreateMergeRequestResponse.Result.Author.Name"));
		result.setAuthor(author);

		ApproveCheckResult approveCheckResult = new ApproveCheckResult();
		approveCheckResult.setTotalCheckResult(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.TotalCheckResult"));

		List<SatisfiedCheckResultsItem> satisfiedCheckResults = new ArrayList<SatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults.Length"); i++) {
			SatisfiedCheckResultsItem satisfiedCheckResultsItem = new SatisfiedCheckResultsItem();
			satisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckStatus"));
			satisfiedCheckResultsItem.setCheckName(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckName"));
			satisfiedCheckResultsItem.setCheckType(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems.add(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setSatisfiedItems(satisfiedItems);

			List<String> unsatisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems.add(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setUnsatisfiedItems(unsatisfiedItems);

			List<ExtraUsersItem> extraUsers = new ArrayList<ExtraUsersItem>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem extraUsersItem = new ExtraUsersItem();
				extraUsersItem.setId(_ctx.longValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem.setExternUserId(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem.setName(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers.add(extraUsersItem);
			}
			satisfiedCheckResultsItem.setExtraUsers(extraUsers);

			satisfiedCheckResults.add(satisfiedCheckResultsItem);
		}
		approveCheckResult.setSatisfiedCheckResults(satisfiedCheckResults);

		List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults = new ArrayList<UnsatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults.Length"); i++) {
			UnsatisfiedCheckResultsItem unsatisfiedCheckResultsItem = new UnsatisfiedCheckResultsItem();
			unsatisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckStatus"));
			unsatisfiedCheckResultsItem.setCheckName(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckName"));
			unsatisfiedCheckResultsItem.setCheckType(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems1.add(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setSatisfiedItems1(satisfiedItems1);

			List<String> unsatisfiedItems2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems2.add(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setUnsatisfiedItems2(unsatisfiedItems2);

			List<ExtraUsersItem4> extraUsers3 = new ArrayList<ExtraUsersItem4>();
			for (int j = 0; j < _ctx.lengthValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem4 extraUsersItem4 = new ExtraUsersItem4();
				extraUsersItem4.setId(_ctx.longValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem4.setExternUserId(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem4.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem4.setName(_ctx.stringValue("CreateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers3.add(extraUsersItem4);
			}
			unsatisfiedCheckResultsItem.setExtraUsers3(extraUsers3);

			unsatisfiedCheckResults.add(unsatisfiedCheckResultsItem);
		}
		approveCheckResult.setUnsatisfiedCheckResults(unsatisfiedCheckResults);
		result.setApproveCheckResult(approveCheckResult);

		List<AssigneeListItem> assigneeList = new ArrayList<AssigneeListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateMergeRequestResponse.Result.AssigneeList.Length"); i++) {
			AssigneeListItem assigneeListItem = new AssigneeListItem();
			assigneeListItem.setId(_ctx.stringValue("CreateMergeRequestResponse.Result.AssigneeList["+ i +"].Id"));
			assigneeListItem.setExternUserId(_ctx.stringValue("CreateMergeRequestResponse.Result.AssigneeList["+ i +"].ExternUserId"));
			assigneeListItem.setAvatarUrl(_ctx.stringValue("CreateMergeRequestResponse.Result.AssigneeList["+ i +"].AvatarUrl"));
			assigneeListItem.setName(_ctx.stringValue("CreateMergeRequestResponse.Result.AssigneeList["+ i +"].Name"));

			assigneeList.add(assigneeListItem);
		}
		result.setAssigneeList(assigneeList);
		createMergeRequestResponse.setResult(result);
	 
	 	return createMergeRequestResponse;
	}
}