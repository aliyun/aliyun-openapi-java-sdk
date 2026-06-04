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

import com.aliyuncs.websitebuild.model.v20250429.CopyAppPluginConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyAppPluginConfigResponseUnmarshaller {

	public static CopyAppPluginConfigResponse unmarshall(CopyAppPluginConfigResponse copyAppPluginConfigResponse, UnmarshallerContext _ctx) {
		
		copyAppPluginConfigResponse.setRequestId(_ctx.stringValue("CopyAppPluginConfigResponse.RequestId"));
		copyAppPluginConfigResponse.setDynamicCode(_ctx.stringValue("CopyAppPluginConfigResponse.DynamicCode"));
		copyAppPluginConfigResponse.setDynamicMessage(_ctx.stringValue("CopyAppPluginConfigResponse.DynamicMessage"));
		copyAppPluginConfigResponse.setSynchro(_ctx.booleanValue("CopyAppPluginConfigResponse.Synchro"));
		copyAppPluginConfigResponse.setAccessDeniedDetail(_ctx.stringValue("CopyAppPluginConfigResponse.AccessDeniedDetail"));
		copyAppPluginConfigResponse.setRootErrorMsg(_ctx.stringValue("CopyAppPluginConfigResponse.RootErrorMsg"));
		copyAppPluginConfigResponse.setRootErrorCode(_ctx.stringValue("CopyAppPluginConfigResponse.RootErrorCode"));
		copyAppPluginConfigResponse.setModule(_ctx.booleanValue("CopyAppPluginConfigResponse.Module"));
		copyAppPluginConfigResponse.setAllowRetry(_ctx.booleanValue("CopyAppPluginConfigResponse.AllowRetry"));
		copyAppPluginConfigResponse.setAppName(_ctx.stringValue("CopyAppPluginConfigResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CopyAppPluginConfigResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CopyAppPluginConfigResponse.ErrorArgs["+ i +"]"));
		}
		copyAppPluginConfigResponse.setErrorArgs(errorArgs);
	 
	 	return copyAppPluginConfigResponse;
	}
}