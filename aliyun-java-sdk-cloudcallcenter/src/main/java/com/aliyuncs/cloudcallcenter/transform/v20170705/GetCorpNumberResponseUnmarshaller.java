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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCorpNumberResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCorpNumberResponse.Number;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCorpNumberResponseUnmarshaller {

	public static GetCorpNumberResponse unmarshall(GetCorpNumberResponse getCorpNumberResponse, UnmarshallerContext context) {
		
		getCorpNumberResponse.setRequestId(context.stringValue("GetCorpNumberResponse.RequestId"));
		getCorpNumberResponse.setSuccess(context.booleanValue("GetCorpNumberResponse.Success"));
		getCorpNumberResponse.setCode(context.stringValue("GetCorpNumberResponse.Code"));
		getCorpNumberResponse.setMessage(context.stringValue("GetCorpNumberResponse.Message"));
		getCorpNumberResponse.setHttpStatusCode(context.integerValue("GetCorpNumberResponse.HttpStatusCode"));

		List<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < context.lengthValue("GetCorpNumberResponse.Numbers.Length"); i++) {
			Number number = new Number();
			number.setTaobaoUid(context.longValue("GetCorpNumberResponse.Numbers["+ i +"].taobaoUid"));
			number.setRamId(context.longValue("GetCorpNumberResponse.Numbers["+ i +"].ramId"));
			number.setRealNameInsId(context.longValue("GetCorpNumberResponse.Numbers["+ i +"].realNameInsId"));
			number.setNumber(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].Number"));
			number.setRegionNameProvince(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].regionNameProvince"));
			number.setRegionNameCity(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].regionNameCity"));
			number.setCorpName(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].corpName"));
			number.setMonthlyPrice(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].monthlyPrice"));
			number.setNumber1(context.stringValue("GetCorpNumberResponse.Numbers["+ i +"].Number"));

			numbers.add(number);
		}
		getCorpNumberResponse.setNumbers(numbers);
	 
	 	return getCorpNumberResponse;
	}
}