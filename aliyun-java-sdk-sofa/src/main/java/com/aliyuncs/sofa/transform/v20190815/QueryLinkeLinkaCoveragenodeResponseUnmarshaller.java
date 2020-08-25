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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCoveragenodeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaCoveragenodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaCoveragenodeResponseUnmarshaller {

	public static QueryLinkeLinkaCoveragenodeResponse unmarshall(QueryLinkeLinkaCoveragenodeResponse queryLinkeLinkaCoveragenodeResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaCoveragenodeResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.RequestId"));
		queryLinkeLinkaCoveragenodeResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.ResultCode"));
		queryLinkeLinkaCoveragenodeResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.ResultMessage"));
		queryLinkeLinkaCoveragenodeResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.ErrorCode"));
		queryLinkeLinkaCoveragenodeResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.ErrorMsg"));
		queryLinkeLinkaCoveragenodeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.ResponseStatusCode"));
		queryLinkeLinkaCoveragenodeResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaCoveragenodeResponse.Success"));

		Result result = new Result();
		result.setBranchCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.BranchCovered"));
		result.setBranchTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.BranchTotal"));
		result.setClassCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.ClassCovered"));
		result.setClassTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.ClassTotal"));
		result.setCxtyCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.CxtyCovered"));
		result.setCxtyTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.CxtyTotal"));
		result.setFileUrl(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.Result.FileUrl"));
		result.setHasSourceCode(_ctx.booleanValue("QueryLinkeLinkaCoveragenodeResponse.Result.HasSourceCode"));
		result.setId(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.Result.Id"));
		result.setInstrCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.InstrCovered"));
		result.setInstrTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.InstrTotal"));
		result.setLineCoverageData(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.Result.LineCoverageData"));
		result.setLineCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.LineCovered"));
		result.setLineTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.LineTotal"));
		result.setMethodCovered(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.MethodCovered"));
		result.setMethodTotal(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.MethodTotal"));
		result.setName(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.Result.Name"));
		result.setType(_ctx.stringValue("QueryLinkeLinkaCoveragenodeResponse.Result.Type"));

		List<Long> diffLines = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaCoveragenodeResponse.Result.DiffLines.Length"); i++) {
			diffLines.add(_ctx.longValue("QueryLinkeLinkaCoveragenodeResponse.Result.DiffLines["+ i +"]"));
		}
		result.setDiffLines(diffLines);
		queryLinkeLinkaCoveragenodeResponse.setResult(result);
	 
	 	return queryLinkeLinkaCoveragenodeResponse;
	}
}