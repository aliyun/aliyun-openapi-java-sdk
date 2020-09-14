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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.CreateAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAlertResponseUnmarshaller {

	public static CreateAlertResponse unmarshall(CreateAlertResponse createAlertResponse, UnmarshallerContext _ctx) {
		
		createAlertResponse.setRequestId(_ctx.stringValue("CreateAlertResponse.RequestId"));
		createAlertResponse.setSuccess(_ctx.booleanValue("CreateAlertResponse.Success"));
		createAlertResponse.setCode(_ctx.stringValue("CreateAlertResponse.Code"));
		createAlertResponse.setMessage(_ctx.stringValue("CreateAlertResponse.Message"));
		createAlertResponse.setData(_ctx.booleanValue("CreateAlertResponse.Data"));
	 
	 	return createAlertResponse;
	}
}