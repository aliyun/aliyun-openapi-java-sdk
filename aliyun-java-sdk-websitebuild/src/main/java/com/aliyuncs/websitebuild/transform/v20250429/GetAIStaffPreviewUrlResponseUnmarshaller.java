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

import com.aliyuncs.websitebuild.model.v20250429.GetAIStaffPreviewUrlResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAIStaffPreviewUrlResponse.Module;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIStaffPreviewUrlResponseUnmarshaller {

	public static GetAIStaffPreviewUrlResponse unmarshall(GetAIStaffPreviewUrlResponse getAIStaffPreviewUrlResponse, UnmarshallerContext _ctx) {
		
		getAIStaffPreviewUrlResponse.setRequestId(_ctx.stringValue("GetAIStaffPreviewUrlResponse.RequestId"));
		getAIStaffPreviewUrlResponse.setDynamicCode(_ctx.stringValue("GetAIStaffPreviewUrlResponse.DynamicCode"));
		getAIStaffPreviewUrlResponse.setDynamicMessage(_ctx.stringValue("GetAIStaffPreviewUrlResponse.DynamicMessage"));
		getAIStaffPreviewUrlResponse.setSynchro(_ctx.booleanValue("GetAIStaffPreviewUrlResponse.Synchro"));
		getAIStaffPreviewUrlResponse.setAccessDeniedDetail(_ctx.stringValue("GetAIStaffPreviewUrlResponse.AccessDeniedDetail"));
		getAIStaffPreviewUrlResponse.setRootErrorMsg(_ctx.stringValue("GetAIStaffPreviewUrlResponse.RootErrorMsg"));
		getAIStaffPreviewUrlResponse.setRootErrorCode(_ctx.stringValue("GetAIStaffPreviewUrlResponse.RootErrorCode"));
		getAIStaffPreviewUrlResponse.setAllowRetry(_ctx.booleanValue("GetAIStaffPreviewUrlResponse.AllowRetry"));
		getAIStaffPreviewUrlResponse.setAppName(_ctx.stringValue("GetAIStaffPreviewUrlResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAIStaffPreviewUrlResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAIStaffPreviewUrlResponse.ErrorArgs["+ i +"]"));
		}
		getAIStaffPreviewUrlResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setUrlMap(_ctx.mapValue("GetAIStaffPreviewUrlResponse.Module.UrlMap"));
		getAIStaffPreviewUrlResponse.setModule(module);
	 
	 	return getAIStaffPreviewUrlResponse;
	}
}