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

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryRandomNumbersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryRandomNumbersResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryRandomNumbersResponse.Data.Number;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRandomNumbersResponseUnmarshaller {

	public static QueryRandomNumbersResponse unmarshall(QueryRandomNumbersResponse queryRandomNumbersResponse, UnmarshallerContext context) {
		
		queryRandomNumbersResponse.setRequestId(context.stringValue("QueryRandomNumbersResponse.RequestId"));
		queryRandomNumbersResponse.setSuccess(context.booleanValue("QueryRandomNumbersResponse.Success"));
		queryRandomNumbersResponse.setCode(context.stringValue("QueryRandomNumbersResponse.Code"));
		queryRandomNumbersResponse.setMessage(context.stringValue("QueryRandomNumbersResponse.Message"));
		queryRandomNumbersResponse.setHttpStatusCode(context.integerValue("QueryRandomNumbersResponse.HttpStatusCode"));

		Data data = new Data();
		data.setMonthlyPrice(context.integerValue("QueryRandomNumbersResponse.Data.MonthlyPrice"));

		List<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < context.lengthValue("QueryRandomNumbersResponse.Data.Numbers.Length"); i++) {
			Number number = new Number();
			number.setNumber(context.stringValue("QueryRandomNumbersResponse.Data.Numbers["+ i +"].Number"));
			number.setSignature(context.stringValue("QueryRandomNumbersResponse.Data.Numbers["+ i +"].Signature"));

			numbers.add(number);
		}
		data.setNumbers(numbers);
		queryRandomNumbersResponse.setData(data);
	 
	 	return queryRandomNumbersResponse;
	}
}