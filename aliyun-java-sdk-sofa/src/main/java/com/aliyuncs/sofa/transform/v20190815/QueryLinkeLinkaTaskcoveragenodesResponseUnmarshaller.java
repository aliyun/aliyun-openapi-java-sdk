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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskcoveragenodesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaTaskcoveragenodesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaTaskcoveragenodesResponseUnmarshaller {

	public static QueryLinkeLinkaTaskcoveragenodesResponse unmarshall(QueryLinkeLinkaTaskcoveragenodesResponse queryLinkeLinkaTaskcoveragenodesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaTaskcoveragenodesResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.RequestId"));
		queryLinkeLinkaTaskcoveragenodesResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.ResultCode"));
		queryLinkeLinkaTaskcoveragenodesResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.ResultMessage"));
		queryLinkeLinkaTaskcoveragenodesResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.ErrorCode"));
		queryLinkeLinkaTaskcoveragenodesResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.ErrorMsg"));
		queryLinkeLinkaTaskcoveragenodesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.ResponseStatusCode"));
		queryLinkeLinkaTaskcoveragenodesResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaTaskcoveragenodesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBranchCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].BranchCovered"));
			resultItem.setBranchTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].BranchTotal"));
			resultItem.setClassCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].ClassCovered"));
			resultItem.setClassTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].ClassTotal"));
			resultItem.setCxtyCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].CxtyCovered"));
			resultItem.setCxtyTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].CxtyTotal"));
			resultItem.setFileUrl(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].FileUrl"));
			resultItem.setHasSourceCode(_ctx.booleanValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].HasSourceCode"));
			resultItem.setId(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].Id"));
			resultItem.setInstrCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].InstrCovered"));
			resultItem.setInstrTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].InstrTotal"));
			resultItem.setLineCoverageData(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].LineCoverageData"));
			resultItem.setLineCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].LineCovered"));
			resultItem.setLineTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].LineTotal"));
			resultItem.setMethodCovered(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].MethodCovered"));
			resultItem.setMethodTotal(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].MethodTotal"));
			resultItem.setName(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].Name"));
			resultItem.setType(_ctx.stringValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].Type"));

			List<Long> diffLines = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].DiffLines.Length"); j++) {
				diffLines.add(_ctx.longValue("QueryLinkeLinkaTaskcoveragenodesResponse.Result["+ i +"].DiffLines["+ j +"]"));
			}
			resultItem.setDiffLines(diffLines);

			result.add(resultItem);
		}
		queryLinkeLinkaTaskcoveragenodesResponse.setResult(result);
	 
	 	return queryLinkeLinkaTaskcoveragenodesResponse;
	}
}