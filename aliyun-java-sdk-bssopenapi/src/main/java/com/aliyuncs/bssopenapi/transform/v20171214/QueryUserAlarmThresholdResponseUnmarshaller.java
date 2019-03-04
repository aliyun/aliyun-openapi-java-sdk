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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryUserAlarmThresholdResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryUserAlarmThresholdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserAlarmThresholdResponseUnmarshaller {

	public static QueryUserAlarmThresholdResponse unmarshall(QueryUserAlarmThresholdResponse queryUserAlarmThresholdResponse, UnmarshallerContext context) {
		
		queryUserAlarmThresholdResponse.setRequestId(context.stringValue("QueryUserAlarmThresholdResponse.RequestId"));
		queryUserAlarmThresholdResponse.setCode(context.stringValue("QueryUserAlarmThresholdResponse.Code"));
		queryUserAlarmThresholdResponse.setMessage(context.stringValue("QueryUserAlarmThresholdResponse.Message"));
		queryUserAlarmThresholdResponse.setSuccess(context.booleanValue("QueryUserAlarmThresholdResponse.Success"));
		queryUserAlarmThresholdResponse.setCount(context.integerValue("QueryUserAlarmThresholdResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("QueryUserAlarmThresholdResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setThresholdAmount(context.stringValue("QueryUserAlarmThresholdResponse.Datas["+ i +"].ThresholdAmount"));
			data.setNumerator(context.integerValue("QueryUserAlarmThresholdResponse.Datas["+ i +"].Numerator"));
			data.setDenominator(context.integerValue("QueryUserAlarmThresholdResponse.Datas["+ i +"].Denominator"));
			data.setThresholdType(context.integerValue("QueryUserAlarmThresholdResponse.Datas["+ i +"].ThresholdType"));

			datas.add(data);
		}
		queryUserAlarmThresholdResponse.setDatas(datas);
	 
	 	return queryUserAlarmThresholdResponse;
	}
}