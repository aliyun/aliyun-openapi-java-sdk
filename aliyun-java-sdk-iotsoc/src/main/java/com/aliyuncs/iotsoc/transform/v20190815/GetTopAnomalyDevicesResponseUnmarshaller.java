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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetTopAnomalyDevicesResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetTopAnomalyDevicesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopAnomalyDevicesResponseUnmarshaller {

	public static GetTopAnomalyDevicesResponse unmarshall(GetTopAnomalyDevicesResponse getTopAnomalyDevicesResponse, UnmarshallerContext _ctx) {
		
		getTopAnomalyDevicesResponse.setRequestId(_ctx.stringValue("GetTopAnomalyDevicesResponse.RequestId"));
		getTopAnomalyDevicesResponse.setSuccess(_ctx.booleanValue("GetTopAnomalyDevicesResponse.Success"));
		getTopAnomalyDevicesResponse.setCode(_ctx.stringValue("GetTopAnomalyDevicesResponse.Code"));
		getTopAnomalyDevicesResponse.setMessage(_ctx.stringValue("GetTopAnomalyDevicesResponse.Message"));

		Data data = new Data();

		List<String> anomalies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopAnomalyDevicesResponse.Data.Anomalies.Length"); i++) {
			anomalies.add(_ctx.stringValue("GetTopAnomalyDevicesResponse.Data.Anomalies["+ i +"]"));
		}
		data.setAnomalies(anomalies);

		List<String> affectedDevices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopAnomalyDevicesResponse.Data.AffectedDevices.Length"); i++) {
			affectedDevices.add(_ctx.stringValue("GetTopAnomalyDevicesResponse.Data.AffectedDevices["+ i +"]"));
		}
		data.setAffectedDevices(affectedDevices);
		getTopAnomalyDevicesResponse.setData(data);
	 
	 	return getTopAnomalyDevicesResponse;
	}
}