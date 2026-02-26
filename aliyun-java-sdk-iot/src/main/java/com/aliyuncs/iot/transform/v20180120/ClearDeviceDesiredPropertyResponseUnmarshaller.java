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

import com.aliyuncs.iot.model.v20180120.ClearDeviceDesiredPropertyResponse;
import com.aliyuncs.iot.model.v20180120.ClearDeviceDesiredPropertyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClearDeviceDesiredPropertyResponseUnmarshaller {

	public static ClearDeviceDesiredPropertyResponse unmarshall(ClearDeviceDesiredPropertyResponse clearDeviceDesiredPropertyResponse, UnmarshallerContext _ctx) {
		
		clearDeviceDesiredPropertyResponse.setRequestId(_ctx.stringValue("ClearDeviceDesiredPropertyResponse.RequestId"));
		clearDeviceDesiredPropertyResponse.setSuccess(_ctx.booleanValue("ClearDeviceDesiredPropertyResponse.Success"));
		clearDeviceDesiredPropertyResponse.setErrorMessage(_ctx.stringValue("ClearDeviceDesiredPropertyResponse.ErrorMessage"));
		clearDeviceDesiredPropertyResponse.setCode(_ctx.stringValue("ClearDeviceDesiredPropertyResponse.Code"));

		Data data = new Data();
		data.setVersions(_ctx.stringValue("ClearDeviceDesiredPropertyResponse.Data.Versions"));
		clearDeviceDesiredPropertyResponse.setData(data);
	 
	 	return clearDeviceDesiredPropertyResponse;
	}
}