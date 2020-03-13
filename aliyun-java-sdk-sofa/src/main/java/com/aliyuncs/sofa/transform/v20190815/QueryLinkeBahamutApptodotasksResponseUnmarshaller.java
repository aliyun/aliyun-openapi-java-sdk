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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApptodotasksResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApptodotasksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutApptodotasksResponseUnmarshaller {

	public static QueryLinkeBahamutApptodotasksResponse unmarshall(QueryLinkeBahamutApptodotasksResponse queryLinkeBahamutApptodotasksResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutApptodotasksResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.RequestId"));
		queryLinkeBahamutApptodotasksResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.ResultCode"));
		queryLinkeBahamutApptodotasksResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.ResultMessage"));
		queryLinkeBahamutApptodotasksResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.ErrorMessage"));
		queryLinkeBahamutApptodotasksResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Message"));
		queryLinkeBahamutApptodotasksResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutApptodotasksResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutApptodotasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMetaId(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].AppMetaId"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Deleted"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Name"));
			resultItem.setReleaseId(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].ReleaseId"));
			resultItem.setRepo(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Repo"));
			resultItem.setSourceBranch(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].SourceBranch"));
			resultItem.setState(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].State"));
			resultItem.setTargetBranch(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].TargetBranch"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Type"));
			resultItem.setUrl(_ctx.stringValue("QueryLinkeBahamutApptodotasksResponse.Result["+ i +"].Url"));

			result.add(resultItem);
		}
		queryLinkeBahamutApptodotasksResponse.setResult(result);
	 
	 	return queryLinkeBahamutApptodotasksResponse;
	}
}