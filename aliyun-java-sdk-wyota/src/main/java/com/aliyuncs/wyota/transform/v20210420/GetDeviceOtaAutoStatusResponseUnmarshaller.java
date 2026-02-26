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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaAutoStatusResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaAutoStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceOtaAutoStatusResponseUnmarshaller {

	public static GetDeviceOtaAutoStatusResponse unmarshall(GetDeviceOtaAutoStatusResponse getDeviceOtaAutoStatusResponse, UnmarshallerContext _ctx) {
		
		getDeviceOtaAutoStatusResponse.setRequestId(_ctx.stringValue("GetDeviceOtaAutoStatusResponse.RequestId"));
		getDeviceOtaAutoStatusResponse.setCode(_ctx.stringValue("GetDeviceOtaAutoStatusResponse.Code"));
		getDeviceOtaAutoStatusResponse.setMessage(_ctx.stringValue("GetDeviceOtaAutoStatusResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetDeviceOtaAutoStatusResponse.Data.Status"));
		data.setForceUpgrade(_ctx.integerValue("GetDeviceOtaAutoStatusResponse.Data.ForceUpgrade"));
		data.setAutoUpdate(_ctx.integerValue("GetDeviceOtaAutoStatusResponse.Data.AutoUpdate"));
		data.setAutoUpdateTimeSchedule(_ctx.stringValue("GetDeviceOtaAutoStatusResponse.Data.AutoUpdateTimeSchedule"));
		getDeviceOtaAutoStatusResponse.setData(data);
	 
	 	return getDeviceOtaAutoStatusResponse;
	}
}