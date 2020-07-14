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

import com.aliyuncs.iot.model.v20180120.SetDeviceDesiredPropertyResponse;
import com.aliyuncs.iot.model.v20180120.SetDeviceDesiredPropertyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDeviceDesiredPropertyResponseUnmarshaller {

	public static SetDeviceDesiredPropertyResponse unmarshall(SetDeviceDesiredPropertyResponse setDeviceDesiredPropertyResponse, UnmarshallerContext _ctx) {
		
		setDeviceDesiredPropertyResponse.setRequestId(_ctx.stringValue("SetDeviceDesiredPropertyResponse.RequestId"));
		setDeviceDesiredPropertyResponse.setSuccess(_ctx.booleanValue("SetDeviceDesiredPropertyResponse.Success"));
		setDeviceDesiredPropertyResponse.setErrorMessage(_ctx.stringValue("SetDeviceDesiredPropertyResponse.ErrorMessage"));
		setDeviceDesiredPropertyResponse.setCode(_ctx.stringValue("SetDeviceDesiredPropertyResponse.Code"));
		setDeviceDesiredPropertyResponse.setMessageArguments(_ctx.stringValue("SetDeviceDesiredPropertyResponse.MessageArguments"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("SetDeviceDesiredPropertyResponse.Data.MessageId"));
		data.setVersions(_ctx.stringValue("SetDeviceDesiredPropertyResponse.Data.Versions"));
		setDeviceDesiredPropertyResponse.setData(data);
	 
	 	return setDeviceDesiredPropertyResponse;
	}
}