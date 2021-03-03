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

import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagV2Response;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagV2Response.Result;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagV2Response.Result.Commit;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagV2Response.Result.Commit.Signature1;
import com.aliyuncs.codeup.model.v20200414.GetRepositoryTagV2Response.Result.Signature;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryTagV2ResponseUnmarshaller {

	public static GetRepositoryTagV2Response unmarshall(GetRepositoryTagV2Response getRepositoryTagV2Response, UnmarshallerContext _ctx) {
		
		getRepositoryTagV2Response.setRequestId(_ctx.stringValue("GetRepositoryTagV2Response.RequestId"));
		getRepositoryTagV2Response.setErrorCode(_ctx.stringValue("GetRepositoryTagV2Response.ErrorCode"));
		getRepositoryTagV2Response.setErrorMessage(_ctx.stringValue("GetRepositoryTagV2Response.ErrorMessage"));
		getRepositoryTagV2Response.setSuccess(_ctx.booleanValue("GetRepositoryTagV2Response.Success"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetRepositoryTagV2Response.Result.Id"));
		result.setMessage(_ctx.stringValue("GetRepositoryTagV2Response.Result.Message"));
		result.setName(_ctx.stringValue("GetRepositoryTagV2Response.Result.Name"));

		Commit commit = new Commit();
		commit.setAuthorEmail(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.AuthorName"));
		commit.setAuthoredDate(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.AuthoredDate"));
		commit.setCommittedDate(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.Id"));
		commit.setMessage(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.Message"));
		commit.setShortId(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRepositoryTagV2Response.Result.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);

		Signature1 signature1 = new Signature1();
		signature1.setGpgKeyId(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.Signature.GpgKeyId"));
		signature1.setVerificationStatus(_ctx.stringValue("GetRepositoryTagV2Response.Result.Commit.Signature.VerificationStatus"));
		commit.setSignature1(signature1);
		result.setCommit(commit);

		Signature signature = new Signature();
		signature.setGpgKeyId(_ctx.stringValue("GetRepositoryTagV2Response.Result.Signature.GpgKeyId"));
		signature.setVerificationStatus(_ctx.stringValue("GetRepositoryTagV2Response.Result.Signature.VerificationStatus"));
		result.setSignature(signature);
		getRepositoryTagV2Response.setResult(result);
	 
	 	return getRepositoryTagV2Response;
	}
}