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

import com.aliyuncs.iot.model.v20180120.GisQueryDeviceLocationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GisQueryDeviceLocationResponseUnmarshaller {

	public static GisQueryDeviceLocationResponse unmarshall(GisQueryDeviceLocationResponse gisQueryDeviceLocationResponse, UnmarshallerContext _ctx) {
		
		gisQueryDeviceLocationResponse.setRequestId(_ctx.stringValue("GisQueryDeviceLocationResponse.RequestId"));
		gisQueryDeviceLocationResponse.setSuccess(_ctx.booleanValue("GisQueryDeviceLocationResponse.Success"));
		gisQueryDeviceLocationResponse.setCode(_ctx.stringValue("GisQueryDeviceLocationResponse.Code"));
		gisQueryDeviceLocationResponse.setErrorMessage(_ctx.stringValue("GisQueryDeviceLocationResponse.ErrorMessage"));
		gisQueryDeviceLocationResponse.setData(_ctx.mapValue("GisQueryDeviceLocationResponse.Data"));
	 
	 	return gisQueryDeviceLocationResponse;
	}
}