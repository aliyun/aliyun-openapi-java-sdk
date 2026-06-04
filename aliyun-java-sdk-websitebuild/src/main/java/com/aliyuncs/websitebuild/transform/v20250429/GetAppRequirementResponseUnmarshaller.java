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

import com.aliyuncs.websitebuild.model.v20250429.GetAppRequirementResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppRequirementResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppRequirementResponseUnmarshaller {

	public static GetAppRequirementResponse unmarshall(GetAppRequirementResponse getAppRequirementResponse, UnmarshallerContext _ctx) {
		
		getAppRequirementResponse.setRequestId(_ctx.stringValue("GetAppRequirementResponse.RequestId"));
		getAppRequirementResponse.setDynamicCode(_ctx.stringValue("GetAppRequirementResponse.DynamicCode"));
		getAppRequirementResponse.setDynamicMessage(_ctx.stringValue("GetAppRequirementResponse.DynamicMessage"));
		getAppRequirementResponse.setSynchro(_ctx.booleanValue("GetAppRequirementResponse.Synchro"));
		getAppRequirementResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppRequirementResponse.AccessDeniedDetail"));
		getAppRequirementResponse.setRootErrorMsg(_ctx.stringValue("GetAppRequirementResponse.RootErrorMsg"));
		getAppRequirementResponse.setRootErrorCode(_ctx.stringValue("GetAppRequirementResponse.RootErrorCode"));
		getAppRequirementResponse.setAllowRetry(_ctx.booleanValue("GetAppRequirementResponse.AllowRetry"));
		getAppRequirementResponse.setAppName(_ctx.stringValue("GetAppRequirementResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppRequirementResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppRequirementResponse.ErrorArgs["+ i +"]"));
		}
		getAppRequirementResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPrd(_ctx.stringValue("GetAppRequirementResponse.Module.Prd"));
		getAppRequirementResponse.setModule(module);
	 
	 	return getAppRequirementResponse;
	}
}