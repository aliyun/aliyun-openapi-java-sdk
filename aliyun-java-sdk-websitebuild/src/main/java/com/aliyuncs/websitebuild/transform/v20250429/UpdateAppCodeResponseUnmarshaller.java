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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppCodeResponseUnmarshaller {

	public static UpdateAppCodeResponse unmarshall(UpdateAppCodeResponse updateAppCodeResponse, UnmarshallerContext _ctx) {
		
		updateAppCodeResponse.setRequestId(_ctx.stringValue("UpdateAppCodeResponse.RequestId"));
		updateAppCodeResponse.setDynamicCode(_ctx.stringValue("UpdateAppCodeResponse.DynamicCode"));
		updateAppCodeResponse.setDynamicMessage(_ctx.stringValue("UpdateAppCodeResponse.DynamicMessage"));
		updateAppCodeResponse.setSynchro(_ctx.booleanValue("UpdateAppCodeResponse.Synchro"));
		updateAppCodeResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppCodeResponse.AccessDeniedDetail"));
		updateAppCodeResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppCodeResponse.RootErrorMsg"));
		updateAppCodeResponse.setRootErrorCode(_ctx.stringValue("UpdateAppCodeResponse.RootErrorCode"));
		updateAppCodeResponse.setModule(_ctx.booleanValue("UpdateAppCodeResponse.Module"));
		updateAppCodeResponse.setAllowRetry(_ctx.booleanValue("UpdateAppCodeResponse.AllowRetry"));
		updateAppCodeResponse.setAppName(_ctx.stringValue("UpdateAppCodeResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppCodeResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppCodeResponse.ErrorArgs["+ i +"]"));
		}
		updateAppCodeResponse.setErrorArgs(errorArgs);
	 
	 	return updateAppCodeResponse;
	}
}