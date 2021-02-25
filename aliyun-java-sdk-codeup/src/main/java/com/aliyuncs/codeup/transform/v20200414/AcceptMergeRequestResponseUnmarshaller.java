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

import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.ApproveCheckResult;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem.ExtraUsersItem;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem.ExtraUsersItem4;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.AssigneeListItem;
import com.aliyuncs.codeup.model.v20200414.AcceptMergeRequestResponse.Result.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptMergeRequestResponseUnmarshaller {

	public static AcceptMergeRequestResponse unmarshall(AcceptMergeRequestResponse acceptMergeRequestResponse, UnmarshallerContext _ctx) {
		
		acceptMergeRequestResponse.setRequestId(_ctx.stringValue("AcceptMergeRequestResponse.RequestId"));
		acceptMergeRequestResponse.setErrorCode(_ctx.stringValue("AcceptMergeRequestResponse.ErrorCode"));
		acceptMergeRequestResponse.setErrorMessage(_ctx.stringValue("AcceptMergeRequestResponse.ErrorMessage"));
		acceptMergeRequestResponse.setSuccess(_ctx.booleanValue("AcceptMergeRequestResponse.Success"));

		Result result = new Result();
		result.setAcceptedRevision(_ctx.stringValue("AcceptMergeRequestResponse.Result.AcceptedRevision"));
		result.setAheadCommitCount(_ctx.integerValue("AcceptMergeRequestResponse.Result.AheadCommitCount"));
		result.setBehindCommitCount(_ctx.integerValue("AcceptMergeRequestResponse.Result.BehindCommitCount"));
		result.setCreatedAt(_ctx.stringValue("AcceptMergeRequestResponse.Result.CreatedAt"));
		result.setDescription(_ctx.stringValue("AcceptMergeRequestResponse.Result.Description"));
		result.setId(_ctx.longValue("AcceptMergeRequestResponse.Result.Id"));
		result.setMergeError(_ctx.stringValue("AcceptMergeRequestResponse.Result.MergeError"));
		result.setMergeStatus(_ctx.stringValue("AcceptMergeRequestResponse.Result.MergeStatus"));
		result.setMergeType(_ctx.stringValue("AcceptMergeRequestResponse.Result.MergeType"));
		result.setMergedRevision(_ctx.stringValue("AcceptMergeRequestResponse.Result.MergedRevision"));
		result.setNameWithNamespace(_ctx.stringValue("AcceptMergeRequestResponse.Result.NameWithNamespace"));
		result.setProjectId(_ctx.longValue("AcceptMergeRequestResponse.Result.ProjectId"));
		result.setSourceBranch(_ctx.stringValue("AcceptMergeRequestResponse.Result.SourceBranch"));
		result.setState(_ctx.stringValue("AcceptMergeRequestResponse.Result.State"));
		result.setTargetBranch(_ctx.stringValue("AcceptMergeRequestResponse.Result.TargetBranch"));
		result.setTitle(_ctx.stringValue("AcceptMergeRequestResponse.Result.Title"));
		result.setUpdatedAt(_ctx.stringValue("AcceptMergeRequestResponse.Result.UpdatedAt"));
		result.setWebUrl(_ctx.stringValue("AcceptMergeRequestResponse.Result.WebUrl"));

		ApproveCheckResult approveCheckResult = new ApproveCheckResult();
		approveCheckResult.setTotalCheckResult(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.TotalCheckResult"));

		List<SatisfiedCheckResultsItem> satisfiedCheckResults = new ArrayList<SatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults.Length"); i++) {
			SatisfiedCheckResultsItem satisfiedCheckResultsItem = new SatisfiedCheckResultsItem();
			satisfiedCheckResultsItem.setCheckName(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckName"));
			satisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckStatus"));
			satisfiedCheckResultsItem.setCheckType(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems.add(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setSatisfiedItems(satisfiedItems);

			List<String> unsatisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems.add(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setUnsatisfiedItems(unsatisfiedItems);

			List<ExtraUsersItem> extraUsers = new ArrayList<ExtraUsersItem>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem extraUsersItem = new ExtraUsersItem();
				extraUsersItem.setAvatarUrl(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem.setExternUserId(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem.setId(_ctx.longValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem.setName(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers.add(extraUsersItem);
			}
			satisfiedCheckResultsItem.setExtraUsers(extraUsers);

			satisfiedCheckResults.add(satisfiedCheckResultsItem);
		}
		approveCheckResult.setSatisfiedCheckResults(satisfiedCheckResults);

		List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults = new ArrayList<UnsatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults.Length"); i++) {
			UnsatisfiedCheckResultsItem unsatisfiedCheckResultsItem = new UnsatisfiedCheckResultsItem();
			unsatisfiedCheckResultsItem.setCheckName(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckName"));
			unsatisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckStatus"));
			unsatisfiedCheckResultsItem.setCheckType(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems1.add(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setSatisfiedItems1(satisfiedItems1);

			List<String> unsatisfiedItems2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems2.add(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setUnsatisfiedItems2(unsatisfiedItems2);

			List<ExtraUsersItem4> extraUsers3 = new ArrayList<ExtraUsersItem4>();
			for (int j = 0; j < _ctx.lengthValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem4 extraUsersItem4 = new ExtraUsersItem4();
				extraUsersItem4.setAvatarUrl(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem4.setExternUserId(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem4.setId(_ctx.longValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem4.setName(_ctx.stringValue("AcceptMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers3.add(extraUsersItem4);
			}
			unsatisfiedCheckResultsItem.setExtraUsers3(extraUsers3);

			unsatisfiedCheckResults.add(unsatisfiedCheckResultsItem);
		}
		approveCheckResult.setUnsatisfiedCheckResults(unsatisfiedCheckResults);
		result.setApproveCheckResult(approveCheckResult);

		Author author = new Author();
		author.setAvatarUrl(_ctx.stringValue("AcceptMergeRequestResponse.Result.Author.AvatarUrl"));
		author.setExternUserId(_ctx.stringValue("AcceptMergeRequestResponse.Result.Author.ExternUserId"));
		author.setId(_ctx.longValue("AcceptMergeRequestResponse.Result.Author.Id"));
		author.setName(_ctx.stringValue("AcceptMergeRequestResponse.Result.Author.Name"));
		result.setAuthor(author);

		List<AssigneeListItem> assigneeList = new ArrayList<AssigneeListItem>();
		for (int i = 0; i < _ctx.lengthValue("AcceptMergeRequestResponse.Result.AssigneeList.Length"); i++) {
			AssigneeListItem assigneeListItem = new AssigneeListItem();
			assigneeListItem.setAvatarUrl(_ctx.stringValue("AcceptMergeRequestResponse.Result.AssigneeList["+ i +"].AvatarUrl"));
			assigneeListItem.setExternUserId(_ctx.stringValue("AcceptMergeRequestResponse.Result.AssigneeList["+ i +"].ExternUserId"));
			assigneeListItem.setId(_ctx.stringValue("AcceptMergeRequestResponse.Result.AssigneeList["+ i +"].Id"));
			assigneeListItem.setName(_ctx.stringValue("AcceptMergeRequestResponse.Result.AssigneeList["+ i +"].Name"));

			assigneeList.add(assigneeListItem);
		}
		result.setAssigneeList(assigneeList);
		acceptMergeRequestResponse.setResult(result);
	 
	 	return acceptMergeRequestResponse;
	}
}