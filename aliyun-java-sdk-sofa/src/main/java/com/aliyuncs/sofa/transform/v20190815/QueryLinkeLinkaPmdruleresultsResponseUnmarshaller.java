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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdruleresultsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdruleresultsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPmdruleresultsResponseUnmarshaller {

	public static QueryLinkeLinkaPmdruleresultsResponse unmarshall(QueryLinkeLinkaPmdruleresultsResponse queryLinkeLinkaPmdruleresultsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPmdruleresultsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.RequestId"));
		queryLinkeLinkaPmdruleresultsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.ResultCode"));
		queryLinkeLinkaPmdruleresultsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.ResultMessage"));
		queryLinkeLinkaPmdruleresultsResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.ErrorCode"));
		queryLinkeLinkaPmdruleresultsResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.ErrorMsg"));
		queryLinkeLinkaPmdruleresultsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPmdruleresultsResponse.ResponseStatusCode"));
		queryLinkeLinkaPmdruleresultsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPmdruleresultsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaPmdruleresultsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBeginColumn(_ctx.longValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].BeginColumn"));
			resultItem.setBeginLine(_ctx.longValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].BeginLine"));
			resultItem.setClassName(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].ClassName"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].Description"));
			resultItem.setEndColumn(_ctx.longValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].EndColumn"));
			resultItem.setEndLine(_ctx.longValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].EndLine"));
			resultItem.setFilename(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].Filename"));
			resultItem.setMethodName(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].MethodName"));
			resultItem.setPackageName(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].PackageName"));
			resultItem.setRule(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].Rule"));
			resultItem.setVarName(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].VarName"));

			List<String> relatedFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].RelatedFiles.Length"); j++) {
				relatedFiles.add(_ctx.stringValue("QueryLinkeLinkaPmdruleresultsResponse.Result["+ i +"].RelatedFiles["+ j +"]"));
			}
			resultItem.setRelatedFiles(relatedFiles);

			result.add(resultItem);
		}
		queryLinkeLinkaPmdruleresultsResponse.setResult(result);
	 
	 	return queryLinkeLinkaPmdruleresultsResponse;
	}
}