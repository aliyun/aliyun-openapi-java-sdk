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

import com.aliyuncs.websitebuild.model.v20250429.EditPluginConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditPluginConfigResponseUnmarshaller {

	public static EditPluginConfigResponse unmarshall(EditPluginConfigResponse editPluginConfigResponse, UnmarshallerContext _ctx) {
		
		editPluginConfigResponse.setRequestId(_ctx.stringValue("EditPluginConfigResponse.RequestId"));
		editPluginConfigResponse.setDynamicCode(_ctx.stringValue("EditPluginConfigResponse.DynamicCode"));
		editPluginConfigResponse.setDynamicMessage(_ctx.stringValue("EditPluginConfigResponse.DynamicMessage"));
		editPluginConfigResponse.setSynchro(_ctx.booleanValue("EditPluginConfigResponse.Synchro"));
		editPluginConfigResponse.setAccessDeniedDetail(_ctx.stringValue("EditPluginConfigResponse.AccessDeniedDetail"));
		editPluginConfigResponse.setRootErrorMsg(_ctx.stringValue("EditPluginConfigResponse.RootErrorMsg"));
		editPluginConfigResponse.setRootErrorCode(_ctx.stringValue("EditPluginConfigResponse.RootErrorCode"));
		editPluginConfigResponse.setModule(_ctx.booleanValue("EditPluginConfigResponse.Module"));
		editPluginConfigResponse.setAllowRetry(_ctx.booleanValue("EditPluginConfigResponse.AllowRetry"));
		editPluginConfigResponse.setAppName(_ctx.stringValue("EditPluginConfigResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("EditPluginConfigResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("EditPluginConfigResponse.ErrorArgs["+ i +"]"));
		}
		editPluginConfigResponse.setErrorArgs(errorArgs);
	 
	 	return editPluginConfigResponse;
	}
}