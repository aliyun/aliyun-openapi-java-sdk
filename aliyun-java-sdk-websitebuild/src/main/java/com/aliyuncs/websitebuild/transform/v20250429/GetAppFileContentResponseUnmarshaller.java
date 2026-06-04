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

import com.aliyuncs.websitebuild.model.v20250429.GetAppFileContentResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppFileContentResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppFileContentResponseUnmarshaller {

	public static GetAppFileContentResponse unmarshall(GetAppFileContentResponse getAppFileContentResponse, UnmarshallerContext _ctx) {
		
		getAppFileContentResponse.setRequestId(_ctx.stringValue("GetAppFileContentResponse.RequestId"));
		getAppFileContentResponse.setDynamicCode(_ctx.stringValue("GetAppFileContentResponse.DynamicCode"));
		getAppFileContentResponse.setDynamicMessage(_ctx.stringValue("GetAppFileContentResponse.DynamicMessage"));
		getAppFileContentResponse.setSynchro(_ctx.booleanValue("GetAppFileContentResponse.Synchro"));
		getAppFileContentResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppFileContentResponse.AccessDeniedDetail"));
		getAppFileContentResponse.setRootErrorMsg(_ctx.stringValue("GetAppFileContentResponse.RootErrorMsg"));
		getAppFileContentResponse.setRootErrorCode(_ctx.stringValue("GetAppFileContentResponse.RootErrorCode"));
		getAppFileContentResponse.setAllowRetry(_ctx.booleanValue("GetAppFileContentResponse.AllowRetry"));
		getAppFileContentResponse.setAppName(_ctx.stringValue("GetAppFileContentResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppFileContentResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppFileContentResponse.ErrorArgs["+ i +"]"));
		}
		getAppFileContentResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setContent(_ctx.stringValue("GetAppFileContentResponse.Module.Content"));
		module.setCurrentTime(_ctx.stringValue("GetAppFileContentResponse.Module.CurrentTime"));
		getAppFileContentResponse.setModule(module);
	 
	 	return getAppFileContentResponse;
	}
}