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

import com.aliyuncs.websitebuild.model.v20250429.GetAppConversationLockStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppConversationLockStatusResponseUnmarshaller {

	public static GetAppConversationLockStatusResponse unmarshall(GetAppConversationLockStatusResponse getAppConversationLockStatusResponse, UnmarshallerContext _ctx) {
		
		getAppConversationLockStatusResponse.setRequestId(_ctx.stringValue("GetAppConversationLockStatusResponse.RequestId"));
		getAppConversationLockStatusResponse.setDynamicCode(_ctx.stringValue("GetAppConversationLockStatusResponse.DynamicCode"));
		getAppConversationLockStatusResponse.setDynamicMessage(_ctx.stringValue("GetAppConversationLockStatusResponse.DynamicMessage"));
		getAppConversationLockStatusResponse.setSynchro(_ctx.booleanValue("GetAppConversationLockStatusResponse.Synchro"));
		getAppConversationLockStatusResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppConversationLockStatusResponse.AccessDeniedDetail"));
		getAppConversationLockStatusResponse.setRootErrorMsg(_ctx.stringValue("GetAppConversationLockStatusResponse.RootErrorMsg"));
		getAppConversationLockStatusResponse.setRootErrorCode(_ctx.stringValue("GetAppConversationLockStatusResponse.RootErrorCode"));
		getAppConversationLockStatusResponse.setModule(_ctx.booleanValue("GetAppConversationLockStatusResponse.Module"));
		getAppConversationLockStatusResponse.setAllowRetry(_ctx.booleanValue("GetAppConversationLockStatusResponse.AllowRetry"));
		getAppConversationLockStatusResponse.setAppName(_ctx.stringValue("GetAppConversationLockStatusResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppConversationLockStatusResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppConversationLockStatusResponse.ErrorArgs["+ i +"]"));
		}
		getAppConversationLockStatusResponse.setErrorArgs(errorArgs);
	 
	 	return getAppConversationLockStatusResponse;
	}
}