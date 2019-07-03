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

import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyStatusResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertyStatusResponse.Data.PropertyStatusInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropertyStatusResponseUnmarshaller {

	public static QueryDevicePropertyStatusResponse unmarshall(QueryDevicePropertyStatusResponse queryDevicePropertyStatusResponse, UnmarshallerContext _ctx) {
		
		queryDevicePropertyStatusResponse.setRequestId(_ctx.stringValue("QueryDevicePropertyStatusResponse.RequestId"));
		queryDevicePropertyStatusResponse.setSuccess(_ctx.booleanValue("QueryDevicePropertyStatusResponse.Success"));
		queryDevicePropertyStatusResponse.setCode(_ctx.stringValue("QueryDevicePropertyStatusResponse.Code"));
		queryDevicePropertyStatusResponse.setErrorMessage(_ctx.stringValue("QueryDevicePropertyStatusResponse.ErrorMessage"));

		Data data = new Data();

		List<PropertyStatusInfo> list = new ArrayList<PropertyStatusInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicePropertyStatusResponse.Data.List.Length"); i++) {
			PropertyStatusInfo propertyStatusInfo = new PropertyStatusInfo();
			propertyStatusInfo.setUnit(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Unit"));
			propertyStatusInfo.setIdentifier(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Identifier"));
			propertyStatusInfo.setDataType(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].DataType"));
			propertyStatusInfo.setTime(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Time"));
			propertyStatusInfo.setValue(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Value"));
			propertyStatusInfo.setName(_ctx.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Name"));

			list.add(propertyStatusInfo);
		}
		data.setList(list);
		queryDevicePropertyStatusResponse.setData(data);
	 
	 	return queryDevicePropertyStatusResponse;
	}
}