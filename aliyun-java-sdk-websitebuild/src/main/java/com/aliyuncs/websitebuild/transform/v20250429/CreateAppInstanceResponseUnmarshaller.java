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

import com.aliyuncs.websitebuild.model.v20250429.CreateAppInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppInstanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppInstanceResponseUnmarshaller {

	public static CreateAppInstanceResponse unmarshall(CreateAppInstanceResponse createAppInstanceResponse, UnmarshallerContext _ctx) {
		
		createAppInstanceResponse.setRequestId(_ctx.stringValue("CreateAppInstanceResponse.RequestId"));
		createAppInstanceResponse.setDynamicCode(_ctx.stringValue("CreateAppInstanceResponse.DynamicCode"));
		createAppInstanceResponse.setDynamicMessage(_ctx.stringValue("CreateAppInstanceResponse.DynamicMessage"));
		createAppInstanceResponse.setSynchro(_ctx.booleanValue("CreateAppInstanceResponse.Synchro"));
		createAppInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppInstanceResponse.AccessDeniedDetail"));
		createAppInstanceResponse.setRootErrorMsg(_ctx.stringValue("CreateAppInstanceResponse.RootErrorMsg"));
		createAppInstanceResponse.setRootErrorCode(_ctx.stringValue("CreateAppInstanceResponse.RootErrorCode"));
		createAppInstanceResponse.setAllowRetry(_ctx.booleanValue("CreateAppInstanceResponse.AllowRetry"));
		createAppInstanceResponse.setAppName(_ctx.stringValue("CreateAppInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppInstanceResponse.ErrorArgs["+ i +"]"));
		}
		createAppInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setBizId(_ctx.stringValue("CreateAppInstanceResponse.Module.BizId"));
		module.setInstanceId(_ctx.stringValue("CreateAppInstanceResponse.Module.InstanceId"));
		module.setOrderId(_ctx.stringValue("CreateAppInstanceResponse.Module.OrderId"));
		createAppInstanceResponse.setModule(module);
	 
	 	return createAppInstanceResponse;
	}
}