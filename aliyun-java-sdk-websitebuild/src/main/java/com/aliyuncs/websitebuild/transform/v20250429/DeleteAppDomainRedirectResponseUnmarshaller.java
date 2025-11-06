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

import com.aliyuncs.websitebuild.model.v20250429.DeleteAppDomainRedirectResponse;
import com.aliyuncs.websitebuild.model.v20250429.DeleteAppDomainRedirectResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppDomainRedirectResponseUnmarshaller {

	public static DeleteAppDomainRedirectResponse unmarshall(DeleteAppDomainRedirectResponse deleteAppDomainRedirectResponse, UnmarshallerContext _ctx) {
		
		deleteAppDomainRedirectResponse.setRequestId(_ctx.stringValue("DeleteAppDomainRedirectResponse.RequestId"));
		deleteAppDomainRedirectResponse.setDynamicCode(_ctx.stringValue("DeleteAppDomainRedirectResponse.DynamicCode"));
		deleteAppDomainRedirectResponse.setDynamicMessage(_ctx.stringValue("DeleteAppDomainRedirectResponse.DynamicMessage"));
		deleteAppDomainRedirectResponse.setSynchro(_ctx.booleanValue("DeleteAppDomainRedirectResponse.Synchro"));
		deleteAppDomainRedirectResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteAppDomainRedirectResponse.AccessDeniedDetail"));
		deleteAppDomainRedirectResponse.setRootErrorMsg(_ctx.stringValue("DeleteAppDomainRedirectResponse.RootErrorMsg"));
		deleteAppDomainRedirectResponse.setRootErrorCode(_ctx.stringValue("DeleteAppDomainRedirectResponse.RootErrorCode"));
		deleteAppDomainRedirectResponse.setAllowRetry(_ctx.booleanValue("DeleteAppDomainRedirectResponse.AllowRetry"));
		deleteAppDomainRedirectResponse.setAppName(_ctx.stringValue("DeleteAppDomainRedirectResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAppDomainRedirectResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteAppDomainRedirectResponse.ErrorArgs["+ i +"]"));
		}
		deleteAppDomainRedirectResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSuccess(_ctx.booleanValue("DeleteAppDomainRedirectResponse.Module.Success"));
		deleteAppDomainRedirectResponse.setModule(module);
	 
	 	return deleteAppDomainRedirectResponse;
	}
}