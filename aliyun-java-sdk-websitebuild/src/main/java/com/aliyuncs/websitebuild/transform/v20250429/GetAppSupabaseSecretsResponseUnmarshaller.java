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

import com.aliyuncs.websitebuild.model.v20250429.GetAppSupabaseSecretsResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppSupabaseSecretsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppSupabaseSecretsResponse.Module.Secret;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSupabaseSecretsResponseUnmarshaller {

	public static GetAppSupabaseSecretsResponse unmarshall(GetAppSupabaseSecretsResponse getAppSupabaseSecretsResponse, UnmarshallerContext _ctx) {
		
		getAppSupabaseSecretsResponse.setRequestId(_ctx.stringValue("GetAppSupabaseSecretsResponse.RequestId"));
		getAppSupabaseSecretsResponse.setDynamicCode(_ctx.stringValue("GetAppSupabaseSecretsResponse.DynamicCode"));
		getAppSupabaseSecretsResponse.setDynamicMessage(_ctx.stringValue("GetAppSupabaseSecretsResponse.DynamicMessage"));
		getAppSupabaseSecretsResponse.setSynchro(_ctx.booleanValue("GetAppSupabaseSecretsResponse.Synchro"));
		getAppSupabaseSecretsResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppSupabaseSecretsResponse.AccessDeniedDetail"));
		getAppSupabaseSecretsResponse.setRootErrorMsg(_ctx.stringValue("GetAppSupabaseSecretsResponse.RootErrorMsg"));
		getAppSupabaseSecretsResponse.setRootErrorCode(_ctx.stringValue("GetAppSupabaseSecretsResponse.RootErrorCode"));
		getAppSupabaseSecretsResponse.setAllowRetry(_ctx.booleanValue("GetAppSupabaseSecretsResponse.AllowRetry"));
		getAppSupabaseSecretsResponse.setAppName(_ctx.stringValue("GetAppSupabaseSecretsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSupabaseSecretsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppSupabaseSecretsResponse.ErrorArgs["+ i +"]"));
		}
		getAppSupabaseSecretsResponse.setErrorArgs(errorArgs);

		Module module = new Module();

		List<Secret> secrets = new ArrayList<Secret>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSupabaseSecretsResponse.Module.Secrets.Length"); i++) {
			Secret secret = new Secret();
			secret.setKey(_ctx.stringValue("GetAppSupabaseSecretsResponse.Module.Secrets["+ i +"].Key"));
			secret.setValue(_ctx.stringValue("GetAppSupabaseSecretsResponse.Module.Secrets["+ i +"].Value"));
			secret.setName(_ctx.stringValue("GetAppSupabaseSecretsResponse.Module.Secrets["+ i +"].Name"));
			secret.setSecretType(_ctx.stringValue("GetAppSupabaseSecretsResponse.Module.Secrets["+ i +"].SecretType"));

			secrets.add(secret);
		}
		module.setSecrets(secrets);
		getAppSupabaseSecretsResponse.setModule(module);
	 
	 	return getAppSupabaseSecretsResponse;
	}
}