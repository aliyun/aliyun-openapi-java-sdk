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

import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalServiceDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalServiceDataResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceOriginalServiceDataResponse.Data.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceOriginalServiceDataResponseUnmarshaller {

	public static QueryDeviceOriginalServiceDataResponse unmarshall(QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceDataResponse, UnmarshallerContext _ctx) {
		
		queryDeviceOriginalServiceDataResponse.setRequestId(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.RequestId"));
		queryDeviceOriginalServiceDataResponse.setSuccess(_ctx.booleanValue("QueryDeviceOriginalServiceDataResponse.Success"));
		queryDeviceOriginalServiceDataResponse.setCode(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Code"));
		queryDeviceOriginalServiceDataResponse.setErrorMessage(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.ErrorMessage"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.NextPageToken"));
		data.setNextValid(_ctx.booleanValue("QueryDeviceOriginalServiceDataResponse.Data.NextValid"));

		List<ServiceInfo> list = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceOriginalServiceDataResponse.Data.List.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setTime(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.List["+ i +"].Time"));
			serviceInfo.setIdentifier(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.List["+ i +"].Identifier"));
			serviceInfo.setName(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.List["+ i +"].Name"));
			serviceInfo.setInputData(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.List["+ i +"].InputData"));
			serviceInfo.setOutputData(_ctx.stringValue("QueryDeviceOriginalServiceDataResponse.Data.List["+ i +"].OutputData"));

			list.add(serviceInfo);
		}
		data.setList(list);
		queryDeviceOriginalServiceDataResponse.setData(data);
	 
	 	return queryDeviceOriginalServiceDataResponse;
	}
}