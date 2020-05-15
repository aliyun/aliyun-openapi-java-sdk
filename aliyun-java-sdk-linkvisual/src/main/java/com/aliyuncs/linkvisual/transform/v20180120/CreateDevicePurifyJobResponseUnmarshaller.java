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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateDevicePurifyJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDevicePurifyJobResponseUnmarshaller {

	public static CreateDevicePurifyJobResponse unmarshall(CreateDevicePurifyJobResponse createDevicePurifyJobResponse, UnmarshallerContext _ctx) {
		
		createDevicePurifyJobResponse.setRequestId(_ctx.stringValue("CreateDevicePurifyJobResponse.RequestId"));
		createDevicePurifyJobResponse.setSuccess(_ctx.booleanValue("CreateDevicePurifyJobResponse.Success"));
		createDevicePurifyJobResponse.setErrorMessage(_ctx.stringValue("CreateDevicePurifyJobResponse.ErrorMessage"));
		createDevicePurifyJobResponse.setCode(_ctx.stringValue("CreateDevicePurifyJobResponse.Code"));
		createDevicePurifyJobResponse.setData(_ctx.stringValue("CreateDevicePurifyJobResponse.Data"));
	 
	 	return createDevicePurifyJobResponse;
	}
}