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

import com.aliyuncs.devops.model.v20210625.GetFileLastCommitResponse;
import com.aliyuncs.devops.model.v20210625.GetFileLastCommitResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetFileLastCommitResponse.Result.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileLastCommitResponseUnmarshaller {

	public static GetFileLastCommitResponse unmarshall(GetFileLastCommitResponse getFileLastCommitResponse, UnmarshallerContext _ctx) {
		
		getFileLastCommitResponse.setErrorMessage(_ctx.stringValue("GetFileLastCommitResponse.errorMessage"));
		getFileLastCommitResponse.setRequestId(_ctx.stringValue("GetFileLastCommitResponse.requestId"));
		getFileLastCommitResponse.setSuccess(_ctx.booleanValue("GetFileLastCommitResponse.success"));
		getFileLastCommitResponse.setErrorCode(_ctx.stringValue("GetFileLastCommitResponse.errorCode"));

		Result result = new Result();
		result.setShortId(_ctx.stringValue("GetFileLastCommitResponse.result.shortId"));
		result.setAuthorName(_ctx.stringValue("GetFileLastCommitResponse.result.authorName"));
		result.setAuthorDate(_ctx.stringValue("GetFileLastCommitResponse.result.authorDate"));
		result.setCreatedAt(_ctx.stringValue("GetFileLastCommitResponse.result.createdAt"));
		result.setMessage(_ctx.stringValue("GetFileLastCommitResponse.result.message"));
		result.setTitle(_ctx.stringValue("GetFileLastCommitResponse.result.title"));
		result.setCommitterName(_ctx.stringValue("GetFileLastCommitResponse.result.committerName"));
		result.setAuthorEmail(_ctx.stringValue("GetFileLastCommitResponse.result.authorEmail"));
		result.setId(_ctx.stringValue("GetFileLastCommitResponse.result.id"));
		result.setCommitterEmail(_ctx.stringValue("GetFileLastCommitResponse.result.committerEmail"));
		result.setCommittedDate(_ctx.stringValue("GetFileLastCommitResponse.result.committedDate"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFileLastCommitResponse.result.parentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetFileLastCommitResponse.result.parentIds["+ i +"]"));
		}
		result.setParentIds(parentIds);

		Signature signature = new Signature();
		signature.setVerificationStatus(_ctx.stringValue("GetFileLastCommitResponse.result.signature.verificationStatus"));
		signature.setGpgKeyId(_ctx.stringValue("GetFileLastCommitResponse.result.signature.gpgKeyId"));
		result.setSignature(signature);
		getFileLastCommitResponse.setResult(result);
	 
	 	return getFileLastCommitResponse;
	}
}