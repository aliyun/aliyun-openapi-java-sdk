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

import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyStatusResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalPropertyStatusResponse.Data.PropertyStatusDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceOriginalPropertyStatusResponseUnmarshaller {

	public static QueryDeviceOriginalPropertyStatusResponse unmarshall(QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatusResponse, UnmarshallerContext _ctx) {
		
		queryDeviceOriginalPropertyStatusResponse.setRequestId(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.RequestId"));
		queryDeviceOriginalPropertyStatusResponse.setSuccess(_ctx.booleanValue("QueryDeviceOriginalPropertyStatusResponse.Success"));
		queryDeviceOriginalPropertyStatusResponse.setCode(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.Code"));
		queryDeviceOriginalPropertyStatusResponse.setErrorMessage(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextValid(_ctx.booleanValue("QueryDeviceOriginalPropertyStatusResponse.Data.NextValid"));
		data.setNextPageToken(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.Data.NextPageToken"));

		List<PropertyStatusDataInfo> list = new ArrayList<PropertyStatusDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceOriginalPropertyStatusResponse.Data.List.Length"); i++) {
			PropertyStatusDataInfo propertyStatusDataInfo = new PropertyStatusDataInfo();
			propertyStatusDataInfo.setIdentifier(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.Data.List["+ i +"].Identifier"));
			propertyStatusDataInfo.setValue(_ctx.stringValue("QueryDeviceOriginalPropertyStatusResponse.Data.List["+ i +"].Value"));
			propertyStatusDataInfo.setTime(_ctx.longValue("QueryDeviceOriginalPropertyStatusResponse.Data.List["+ i +"].Time"));

			list.add(propertyStatusDataInfo);
		}
		data.setList(list);
		queryDeviceOriginalPropertyStatusResponse.setData(data);
	 
	 	return queryDeviceOriginalPropertyStatusResponse;
	}
}