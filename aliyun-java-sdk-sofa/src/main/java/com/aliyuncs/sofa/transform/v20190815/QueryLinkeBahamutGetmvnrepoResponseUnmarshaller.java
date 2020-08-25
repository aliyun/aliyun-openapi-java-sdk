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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGetmvnrepoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutGetmvnrepoResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutGetmvnrepoResponseUnmarshaller {

	public static QueryLinkeBahamutGetmvnrepoResponse unmarshall(QueryLinkeBahamutGetmvnrepoResponse queryLinkeBahamutGetmvnrepoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutGetmvnrepoResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.RequestId"));
		queryLinkeBahamutGetmvnrepoResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.ResultCode"));
		queryLinkeBahamutGetmvnrepoResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.ResultMessage"));
		queryLinkeBahamutGetmvnrepoResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.ErrorMessage"));
		queryLinkeBahamutGetmvnrepoResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutGetmvnrepoResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Message"));
		queryLinkeBahamutGetmvnrepoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutGetmvnrepoResponse.ResponseStatusCode"));
		queryLinkeBahamutGetmvnrepoResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutGetmvnrepoResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutGetmvnrepoResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCanEdit(_ctx.booleanValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].CanEdit"));
			resultItem.setFabricStage(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].FabricStage"));
			resultItem.setRepoFullName(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].RepoFullName"));
			resultItem.setRepoName(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].RepoName"));
			resultItem.setRepoUrl(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].RepoUrl"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutGetmvnrepoResponse.Result["+ i +"].Type"));

			result.add(resultItem);
		}
		queryLinkeBahamutGetmvnrepoResponse.setResult(result);
	 
	 	return queryLinkeBahamutGetmvnrepoResponse;
	}
}