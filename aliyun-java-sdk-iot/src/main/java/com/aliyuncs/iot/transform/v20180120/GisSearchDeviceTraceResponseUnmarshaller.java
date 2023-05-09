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

import com.aliyuncs.iot.model.v20180120.GisSearchDeviceTraceResponse;
import com.aliyuncs.iot.model.v20180120.GisSearchDeviceTraceResponse.Data;
import com.aliyuncs.iot.model.v20180120.GisSearchDeviceTraceResponse.Data.PointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GisSearchDeviceTraceResponseUnmarshaller {

	public static GisSearchDeviceTraceResponse unmarshall(GisSearchDeviceTraceResponse gisSearchDeviceTraceResponse, UnmarshallerContext _ctx) {
		
		gisSearchDeviceTraceResponse.setRequestId(_ctx.stringValue("GisSearchDeviceTraceResponse.RequestId"));
		gisSearchDeviceTraceResponse.setCode(_ctx.stringValue("GisSearchDeviceTraceResponse.Code"));
		gisSearchDeviceTraceResponse.setErrorMessage(_ctx.stringValue("GisSearchDeviceTraceResponse.ErrorMessage"));
		gisSearchDeviceTraceResponse.setSuccess(_ctx.booleanValue("GisSearchDeviceTraceResponse.Success"));

		Data data = new Data();
		data.setDeviceName(_ctx.stringValue("GisSearchDeviceTraceResponse.Data.DeviceName"));
		data.setProductKey(_ctx.stringValue("GisSearchDeviceTraceResponse.Data.ProductKey"));

		List<PointsItem> points = new ArrayList<PointsItem>();
		for (int i = 0; i < _ctx.lengthValue("GisSearchDeviceTraceResponse.Data.Points.Length"); i++) {
			PointsItem pointsItem = new PointsItem();
			pointsItem.setLocateTime(_ctx.longValue("GisSearchDeviceTraceResponse.Data.Points["+ i +"].LocateTime"));
			pointsItem.setLocation(_ctx.stringValue("GisSearchDeviceTraceResponse.Data.Points["+ i +"].Location"));

			points.add(pointsItem);
		}
		data.setPoints(points);
		gisSearchDeviceTraceResponse.setData(data);
	 
	 	return gisSearchDeviceTraceResponse;
	}
}