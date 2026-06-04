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

import com.aliyuncs.websitebuild.model.v20250429.GetAppTokenServiceResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppTokenServiceResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppTokenServiceResponseUnmarshaller {

	public static GetAppTokenServiceResponse unmarshall(GetAppTokenServiceResponse getAppTokenServiceResponse, UnmarshallerContext _ctx) {
		
		getAppTokenServiceResponse.setRequestId(_ctx.stringValue("GetAppTokenServiceResponse.RequestId"));
		getAppTokenServiceResponse.setDynamicCode(_ctx.stringValue("GetAppTokenServiceResponse.DynamicCode"));
		getAppTokenServiceResponse.setDynamicMessage(_ctx.stringValue("GetAppTokenServiceResponse.DynamicMessage"));
		getAppTokenServiceResponse.setSynchro(_ctx.booleanValue("GetAppTokenServiceResponse.Synchro"));
		getAppTokenServiceResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppTokenServiceResponse.AccessDeniedDetail"));
		getAppTokenServiceResponse.setRootErrorMsg(_ctx.stringValue("GetAppTokenServiceResponse.RootErrorMsg"));
		getAppTokenServiceResponse.setRootErrorCode(_ctx.stringValue("GetAppTokenServiceResponse.RootErrorCode"));
		getAppTokenServiceResponse.setAllowRetry(_ctx.booleanValue("GetAppTokenServiceResponse.AllowRetry"));
		getAppTokenServiceResponse.setAppName(_ctx.stringValue("GetAppTokenServiceResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppTokenServiceResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppTokenServiceResponse.ErrorArgs["+ i +"]"));
		}
		getAppTokenServiceResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setExtend(_ctx.stringValue("GetAppTokenServiceResponse.Module.Extend"));
		module.setStatus(_ctx.stringValue("GetAppTokenServiceResponse.Module.Status"));
		getAppTokenServiceResponse.setModule(module);
	 
	 	return getAppTokenServiceResponse;
	}
}