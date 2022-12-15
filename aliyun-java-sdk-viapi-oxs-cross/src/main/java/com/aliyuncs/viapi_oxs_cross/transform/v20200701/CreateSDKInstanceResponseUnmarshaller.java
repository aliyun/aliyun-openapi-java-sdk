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

package com.aliyuncs.viapi_oxs_cross.transform.v20200701;

import com.aliyuncs.viapi_oxs_cross.model.v20200701.CreateSDKInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSDKInstanceResponseUnmarshaller {

	public static CreateSDKInstanceResponse unmarshall(CreateSDKInstanceResponse createSDKInstanceResponse, UnmarshallerContext _ctx) {
		
		createSDKInstanceResponse.setRequestId(_ctx.stringValue("CreateSDKInstanceResponse.RequestId"));
		createSDKInstanceResponse.setOk(_ctx.booleanValue("CreateSDKInstanceResponse.Ok"));
		createSDKInstanceResponse.setData(_ctx.stringValue("CreateSDKInstanceResponse.Data"));
		createSDKInstanceResponse.setErrorMessage(_ctx.stringValue("CreateSDKInstanceResponse.ErrorMessage"));
		createSDKInstanceResponse.setCode(_ctx.stringValue("CreateSDKInstanceResponse.Code"));
		createSDKInstanceResponse.setHttpCode(_ctx.integerValue("CreateSDKInstanceResponse.HttpCode"));
	 
	 	return createSDKInstanceResponse;
	}
}