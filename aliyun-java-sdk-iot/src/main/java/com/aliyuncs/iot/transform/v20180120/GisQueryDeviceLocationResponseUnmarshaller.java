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

import com.aliyuncs.iot.model.v20180120.GisQueryDeviceLocationResponse;
import com.aliyuncs.iot.model.v20180120.GisQueryDeviceLocationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GisQueryDeviceLocationResponseUnmarshaller {

	public static GisQueryDeviceLocationResponse unmarshall(GisQueryDeviceLocationResponse gisQueryDeviceLocationResponse, UnmarshallerContext _ctx) {
		
		gisQueryDeviceLocationResponse.setRequestId(_ctx.stringValue("GisQueryDeviceLocationResponse.RequestId"));
		gisQueryDeviceLocationResponse.setSuccess(_ctx.booleanValue("GisQueryDeviceLocationResponse.Success"));
		gisQueryDeviceLocationResponse.setCode(_ctx.stringValue("GisQueryDeviceLocationResponse.Code"));
		gisQueryDeviceLocationResponse.setErrorMessage(_ctx.stringValue("GisQueryDeviceLocationResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GisQueryDeviceLocationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProductKey(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].ProductKey"));
			dataItem.setDeviceName(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].DeviceName"));
			dataItem.setIp(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].Ip"));
			dataItem.setCountry(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].Country"));
			dataItem.setProvince(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].Province"));
			dataItem.setCity(_ctx.stringValue("GisQueryDeviceLocationResponse.Data["+ i +"].City"));
			dataItem.setLongitude(_ctx.floatValue("GisQueryDeviceLocationResponse.Data["+ i +"].Longitude"));
			dataItem.setLatitude(_ctx.floatValue("GisQueryDeviceLocationResponse.Data["+ i +"].Latitude"));
			dataItem.setCoordinateSystem(_ctx.integerValue("GisQueryDeviceLocationResponse.Data["+ i +"].CoordinateSystem"));
			dataItem.setAdcode(_ctx.longValue("GisQueryDeviceLocationResponse.Data["+ i +"].Adcode"));

			data.add(dataItem);
		}
		gisQueryDeviceLocationResponse.setData(data);
	 
	 	return gisQueryDeviceLocationResponse;
	}
}