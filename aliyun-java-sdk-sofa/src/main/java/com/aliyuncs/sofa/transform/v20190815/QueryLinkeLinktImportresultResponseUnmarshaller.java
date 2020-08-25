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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktImportresultResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktImportresultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktImportresultResponseUnmarshaller {

	public static QueryLinkeLinktImportresultResponse unmarshall(QueryLinkeLinktImportresultResponse queryLinkeLinktImportresultResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktImportresultResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktImportresultResponse.RequestId"));
		queryLinkeLinktImportresultResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktImportresultResponse.ResultCode"));
		queryLinkeLinktImportresultResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktImportresultResponse.ResultMessage"));
		queryLinkeLinktImportresultResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktImportresultResponse.ErrorCode"));
		queryLinkeLinktImportresultResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktImportresultResponse.ErrorMessage"));
		queryLinkeLinktImportresultResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktImportresultResponse.ResponseStatusCode"));
		queryLinkeLinktImportresultResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktImportresultResponse.Success"));

		Data data = new Data();
		data.setResolving(_ctx.booleanValue("QueryLinkeLinktImportresultResponse.Data.Resolving"));
		data.setResult(_ctx.stringValue("QueryLinkeLinktImportresultResponse.Data.Result"));
		queryLinkeLinktImportresultResponse.setData(data);
	 
	 	return queryLinkeLinktImportresultResponse;
	}
}