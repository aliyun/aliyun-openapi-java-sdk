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

import com.aliyuncs.websitebuild.model.v20250429.CheckResourceMeasureResponse;
import com.aliyuncs.websitebuild.model.v20250429.CheckResourceMeasureResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceMeasureResponseUnmarshaller {

	public static CheckResourceMeasureResponse unmarshall(CheckResourceMeasureResponse checkResourceMeasureResponse, UnmarshallerContext _ctx) {
		
		checkResourceMeasureResponse.setRequestId(_ctx.stringValue("CheckResourceMeasureResponse.RequestId"));
		checkResourceMeasureResponse.setDynamicCode(_ctx.stringValue("CheckResourceMeasureResponse.DynamicCode"));
		checkResourceMeasureResponse.setDynamicMessage(_ctx.stringValue("CheckResourceMeasureResponse.DynamicMessage"));
		checkResourceMeasureResponse.setSynchro(_ctx.booleanValue("CheckResourceMeasureResponse.Synchro"));
		checkResourceMeasureResponse.setAccessDeniedDetail(_ctx.stringValue("CheckResourceMeasureResponse.AccessDeniedDetail"));
		checkResourceMeasureResponse.setRootErrorMsg(_ctx.stringValue("CheckResourceMeasureResponse.RootErrorMsg"));
		checkResourceMeasureResponse.setRootErrorCode(_ctx.stringValue("CheckResourceMeasureResponse.RootErrorCode"));
		checkResourceMeasureResponse.setAllowRetry(_ctx.booleanValue("CheckResourceMeasureResponse.AllowRetry"));
		checkResourceMeasureResponse.setAppName(_ctx.stringValue("CheckResourceMeasureResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckResourceMeasureResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CheckResourceMeasureResponse.ErrorArgs["+ i +"]"));
		}
		checkResourceMeasureResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPassed(_ctx.booleanValue("CheckResourceMeasureResponse.Module.Passed"));
		module.setResourceCode(_ctx.stringValue("CheckResourceMeasureResponse.Module.ResourceCode"));
		module.setErrorCode(_ctx.stringValue("CheckResourceMeasureResponse.Module.ErrorCode"));
		module.setErrorMessage(_ctx.stringValue("CheckResourceMeasureResponse.Module.ErrorMessage"));
		checkResourceMeasureResponse.setModule(module);
	 
	 	return checkResourceMeasureResponse;
	}
}