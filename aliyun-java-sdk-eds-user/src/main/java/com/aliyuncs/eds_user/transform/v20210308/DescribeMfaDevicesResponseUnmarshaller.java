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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeMfaDevicesResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeMfaDevicesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMfaDevicesResponseUnmarshaller {

	public static DescribeMfaDevicesResponse unmarshall(DescribeMfaDevicesResponse describeMfaDevicesResponse, UnmarshallerContext _ctx) {
		
		describeMfaDevicesResponse.setRequestId(_ctx.stringValue("DescribeMfaDevicesResponse.RequestId"));
		describeMfaDevicesResponse.setNextToken(_ctx.stringValue("DescribeMfaDevicesResponse.NextToken"));

		List<Data> mfaDevices = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMfaDevicesResponse.MfaDevices.Length"); i++) {
			Data data = new Data();
			data.setId(_ctx.longValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].Id"));
			data.setEndUserId(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].EndUserId"));
			data.setEmail(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].Email"));
			data.setGmtEnabled(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].GmtEnabled"));
			data.setGmtUnlock(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].GmtUnlock"));
			data.setConsecutiveFails(_ctx.integerValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].ConsecutiveFails"));
			data.setSerialNumber(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].SerialNumber"));
			data.setStatus(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].Status"));
			data.setDeviceType(_ctx.stringValue("DescribeMfaDevicesResponse.MfaDevices["+ i +"].DeviceType"));

			mfaDevices.add(data);
		}
		describeMfaDevicesResponse.setMfaDevices(mfaDevices);
	 
	 	return describeMfaDevicesResponse;
	}
}