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

import com.aliyuncs.websitebuild.model.v20250429.ModifyAppInstanceSpecResponse;
import com.aliyuncs.websitebuild.model.v20250429.ModifyAppInstanceSpecResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAppInstanceSpecResponseUnmarshaller {

	public static ModifyAppInstanceSpecResponse unmarshall(ModifyAppInstanceSpecResponse modifyAppInstanceSpecResponse, UnmarshallerContext _ctx) {
		
		modifyAppInstanceSpecResponse.setRequestId(_ctx.stringValue("ModifyAppInstanceSpecResponse.RequestId"));
		modifyAppInstanceSpecResponse.setDynamicCode(_ctx.stringValue("ModifyAppInstanceSpecResponse.DynamicCode"));
		modifyAppInstanceSpecResponse.setDynamicMessage(_ctx.stringValue("ModifyAppInstanceSpecResponse.DynamicMessage"));
		modifyAppInstanceSpecResponse.setSynchro(_ctx.booleanValue("ModifyAppInstanceSpecResponse.Synchro"));
		modifyAppInstanceSpecResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyAppInstanceSpecResponse.AccessDeniedDetail"));
		modifyAppInstanceSpecResponse.setRootErrorMsg(_ctx.stringValue("ModifyAppInstanceSpecResponse.RootErrorMsg"));
		modifyAppInstanceSpecResponse.setRootErrorCode(_ctx.stringValue("ModifyAppInstanceSpecResponse.RootErrorCode"));
		modifyAppInstanceSpecResponse.setAllowRetry(_ctx.booleanValue("ModifyAppInstanceSpecResponse.AllowRetry"));
		modifyAppInstanceSpecResponse.setAppName(_ctx.stringValue("ModifyAppInstanceSpecResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyAppInstanceSpecResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ModifyAppInstanceSpecResponse.ErrorArgs["+ i +"]"));
		}
		modifyAppInstanceSpecResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setOrderId(_ctx.stringValue("ModifyAppInstanceSpecResponse.Module.OrderId"));
		modifyAppInstanceSpecResponse.setModule(module);
	 
	 	return modifyAppInstanceSpecResponse;
	}
}