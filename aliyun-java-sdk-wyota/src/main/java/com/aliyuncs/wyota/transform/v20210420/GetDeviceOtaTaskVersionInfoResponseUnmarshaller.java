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

import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaTaskVersionInfoResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaTaskVersionInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceOtaTaskVersionInfoResponseUnmarshaller {

	public static GetDeviceOtaTaskVersionInfoResponse unmarshall(GetDeviceOtaTaskVersionInfoResponse getDeviceOtaTaskVersionInfoResponse, UnmarshallerContext _ctx) {
		
		getDeviceOtaTaskVersionInfoResponse.setRequestId(_ctx.stringValue("GetDeviceOtaTaskVersionInfoResponse.RequestId"));
		getDeviceOtaTaskVersionInfoResponse.setCode(_ctx.stringValue("GetDeviceOtaTaskVersionInfoResponse.Code"));
		getDeviceOtaTaskVersionInfoResponse.setMessage(_ctx.stringValue("GetDeviceOtaTaskVersionInfoResponse.Message"));

		Data data = new Data();
		data.setVersion(_ctx.stringValue("GetDeviceOtaTaskVersionInfoResponse.Data.Version"));
		data.setSize(_ctx.longValue("GetDeviceOtaTaskVersionInfoResponse.Data.Size"));
		data.setReleaseNote(_ctx.stringValue("GetDeviceOtaTaskVersionInfoResponse.Data.ReleaseNote"));
		getDeviceOtaTaskVersionInfoResponse.setData(data);
	 
	 	return getDeviceOtaTaskVersionInfoResponse;
	}
}