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

import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.ApproveCheckResult;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResultsItem.ExtraUsersItem;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResultsItem.ExtraUsersItem4;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.AssigneeListItem;
import com.aliyuncs.codeup.model.v20200414.MergeMergeRequestResponse.Result.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class MergeMergeRequestResponseUnmarshaller {

	public static MergeMergeRequestResponse unmarshall(MergeMergeRequestResponse mergeMergeRequestResponse, UnmarshallerContext _ctx) {
		
		mergeMergeRequestResponse.setRequestId(_ctx.stringValue("MergeMergeRequestResponse.RequestId"));
		mergeMergeRequestResponse.setErrorCode(_ctx.stringValue("MergeMergeRequestResponse.ErrorCode"));
		mergeMergeRequestResponse.setSuccess(_ctx.booleanValue("MergeMergeRequestResponse.Success"));
		mergeMergeRequestResponse.setErrorMessage(_ctx.stringValue("MergeMergeRequestResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("MergeMergeRequestResponse.Result.Id"));
		result.setProjectId(_ctx.longValue("MergeMergeRequestResponse.Result.ProjectId"));
		result.setTitle(_ctx.stringValue("MergeMergeRequestResponse.Result.Title"));
		result.setDescription(_ctx.stringValue("MergeMergeRequestResponse.Result.Description"));
		result.setState(_ctx.stringValue("MergeMergeRequestResponse.Result.State"));
		result.setMergeStatus(_ctx.stringValue("MergeMergeRequestResponse.Result.MergeStatus"));
		result.setCreatedAt(_ctx.stringValue("MergeMergeRequestResponse.Result.CreatedAt"));
		result.setUpdatedAt(_ctx.stringValue("MergeMergeRequestResponse.Result.UpdatedAt"));
		result.setTargetBranch(_ctx.stringValue("MergeMergeRequestResponse.Result.TargetBranch"));
		result.setSourceBranch(_ctx.stringValue("MergeMergeRequestResponse.Result.SourceBranch"));
		result.setWebUrl(_ctx.stringValue("MergeMergeRequestResponse.Result.WebUrl"));
		result.setAcceptedRevision(_ctx.stringValue("MergeMergeRequestResponse.Result.AcceptedRevision"));
		result.setMergeError(_ctx.stringValue("MergeMergeRequestResponse.Result.MergeError"));
		result.setMergedRevision(_ctx.stringValue("MergeMergeRequestResponse.Result.MergedRevision"));
		result.setNameWithNamespace(_ctx.stringValue("MergeMergeRequestResponse.Result.NameWithNamespace"));
		result.setMergeType(_ctx.stringValue("MergeMergeRequestResponse.Result.MergeType"));
		result.setAheadCommitCount(_ctx.integerValue("MergeMergeRequestResponse.Result.AheadCommitCount"));
		result.setBehindCommitCount(_ctx.integerValue("MergeMergeRequestResponse.Result.BehindCommitCount"));

		Author author = new Author();
		author.setId(_ctx.longValue("MergeMergeRequestResponse.Result.Author.Id"));
		author.setExternUserId(_ctx.stringValue("MergeMergeRequestResponse.Result.Author.ExternUserId"));
		author.setAvatarUrl(_ctx.stringValue("MergeMergeRequestResponse.Result.Author.AvatarUrl"));
		author.setName(_ctx.stringValue("MergeMergeRequestResponse.Result.Author.Name"));
		result.setAuthor(author);

		ApproveCheckResult approveCheckResult = new ApproveCheckResult();
		approveCheckResult.setTotalCheckResult(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.TotalCheckResult"));

		List<SatisfiedCheckResultsItem> satisfiedCheckResults = new ArrayList<SatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults.Length"); i++) {
			SatisfiedCheckResultsItem satisfiedCheckResultsItem = new SatisfiedCheckResultsItem();
			satisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckStatus"));
			satisfiedCheckResultsItem.setCheckName(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckName"));
			satisfiedCheckResultsItem.setCheckType(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems.add(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setSatisfiedItems(satisfiedItems);

			List<String> unsatisfiedItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems.add(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			satisfiedCheckResultsItem.setUnsatisfiedItems(unsatisfiedItems);

			List<ExtraUsersItem> extraUsers = new ArrayList<ExtraUsersItem>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem extraUsersItem = new ExtraUsersItem();
				extraUsersItem.setId(_ctx.longValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem.setExternUserId(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem.setAvatarUrl(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem.setName(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.SatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers.add(extraUsersItem);
			}
			satisfiedCheckResultsItem.setExtraUsers(extraUsers);

			satisfiedCheckResults.add(satisfiedCheckResultsItem);
		}
		approveCheckResult.setSatisfiedCheckResults(satisfiedCheckResults);

		List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults = new ArrayList<UnsatisfiedCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults.Length"); i++) {
			UnsatisfiedCheckResultsItem unsatisfiedCheckResultsItem = new UnsatisfiedCheckResultsItem();
			unsatisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckStatus"));
			unsatisfiedCheckResultsItem.setCheckName(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckName"));
			unsatisfiedCheckResultsItem.setCheckType(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].CheckType"));

			List<String> satisfiedItems1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems.Length"); j++) {
				satisfiedItems1.add(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].SatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setSatisfiedItems1(satisfiedItems1);

			List<String> unsatisfiedItems2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems.Length"); j++) {
				unsatisfiedItems2.add(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].UnsatisfiedItems["+ j +"]"));
			}
			unsatisfiedCheckResultsItem.setUnsatisfiedItems2(unsatisfiedItems2);

			List<ExtraUsersItem4> extraUsers3 = new ArrayList<ExtraUsersItem4>();
			for (int j = 0; j < _ctx.lengthValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers.Length"); j++) {
				ExtraUsersItem4 extraUsersItem4 = new ExtraUsersItem4();
				extraUsersItem4.setId(_ctx.longValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Id"));
				extraUsersItem4.setExternUserId(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].ExternUserId"));
				extraUsersItem4.setAvatarUrl(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].AvatarUrl"));
				extraUsersItem4.setName(_ctx.stringValue("MergeMergeRequestResponse.Result.ApproveCheckResult.UnsatisfiedCheckResults["+ i +"].ExtraUsers["+ j +"].Name"));

				extraUsers3.add(extraUsersItem4);
			}
			unsatisfiedCheckResultsItem.setExtraUsers3(extraUsers3);

			unsatisfiedCheckResults.add(unsatisfiedCheckResultsItem);
		}
		approveCheckResult.setUnsatisfiedCheckResults(unsatisfiedCheckResults);
		result.setApproveCheckResult(approveCheckResult);

		List<AssigneeListItem> assigneeList = new ArrayList<AssigneeListItem>();
		for (int i = 0; i < _ctx.lengthValue("MergeMergeRequestResponse.Result.AssigneeList.Length"); i++) {
			AssigneeListItem assigneeListItem = new AssigneeListItem();
			assigneeListItem.setId(_ctx.stringValue("MergeMergeRequestResponse.Result.AssigneeList["+ i +"].Id"));
			assigneeListItem.setExternUserId(_ctx.stringValue("MergeMergeRequestResponse.Result.AssigneeList["+ i +"].ExternUserId"));
			assigneeListItem.setAvatarUrl(_ctx.stringValue("MergeMergeRequestResponse.Result.AssigneeList["+ i +"].AvatarUrl"));
			assigneeListItem.setName(_ctx.stringValue("MergeMergeRequestResponse.Result.AssigneeList["+ i +"].Name"));

			assigneeList.add(assigneeListItem);
		}
		result.setAssigneeList(assigneeList);
		mergeMergeRequestResponse.setResult(result);
	 
	 	return mergeMergeRequestResponse;
	}
}