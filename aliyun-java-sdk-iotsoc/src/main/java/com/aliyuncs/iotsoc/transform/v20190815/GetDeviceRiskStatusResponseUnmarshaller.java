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

import com.aliyuncs.iotsoc.model.v20190815.GetDeviceRiskStatusResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetDeviceRiskStatusResponse.Data;
import com.aliyuncs.iotsoc.model.v20190815.GetDeviceRiskStatusResponse.Data.Device;
import com.aliyuncs.iotsoc.model.v20190815.GetDeviceRiskStatusResponse.Data.RiskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceRiskStatusResponseUnmarshaller {

	public static GetDeviceRiskStatusResponse unmarshall(GetDeviceRiskStatusResponse getDeviceRiskStatusResponse, UnmarshallerContext _ctx) {
		
		getDeviceRiskStatusResponse.setRequestId(_ctx.stringValue("GetDeviceRiskStatusResponse.RequestId"));
		getDeviceRiskStatusResponse.setCode(_ctx.stringValue("GetDeviceRiskStatusResponse.Code"));

		Data data = new Data();
		data.setRiskLevel(_ctx.stringValue("GetDeviceRiskStatusResponse.Data.RiskLevel"));

		Device device = new Device();
		device.setProductKey(_ctx.stringValue("GetDeviceRiskStatusResponse.Data.Device.ProductKey"));
		device.setDeviceName(_ctx.stringValue("GetDeviceRiskStatusResponse.Data.Device.DeviceName"));
		data.setDevice(device);

		List<RiskInfo> riskInfoList = new ArrayList<RiskInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceRiskStatusResponse.Data.RiskInfoList.Length"); i++) {
			RiskInfo riskInfo = new RiskInfo();
			riskInfo.setRiskName(_ctx.stringValue("GetDeviceRiskStatusResponse.Data.RiskInfoList["+ i +"].RiskName"));
			riskInfo.setDescription(_ctx.stringValue("GetDeviceRiskStatusResponse.Data.RiskInfoList["+ i +"].Description"));
			riskInfo.setScore(_ctx.integerValue("GetDeviceRiskStatusResponse.Data.RiskInfoList["+ i +"].Score"));

			riskInfoList.add(riskInfo);
		}
		data.setRiskInfoList(riskInfoList);
		getDeviceRiskStatusResponse.setData(data);
	 
	 	return getDeviceRiskStatusResponse;
	}
}