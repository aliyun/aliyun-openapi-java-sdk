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

import com.aliyuncs.iot.model.v20180120.GetSpeechDeviceDetailResponse;
import com.aliyuncs.iot.model.v20180120.GetSpeechDeviceDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechDeviceDetailResponseUnmarshaller {

	public static GetSpeechDeviceDetailResponse unmarshall(GetSpeechDeviceDetailResponse getSpeechDeviceDetailResponse, UnmarshallerContext _ctx) {
		
		getSpeechDeviceDetailResponse.setRequestId(_ctx.stringValue("GetSpeechDeviceDetailResponse.RequestId"));
		getSpeechDeviceDetailResponse.setSuccess(_ctx.booleanValue("GetSpeechDeviceDetailResponse.Success"));
		getSpeechDeviceDetailResponse.setCode(_ctx.stringValue("GetSpeechDeviceDetailResponse.Code"));
		getSpeechDeviceDetailResponse.setErrorMessage(_ctx.stringValue("GetSpeechDeviceDetailResponse.ErrorMessage"));

		Data data = new Data();
		data.setProductKey(_ctx.stringValue("GetSpeechDeviceDetailResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("GetSpeechDeviceDetailResponse.Data.DeviceName"));
		data.setIotId(_ctx.stringValue("GetSpeechDeviceDetailResponse.Data.IotId"));
		data.setStatus(_ctx.stringValue("GetSpeechDeviceDetailResponse.Data.Status"));
		data.setAvailableSpace(_ctx.floatValue("GetSpeechDeviceDetailResponse.Data.AvailableSpace"));
		data.setTotalSpace(_ctx.floatValue("GetSpeechDeviceDetailResponse.Data.TotalSpace"));
		data.setSpeechListUpdateTime(_ctx.longValue("GetSpeechDeviceDetailResponse.Data.SpeechListUpdateTime"));
		getSpeechDeviceDetailResponse.setData(data);
	 
	 	return getSpeechDeviceDetailResponse;
	}
}