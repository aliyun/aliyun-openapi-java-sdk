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

import com.aliyuncs.websitebuild.model.v20250429.RenewAppSandboxResponse;
import com.aliyuncs.websitebuild.model.v20250429.RenewAppSandboxResponse.Module;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewAppSandboxResponseUnmarshaller {

	public static RenewAppSandboxResponse unmarshall(RenewAppSandboxResponse renewAppSandboxResponse, UnmarshallerContext _ctx) {
		
		renewAppSandboxResponse.setRequestId(_ctx.stringValue("RenewAppSandboxResponse.RequestId"));
		renewAppSandboxResponse.setDynamicCode(_ctx.stringValue("RenewAppSandboxResponse.DynamicCode"));
		renewAppSandboxResponse.setDynamicMessage(_ctx.stringValue("RenewAppSandboxResponse.DynamicMessage"));
		renewAppSandboxResponse.setSynchro(_ctx.booleanValue("RenewAppSandboxResponse.Synchro"));
		renewAppSandboxResponse.setAccessDeniedDetail(_ctx.stringValue("RenewAppSandboxResponse.AccessDeniedDetail"));
		renewAppSandboxResponse.setRootErrorMsg(_ctx.stringValue("RenewAppSandboxResponse.RootErrorMsg"));
		renewAppSandboxResponse.setRootErrorCode(_ctx.stringValue("RenewAppSandboxResponse.RootErrorCode"));
		renewAppSandboxResponse.setAllowRetry(_ctx.booleanValue("RenewAppSandboxResponse.AllowRetry"));
		renewAppSandboxResponse.setAppName(_ctx.stringValue("RenewAppSandboxResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewAppSandboxResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RenewAppSandboxResponse.ErrorArgs["+ i +"]"));
		}
		renewAppSandboxResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPreviewUrls(_ctx.mapValue("RenewAppSandboxResponse.Module.PreviewUrls"));
		renewAppSandboxResponse.setModule(module);
	 
	 	return renewAppSandboxResponse;
	}
}