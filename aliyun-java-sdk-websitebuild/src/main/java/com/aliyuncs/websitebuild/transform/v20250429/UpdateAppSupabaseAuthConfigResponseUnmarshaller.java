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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppSupabaseAuthConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppSupabaseAuthConfigResponseUnmarshaller {

	public static UpdateAppSupabaseAuthConfigResponse unmarshall(UpdateAppSupabaseAuthConfigResponse updateAppSupabaseAuthConfigResponse, UnmarshallerContext _ctx) {
		
		updateAppSupabaseAuthConfigResponse.setRequestId(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.RequestId"));
		updateAppSupabaseAuthConfigResponse.setDynamicCode(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.DynamicCode"));
		updateAppSupabaseAuthConfigResponse.setDynamicMessage(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.DynamicMessage"));
		updateAppSupabaseAuthConfigResponse.setSynchro(_ctx.booleanValue("UpdateAppSupabaseAuthConfigResponse.Synchro"));
		updateAppSupabaseAuthConfigResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.AccessDeniedDetail"));
		updateAppSupabaseAuthConfigResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.RootErrorMsg"));
		updateAppSupabaseAuthConfigResponse.setRootErrorCode(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.RootErrorCode"));
		updateAppSupabaseAuthConfigResponse.setModule(_ctx.booleanValue("UpdateAppSupabaseAuthConfigResponse.Module"));
		updateAppSupabaseAuthConfigResponse.setAllowRetry(_ctx.booleanValue("UpdateAppSupabaseAuthConfigResponse.AllowRetry"));
		updateAppSupabaseAuthConfigResponse.setAppName(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppSupabaseAuthConfigResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppSupabaseAuthConfigResponse.ErrorArgs["+ i +"]"));
		}
		updateAppSupabaseAuthConfigResponse.setErrorArgs(errorArgs);
	 
	 	return updateAppSupabaseAuthConfigResponse;
	}
}