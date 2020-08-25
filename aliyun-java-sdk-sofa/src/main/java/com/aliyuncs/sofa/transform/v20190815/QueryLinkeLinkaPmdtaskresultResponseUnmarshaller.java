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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtaskresultResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaPmdtaskresultResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaPmdtaskresultResponseUnmarshaller {

	public static QueryLinkeLinkaPmdtaskresultResponse unmarshall(QueryLinkeLinkaPmdtaskresultResponse queryLinkeLinkaPmdtaskresultResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaPmdtaskresultResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.RequestId"));
		queryLinkeLinkaPmdtaskresultResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.ResultCode"));
		queryLinkeLinkaPmdtaskresultResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.ResultMessage"));
		queryLinkeLinkaPmdtaskresultResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.ErrorCode"));
		queryLinkeLinkaPmdtaskresultResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.ErrorMsg"));
		queryLinkeLinkaPmdtaskresultResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaPmdtaskresultResponse.ResponseStatusCode"));
		queryLinkeLinkaPmdtaskresultResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaPmdtaskresultResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaPmdtaskresultResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBeginColumn(_ctx.longValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].BeginColumn"));
			resultItem.setBeginLine(_ctx.longValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].BeginLine"));
			resultItem.setClassName(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].ClassName"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].Description"));
			resultItem.setEndColumn(_ctx.longValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].EndColumn"));
			resultItem.setEndLine(_ctx.longValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].EndLine"));
			resultItem.setFilename(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].Filename"));
			resultItem.setMethodName(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].MethodName"));
			resultItem.setPackageName(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].PackageName"));
			resultItem.setRule(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].Rule"));
			resultItem.setVarName(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].VarName"));

			List<String> relatedFiles = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].RelatedFiles.Length"); j++) {
				relatedFiles.add(_ctx.stringValue("QueryLinkeLinkaPmdtaskresultResponse.Result["+ i +"].RelatedFiles["+ j +"]"));
			}
			resultItem.setRelatedFiles(relatedFiles);

			result.add(resultItem);
		}
		queryLinkeLinkaPmdtaskresultResponse.setResult(result);
	 
	 	return queryLinkeLinkaPmdtaskresultResponse;
	}
}