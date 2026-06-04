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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppSeoStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppSeoStatusResponseUnmarshaller {

	public static UpdateAppSeoStatusResponse unmarshall(UpdateAppSeoStatusResponse updateAppSeoStatusResponse, UnmarshallerContext _ctx) {
		
		updateAppSeoStatusResponse.setRequestId(_ctx.stringValue("UpdateAppSeoStatusResponse.RequestId"));
		updateAppSeoStatusResponse.setDynamicCode(_ctx.stringValue("UpdateAppSeoStatusResponse.DynamicCode"));
		updateAppSeoStatusResponse.setDynamicMessage(_ctx.stringValue("UpdateAppSeoStatusResponse.DynamicMessage"));
		updateAppSeoStatusResponse.setSynchro(_ctx.booleanValue("UpdateAppSeoStatusResponse.Synchro"));
		updateAppSeoStatusResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppSeoStatusResponse.AccessDeniedDetail"));
		updateAppSeoStatusResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppSeoStatusResponse.RootErrorMsg"));
		updateAppSeoStatusResponse.setRootErrorCode(_ctx.stringValue("UpdateAppSeoStatusResponse.RootErrorCode"));
		updateAppSeoStatusResponse.setModule(_ctx.booleanValue("UpdateAppSeoStatusResponse.Module"));
		updateAppSeoStatusResponse.setAllowRetry(_ctx.booleanValue("UpdateAppSeoStatusResponse.AllowRetry"));
		updateAppSeoStatusResponse.setAppName(_ctx.stringValue("UpdateAppSeoStatusResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppSeoStatusResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppSeoStatusResponse.ErrorArgs["+ i +"]"));
		}
		updateAppSeoStatusResponse.setErrorArgs(errorArgs);
	 
	 	return updateAppSeoStatusResponse;
	}
}