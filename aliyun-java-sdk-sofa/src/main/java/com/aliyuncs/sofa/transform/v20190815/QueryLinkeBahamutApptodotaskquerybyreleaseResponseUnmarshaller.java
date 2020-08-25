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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApptodotaskquerybyreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutApptodotaskquerybyreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutApptodotaskquerybyreleaseResponse unmarshall(QueryLinkeBahamutApptodotaskquerybyreleaseResponse queryLinkeBahamutApptodotaskquerybyreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.RequestId"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ResultCode"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ResultMessage"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ErrorMessage"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Message"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMetaId(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].AppMetaId"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Name"));
			resultItem.setReleaseId(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].ReleaseId"));
			resultItem.setRepo(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Repo"));
			resultItem.setSourceBranch(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].SourceBranch"));
			resultItem.setState(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].State"));
			resultItem.setTargetBranch(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].TargetBranch"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("QueryLinkeBahamutApptodotaskquerybyreleaseResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		queryLinkeBahamutApptodotaskquerybyreleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutApptodotaskquerybyreleaseResponse;
	}
}