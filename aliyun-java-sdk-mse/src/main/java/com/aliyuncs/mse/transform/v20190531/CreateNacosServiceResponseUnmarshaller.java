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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.CreateNacosServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNacosServiceResponseUnmarshaller {

	public static CreateNacosServiceResponse unmarshall(CreateNacosServiceResponse createNacosServiceResponse, UnmarshallerContext _ctx) {
		
		createNacosServiceResponse.setRequestId(_ctx.stringValue("CreateNacosServiceResponse.RequestId"));
		createNacosServiceResponse.setHttpStatusCode(_ctx.integerValue("CreateNacosServiceResponse.HttpStatusCode"));
		createNacosServiceResponse.setData(_ctx.stringValue("CreateNacosServiceResponse.Data"));
		createNacosServiceResponse.setCode(_ctx.integerValue("CreateNacosServiceResponse.Code"));
		createNacosServiceResponse.setSuccess(_ctx.booleanValue("CreateNacosServiceResponse.Success"));
		createNacosServiceResponse.setMessage(_ctx.stringValue("CreateNacosServiceResponse.Message"));
	 
	 	return createNacosServiceResponse;
	}
}