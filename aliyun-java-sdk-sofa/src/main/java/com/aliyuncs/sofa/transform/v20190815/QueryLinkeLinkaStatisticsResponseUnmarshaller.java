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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaStatisticsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaStatisticsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaStatisticsResponseUnmarshaller {

	public static QueryLinkeLinkaStatisticsResponse unmarshall(QueryLinkeLinkaStatisticsResponse queryLinkeLinkaStatisticsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaStatisticsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.RequestId"));
		queryLinkeLinkaStatisticsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.ResultCode"));
		queryLinkeLinkaStatisticsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.ResultMessage"));
		queryLinkeLinkaStatisticsResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.ErrorCode"));
		queryLinkeLinkaStatisticsResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.ErrorMsg"));
		queryLinkeLinkaStatisticsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaStatisticsResponse.ResponseStatusCode"));
		queryLinkeLinkaStatisticsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaStatisticsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaStatisticsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCodeLines(_ctx.longValue("QueryLinkeLinkaStatisticsResponse.Result["+ i +"].CodeLines"));
			resultItem.setContentLines(_ctx.longValue("QueryLinkeLinkaStatisticsResponse.Result["+ i +"].ContentLines"));
			resultItem.setFilename(_ctx.stringValue("QueryLinkeLinkaStatisticsResponse.Result["+ i +"].Filename"));
			resultItem.setPublicApis(_ctx.longValue("QueryLinkeLinkaStatisticsResponse.Result["+ i +"].PublicApis"));
			resultItem.setPublicCommentedApis(_ctx.longValue("QueryLinkeLinkaStatisticsResponse.Result["+ i +"].PublicCommentedApis"));

			result.add(resultItem);
		}
		queryLinkeLinkaStatisticsResponse.setResult(result);
	 
	 	return queryLinkeLinkaStatisticsResponse;
	}
}