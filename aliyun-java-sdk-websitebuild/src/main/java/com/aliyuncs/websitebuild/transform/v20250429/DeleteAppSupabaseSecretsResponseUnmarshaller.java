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

import com.aliyuncs.websitebuild.model.v20250429.DeleteAppSupabaseSecretsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppSupabaseSecretsResponseUnmarshaller {

	public static DeleteAppSupabaseSecretsResponse unmarshall(DeleteAppSupabaseSecretsResponse deleteAppSupabaseSecretsResponse, UnmarshallerContext _ctx) {
		
		deleteAppSupabaseSecretsResponse.setRequestId(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.RequestId"));
		deleteAppSupabaseSecretsResponse.setDynamicCode(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.DynamicCode"));
		deleteAppSupabaseSecretsResponse.setDynamicMessage(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.DynamicMessage"));
		deleteAppSupabaseSecretsResponse.setSynchro(_ctx.booleanValue("DeleteAppSupabaseSecretsResponse.Synchro"));
		deleteAppSupabaseSecretsResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.AccessDeniedDetail"));
		deleteAppSupabaseSecretsResponse.setRootErrorMsg(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.RootErrorMsg"));
		deleteAppSupabaseSecretsResponse.setRootErrorCode(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.RootErrorCode"));
		deleteAppSupabaseSecretsResponse.setModule(_ctx.booleanValue("DeleteAppSupabaseSecretsResponse.Module"));
		deleteAppSupabaseSecretsResponse.setAllowRetry(_ctx.booleanValue("DeleteAppSupabaseSecretsResponse.AllowRetry"));
		deleteAppSupabaseSecretsResponse.setAppName(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAppSupabaseSecretsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("DeleteAppSupabaseSecretsResponse.ErrorArgs["+ i +"]"));
		}
		deleteAppSupabaseSecretsResponse.setErrorArgs(errorArgs);
	 
	 	return deleteAppSupabaseSecretsResponse;
	}
}