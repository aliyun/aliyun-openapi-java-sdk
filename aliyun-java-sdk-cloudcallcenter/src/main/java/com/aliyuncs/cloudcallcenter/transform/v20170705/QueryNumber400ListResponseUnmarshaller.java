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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400ListResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400ListResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400ListResponse.Data.Number;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumber400ListResponseUnmarshaller {

	public static QueryNumber400ListResponse unmarshall(QueryNumber400ListResponse queryNumber400ListResponse, UnmarshallerContext context) {
		
		queryNumber400ListResponse.setRequestId(context.stringValue("QueryNumber400ListResponse.RequestId"));
		queryNumber400ListResponse.setSuccess(context.booleanValue("QueryNumber400ListResponse.Success"));
		queryNumber400ListResponse.setCode(context.stringValue("QueryNumber400ListResponse.Code"));
		queryNumber400ListResponse.setMessage(context.stringValue("QueryNumber400ListResponse.Message"));
		queryNumber400ListResponse.setHttpStatusCode(context.integerValue("QueryNumber400ListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setMonthlyPrice(context.integerValue("QueryNumber400ListResponse.Data.MonthlyPrice"));

		List<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < context.lengthValue("QueryNumber400ListResponse.Data.Numbers.Length"); i++) {
			Number number = new Number();
			number.setNumber(context.stringValue("QueryNumber400ListResponse.Data.Numbers["+ i +"].Number"));
			number.setSignature(context.stringValue("QueryNumber400ListResponse.Data.Numbers["+ i +"].Signature"));

			numbers.add(number);
		}
		data.setNumbers(numbers);
		queryNumber400ListResponse.setData(data);
	 
	 	return queryNumber400ListResponse;
	}
}