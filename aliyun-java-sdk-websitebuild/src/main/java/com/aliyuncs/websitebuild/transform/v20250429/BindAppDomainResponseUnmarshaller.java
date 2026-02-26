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

import com.aliyuncs.websitebuild.model.v20250429.BindAppDomainResponse;
import com.aliyuncs.websitebuild.model.v20250429.BindAppDomainResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAppDomainResponseUnmarshaller {

	public static BindAppDomainResponse unmarshall(BindAppDomainResponse bindAppDomainResponse, UnmarshallerContext _ctx) {
		
		bindAppDomainResponse.setRequestId(_ctx.stringValue("BindAppDomainResponse.RequestId"));
		bindAppDomainResponse.setDynamicCode(_ctx.stringValue("BindAppDomainResponse.DynamicCode"));
		bindAppDomainResponse.setDynamicMessage(_ctx.stringValue("BindAppDomainResponse.DynamicMessage"));
		bindAppDomainResponse.setSynchro(_ctx.booleanValue("BindAppDomainResponse.Synchro"));
		bindAppDomainResponse.setAccessDeniedDetail(_ctx.stringValue("BindAppDomainResponse.AccessDeniedDetail"));
		bindAppDomainResponse.setRootErrorMsg(_ctx.stringValue("BindAppDomainResponse.RootErrorMsg"));
		bindAppDomainResponse.setRootErrorCode(_ctx.stringValue("BindAppDomainResponse.RootErrorCode"));
		bindAppDomainResponse.setAllowRetry(_ctx.booleanValue("BindAppDomainResponse.AllowRetry"));
		bindAppDomainResponse.setAppName(_ctx.stringValue("BindAppDomainResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BindAppDomainResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("BindAppDomainResponse.ErrorArgs["+ i +"]"));
		}
		bindAppDomainResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSuccess(_ctx.booleanValue("BindAppDomainResponse.Module.Success"));
		bindAppDomainResponse.setModule(module);
	 
	 	return bindAppDomainResponse;
	}
}