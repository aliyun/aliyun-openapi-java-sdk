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

import com.aliyuncs.bssopenapi.model.v20171214.QueryResellerUserAlarmThresholdResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryResellerUserAlarmThresholdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResellerUserAlarmThresholdResponseUnmarshaller {

	public static QueryResellerUserAlarmThresholdResponse unmarshall(QueryResellerUserAlarmThresholdResponse queryResellerUserAlarmThresholdResponse, UnmarshallerContext _ctx) {
		
		queryResellerUserAlarmThresholdResponse.setRequestId(_ctx.stringValue("QueryResellerUserAlarmThresholdResponse.RequestId"));
		queryResellerUserAlarmThresholdResponse.setCount(_ctx.integerValue("QueryResellerUserAlarmThresholdResponse.Count"));
		queryResellerUserAlarmThresholdResponse.setSuccess(_ctx.booleanValue("QueryResellerUserAlarmThresholdResponse.Success"));
		queryResellerUserAlarmThresholdResponse.setCode(_ctx.stringValue("QueryResellerUserAlarmThresholdResponse.Code"));
		queryResellerUserAlarmThresholdResponse.setMessage(_ctx.stringValue("QueryResellerUserAlarmThresholdResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryResellerUserAlarmThresholdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setThresholdType(_ctx.integerValue("QueryResellerUserAlarmThresholdResponse.Data["+ i +"].ThresholdType"));
			dataItem.setThresholdAmount(_ctx.stringValue("QueryResellerUserAlarmThresholdResponse.Data["+ i +"].ThresholdAmount"));
			dataItem.setNumerator(_ctx.integerValue("QueryResellerUserAlarmThresholdResponse.Data["+ i +"].Numerator"));
			dataItem.setDenominator(_ctx.integerValue("QueryResellerUserAlarmThresholdResponse.Data["+ i +"].Denominator"));

			data.add(dataItem);
		}
		queryResellerUserAlarmThresholdResponse.setData(data);
	 
	 	return queryResellerUserAlarmThresholdResponse;
	}
}