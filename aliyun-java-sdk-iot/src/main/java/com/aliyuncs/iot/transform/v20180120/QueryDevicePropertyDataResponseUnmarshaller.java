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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropertyDataResponseUnmarshaller {

	public static QueryDevicePropertyDataResponse unmarshall(QueryDevicePropertyDataResponse queryDevicePropertyDataResponse, UnmarshallerContext context) {
		
		queryDevicePropertyDataResponse.setRequestId(context.stringValue("QueryDevicePropertyDataResponse.RequestId"));
		queryDevicePropertyDataResponse.setSuccess(context.booleanValue("QueryDevicePropertyDataResponse.Success"));
		queryDevicePropertyDataResponse.setCode(context.stringValue("QueryDevicePropertyDataResponse.Code"));
		queryDevicePropertyDataResponse.setErrorMessage(context.stringValue("QueryDevicePropertyDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextValid(context.booleanValue("QueryDevicePropertyDataResponse.Data.NextValid"));
		data.setNextTime(context.longValue("QueryDevicePropertyDataResponse.Data.NextTime"));

		List<PropertyInfo> list = new ArrayList<PropertyInfo>();
		for (int i = 0; i < context.lengthValue("QueryDevicePropertyDataResponse.Data.List.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setTime(context.stringValue("QueryDevicePropertyDataResponse.Data.List["+ i +"].Time"));
			propertyInfo.setValue(context.stringValue("QueryDevicePropertyDataResponse.Data.List["+ i +"].Value"));

			list.add(propertyInfo);
		}
		data.setList(list);
		queryDevicePropertyDataResponse.setData(data);
	 
	 	return queryDevicePropertyDataResponse;
	}
}