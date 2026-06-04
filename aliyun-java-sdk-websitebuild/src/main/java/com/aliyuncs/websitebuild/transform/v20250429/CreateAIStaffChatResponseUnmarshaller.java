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

import com.aliyuncs.websitebuild.model.v20250429.CreateAIStaffChatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAIStaffChatResponseUnmarshaller {

	public static CreateAIStaffChatResponse unmarshall(CreateAIStaffChatResponse createAIStaffChatResponse, UnmarshallerContext _ctx) {
		
		createAIStaffChatResponse.setRequestId(_ctx.stringValue("CreateAIStaffChatResponse.RequestId"));
		createAIStaffChatResponse.setDynamicCode(_ctx.stringValue("CreateAIStaffChatResponse.DynamicCode"));
		createAIStaffChatResponse.setDynamicMessage(_ctx.stringValue("CreateAIStaffChatResponse.DynamicMessage"));
		createAIStaffChatResponse.setSynchro(_ctx.booleanValue("CreateAIStaffChatResponse.Synchro"));
		createAIStaffChatResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAIStaffChatResponse.AccessDeniedDetail"));
		createAIStaffChatResponse.setRootErrorMsg(_ctx.stringValue("CreateAIStaffChatResponse.RootErrorMsg"));
		createAIStaffChatResponse.setRootErrorCode(_ctx.stringValue("CreateAIStaffChatResponse.RootErrorCode"));
		createAIStaffChatResponse.setModule(_ctx.booleanValue("CreateAIStaffChatResponse.Module"));
		createAIStaffChatResponse.setAllowRetry(_ctx.booleanValue("CreateAIStaffChatResponse.AllowRetry"));
		createAIStaffChatResponse.setAppName(_ctx.stringValue("CreateAIStaffChatResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAIStaffChatResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAIStaffChatResponse.ErrorArgs["+ i +"]"));
		}
		createAIStaffChatResponse.setErrorArgs(errorArgs);
	 
	 	return createAIStaffChatResponse;
	}
}