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

import com.aliyuncs.iot.model.v20180120.QueryDeviceServiceDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceServiceDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceServiceDataResponse.Data.ServiceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceServiceDataResponseUnmarshaller {

	public static QueryDeviceServiceDataResponse unmarshall(QueryDeviceServiceDataResponse queryDeviceServiceDataResponse, UnmarshallerContext context) {
		
		queryDeviceServiceDataResponse.setRequestId(context.stringValue("QueryDeviceServiceDataResponse.RequestId"));
		queryDeviceServiceDataResponse.setSuccess(context.booleanValue("QueryDeviceServiceDataResponse.Success"));
		queryDeviceServiceDataResponse.setCode(context.stringValue("QueryDeviceServiceDataResponse.Code"));
		queryDeviceServiceDataResponse.setErrorMessage(context.stringValue("QueryDeviceServiceDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextTime(context.longValue("QueryDeviceServiceDataResponse.Data.NextTime"));
		data.setNextValid(context.booleanValue("QueryDeviceServiceDataResponse.Data.NextValid"));

		List<ServiceInfo> list = new ArrayList<ServiceInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceServiceDataResponse.Data.List.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setTime(context.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Time"));
			serviceInfo.setIdentifier(context.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Identifier"));
			serviceInfo.setName(context.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Name"));
			serviceInfo.setInputData(context.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].InputData"));
			serviceInfo.setOutputData(context.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].OutputData"));

			list.add(serviceInfo);
		}
		data.setList(list);
		queryDeviceServiceDataResponse.setData(data);
	 
	 	return queryDeviceServiceDataResponse;
	}
}