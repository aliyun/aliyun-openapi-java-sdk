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

import com.aliyuncs.iot.model.v20180120.InvokeThingServiceResponse;
import com.aliyuncs.iot.model.v20180120.InvokeThingServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvokeThingServiceResponseUnmarshaller {

	public static InvokeThingServiceResponse unmarshall(InvokeThingServiceResponse invokeThingServiceResponse, UnmarshallerContext _ctx) {
		
		invokeThingServiceResponse.setRequestId(_ctx.stringValue("InvokeThingServiceResponse.RequestId"));
		invokeThingServiceResponse.setSuccess(_ctx.booleanValue("InvokeThingServiceResponse.Success"));
		invokeThingServiceResponse.setErrorMessage(_ctx.stringValue("InvokeThingServiceResponse.ErrorMessage"));
		invokeThingServiceResponse.setCode(_ctx.stringValue("InvokeThingServiceResponse.Code"));

		Data data = new Data();
		data.setResult(_ctx.stringValue("InvokeThingServiceResponse.Data.Result"));
		data.setMessageId(_ctx.stringValue("InvokeThingServiceResponse.Data.MessageId"));
		invokeThingServiceResponse.setData(data);
	 
	 	return invokeThingServiceResponse;
	}
}