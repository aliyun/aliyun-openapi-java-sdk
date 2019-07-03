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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceServiceDataResponseUnmarshaller {

	public static QueryDeviceServiceDataResponse unmarshall(QueryDeviceServiceDataResponse queryDeviceServiceDataResponse, UnmarshallerContext _ctx) {
		
		queryDeviceServiceDataResponse.setRequestId(_ctx.stringValue("QueryDeviceServiceDataResponse.RequestId"));
		queryDeviceServiceDataResponse.setSuccess(_ctx.booleanValue("QueryDeviceServiceDataResponse.Success"));
		queryDeviceServiceDataResponse.setCode(_ctx.stringValue("QueryDeviceServiceDataResponse.Code"));
		queryDeviceServiceDataResponse.setErrorMessage(_ctx.stringValue("QueryDeviceServiceDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextTime(_ctx.longValue("QueryDeviceServiceDataResponse.Data.NextTime"));
		data.setNextValid(_ctx.booleanValue("QueryDeviceServiceDataResponse.Data.NextValid"));

		List<ServiceInfo> list = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceServiceDataResponse.Data.List.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setTime(_ctx.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Time"));
			serviceInfo.setIdentifier(_ctx.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Identifier"));
			serviceInfo.setName(_ctx.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].Name"));
			serviceInfo.setInputData(_ctx.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].InputData"));
			serviceInfo.setOutputData(_ctx.stringValue("QueryDeviceServiceDataResponse.Data.List["+ i +"].OutputData"));

			list.add(serviceInfo);
		}
		data.setList(list);
		queryDeviceServiceDataResponse.setData(data);
	 
	 	return queryDeviceServiceDataResponse;
	}
}