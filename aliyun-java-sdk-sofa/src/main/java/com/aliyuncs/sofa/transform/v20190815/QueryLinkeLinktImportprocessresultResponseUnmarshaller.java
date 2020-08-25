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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktImportprocessresultResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktImportprocessresultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktImportprocessresultResponseUnmarshaller {

	public static QueryLinkeLinktImportprocessresultResponse unmarshall(QueryLinkeLinktImportprocessresultResponse queryLinkeLinktImportprocessresultResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktImportprocessresultResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktImportprocessresultResponse.RequestId"));
		queryLinkeLinktImportprocessresultResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktImportprocessresultResponse.ResultCode"));
		queryLinkeLinktImportprocessresultResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktImportprocessresultResponse.ResultMessage"));
		queryLinkeLinktImportprocessresultResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktImportprocessresultResponse.ErrorCode"));
		queryLinkeLinktImportprocessresultResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktImportprocessresultResponse.ErrorMessage"));
		queryLinkeLinktImportprocessresultResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktImportprocessresultResponse.ResponseStatusCode"));
		queryLinkeLinktImportprocessresultResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktImportprocessresultResponse.Success"));

		Data data = new Data();
		data.setFinished(_ctx.booleanValue("QueryLinkeLinktImportprocessresultResponse.Data.Finished"));
		data.setFinishedCount(_ctx.longValue("QueryLinkeLinktImportprocessresultResponse.Data.FinishedCount"));
		data.setSuccess(_ctx.booleanValue("QueryLinkeLinktImportprocessresultResponse.Data.Success"));
		data.setTotal(_ctx.longValue("QueryLinkeLinktImportprocessresultResponse.Data.Total"));
		queryLinkeLinktImportprocessresultResponse.setData(data);
	 
	 	return queryLinkeLinktImportprocessresultResponse;
	}
}