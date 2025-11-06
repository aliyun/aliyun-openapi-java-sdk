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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.DispatchConsoleAPIForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.DispatchConsoleAPIForPartnerResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class DispatchConsoleAPIForPartnerResponseUnmarshaller {

	public static DispatchConsoleAPIForPartnerResponse unmarshall(DispatchConsoleAPIForPartnerResponse dispatchConsoleAPIForPartnerResponse, UnmarshallerContext _ctx) {
		
		dispatchConsoleAPIForPartnerResponse.setRequestId(_ctx.stringValue("DispatchConsoleAPIForPartnerResponse.RequestId"));
		dispatchConsoleAPIForPartnerResponse.setSuccess(_ctx.stringValue("DispatchConsoleAPIForPartnerResponse.Success"));
		dispatchConsoleAPIForPartnerResponse.setErrorCode(_ctx.stringValue("DispatchConsoleAPIForPartnerResponse.ErrorCode"));

		Module module = new Module();
		module.setData(_ctx.stringValue("DispatchConsoleAPIForPartnerResponse.Module.Data"));
		dispatchConsoleAPIForPartnerResponse.setModule(module);
	 
	 	return dispatchConsoleAPIForPartnerResponse;
	}
}