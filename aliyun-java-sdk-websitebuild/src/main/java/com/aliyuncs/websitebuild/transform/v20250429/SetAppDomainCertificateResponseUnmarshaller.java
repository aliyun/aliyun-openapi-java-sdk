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

import com.aliyuncs.websitebuild.model.v20250429.SetAppDomainCertificateResponse;
import com.aliyuncs.websitebuild.model.v20250429.SetAppDomainCertificateResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetAppDomainCertificateResponseUnmarshaller {

	public static SetAppDomainCertificateResponse unmarshall(SetAppDomainCertificateResponse setAppDomainCertificateResponse, UnmarshallerContext _ctx) {
		
		setAppDomainCertificateResponse.setRequestId(_ctx.stringValue("SetAppDomainCertificateResponse.RequestId"));
		setAppDomainCertificateResponse.setDynamicCode(_ctx.stringValue("SetAppDomainCertificateResponse.DynamicCode"));
		setAppDomainCertificateResponse.setDynamicMessage(_ctx.stringValue("SetAppDomainCertificateResponse.DynamicMessage"));
		setAppDomainCertificateResponse.setSynchro(_ctx.booleanValue("SetAppDomainCertificateResponse.Synchro"));
		setAppDomainCertificateResponse.setAccessDeniedDetail(_ctx.stringValue("SetAppDomainCertificateResponse.AccessDeniedDetail"));
		setAppDomainCertificateResponse.setRootErrorMsg(_ctx.stringValue("SetAppDomainCertificateResponse.RootErrorMsg"));
		setAppDomainCertificateResponse.setRootErrorCode(_ctx.stringValue("SetAppDomainCertificateResponse.RootErrorCode"));
		setAppDomainCertificateResponse.setAllowRetry(_ctx.booleanValue("SetAppDomainCertificateResponse.AllowRetry"));
		setAppDomainCertificateResponse.setAppName(_ctx.stringValue("SetAppDomainCertificateResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SetAppDomainCertificateResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SetAppDomainCertificateResponse.ErrorArgs["+ i +"]"));
		}
		setAppDomainCertificateResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSuccess(_ctx.booleanValue("SetAppDomainCertificateResponse.Module.Success"));
		setAppDomainCertificateResponse.setModule(module);
	 
	 	return setAppDomainCertificateResponse;
	}
}