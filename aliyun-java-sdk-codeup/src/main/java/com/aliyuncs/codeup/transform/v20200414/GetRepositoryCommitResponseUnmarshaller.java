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

import com.aliyuncs.codeup.model.v20200414.GetRepositoryCommitResponse;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryCommitResponse.Result;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryCommitResponse.Result.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryCommitResponseUnmarshaller {

	public static GetRepositoryCommitResponse unmarshall(GetRepositoryCommitResponse getRepositoryCommitResponse, UnmarshallerContext _ctx) {
		
		getRepositoryCommitResponse.setRequestId(_ctx.stringValue("GetRepositoryCommitResponse.RequestId"));
		getRepositoryCommitResponse.setErrorCode(_ctx.stringValue("GetRepositoryCommitResponse.ErrorCode"));
		getRepositoryCommitResponse.setErrorMessage(_ctx.stringValue("GetRepositoryCommitResponse.ErrorMessage"));
		getRepositoryCommitResponse.setSuccess(_ctx.booleanValue("GetRepositoryCommitResponse.Success"));

		Result result = new Result();
		result.setAuthorDate(_ctx.stringValue("GetRepositoryCommitResponse.Result.AuthorDate"));
		result.setAuthorEmail(_ctx.stringValue("GetRepositoryCommitResponse.Result.AuthorEmail"));
		result.setAuthorName(_ctx.stringValue("GetRepositoryCommitResponse.Result.AuthorName"));
		result.setCommittedDate(_ctx.stringValue("GetRepositoryCommitResponse.Result.CommittedDate"));
		result.setCommitterEmail(_ctx.stringValue("GetRepositoryCommitResponse.Result.CommitterEmail"));
		result.setCommitterName(_ctx.stringValue("GetRepositoryCommitResponse.Result.CommitterName"));
		result.setCreatedAt(_ctx.stringValue("GetRepositoryCommitResponse.Result.CreatedAt"));
		result.setId(_ctx.stringValue("GetRepositoryCommitResponse.Result.Id"));
		result.setMessage(_ctx.stringValue("GetRepositoryCommitResponse.Result.Message"));
		result.setShortId(_ctx.stringValue("GetRepositoryCommitResponse.Result.ShortId"));
		result.setTitle(_ctx.stringValue("GetRepositoryCommitResponse.Result.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryCommitResponse.Result.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetRepositoryCommitResponse.Result.ParentIds["+ i +"]"));
		}
		result.setParentIds(parentIds);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetRepositoryCommitResponse.Result.Signature.GpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetRepositoryCommitResponse.Result.Signature.VerificationStatus"));
		result.setSignature(signature);
		getRepositoryCommitResponse.setResult(result);
	 
	 	return getRepositoryCommitResponse;
	}
}