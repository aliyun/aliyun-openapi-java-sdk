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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppFileResponseUnmarshaller {

	public static UpdateAppFileResponse unmarshall(UpdateAppFileResponse updateAppFileResponse, UnmarshallerContext _ctx) {
		
		updateAppFileResponse.setRequestId(_ctx.stringValue("UpdateAppFileResponse.RequestId"));
		updateAppFileResponse.setDynamicCode(_ctx.stringValue("UpdateAppFileResponse.DynamicCode"));
		updateAppFileResponse.setDynamicMessage(_ctx.stringValue("UpdateAppFileResponse.DynamicMessage"));
		updateAppFileResponse.setSynchro(_ctx.booleanValue("UpdateAppFileResponse.Synchro"));
		updateAppFileResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppFileResponse.AccessDeniedDetail"));
		updateAppFileResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppFileResponse.RootErrorMsg"));
		updateAppFileResponse.setRootErrorCode(_ctx.stringValue("UpdateAppFileResponse.RootErrorCode"));
		updateAppFileResponse.setModule(_ctx.booleanValue("UpdateAppFileResponse.Module"));
		updateAppFileResponse.setAllowRetry(_ctx.booleanValue("UpdateAppFileResponse.AllowRetry"));
		updateAppFileResponse.setAppName(_ctx.stringValue("UpdateAppFileResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppFileResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppFileResponse.ErrorArgs["+ i +"]"));
		}
		updateAppFileResponse.setErrorArgs(errorArgs);
	 
	 	return updateAppFileResponse;
	}
}