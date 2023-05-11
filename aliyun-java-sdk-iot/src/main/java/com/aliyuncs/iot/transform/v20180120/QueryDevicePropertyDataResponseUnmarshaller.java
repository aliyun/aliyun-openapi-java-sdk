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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyDataResponse.Data.PropertyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropertyDataResponseUnmarshaller {

	public static QueryDevicePropertyDataResponse unmarshall(QueryDevicePropertyDataResponse queryDevicePropertyDataResponse, UnmarshallerContext _ctx) {
		
		queryDevicePropertyDataResponse.setRequestId(_ctx.stringValue("QueryDevicePropertyDataResponse.RequestId"));
		queryDevicePropertyDataResponse.setSuccess(_ctx.booleanValue("QueryDevicePropertyDataResponse.Success"));
		queryDevicePropertyDataResponse.setCode(_ctx.stringValue("QueryDevicePropertyDataResponse.Code"));
		queryDevicePropertyDataResponse.setErrorMessage(_ctx.stringValue("QueryDevicePropertyDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextValid(_ctx.booleanValue("QueryDevicePropertyDataResponse.Data.NextValid"));
		data.setNextTime(_ctx.longValue("QueryDevicePropertyDataResponse.Data.NextTime"));

		List<PropertyInfo> list = new ArrayList<PropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicePropertyDataResponse.Data.List.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setTime(_ctx.stringValue("QueryDevicePropertyDataResponse.Data.List["+ i +"].Time"));
			propertyInfo.setValue(_ctx.stringValue("QueryDevicePropertyDataResponse.Data.List["+ i +"].Value"));

			list.add(propertyInfo);
		}
		data.setList(list);
		queryDevicePropertyDataResponse.setData(data);
	 
	 	return queryDevicePropertyDataResponse;
	}
}