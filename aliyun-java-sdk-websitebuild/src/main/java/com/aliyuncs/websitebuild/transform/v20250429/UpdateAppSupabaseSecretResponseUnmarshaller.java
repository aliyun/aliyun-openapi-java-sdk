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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppSupabaseSecretResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppSupabaseSecretResponseUnmarshaller {

	public static UpdateAppSupabaseSecretResponse unmarshall(UpdateAppSupabaseSecretResponse updateAppSupabaseSecretResponse, UnmarshallerContext _ctx) {
		
		updateAppSupabaseSecretResponse.setRequestId(_ctx.stringValue("UpdateAppSupabaseSecretResponse.RequestId"));
		updateAppSupabaseSecretResponse.setDynamicCode(_ctx.stringValue("UpdateAppSupabaseSecretResponse.DynamicCode"));
		updateAppSupabaseSecretResponse.setDynamicMessage(_ctx.stringValue("UpdateAppSupabaseSecretResponse.DynamicMessage"));
		updateAppSupabaseSecretResponse.setSynchro(_ctx.booleanValue("UpdateAppSupabaseSecretResponse.Synchro"));
		updateAppSupabaseSecretResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppSupabaseSecretResponse.AccessDeniedDetail"));
		updateAppSupabaseSecretResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppSupabaseSecretResponse.RootErrorMsg"));
		updateAppSupabaseSecretResponse.setRootErrorCode(_ctx.stringValue("UpdateAppSupabaseSecretResponse.RootErrorCode"));
		updateAppSupabaseSecretResponse.setModule(_ctx.booleanValue("UpdateAppSupabaseSecretResponse.Module"));
		updateAppSupabaseSecretResponse.setAllowRetry(_ctx.booleanValue("UpdateAppSupabaseSecretResponse.AllowRetry"));
		updateAppSupabaseSecretResponse.setAppName(_ctx.stringValue("UpdateAppSupabaseSecretResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppSupabaseSecretResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppSupabaseSecretResponse.ErrorArgs["+ i +"]"));
		}
		updateAppSupabaseSecretResponse.setErrorArgs(errorArgs);
	 
	 	return updateAppSupabaseSecretResponse;
	}
}