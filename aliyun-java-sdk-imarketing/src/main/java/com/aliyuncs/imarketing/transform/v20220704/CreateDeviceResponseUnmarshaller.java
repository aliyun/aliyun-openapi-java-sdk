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

package com.aliyuncs.imarketing.transform.v20220704;

import com.aliyuncs.imarketing.model.v20220704.CreateDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceResponseUnmarshaller {

	public static CreateDeviceResponse unmarshall(CreateDeviceResponse createDeviceResponse, UnmarshallerContext _ctx) {
		
		createDeviceResponse.setRequestId(_ctx.stringValue("CreateDeviceResponse.RequestId"));
		createDeviceResponse.setCode(_ctx.stringValue("CreateDeviceResponse.Code"));
		createDeviceResponse.setMessage(_ctx.stringValue("CreateDeviceResponse.Message"));
		createDeviceResponse.setSuccess(_ctx.booleanValue("CreateDeviceResponse.Success"));
		createDeviceResponse.setModel(_ctx.stringValue("CreateDeviceResponse.Model"));
	 
	 	return createDeviceResponse;
	}
}