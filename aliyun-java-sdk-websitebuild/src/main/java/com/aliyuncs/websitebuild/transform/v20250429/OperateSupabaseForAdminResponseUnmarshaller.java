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

import com.aliyuncs.websitebuild.model.v20250429.OperateSupabaseForAdminResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateSupabaseForAdminResponseUnmarshaller {

	public static OperateSupabaseForAdminResponse unmarshall(OperateSupabaseForAdminResponse operateSupabaseForAdminResponse, UnmarshallerContext _ctx) {
		
		operateSupabaseForAdminResponse.setRequestId(_ctx.stringValue("OperateSupabaseForAdminResponse.RequestId"));
		operateSupabaseForAdminResponse.setDynamicCode(_ctx.stringValue("OperateSupabaseForAdminResponse.DynamicCode"));
		operateSupabaseForAdminResponse.setDynamicMessage(_ctx.stringValue("OperateSupabaseForAdminResponse.DynamicMessage"));
		operateSupabaseForAdminResponse.setSynchro(_ctx.booleanValue("OperateSupabaseForAdminResponse.Synchro"));
		operateSupabaseForAdminResponse.setAccessDeniedDetail(_ctx.stringValue("OperateSupabaseForAdminResponse.AccessDeniedDetail"));
		operateSupabaseForAdminResponse.setRootErrorMsg(_ctx.stringValue("OperateSupabaseForAdminResponse.RootErrorMsg"));
		operateSupabaseForAdminResponse.setRootErrorCode(_ctx.stringValue("OperateSupabaseForAdminResponse.RootErrorCode"));
		operateSupabaseForAdminResponse.setModule(_ctx.stringValue("OperateSupabaseForAdminResponse.Module"));
		operateSupabaseForAdminResponse.setAllowRetry(_ctx.booleanValue("OperateSupabaseForAdminResponse.AllowRetry"));
		operateSupabaseForAdminResponse.setAppName(_ctx.stringValue("OperateSupabaseForAdminResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OperateSupabaseForAdminResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("OperateSupabaseForAdminResponse.ErrorArgs["+ i +"]"));
		}
		operateSupabaseForAdminResponse.setErrorArgs(errorArgs);
	 
	 	return operateSupabaseForAdminResponse;
	}
}