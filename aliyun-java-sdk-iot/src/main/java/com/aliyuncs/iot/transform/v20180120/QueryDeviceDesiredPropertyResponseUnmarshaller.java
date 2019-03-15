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

import com.aliyuncs.iot.model.v20180120.QueryDeviceDesiredPropertyResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceDesiredPropertyResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceDesiredPropertyResponse.Data.DesiredPropertyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceDesiredPropertyResponseUnmarshaller {

	public static QueryDeviceDesiredPropertyResponse unmarshall(QueryDeviceDesiredPropertyResponse queryDeviceDesiredPropertyResponse, UnmarshallerContext context) {
		
		queryDeviceDesiredPropertyResponse.setRequestId(context.stringValue("QueryDeviceDesiredPropertyResponse.RequestId"));
		queryDeviceDesiredPropertyResponse.setSuccess(context.booleanValue("QueryDeviceDesiredPropertyResponse.Success"));
		queryDeviceDesiredPropertyResponse.setCode(context.stringValue("QueryDeviceDesiredPropertyResponse.Code"));
		queryDeviceDesiredPropertyResponse.setErrorMessage(context.stringValue("QueryDeviceDesiredPropertyResponse.ErrorMessage"));

		Data data = new Data();

		List<DesiredPropertyInfo> list = new ArrayList<DesiredPropertyInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceDesiredPropertyResponse.Data.List.Length"); i++) {
			DesiredPropertyInfo desiredPropertyInfo = new DesiredPropertyInfo();
			desiredPropertyInfo.setUnit(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Unit"));
			desiredPropertyInfo.setIdentifier(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Identifier"));
			desiredPropertyInfo.setDataType(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].DataType"));
			desiredPropertyInfo.setTime(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Time"));
			desiredPropertyInfo.setValue(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Value"));
			desiredPropertyInfo.setName(context.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Name"));
			desiredPropertyInfo.setVersion(context.longValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Version"));

			list.add(desiredPropertyInfo);
		}
		data.setList(list);
		queryDeviceDesiredPropertyResponse.setData(data);
	 
	 	return queryDeviceDesiredPropertyResponse;
	}
}