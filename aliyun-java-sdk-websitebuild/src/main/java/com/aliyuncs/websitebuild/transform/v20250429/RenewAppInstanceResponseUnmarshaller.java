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

import com.aliyuncs.websitebuild.model.v20250429.RenewAppInstanceResponse;
import com.aliyuncs.websitebuild.model.v20250429.RenewAppInstanceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewAppInstanceResponseUnmarshaller {

	public static RenewAppInstanceResponse unmarshall(RenewAppInstanceResponse renewAppInstanceResponse, UnmarshallerContext _ctx) {
		
		renewAppInstanceResponse.setRequestId(_ctx.stringValue("RenewAppInstanceResponse.RequestId"));
		renewAppInstanceResponse.setDynamicCode(_ctx.stringValue("RenewAppInstanceResponse.DynamicCode"));
		renewAppInstanceResponse.setDynamicMessage(_ctx.stringValue("RenewAppInstanceResponse.DynamicMessage"));
		renewAppInstanceResponse.setSynchro(_ctx.booleanValue("RenewAppInstanceResponse.Synchro"));
		renewAppInstanceResponse.setAccessDeniedDetail(_ctx.stringValue("RenewAppInstanceResponse.AccessDeniedDetail"));
		renewAppInstanceResponse.setRootErrorMsg(_ctx.stringValue("RenewAppInstanceResponse.RootErrorMsg"));
		renewAppInstanceResponse.setRootErrorCode(_ctx.stringValue("RenewAppInstanceResponse.RootErrorCode"));
		renewAppInstanceResponse.setAllowRetry(_ctx.booleanValue("RenewAppInstanceResponse.AllowRetry"));
		renewAppInstanceResponse.setAppName(_ctx.stringValue("RenewAppInstanceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewAppInstanceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RenewAppInstanceResponse.ErrorArgs["+ i +"]"));
		}
		renewAppInstanceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setOrderId(_ctx.stringValue("RenewAppInstanceResponse.Module.OrderId"));
		renewAppInstanceResponse.setModule(module);
	 
	 	return renewAppInstanceResponse;
	}
}