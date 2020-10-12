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

import com.aliyuncs.codeup.model.v20200414.CreateTagResponse;
import com.aliyuncs.codeup.model.v20200414.CreateTagResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateTagResponse.Result.CommitInfo;
import com.aliyuncs.codeup.model.v20200414.CreateTagResponse.Result.Release;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTagResponseUnmarshaller {

	public static CreateTagResponse unmarshall(CreateTagResponse createTagResponse, UnmarshallerContext _ctx) {
		
		createTagResponse.setRequestId(_ctx.stringValue("CreateTagResponse.RequestId"));
		createTagResponse.setErrorCode(_ctx.stringValue("CreateTagResponse.ErrorCode"));
		createTagResponse.setSuccess(_ctx.booleanValue("CreateTagResponse.Success"));
		createTagResponse.setErrorMessage(_ctx.stringValue("CreateTagResponse.ErrorMessage"));

		Result result = new Result();
		result.setName(_ctx.stringValue("CreateTagResponse.Result.Name"));
		result.setMessage(_ctx.stringValue("CreateTagResponse.Result.Message"));

		CommitInfo commitInfo = new CommitInfo();
		commitInfo.setId(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.Id"));
		commitInfo.setShortId(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.ShortId"));
		commitInfo.setTitle(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.Title"));
		commitInfo.setAuthorName(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.AuthorName"));
		commitInfo.setAuthorEmail(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.AuthorEmail"));
		commitInfo.setAuthoredDate(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.AuthoredDate"));
		commitInfo.setCommittedDate(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.CommittedDate"));
		commitInfo.setCommitterEmail(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.CommitterEmail"));
		commitInfo.setCommitterName(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.CommitterName"));
		commitInfo.setCreatedAt(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.CreatedAt"));
		commitInfo.setMessage(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.Message"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateTagResponse.Result.CommitInfo.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateTagResponse.Result.CommitInfo.ParentIds["+ i +"]"));
		}
		commitInfo.setParentIds(parentIds);
		result.setCommitInfo(commitInfo);

		Release release = new Release();
		release.setTagName(_ctx.stringValue("CreateTagResponse.Result.Release.TagName"));
		release.setDescription(_ctx.stringValue("CreateTagResponse.Result.Release.Description"));
		result.setRelease(release);
		createTagResponse.setResult(result);
	 
	 	return createTagResponse;
	}
}