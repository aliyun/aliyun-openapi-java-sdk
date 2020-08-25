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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaGrouphistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaGrouphistoryResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaGrouphistoryResponseUnmarshaller {

	public static QueryLinkeLinkaGrouphistoryResponse unmarshall(QueryLinkeLinkaGrouphistoryResponse queryLinkeLinkaGrouphistoryResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaGrouphistoryResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.RequestId"));
		queryLinkeLinkaGrouphistoryResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.ResultCode"));
		queryLinkeLinkaGrouphistoryResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.ResultMessage"));
		queryLinkeLinkaGrouphistoryResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.ErrorCode"));
		queryLinkeLinkaGrouphistoryResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.ErrorMsg"));
		queryLinkeLinkaGrouphistoryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaGrouphistoryResponse.ResponseStatusCode"));
		queryLinkeLinkaGrouphistoryResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaGrouphistoryResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaGrouphistoryResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreatedAt(_ctx.longValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].CreatedAt"));
			resultItem.setGroup(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].Group"));
			resultItem.setId(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].Id"));
			resultItem.setOnlySummary(_ctx.booleanValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].OnlySummary"));
			resultItem.setTaskId(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].TaskId"));

			List<String> subCoverages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].SubCoverages.Length"); j++) {
				subCoverages.add(_ctx.stringValue("QueryLinkeLinkaGrouphistoryResponse.Result["+ i +"].SubCoverages["+ j +"]"));
			}
			resultItem.setSubCoverages(subCoverages);

			result.add(resultItem);
		}
		queryLinkeLinkaGrouphistoryResponse.setResult(result);
	 
	 	return queryLinkeLinkaGrouphistoryResponse;
	}
}