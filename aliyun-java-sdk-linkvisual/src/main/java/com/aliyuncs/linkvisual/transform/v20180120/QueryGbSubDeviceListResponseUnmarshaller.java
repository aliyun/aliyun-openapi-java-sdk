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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryGbSubDeviceListResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryGbSubDeviceListResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryGbSubDeviceListResponse.Data.GbSubDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGbSubDeviceListResponseUnmarshaller {

	public static QueryGbSubDeviceListResponse unmarshall(QueryGbSubDeviceListResponse queryGbSubDeviceListResponse, UnmarshallerContext _ctx) {
		
		queryGbSubDeviceListResponse.setRequestId(_ctx.stringValue("QueryGbSubDeviceListResponse.RequestId"));
		queryGbSubDeviceListResponse.setCode(_ctx.stringValue("QueryGbSubDeviceListResponse.Code"));
		queryGbSubDeviceListResponse.setErrorMessage(_ctx.stringValue("QueryGbSubDeviceListResponse.ErrorMessage"));
		queryGbSubDeviceListResponse.setSuccess(_ctx.booleanValue("QueryGbSubDeviceListResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryGbSubDeviceListResponse.Data.Total"));

		List<GbSubDevice> gbSubDeviceList = new ArrayList<GbSubDevice>();
		for (int i = 0; i < _ctx.lengthValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList.Length"); i++) {
			GbSubDevice gbSubDevice = new GbSubDevice();
			gbSubDevice.setProductKey(_ctx.stringValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList["+ i +"].ProductKey"));
			gbSubDevice.setDeviceName(_ctx.stringValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList["+ i +"].DeviceName"));
			gbSubDevice.setDeviceId(_ctx.stringValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList["+ i +"].DeviceId"));
			gbSubDevice.setDeviceEnable(_ctx.integerValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList["+ i +"].DeviceEnable"));
			gbSubDevice.setIotId(_ctx.stringValue("QueryGbSubDeviceListResponse.Data.GbSubDeviceList["+ i +"].IotId"));

			gbSubDeviceList.add(gbSubDevice);
		}
		data.setGbSubDeviceList(gbSubDeviceList);
		queryGbSubDeviceListResponse.setData(data);
	 
	 	return queryGbSubDeviceListResponse;
	}
}