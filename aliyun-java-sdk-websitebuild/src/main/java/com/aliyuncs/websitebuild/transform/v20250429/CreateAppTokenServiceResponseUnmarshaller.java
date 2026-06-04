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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.CreateAppTokenServiceResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppTokenServiceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppTokenServiceResponseUnmarshaller {

	public static CreateAppTokenServiceResponse unmarshall(CreateAppTokenServiceResponse createAppTokenServiceResponse, UnmarshallerContext _ctx) {
		
		createAppTokenServiceResponse.setRequestId(_ctx.stringValue("CreateAppTokenServiceResponse.RequestId"));
		createAppTokenServiceResponse.setDynamicCode(_ctx.stringValue("CreateAppTokenServiceResponse.DynamicCode"));
		createAppTokenServiceResponse.setDynamicMessage(_ctx.stringValue("CreateAppTokenServiceResponse.DynamicMessage"));
		createAppTokenServiceResponse.setSynchro(_ctx.booleanValue("CreateAppTokenServiceResponse.Synchro"));
		createAppTokenServiceResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppTokenServiceResponse.AccessDeniedDetail"));
		createAppTokenServiceResponse.setRootErrorMsg(_ctx.stringValue("CreateAppTokenServiceResponse.RootErrorMsg"));
		createAppTokenServiceResponse.setRootErrorCode(_ctx.stringValue("CreateAppTokenServiceResponse.RootErrorCode"));
		createAppTokenServiceResponse.setAllowRetry(_ctx.booleanValue("CreateAppTokenServiceResponse.AllowRetry"));
		createAppTokenServiceResponse.setAppName(_ctx.stringValue("CreateAppTokenServiceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppTokenServiceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppTokenServiceResponse.ErrorArgs["+ i +"]"));
		}
		createAppTokenServiceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setExtInfo(_ctx.stringValue("CreateAppTokenServiceResponse.Module.ExtInfo"));
		createAppTokenServiceResponse.setModule(module);
	 
	 	return createAppTokenServiceResponse;
	}
}