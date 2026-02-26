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

import com.aliyuncs.websitebuild.model.v20250429.UnbindAppDomainResponse;
import com.aliyuncs.websitebuild.model.v20250429.UnbindAppDomainResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindAppDomainResponseUnmarshaller {

	public static UnbindAppDomainResponse unmarshall(UnbindAppDomainResponse unbindAppDomainResponse, UnmarshallerContext _ctx) {
		
		unbindAppDomainResponse.setRequestId(_ctx.stringValue("UnbindAppDomainResponse.RequestId"));
		unbindAppDomainResponse.setDynamicCode(_ctx.stringValue("UnbindAppDomainResponse.DynamicCode"));
		unbindAppDomainResponse.setDynamicMessage(_ctx.stringValue("UnbindAppDomainResponse.DynamicMessage"));
		unbindAppDomainResponse.setSynchro(_ctx.booleanValue("UnbindAppDomainResponse.Synchro"));
		unbindAppDomainResponse.setAccessDeniedDetail(_ctx.stringValue("UnbindAppDomainResponse.AccessDeniedDetail"));
		unbindAppDomainResponse.setRootErrorMsg(_ctx.stringValue("UnbindAppDomainResponse.RootErrorMsg"));
		unbindAppDomainResponse.setRootErrorCode(_ctx.stringValue("UnbindAppDomainResponse.RootErrorCode"));
		unbindAppDomainResponse.setAllowRetry(_ctx.booleanValue("UnbindAppDomainResponse.AllowRetry"));
		unbindAppDomainResponse.setAppName(_ctx.stringValue("UnbindAppDomainResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UnbindAppDomainResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UnbindAppDomainResponse.ErrorArgs["+ i +"]"));
		}
		unbindAppDomainResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSuccess(_ctx.booleanValue("UnbindAppDomainResponse.Module.Success"));
		unbindAppDomainResponse.setModule(module);
	 
	 	return unbindAppDomainResponse;
	}
}