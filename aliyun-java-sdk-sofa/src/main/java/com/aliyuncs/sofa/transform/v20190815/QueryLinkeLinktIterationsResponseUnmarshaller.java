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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktIterationsResponseUnmarshaller {

	public static QueryLinkeLinktIterationsResponse unmarshall(QueryLinkeLinktIterationsResponse queryLinkeLinktIterationsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktIterationsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktIterationsResponse.RequestId"));
		queryLinkeLinktIterationsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktIterationsResponse.ResultCode"));
		queryLinkeLinktIterationsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktIterationsResponse.ResultMessage"));
		queryLinkeLinktIterationsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktIterationsResponse.ErrorCode"));
		queryLinkeLinktIterationsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktIterationsResponse.ErrorMessage"));
		queryLinkeLinktIterationsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktIterationsResponse.ResponseStatusCode"));
		queryLinkeLinktIterationsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktIterationsResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("QueryLinkeLinktIterationsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("QueryLinkeLinktIterationsResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("QueryLinkeLinktIterationsResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("QueryLinkeLinktIterationsResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktIterationsResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryLinkeLinktIterationsResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		queryLinkeLinktIterationsResponse.setData(data);
	 
	 	return queryLinkeLinktIterationsResponse;
	}
}