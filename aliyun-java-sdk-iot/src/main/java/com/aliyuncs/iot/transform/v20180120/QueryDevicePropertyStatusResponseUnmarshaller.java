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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropertyStatusResponseUnmarshaller {

	public static QueryDevicePropertyStatusResponse unmarshall(QueryDevicePropertyStatusResponse queryDevicePropertyStatusResponse, UnmarshallerContext context) {
		
		queryDevicePropertyStatusResponse.setRequestId(context.stringValue("QueryDevicePropertyStatusResponse.RequestId"));
		queryDevicePropertyStatusResponse.setSuccess(context.booleanValue("QueryDevicePropertyStatusResponse.Success"));
		queryDevicePropertyStatusResponse.setCode(context.stringValue("QueryDevicePropertyStatusResponse.Code"));
		queryDevicePropertyStatusResponse.setErrorMessage(context.stringValue("QueryDevicePropertyStatusResponse.ErrorMessage"));

		Data data = new Data();

		List<PropertyStatusInfo> list = new ArrayList<PropertyStatusInfo>();
		for (int i = 0; i < context.lengthValue("QueryDevicePropertyStatusResponse.Data.List.Length"); i++) {
			PropertyStatusInfo propertyStatusInfo = new PropertyStatusInfo();
			propertyStatusInfo.setUnit(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Unit"));
			propertyStatusInfo.setIdentifier(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Identifier"));
			propertyStatusInfo.setDataType(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].DataType"));
			propertyStatusInfo.setTime(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Time"));
			propertyStatusInfo.setValue(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Value"));
			propertyStatusInfo.setName(context.stringValue("QueryDevicePropertyStatusResponse.Data.List["+ i +"].Name"));

			list.add(propertyStatusInfo);
		}
		data.setList(list);
		queryDevicePropertyStatusResponse.setData(data);
	 
	 	return queryDevicePropertyStatusResponse;
	}
}