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

import com.aliyuncs.websitebuild.model.v20250429.SaveAppSupabaseSecretsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAppSupabaseSecretsResponseUnmarshaller {

	public static SaveAppSupabaseSecretsResponse unmarshall(SaveAppSupabaseSecretsResponse saveAppSupabaseSecretsResponse, UnmarshallerContext _ctx) {
		
		saveAppSupabaseSecretsResponse.setRequestId(_ctx.stringValue("SaveAppSupabaseSecretsResponse.RequestId"));
		saveAppSupabaseSecretsResponse.setDynamicCode(_ctx.stringValue("SaveAppSupabaseSecretsResponse.DynamicCode"));
		saveAppSupabaseSecretsResponse.setDynamicMessage(_ctx.stringValue("SaveAppSupabaseSecretsResponse.DynamicMessage"));
		saveAppSupabaseSecretsResponse.setSynchro(_ctx.booleanValue("SaveAppSupabaseSecretsResponse.Synchro"));
		saveAppSupabaseSecretsResponse.setAccessDeniedDetail(_ctx.stringValue("SaveAppSupabaseSecretsResponse.AccessDeniedDetail"));
		saveAppSupabaseSecretsResponse.setRootErrorMsg(_ctx.stringValue("SaveAppSupabaseSecretsResponse.RootErrorMsg"));
		saveAppSupabaseSecretsResponse.setRootErrorCode(_ctx.stringValue("SaveAppSupabaseSecretsResponse.RootErrorCode"));
		saveAppSupabaseSecretsResponse.setModule(_ctx.booleanValue("SaveAppSupabaseSecretsResponse.Module"));
		saveAppSupabaseSecretsResponse.setAllowRetry(_ctx.booleanValue("SaveAppSupabaseSecretsResponse.AllowRetry"));
		saveAppSupabaseSecretsResponse.setAppName(_ctx.stringValue("SaveAppSupabaseSecretsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveAppSupabaseSecretsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SaveAppSupabaseSecretsResponse.ErrorArgs["+ i +"]"));
		}
		saveAppSupabaseSecretsResponse.setErrorArgs(errorArgs);
	 
	 	return saveAppSupabaseSecretsResponse;
	}
}