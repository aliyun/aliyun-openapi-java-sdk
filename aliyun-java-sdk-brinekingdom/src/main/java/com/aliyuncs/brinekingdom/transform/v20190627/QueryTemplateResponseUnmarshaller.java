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

import com.aliyuncs.brinekingdom.model.v20190627.QueryTemplateResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QueryTemplateResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTemplateResponseUnmarshaller {

	public static QueryTemplateResponse unmarshall(QueryTemplateResponse queryTemplateResponse, UnmarshallerContext _ctx) {
		
		queryTemplateResponse.setRequestId(_ctx.stringValue("QueryTemplateResponse.RequestId"));
		queryTemplateResponse.set_Class(_ctx.stringValue("QueryTemplateResponse.Class"));
		queryTemplateResponse.setErrorMessage(_ctx.stringValue("QueryTemplateResponse.ErrorMessage"));
		queryTemplateResponse.setSuccess(_ctx.booleanValue("QueryTemplateResponse.Success"));
		queryTemplateResponse.setResultCode(_ctx.stringValue("QueryTemplateResponse.ResultCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTemplateResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("QueryTemplateResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryTemplateResponse.Result["+ i +"].Name"));

			result.add(resultItem);
		}
		queryTemplateResponse.setResult(result);
	 
	 	return queryTemplateResponse;
	}
}