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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPriorityresultsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPriorityresultsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPriorityresultsResponseUnmarshaller {

	public static QueryLinkeLinkaPriorityresultsResponse unmarshall(QueryLinkeLinkaPriorityresultsResponse queryLinkeLinkaPriorityresultsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPriorityresultsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.RequestId"));
		queryLinkeLinkaPriorityresultsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.ResultCode"));
		queryLinkeLinkaPriorityresultsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.ResultMessage"));
		queryLinkeLinkaPriorityresultsResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.ErrorCode"));
		queryLinkeLinkaPriorityresultsResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.ErrorMsg"));
		queryLinkeLinkaPriorityresultsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPriorityresultsResponse.ResponseStatusCode"));
		queryLinkeLinkaPriorityresultsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPriorityresultsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaPriorityresultsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBeginColumn(_ctx.longValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].BeginColumn"));
			resultItem.setBeginLine(_ctx.longValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].BeginLine"));
			resultItem.setClassName(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].ClassName"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].Description"));
			resultItem.setEndColumn(_ctx.longValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].EndColumn"));
			resultItem.setEndLine(_ctx.longValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].EndLine"));
			resultItem.setFilename(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].Filename"));
			resultItem.setMethodName(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].MethodName"));
			resultItem.setPackageName(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].PackageName"));
			resultItem.setRule(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].Rule"));
			resultItem.setVarName(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].VarName"));

			List<String> relatedFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].RelatedFiles.Length"); j++) {
				relatedFiles.add(_ctx.stringValue("QueryLinkeLinkaPriorityresultsResponse.Result["+ i +"].RelatedFiles["+ j +"]"));
			}
			resultItem.setRelatedFiles(relatedFiles);

			result.add(resultItem);
		}
		queryLinkeLinkaPriorityresultsResponse.setResult(result);
	 
	 	return queryLinkeLinkaPriorityresultsResponse;
	}
}