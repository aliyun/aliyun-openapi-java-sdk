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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.DescribeSAGDeviceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSAGDeviceInfoResponseUnmarshaller {

	public static DescribeSAGDeviceInfoResponse unmarshall(DescribeSAGDeviceInfoResponse describeSAGDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeSAGDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeSAGDeviceInfoResponse.RequestId"));
		describeSAGDeviceInfoResponse.setServiceIP(_ctx.stringValue("DescribeSAGDeviceInfoResponse.ServiceIP"));
		describeSAGDeviceInfoResponse.setControllerState(_ctx.stringValue("DescribeSAGDeviceInfoResponse.ControllerState"));
		describeSAGDeviceInfoResponse.setSynStatus(_ctx.stringValue("DescribeSAGDeviceInfoResponse.SynStatus"));
		describeSAGDeviceInfoResponse.setSmartAGType(_ctx.stringValue("DescribeSAGDeviceInfoResponse.SmartAGType"));
		describeSAGDeviceInfoResponse.setVersion(_ctx.stringValue("DescribeSAGDeviceInfoResponse.Version"));
		describeSAGDeviceInfoResponse.setVpnState(_ctx.stringValue("DescribeSAGDeviceInfoResponse.VpnState"));
		describeSAGDeviceInfoResponse.setStartupTime(_ctx.stringValue("DescribeSAGDeviceInfoResponse.StartupTime"));
		describeSAGDeviceInfoResponse.setLastConnectedControllerTime(_ctx.stringValue("DescribeSAGDeviceInfoResponse.LastConnectedControllerTime"));
		describeSAGDeviceInfoResponse.setResettableStatus(_ctx.stringValue("DescribeSAGDeviceInfoResponse.ResettableStatus"));
	 
	 	return describeSAGDeviceInfoResponse;
	}
}