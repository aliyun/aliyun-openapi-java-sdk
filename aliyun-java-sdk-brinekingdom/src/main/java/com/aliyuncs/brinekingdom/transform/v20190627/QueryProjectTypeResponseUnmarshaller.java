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

import com.aliyuncs.brinekingdom.model.v20190627.QueryProjectTypeResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryProjectTypeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectTypeResponseUnmarshaller {

	public static QueryProjectTypeResponse unmarshall(QueryProjectTypeResponse queryProjectTypeResponse, UnmarshallerContext _ctx) {
		
		queryProjectTypeResponse.setRequestId(_ctx.stringValue("QueryProjectTypeResponse.RequestId"));
		queryProjectTypeResponse.set_Class(_ctx.stringValue("QueryProjectTypeResponse.Class"));
		queryProjectTypeResponse.setErrorMessage(_ctx.stringValue("QueryProjectTypeResponse.ErrorMessage"));
		queryProjectTypeResponse.setSuccess(_ctx.booleanValue("QueryProjectTypeResponse.Success"));
		queryProjectTypeResponse.setResultCode(_ctx.stringValue("QueryProjectTypeResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectTypeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.set_Class(_ctx.stringValue("QueryProjectTypeResponse.Result["+ i +"].Class"));
			resultItem.setId(_ctx.longValue("QueryProjectTypeResponse.Result["+ i +"].Id"));
			resultItem.setProjectType(_ctx.stringValue("QueryProjectTypeResponse.Result["+ i +"].ProjectType"));
			resultItem.setProjectTypeName(_ctx.stringValue("QueryProjectTypeResponse.Result["+ i +"].ProjectTypeName"));

			result.add(resultItem);
		}
		queryProjectTypeResponse.setResult(result);
	 
	 	return queryProjectTypeResponse;
	}
}