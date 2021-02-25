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

import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.ApproveCheckResult;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem.ExtraUsersItem;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem.ExtraUsersItem4;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.AssigneeListItem;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestResponse.Result.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMergeRequestResponseUnmarshaller {

	public static UpdateMergeRequestResponse unmarshall(UpdateMergeRequestResponse updateMergeRequestResponse, UnmarshallerContext _ctx) {
		
		updateMergeRequestResponse.setRequestId(_ctx.stringValue("UpdateMergeRequestResponse.RequestId"));
		updateMergeRequestResponse.setErrorCode(_ctx.stringValue("UpdateMergeRequestResponse.ErrorCode"));
		updateMergeRequestResponse.setErrorMessage(_ctx.stringValue("UpdateMergeRequestResponse.ErrorMessage"));
		updateMergeRequestResponse.setSuccess(_ctx.booleanValue("UpdateMergeRequestResponse.Success"));

		Result result = new Result();
		result.setAcceptedRevision(_ctx.stringValue("UpdateMergeRequestResponse.Result.AcceptedRevision"));
		result.setAheadCommitCount(_ctx.integerValue("UpdateMergeRequestResponse.Result.AheadCommitCount"));
		result.setBehindCommitCount(_ctx.integerValue("UpdateMergeRequestResponse.Result.BehindCommitCount"));
		result.setCreatedAt(_ctx.stringValue("UpdateMergeRequestResponse.Result.CreatedAt"));
		result.setDescription(_ctx.stringValue("UpdateMergeRequestResponse.Result.Description"));
		result.setId(_ctx.longValue("UpdateMergeRequestResponse.Result.Id"));
		result.setMergeError(_ctx.stringValue("UpdateMergeRequestResponse.Result.MergeError"));
		result.setMergeStatus(_ctx.stringValue("UpdateMergeRequestResponse.Result.MergeStatus"));
		result.setMergeType(_ctx.stringValue("UpdateMergeRequestResponse.Result.MergeType"));
		result.setMergedRevision(_ctx.stringValue("UpdateMergeRequestResponse.Result.MergedRevision"));
		result.setNameWithNamespace(_ctx.stringValue("UpdateMergeRequestResponse.Result.NameWithNamespace"));
		result.setProjectId(_ctx.longValue("UpdateMergeRequestResponse.Result.ProjectId"));
		result.setSourceBranch(_ctx.stringValue("UpdateMergeRequestResponse.Result.SourceBranch"));
		result.setState(_ctx.stringValue("UpdateMergeRequestResponse.Result.State"));
		result.setTargetBranch(_ctx.stringValue("UpdateMergeRequestResponse.Result.TargetBranch"));
		result.setTitle(_ctx.stringValue("UpdateMergeRequestResponse.Result.Title"));
		result.setUpdatedAt(_ctx.stringValue("UpdateMergeRequestResponse.Result.UpdatedAt"));
		result.setWebUrl(_ctx.stringValue("UpdateMergeRequestResponse.Result.WebUrl"));

		ApproveCheckResult approveCheckResult = new ApproveCheckResult();
		approveCheckResult.setTotalCheckResult(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.TotalCheckResult"));

		List<SatisfiedCheckResultsItem> satisfiedCheckResults = new ArrayList<SatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults.Length"); i++) {
			SatisfiedCheckResultsItem satisfiedCheckResultsItem = new SatisfiedCheckResultsItem();
			satisfiedCheckResultsItem.setCheckName(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckName"));
			satisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckStatus"));
			satisfiedCheckResultsItem.setCheckType(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems.add(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setSatisfiedItems(satisfiedItems);

			List<String> unsatisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems.add(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setUnsatisfiedItems(unsatisfiedItems);

			List<ExtraUsersItem> extraUsers = new ArrayList<ExtraUsersItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem extraUsersItem = new ExtraUsersItem();
				extraUsersItem.setAvatarUrl(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem.setExternUserId(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem.setId(_ctx.longValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem.setName(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers.add(extraUsersItem);
			}
			satisfiedCheckResultsItem.setExtraUsers(extraUsers);

			satisfiedCheckResults.add(satisfiedCheckResultsItem);
		}
		approveCheckResult.setSatisfiedCheckResults(satisfiedCheckResults);

		List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults = new ArrayList<UnsatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults.Length"); i++) {
			UnsatisfiedCheckResultsItem unsatisfiedCheckResultsItem = new UnsatisfiedCheckResultsItem();
			unsatisfiedCheckResultsItem.setCheckName(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckName"));
			unsatisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckStatus"));
			unsatisfiedCheckResultsItem.setCheckType(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems1.add(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setSatisfiedItems1(satisfiedItems1);

			List<String> unsatisfiedItems2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems2.add(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setUnsatisfiedItems2(unsatisfiedItems2);

			List<ExtraUsersItem4> extraUsers3 = new ArrayList<ExtraUsersItem4>();
			for (int j = 0; j < _ctx.lengthValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem4 extraUsersItem4 = new ExtraUsersItem4();
				extraUsersItem4.setAvatarUrl(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem4.setExternUserId(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem4.setId(_ctx.longValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem4.setName(_ctx.stringValue("UpdateMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers3.add(extraUsersItem4);
			}
			unsatisfiedCheckResultsItem.setExtraUsers3(extraUsers3);

			unsatisfiedCheckResults.add(unsatisfiedCheckResultsItem);
		}
		approveCheckResult.setUnsatisfiedCheckResults(unsatisfiedCheckResults);
		result.setApproveCheckResult(approveCheckResult);

		Author author = new Author();
		author.setAvatarUrl(_ctx.stringValue("UpdateMergeRequestResponse.Result.Author.AvatarUrl"));
		author.setExternUserId(_ctx.stringValue("UpdateMergeRequestResponse.Result.Author.ExternUserId"));
		author.setId(_ctx.longValue("UpdateMergeRequestResponse.Result.Author.Id"));
		author.setName(_ctx.stringValue("UpdateMergeRequestResponse.Result.Author.Name"));
		result.setAuthor(author);

		List<AssigneeListItem> assigneeList = new ArrayList<AssigneeListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMergeRequestResponse.Result.AssigneeList.Length"); i++) {
			AssigneeListItem assigneeListItem = new AssigneeListItem();
			assigneeListItem.setAvatarUrl(_ctx.stringValue("UpdateMergeRequestResponse.Result.AssigneeList["+ i +"].AvatarUrl"));
			assigneeListItem.setExternUserId(_ctx.stringValue("UpdateMergeRequestResponse.Result.AssigneeList["+ i +"].ExternUserId"));
			assigneeListItem.setId(_ctx.stringValue("UpdateMergeRequestResponse.Result.AssigneeList["+ i +"].Id"));
			assigneeListItem.setName(_ctx.stringValue("UpdateMergeRequestResponse.Result.AssigneeList["+ i +"].Name"));

			assigneeList.add(assigneeListItem);
		}
		result.setAssigneeList(assigneeList);
		updateMergeRequestResponse.setResult(result);
	 
	 	return updateMergeRequestResponse;
	}
}