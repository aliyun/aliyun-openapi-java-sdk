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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaAllsourcefilenodesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaAllsourcefilenodesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaAllsourcefilenodesResponseUnmarshaller {

	public static QueryLinkeLinkaAllsourcefilenodesResponse unmarshall(QueryLinkeLinkaAllsourcefilenodesResponse queryLinkeLinkaAllsourcefilenodesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaAllsourcefilenodesResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.RequestId"));
		queryLinkeLinkaAllsourcefilenodesResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.ResultCode"));
		queryLinkeLinkaAllsourcefilenodesResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.ResultMessage"));
		queryLinkeLinkaAllsourcefilenodesResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.ErrorCode"));
		queryLinkeLinkaAllsourcefilenodesResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.ErrorMsg"));
		queryLinkeLinkaAllsourcefilenodesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.ResponseStatusCode"));
		queryLinkeLinkaAllsourcefilenodesResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaAllsourcefilenodesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBranchCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].BranchCovered"));
			resultItem.setBranchTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].BranchTotal"));
			resultItem.setClassCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].ClassCovered"));
			resultItem.setClassTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].ClassTotal"));
			resultItem.setCxtyCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].CxtyCovered"));
			resultItem.setCxtyTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].CxtyTotal"));
			resultItem.setFileUrl(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].FileUrl"));
			resultItem.setHasSourceCode(_ctx.booleanValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].HasSourceCode"));
			resultItem.setId(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].Id"));
			resultItem.setInstrCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].InstrCovered"));
			resultItem.setInstrTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].InstrTotal"));
			resultItem.setLineCoverageData(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].LineCoverageData"));
			resultItem.setLineCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].LineCovered"));
			resultItem.setLineTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].LineTotal"));
			resultItem.setMethodCovered(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].MethodCovered"));
			resultItem.setMethodTotal(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].MethodTotal"));
			resultItem.setName(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].Name"));
			resultItem.setType(_ctx.stringValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].Type"));

			List<Long> diffLines = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].DiffLines.Length"); j++) {
				diffLines.add(_ctx.longValue("QueryLinkeLinkaAllsourcefilenodesResponse.Result["+ i +"].DiffLines["+ j +"]"));
			}
			resultItem.setDiffLines(diffLines);

			result.add(resultItem);
		}
		queryLinkeLinkaAllsourcefilenodesResponse.setResult(result);
	 
	 	return queryLinkeLinkaAllsourcefilenodesResponse;
	}
}