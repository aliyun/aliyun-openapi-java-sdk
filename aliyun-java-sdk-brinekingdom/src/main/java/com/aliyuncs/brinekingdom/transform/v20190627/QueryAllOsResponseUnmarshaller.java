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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.QueryAllOsResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryAllOsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllOsResponseUnmarshaller {

	public static QueryAllOsResponse unmarshall(QueryAllOsResponse queryAllOsResponse, UnmarshallerContext _ctx) {
		
		queryAllOsResponse.setRequestId(_ctx.stringValue("QueryAllOsResponse.RequestId"));
		queryAllOsResponse.set_Class(_ctx.stringValue("QueryAllOsResponse.Class"));
		queryAllOsResponse.setErrorMessage(_ctx.stringValue("QueryAllOsResponse.ErrorMessage"));
		queryAllOsResponse.setSuccess(_ctx.booleanValue("QueryAllOsResponse.Success"));
		queryAllOsResponse.setResultCode(_ctx.stringValue("QueryAllOsResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllOsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setLabel(_ctx.stringValue("QueryAllOsResponse.Result["+ i +"].Label"));
			resultItem.setValue(_ctx.longValue("QueryAllOsResponse.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		queryAllOsResponse.setResult(result);
	 
	 	return queryAllOsResponse;
	}
}