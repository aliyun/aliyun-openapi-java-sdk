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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.GetDeviceCertificateResponse;
import com.aliyuncs.onsmqtt.model.v20200420.GetDeviceCertificateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceCertificateResponseUnmarshaller {

	public static GetDeviceCertificateResponse unmarshall(GetDeviceCertificateResponse getDeviceCertificateResponse, UnmarshallerContext _ctx) {
		
		getDeviceCertificateResponse.setRequestId(_ctx.stringValue("GetDeviceCertificateResponse.RequestId"));

		Data data = new Data();
		data.setValidBegin(_ctx.stringValue("GetDeviceCertificateResponse.Data.ValidBegin"));
		data.setValidEnd(_ctx.stringValue("GetDeviceCertificateResponse.Data.ValidEnd"));
		data.setDeviceSn(_ctx.stringValue("GetDeviceCertificateResponse.Data.DeviceSn"));
		data.setDeviceName(_ctx.stringValue("GetDeviceCertificateResponse.Data.DeviceName"));
		data.setDeviceContent(_ctx.stringValue("GetDeviceCertificateResponse.Data.DeviceContent"));
		data.setCaSn(_ctx.stringValue("GetDeviceCertificateResponse.Data.CaSn"));
		data.setStatus(_ctx.stringValue("GetDeviceCertificateResponse.Data.Status"));
		getDeviceCertificateResponse.setData(data);
	 
	 	return getDeviceCertificateResponse;
	}
}