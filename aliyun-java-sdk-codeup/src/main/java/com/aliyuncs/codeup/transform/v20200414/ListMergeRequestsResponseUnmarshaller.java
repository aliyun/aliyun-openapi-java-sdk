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

import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.ApproveCheckResult;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.ApproveCheckResult.SatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.ApproveCheckResult.SatisfiedCheckResultsItem.ExtraUsersItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.ApproveCheckResult.UnsatisfiedCheckResultsItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.ApproveCheckResult.UnsatisfiedCheckResultsItem.ExtraUsersItem4;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.AssigneeListItem;
import com.aliyuncs.codeup.model.v20200414.ListMergeRequestsResponse.ResultItem.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestsResponseUnmarshaller {

	public static ListMergeRequestsResponse unmarshall(ListMergeRequestsResponse listMergeRequestsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestsResponse.setRequestId(_ctx.stringValue("ListMergeRequestsResponse.RequestId"));
		listMergeRequestsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestsResponse.ErrorCode"));
		listMergeRequestsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestsResponse.ErrorMessage"));
		listMergeRequestsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestsResponse.Success"));
		listMergeRequestsResponse.setTotal(_ctx.longValue("ListMergeRequestsResponse.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAcceptedRevision(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AcceptedRevision"));
			resultItem.setAheadCommitCount(_ctx.integerValue("ListMergeRequestsResponse.Result["+ i +"].AheadCommitCount"));
			resultItem.setBehindCommitCount(_ctx.integerValue("ListMergeRequestsResponse.Result["+ i +"].BehindCommitCount"));
			resultItem.setCreatedAt(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].CreatedAt"));
			resultItem.setDescription(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.longValue("ListMergeRequestsResponse.Result["+ i +"].Id"));
			resultItem.setMergeError(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].MergeError"));
			resultItem.setMergeStatus(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].MergeStatus"));
			resultItem.setMergeType(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].MergeType"));
			resultItem.setMergedRevision(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].MergedRevision"));
			resultItem.setNameWithNamespace(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].NameWithNamespace"));
			resultItem.setProjectId(_ctx.longValue("ListMergeRequestsResponse.Result["+ i +"].ProjectId"));
			resultItem.setSourceBranch(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].SourceBranch"));
			resultItem.setState(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].State"));
			resultItem.setTargetBranch(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].TargetBranch"));
			resultItem.setTitle(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].Title"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setWebUrl(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].WebUrl"));
			resultItem.setIsSupportMerge(_ctx.booleanValue("ListMergeRequestsResponse.Result["+ i +"].IsSupportMerge"));

			ApproveCheckResult approveCheckResult = new ApproveCheckResult();
			approveCheckResult.setTotalCheckResult(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.TotalCheckResult"));

			List<SatisfiedCheckResultsItem> satisfiedCheckResults = new ArrayList<SatisfiedCheckResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults.Length"); j++) {
				SatisfiedCheckResultsItem satisfiedCheckResultsItem = new SatisfiedCheckResultsItem();
				satisfiedCheckResultsItem.setCheckName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].CheckName"));
				satisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].CheckStatus"));
				satisfiedCheckResultsItem.setCheckType(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].CheckType"));

				List<String> satisfiedItems = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].SatisfiedItems.Length"); k++) {
					satisfiedItems.add(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].SatisfiedItems["+ k +"]"));
				}
				satisfiedCheckResultsItem.setSatisfiedItems(satisfiedItems);

				List<String> unsatisfiedItems = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].UnsatisfiedItems.Length"); k++) {
					unsatisfiedItems.add(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].UnsatisfiedItems["+ k +"]"));
				}
				satisfiedCheckResultsItem.setUnsatisfiedItems(unsatisfiedItems);

				List<ExtraUsersItem> extraUsers = new ArrayList<ExtraUsersItem>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].ExtraUsers.Length"); k++) {
					ExtraUsersItem extraUsersItem = new ExtraUsersItem();
					extraUsersItem.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].AvatarUrl"));
					extraUsersItem.setExternUserId(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].ExternUserId"));
					extraUsersItem.setId(_ctx.longValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].Id"));
					extraUsersItem.setName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.SatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].Name"));

					extraUsers.add(extraUsersItem);
				}
				satisfiedCheckResultsItem.setExtraUsers(extraUsers);

				satisfiedCheckResults.add(satisfiedCheckResultsItem);
			}
			approveCheckResult.setSatisfiedCheckResults(satisfiedCheckResults);

			List<UnsatisfiedCheckResultsItem> unsatisfiedCheckResults = new ArrayList<UnsatisfiedCheckResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults.Length"); j++) {
				UnsatisfiedCheckResultsItem unsatisfiedCheckResultsItem = new UnsatisfiedCheckResultsItem();
				unsatisfiedCheckResultsItem.setCheckName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].CheckName"));
				unsatisfiedCheckResultsItem.setCheckStatus(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].CheckStatus"));
				unsatisfiedCheckResultsItem.setCheckType(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].CheckType"));

				List<String> satisfiedItems1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].SatisfiedItems.Length"); k++) {
					satisfiedItems1.add(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].SatisfiedItems["+ k +"]"));
				}
				unsatisfiedCheckResultsItem.setSatisfiedItems1(satisfiedItems1);

				List<String> unsatisfiedItems2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].UnsatisfiedItems.Length"); k++) {
					unsatisfiedItems2.add(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].UnsatisfiedItems["+ k +"]"));
				}
				unsatisfiedCheckResultsItem.setUnsatisfiedItems2(unsatisfiedItems2);

				List<ExtraUsersItem4> extraUsers3 = new ArrayList<ExtraUsersItem4>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].ExtraUsers.Length"); k++) {
					ExtraUsersItem4 extraUsersItem4 = new ExtraUsersItem4();
					extraUsersItem4.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].AvatarUrl"));
					extraUsersItem4.setExternUserId(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].ExternUserId"));
					extraUsersItem4.setId(_ctx.longValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].Id"));
					extraUsersItem4.setName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].ApproveCheckResult.UnsatisfiedCheckResults["+ j +"].ExtraUsers["+ k +"].Name"));

					extraUsers3.add(extraUsersItem4);
				}
				unsatisfiedCheckResultsItem.setExtraUsers3(extraUsers3);

				unsatisfiedCheckResults.add(unsatisfiedCheckResultsItem);
			}
			approveCheckResult.setUnsatisfiedCheckResults(unsatisfiedCheckResults);
			resultItem.setApproveCheckResult(approveCheckResult);

			Author author = new Author();
			author.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].Author.AvatarUrl"));
			author.setExternUserId(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].Author.ExternUserId"));
			author.setId(_ctx.longValue("ListMergeRequestsResponse.Result["+ i +"].Author.Id"));
			author.setName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].Author.Name"));
			resultItem.setAuthor(author);

			List<AssigneeListItem> assigneeList = new ArrayList<AssigneeListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList.Length"); j++) {
				AssigneeListItem assigneeListItem = new AssigneeListItem();
				assigneeListItem.setAvatarUrl(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].AvatarUrl"));
				assigneeListItem.setExternUserId(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].ExternUserId"));
				assigneeListItem.setId(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].Id"));
				assigneeListItem.setName(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].Name"));
				assigneeListItem.setStatus(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].Status"));
				assigneeListItem.setEmail(_ctx.stringValue("ListMergeRequestsResponse.Result["+ i +"].AssigneeList["+ j +"].Email"));

				assigneeList.add(assigneeListItem);
			}
			resultItem.setAssigneeList(assigneeList);

			result.add(resultItem);
		}
		listMergeRequestsResponse.setResult(result);
	 
	 	return listMergeRequestsResponse;
	}
}