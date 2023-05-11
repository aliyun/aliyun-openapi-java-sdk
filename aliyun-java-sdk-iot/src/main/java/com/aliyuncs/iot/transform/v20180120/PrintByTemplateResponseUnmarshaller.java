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

import com.aliyuncs.iot.model.v20180120.PrintByTemplateResponse;
import com.aliyuncs.iot.model.v20180120.PrintByTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PrintByTemplateResponseUnmarshaller {

	public static PrintByTemplateResponse unmarshall(PrintByTemplateResponse printByTemplateResponse, UnmarshallerContext _ctx) {
		
		printByTemplateResponse.setRequestId(_ctx.stringValue("PrintByTemplateResponse.RequestId"));
		printByTemplateResponse.setSuccess(_ctx.booleanValue("PrintByTemplateResponse.Success"));
		printByTemplateResponse.setCode(_ctx.stringValue("PrintByTemplateResponse.Code"));
		printByTemplateResponse.setErrorMessage(_ctx.stringValue("PrintByTemplateResponse.ErrorMessage"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("PrintByTemplateResponse.Data.Success"));
		data.setDeviceErrorCode(_ctx.stringValue("PrintByTemplateResponse.Data.DeviceErrorCode"));
		data.setDeviceErrorMessage(_ctx.stringValue("PrintByTemplateResponse.Data.DeviceErrorMessage"));
		data.setId(_ctx.stringValue("PrintByTemplateResponse.Data.Id"));
		data.setRetryCount(_ctx.integerValue("PrintByTemplateResponse.Data.RetryCount"));
		data.setMaxRetryCount(_ctx.integerValue("PrintByTemplateResponse.Data.MaxRetryCount"));
		printByTemplateResponse.setData(data);
	 
	 	return printByTemplateResponse;
	}
}