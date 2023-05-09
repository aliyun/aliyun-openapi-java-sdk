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

import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyDataResponse.Data.PropertyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceOriginalPropertyDataResponseUnmarshaller {

	public static QueryDeviceOriginalPropertyDataResponse unmarshall(QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyDataResponse, UnmarshallerContext _ctx) {
		
		queryDeviceOriginalPropertyDataResponse.setRequestId(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.RequestId"));
		queryDeviceOriginalPropertyDataResponse.setCode(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.Code"));
		queryDeviceOriginalPropertyDataResponse.setErrorMessage(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.ErrorMessage"));
		queryDeviceOriginalPropertyDataResponse.setSuccess(_ctx.booleanValue("QueryDeviceOriginalPropertyDataResponse.Success"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.Data.nextPageToken"));
		data.setNextValid(_ctx.booleanValue("QueryDeviceOriginalPropertyDataResponse.Data.NextValid"));

		List<PropertyInfo> list = new ArrayList<PropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceOriginalPropertyDataResponse.Data.List.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setValue(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.Data.List["+ i +"].Value"));
			propertyInfo.setTime(_ctx.stringValue("QueryDeviceOriginalPropertyDataResponse.Data.List["+ i +"].Time"));

			list.add(propertyInfo);
		}
		data.setList(list);
		queryDeviceOriginalPropertyDataResponse.setData(data);
	 
	 	return queryDeviceOriginalPropertyDataResponse;
	}
}