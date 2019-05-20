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

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumbersOfMainAccountResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumbersOfMainAccountResponse.Number;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumbersOfMainAccountResponseUnmarshaller {

	public static QueryNumbersOfMainAccountResponse unmarshall(QueryNumbersOfMainAccountResponse queryNumbersOfMainAccountResponse, UnmarshallerContext context) {
		
		queryNumbersOfMainAccountResponse.setRequestId(context.stringValue("QueryNumbersOfMainAccountResponse.RequestId"));
		queryNumbersOfMainAccountResponse.setSuccess(context.booleanValue("QueryNumbersOfMainAccountResponse.Success"));
		queryNumbersOfMainAccountResponse.setCode(context.stringValue("QueryNumbersOfMainAccountResponse.Code"));
		queryNumbersOfMainAccountResponse.setMessage(context.stringValue("QueryNumbersOfMainAccountResponse.Message"));
		queryNumbersOfMainAccountResponse.setHttpStatusCode(context.integerValue("QueryNumbersOfMainAccountResponse.HttpStatusCode"));

		List<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < context.lengthValue("QueryNumbersOfMainAccountResponse.Numbers.Length"); i++) {
			Number number = new Number();
			number.setTaobaoUid(context.longValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].taobaoUid"));
			number.setRamId(context.longValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].RamId"));
			number.setRealNameInsId(context.longValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].RealNameInsId"));
			number.setNumber(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].Number"));
			number.setRegionNameProvince(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].RegionNameProvince"));
			number.setRegionNameCity(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].RegionNameCity"));
			number.setCorpName(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].CorpName"));
			number.setMonthlyPrice(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].MonthlyPrice"));
			number.setStatus(context.booleanValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].Status"));
			number.setGmtCreate(context.stringValue("QueryNumbersOfMainAccountResponse.Numbers["+ i +"].GmtCreate"));

			numbers.add(number);
		}
		queryNumbersOfMainAccountResponse.setNumbers(numbers);
	 
	 	return queryNumbersOfMainAccountResponse;
	}
}