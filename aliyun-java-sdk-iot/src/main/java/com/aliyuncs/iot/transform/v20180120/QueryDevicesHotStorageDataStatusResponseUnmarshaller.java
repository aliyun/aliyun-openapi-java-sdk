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

import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataStatusResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDevicesHotStorageDataStatusResponse.Data.PropertyStatusDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicesHotStorageDataStatusResponseUnmarshaller {

	public static QueryDevicesHotStorageDataStatusResponse unmarshall(QueryDevicesHotStorageDataStatusResponse queryDevicesHotStorageDataStatusResponse, UnmarshallerContext _ctx) {
		
		queryDevicesHotStorageDataStatusResponse.setRequestId(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.RequestId"));
		queryDevicesHotStorageDataStatusResponse.setCode(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.Code"));
		queryDevicesHotStorageDataStatusResponse.setErrorMessage(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.ErrorMessage"));
		queryDevicesHotStorageDataStatusResponse.setSuccess(_ctx.booleanValue("QueryDevicesHotStorageDataStatusResponse.Success"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.Data.NextPageToken"));
		data.setNextValid(_ctx.booleanValue("QueryDevicesHotStorageDataStatusResponse.Data.NextValid"));

		List<PropertyStatusDataInfo> list = new ArrayList<PropertyStatusDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicesHotStorageDataStatusResponse.Data.List.Length"); i++) {
			PropertyStatusDataInfo propertyStatusDataInfo = new PropertyStatusDataInfo();
			propertyStatusDataInfo.setIdentifier(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.Data.List["+ i +"].Identifier"));
			propertyStatusDataInfo.setValue(_ctx.stringValue("QueryDevicesHotStorageDataStatusResponse.Data.List["+ i +"].Value"));
			propertyStatusDataInfo.setTime(_ctx.longValue("QueryDevicesHotStorageDataStatusResponse.Data.List["+ i +"].Time"));

			list.add(propertyStatusDataInfo);
		}
		data.setList(list);
		queryDevicesHotStorageDataStatusResponse.setData(data);
	 
	 	return queryDevicesHotStorageDataStatusResponse;
	}
}