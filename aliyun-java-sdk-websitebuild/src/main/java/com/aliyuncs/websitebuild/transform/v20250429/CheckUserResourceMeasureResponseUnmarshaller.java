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

import com.aliyuncs.websitebuild.model.v20250429.CheckUserResourceMeasureResponse;
import com.aliyuncs.websitebuild.model.v20250429.CheckUserResourceMeasureResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckUserResourceMeasureResponseUnmarshaller {

	public static CheckUserResourceMeasureResponse unmarshall(CheckUserResourceMeasureResponse checkUserResourceMeasureResponse, UnmarshallerContext _ctx) {
		
		checkUserResourceMeasureResponse.setRequestId(_ctx.stringValue("CheckUserResourceMeasureResponse.RequestId"));
		checkUserResourceMeasureResponse.setDynamicCode(_ctx.stringValue("CheckUserResourceMeasureResponse.DynamicCode"));
		checkUserResourceMeasureResponse.setDynamicMessage(_ctx.stringValue("CheckUserResourceMeasureResponse.DynamicMessage"));
		checkUserResourceMeasureResponse.setSynchro(_ctx.booleanValue("CheckUserResourceMeasureResponse.Synchro"));
		checkUserResourceMeasureResponse.setAccessDeniedDetail(_ctx.stringValue("CheckUserResourceMeasureResponse.AccessDeniedDetail"));
		checkUserResourceMeasureResponse.setRootErrorMsg(_ctx.stringValue("CheckUserResourceMeasureResponse.RootErrorMsg"));
		checkUserResourceMeasureResponse.setRootErrorCode(_ctx.stringValue("CheckUserResourceMeasureResponse.RootErrorCode"));
		checkUserResourceMeasureResponse.setAllowRetry(_ctx.booleanValue("CheckUserResourceMeasureResponse.AllowRetry"));
		checkUserResourceMeasureResponse.setAppName(_ctx.stringValue("CheckUserResourceMeasureResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckUserResourceMeasureResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CheckUserResourceMeasureResponse.ErrorArgs["+ i +"]"));
		}
		checkUserResourceMeasureResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setPassed(_ctx.booleanValue("CheckUserResourceMeasureResponse.Module.Passed"));
		module.setResourceCode(_ctx.stringValue("CheckUserResourceMeasureResponse.Module.ResourceCode"));
		module.setErrorCode(_ctx.stringValue("CheckUserResourceMeasureResponse.Module.ErrorCode"));
		module.setErrorMessage(_ctx.stringValue("CheckUserResourceMeasureResponse.Module.ErrorMessage"));
		checkUserResourceMeasureResponse.setModule(module);
	 
	 	return checkUserResourceMeasureResponse;
	}
}