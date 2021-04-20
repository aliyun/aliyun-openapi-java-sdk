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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.GetDeviceCaptureStrategyResponse;
import com.aliyuncs.vcs.model.v20200515.GetDeviceCaptureStrategyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceCaptureStrategyResponseUnmarshaller {

	public static GetDeviceCaptureStrategyResponse unmarshall(GetDeviceCaptureStrategyResponse getDeviceCaptureStrategyResponse, UnmarshallerContext _ctx) {
		
		getDeviceCaptureStrategyResponse.setRequestId(_ctx.stringValue("GetDeviceCaptureStrategyResponse.RequestId"));
		getDeviceCaptureStrategyResponse.setMessage(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Message"));
		getDeviceCaptureStrategyResponse.setCode(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Code"));

		Data data = new Data();
		data.setDeviceType(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.DeviceType"));
		data.setSundayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.SundayCaptureStrategy"));
		data.setMondayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.MondayCaptureStrategy"));
		data.setFridayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.FridayCaptureStrategy"));
		data.setTuesdayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.TuesdayCaptureStrategy"));
		data.setWednesdayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.WednesdayCaptureStrategy"));
		data.setDeviceCode(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.DeviceCode"));
		data.setThursdayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.ThursdayCaptureStrategy"));
		data.setSaturdayCaptureStrategy(_ctx.stringValue("GetDeviceCaptureStrategyResponse.Data.SaturdayCaptureStrategy"));
		getDeviceCaptureStrategyResponse.setData(data);
	 
	 	return getDeviceCaptureStrategyResponse;
	}
}