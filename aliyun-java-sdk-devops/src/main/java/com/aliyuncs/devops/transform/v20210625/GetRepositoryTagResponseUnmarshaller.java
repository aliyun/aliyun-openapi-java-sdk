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

import com.aliyuncs.devops.model.v20210625.GetRepositoryTagResponse;
import com.aliyuncs.devops.model.v20210625.GetRepositoryTagResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetRepositoryTagResponse.Result.Commit;
import com.aliyuncs.devops.model.v20210625.GetRepositoryTagResponse.Result.Commit.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryTagResponseUnmarshaller {

	public static GetRepositoryTagResponse unmarshall(GetRepositoryTagResponse getRepositoryTagResponse, UnmarshallerContext _ctx) {
		
		getRepositoryTagResponse.setRequestId(_ctx.stringValue("GetRepositoryTagResponse.requestId"));
		getRepositoryTagResponse.setErrorMessage(_ctx.stringValue("GetRepositoryTagResponse.errorMessage"));
		getRepositoryTagResponse.setErrorCode(_ctx.stringValue("GetRepositoryTagResponse.errorCode"));
		getRepositoryTagResponse.setSuccess(_ctx.booleanValue("GetRepositoryTagResponse.success"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetRepositoryTagResponse.result.id"));
		result.setName(_ctx.stringValue("GetRepositoryTagResponse.result.name"));
		result.setMessage(_ctx.stringValue("GetRepositoryTagResponse.result.message"));

		Commit commit = new Commit();
		commit.setId(_ctx.stringValue("GetRepositoryTagResponse.result.commit.id"));
		commit.setShortId(_ctx.stringValue("GetRepositoryTagResponse.result.commit.shortId"));
		commit.setTitle(_ctx.stringValue("GetRepositoryTagResponse.result.commit.title"));
		commit.setMessage(_ctx.stringValue("GetRepositoryTagResponse.result.commit.message"));
		commit.setCreatedAt(_ctx.stringValue("GetRepositoryTagResponse.result.commit.createdAt"));
		commit.setAuthorName(_ctx.stringValue("GetRepositoryTagResponse.result.commit.authorName"));
		commit.setAuthorEmail(_ctx.stringValue("GetRepositoryTagResponse.result.commit.authorEmail"));
		commit.setAuthoredDate(_ctx.stringValue("GetRepositoryTagResponse.result.commit.authoredDate"));
		commit.setCommitterName(_ctx.stringValue("GetRepositoryTagResponse.result.commit.committerName"));
		commit.setCommitterEmail(_ctx.stringValue("GetRepositoryTagResponse.result.commit.committerEmail"));
		commit.setCommittedDate(_ctx.stringValue("GetRepositoryTagResponse.result.commit.committedDate"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryTagResponse.result.commit.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetRepositoryTagResponse.result.commit.parentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetRepositoryTagResponse.result.commit.signature.gpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetRepositoryTagResponse.result.commit.signature.verificationStatus"));
		commit.setSignature(signature);
		result.setCommit(commit);
		getRepositoryTagResponse.setResult(result);
	 
	 	return getRepositoryTagResponse;
	}
}