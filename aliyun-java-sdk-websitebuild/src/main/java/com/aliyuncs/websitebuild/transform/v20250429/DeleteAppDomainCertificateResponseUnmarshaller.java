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

import com.aliyuncs.websitebuild.model.v20250429.DeleteAppDomainCertificateResponse;
import com.aliyuncs.websitebuild.model.v20250429.DeleteAppDomainCertificateResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppDomainCertificateResponseUnmarshaller {

	public static DeleteAppDomainCertificateResponse unmarshall(DeleteAppDomainCertificateResponse deleteAppDomainCertificateResponse, UnmarshallerContext _ctx) {
		
		deleteAppDomainCertificateResponse.setRequestId(_ctx.stringValue("DeleteAppDomainCertificateResponse.RequestId"));
		deleteAppDomainCertificateResponse.setDynamicCode(_ctx.stringValue("DeleteAppDomainCertificateResponse.DynamicCode"));
		deleteAppDomainCertificateResponse.setDynamicMessage(_ctx.stringValue("DeleteAppDomainCertificateResponse.DynamicMessage"));
		deleteAppDomainCertificateResponse.setSynchro(_ctx.booleanValue("DeleteAppDomainCertificateResponse.Synchro"));
		deleteAppDomainCertificateResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteAppDomainCertificateResponse.AccessDeniedDetail"));
		deleteAppDomainCertificateResponse.setRootErrorMsg(_ctx.stringValue("DeleteAppDomainCertificateResponse.RootErrorMsg"));
		deleteAppDomainCertificateResponse.setRootErrorCode(_ctx.stringValue("DeleteAppDomainCertificateResponse.RootErrorCode"));
		deleteAppDomainCertificateResponse.setAllowRetry(_ctx.booleanValue("DeleteAppDomainCertificateResponse.AllowRetry"));
		deleteAppDomainCertificateResponse.setAppName(_ctx.stringValue("DeleteAppDomainCertificateResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAppDomainCertificateResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteAppDomainCertificateResponse.ErrorArgs["+ i +"]"));
		}
		deleteAppDomainCertificateResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSuccess(_ctx.booleanValue("DeleteAppDomainCertificateResponse.Module.Success"));
		deleteAppDomainCertificateResponse.setModule(module);
	 
	 	return deleteAppDomainCertificateResponse;
	}
}