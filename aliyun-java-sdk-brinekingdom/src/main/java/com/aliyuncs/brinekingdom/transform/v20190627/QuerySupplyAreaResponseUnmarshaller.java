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

import com.aliyuncs.brinekingdom.model.v20190627.QuerySupplyAreaResponse;
import com.aliyuncs.brinekingdom.model.v20190627.QuerySupplyAreaResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySupplyAreaResponseUnmarshaller {

	public static QuerySupplyAreaResponse unmarshall(QuerySupplyAreaResponse querySupplyAreaResponse, UnmarshallerContext _ctx) {
		
		querySupplyAreaResponse.setRequestId(_ctx.stringValue("QuerySupplyAreaResponse.RequestId"));
		querySupplyAreaResponse.setMessage(_ctx.stringValue("QuerySupplyAreaResponse.Message"));
		querySupplyAreaResponse.setSuccess(_ctx.booleanValue("QuerySupplyAreaResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySupplyAreaResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setArea(_ctx.stringValue("QuerySupplyAreaResponse.Result["+ i +"].Area"));
			resultItem.set_Class(_ctx.stringValue("QuerySupplyAreaResponse.Result["+ i +"].Class"));
			resultItem.setCountry(_ctx.stringValue("QuerySupplyAreaResponse.Result["+ i +"].Country"));
			resultItem.setIdc(_ctx.stringValue("QuerySupplyAreaResponse.Result["+ i +"].Idc"));

			result.add(resultItem);
		}
		querySupplyAreaResponse.setResult(result);
	 
	 	return querySupplyAreaResponse;
	}
}