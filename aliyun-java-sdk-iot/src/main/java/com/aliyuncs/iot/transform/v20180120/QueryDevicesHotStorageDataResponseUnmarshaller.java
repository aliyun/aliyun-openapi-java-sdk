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

import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataResponse.Data.PropertyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicesHotStorageDataResponseUnmarshaller {

	public static QueryDevicesHotStorageDataResponse unmarshall(QueryDevicesHotStorageDataResponse queryDevicesHotStorageDataResponse, UnmarshallerContext _ctx) {
		
		queryDevicesHotStorageDataResponse.setRequestId(_ctx.stringValue("QueryDevicesHotStorageDataResponse.RequestId"));
		queryDevicesHotStorageDataResponse.setCode(_ctx.stringValue("QueryDevicesHotStorageDataResponse.Code"));
		queryDevicesHotStorageDataResponse.setErrorMessage(_ctx.stringValue("QueryDevicesHotStorageDataResponse.ErrorMessage"));
		queryDevicesHotStorageDataResponse.setSuccess(_ctx.booleanValue("QueryDevicesHotStorageDataResponse.Success"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("QueryDevicesHotStorageDataResponse.Data.nextPageToken"));
		data.setNextValid(_ctx.booleanValue("QueryDevicesHotStorageDataResponse.Data.NextValid"));

		List<PropertyInfo> list = new ArrayList<PropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicesHotStorageDataResponse.Data.List.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setValue(_ctx.stringValue("QueryDevicesHotStorageDataResponse.Data.List["+ i +"].Value"));
			propertyInfo.setTime(_ctx.stringValue("QueryDevicesHotStorageDataResponse.Data.List["+ i +"].Time"));

			list.add(propertyInfo);
		}
		data.setList(list);
		queryDevicesHotStorageDataResponse.setData(data);
	 
	 	return queryDevicesHotStorageDataResponse;
	}
}