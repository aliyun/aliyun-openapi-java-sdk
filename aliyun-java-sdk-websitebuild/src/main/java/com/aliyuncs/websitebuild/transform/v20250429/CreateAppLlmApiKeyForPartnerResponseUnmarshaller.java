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

import com.aliyuncs.websitebuild.model.v20250429.CreateAppLlmApiKeyForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppLlmApiKeyForPartnerResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppLlmApiKeyForPartnerResponseUnmarshaller {

	public static CreateAppLlmApiKeyForPartnerResponse unmarshall(CreateAppLlmApiKeyForPartnerResponse createAppLlmApiKeyForPartnerResponse, UnmarshallerContext _ctx) {
		
		createAppLlmApiKeyForPartnerResponse.setRequestId(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.RequestId"));
		createAppLlmApiKeyForPartnerResponse.setDynamicCode(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.DynamicCode"));
		createAppLlmApiKeyForPartnerResponse.setDynamicMessage(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.DynamicMessage"));
		createAppLlmApiKeyForPartnerResponse.setSynchro(_ctx.booleanValue("CreateAppLlmApiKeyForPartnerResponse.Synchro"));
		createAppLlmApiKeyForPartnerResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.AccessDeniedDetail"));
		createAppLlmApiKeyForPartnerResponse.setRootErrorMsg(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.RootErrorMsg"));
		createAppLlmApiKeyForPartnerResponse.setRootErrorCode(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.RootErrorCode"));
		createAppLlmApiKeyForPartnerResponse.setAllowRetry(_ctx.booleanValue("CreateAppLlmApiKeyForPartnerResponse.AllowRetry"));
		createAppLlmApiKeyForPartnerResponse.setAppName(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppLlmApiKeyForPartnerResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.ErrorArgs["+ i +"]"));
		}
		createAppLlmApiKeyForPartnerResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setEncryptedApiKey(_ctx.stringValue("CreateAppLlmApiKeyForPartnerResponse.Module.EncryptedApiKey"));
		createAppLlmApiKeyForPartnerResponse.setModule(module);
	 
	 	return createAppLlmApiKeyForPartnerResponse;
	}
}