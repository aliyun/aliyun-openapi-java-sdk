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

import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagResponse;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagResponse.Result;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagResponse.Result.Commit;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagResponse.Result.Commit.Signature1;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagResponse.Result.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryTagResponseUnmarshaller {

	public static GetRepositoryTagResponse unmarshall(GetRepositoryTagResponse getRepositoryTagResponse, UnmarshallerContext _ctx) {
		
		getRepositoryTagResponse.setRequestId(_ctx.stringValue("GetRepositoryTagResponse.RequestId"));
		getRepositoryTagResponse.setErrorCode(_ctx.stringValue("GetRepositoryTagResponse.ErrorCode"));
		getRepositoryTagResponse.setSuccess(_ctx.booleanValue("GetRepositoryTagResponse.Success"));
		getRepositoryTagResponse.setErrorMessage(_ctx.stringValue("GetRepositoryTagResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetRepositoryTagResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetRepositoryTagResponse.Result.Name"));
		result.setMessage(_ctx.stringValue("GetRepositoryTagResponse.Result.Message"));

		Commit commit = new Commit();
		commit.setId(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.Id"));
		commit.setShortId(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.Title"));
		commit.setAuthorName(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.AuthorName"));
		commit.setAuthorEmail(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.AuthorEmail"));
		commit.setCreatedAt(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.CreatedAt"));
		commit.setMessage(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.Message"));
		commit.setAuthoredDate(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.AuthoredDate"));
		commit.setCommittedDate(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.CommitterName"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryTagResponse.Result.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);

		Signature1 signature1 = new Signature1();
		signature1.setGpgKeyId(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.Signature.GpgKeyId"));
		signature1.setVerificationStatus(_ctx.stringValue("GetRepositoryTagResponse.Result.Commit.Signature.VerificationStatus"));
		commit.setSignature1(signature1);
		result.setCommit(commit);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetRepositoryTagResponse.Result.Signature.GpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetRepositoryTagResponse.Result.Signature.VerificationStatus"));
		result.setSignature(signature);
		getRepositoryTagResponse.setResult(result);
	 
	 	return getRepositoryTagResponse;
	}
}