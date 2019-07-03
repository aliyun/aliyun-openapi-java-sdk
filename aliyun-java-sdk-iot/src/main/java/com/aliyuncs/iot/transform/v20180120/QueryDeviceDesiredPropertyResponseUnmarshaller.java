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

	public static QueryDeviceDesiredPropertyResponse unmarshall(QueryDeviceDesiredPropertyResponse queryDeviceDesiredPropertyResponse, UnmarshallerContext _ctx) {
		
		queryDeviceDesiredPropertyResponse.setRequestId(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.RequestId"));
		queryDeviceDesiredPropertyResponse.setSuccess(_ctx.booleanValue("QueryDeviceDesiredPropertyResponse.Success"));
		queryDeviceDesiredPropertyResponse.setCode(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Code"));
		queryDeviceDesiredPropertyResponse.setErrorMessage(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.ErrorMessage"));

		Data data = new Data();

		List<DesiredPropertyInfo> list = new ArrayList<DesiredPropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceDesiredPropertyResponse.Data.List.Length"); i++) {
			DesiredPropertyInfo desiredPropertyInfo = new DesiredPropertyInfo();
			desiredPropertyInfo.setUnit(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Unit"));
			desiredPropertyInfo.setIdentifier(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Identifier"));
			desiredPropertyInfo.setDataType(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].DataType"));
			desiredPropertyInfo.setTime(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Time"));
			desiredPropertyInfo.setValue(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Value"));
			desiredPropertyInfo.setName(_ctx.stringValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Name"));
			desiredPropertyInfo.setVersion(_ctx.longValue("QueryDeviceDesiredPropertyResponse.Data.List["+ i +"].Version"));

			list.add(desiredPropertyInfo);
		}
		data.setList(list);
		queryDeviceDesiredPropertyResponse.setData(data);
	 
	 	return queryDeviceDesiredPropertyResponse;
	}
}